/*
 * Copyright (C) 2014 Jan Pokorsky
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package cz.cas.lib.proarc.common.mods.ndk;

import com.fasterxml.jackson.databind.ObjectMapper;
import static cz.cas.lib.proarc.common.mods.ndk.MapperUtils.*;
import cz.cas.lib.proarc.common.mods.custom.ModsConstants;
import cz.cas.lib.proarc.common.object.ndk.NdkMetadataHandler;
import cz.cas.lib.proarc.mods.ClassificationDefinition;
import cz.cas.lib.proarc.mods.DateOtherDefinition;
import cz.cas.lib.proarc.mods.Extent;
import cz.cas.lib.proarc.mods.FormDefinition;
import cz.cas.lib.proarc.mods.GenreDefinition;
import cz.cas.lib.proarc.mods.ModsDefinition;
import cz.cas.lib.proarc.mods.OriginInfoDefinition;
import cz.cas.lib.proarc.mods.PhysicalDescriptionDefinition;
import cz.cas.lib.proarc.mods.RecordInfoDefinition;
import cz.cas.lib.proarc.mods.StringPlusLanguagePlusAuthority;
import cz.cas.lib.proarc.mods.SubjectDefinition;
import cz.cas.lib.proarc.mods.SubjectNameDefinition;
import cz.cas.lib.proarc.mods.TitleInfoDefinition;
import cz.cas.lib.proarc.mods.TypeOfResourceDefinition;
import cz.cas.lib.proarc.oaidublincore.OaiDcType;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Jan Pokorsky
 */
public class NdkPeriodicalSupplementMapper extends NdkMapper {

    @Override
    public void createMods(ModsDefinition mods, Context ctx) {
        super.createMods(mods, ctx);
        // mods/originInfo/place/placeTerm/type="text" if null
        // mods/language/languageTerm @type=code, @authority="iso639‐2b"
        fillLanguage(mods);
        // physicalDescription
        //  mods/classification@authority="udc"
        List<ClassificationDefinition> classifications = mods.getClassification();
        for (ClassificationDefinition classification : classifications) {
            repairAuthorityInClassification(classification);
        }
        for (OriginInfoDefinition oi : mods.getOriginInfo()) {
            // sets type in element dateOther
            for (DateOtherDefinition dateOther : oi.getDateOther()) {
                dateOther.setType(oi.getEventType());
            }
        }
        for (PhysicalDescriptionDefinition pd : mods.getPhysicalDescription()) {
            for (FormDefinition form : pd.getForm()) {
                if (ModsConstants.VALUE_PHYSICALDESCRIPTION_FORM_RDAMEDIA.equals(form.getAuthority())) {
                    form.setType("media");
                } else if (ModsConstants.VALUE_PHYSICALDESCRIPTION_FORM_RDACARRIER.equals(form.getAuthority())) {
                    form.setType("carrier");
                } else {
                    form.setType(null);
                }
            }
        }
    }

    @Override
    protected String createObjectLabel(ModsDefinition mods) {
        String partNumber = findPartNumber(mods);
        String partName = findPartName(mods);
        if (partNumber != null && partName != null) {
            return partNumber + ", " + partName;
        } else {
            return partNumber != null ? partNumber : partName;
        }
    }

    @Override
    protected OaiDcType createDc(ModsDefinition mods, Context ctx) {
        OaiDcType dc = super.createDc(mods, ctx);
        for (TitleInfoDefinition titleInfo : mods.getTitleInfo()) {
            StringBuilder title = new StringBuilder();
            addNonSort(title, titleInfo);
            addTitle(title, titleInfo);
            addPartName(title, titleInfo);
            addElementType(dc.getTitles(), title.toString());

            addStringPlusLanguage(dc.getDescriptions(), titleInfo.getPartNumber());
        }
        addName(mods.getName(), dc.getCreators());
        for (TypeOfResourceDefinition resType : mods.getTypeOfResource()) {
            addElementType(dc.getTypes(), resType.getValue());
        }
        for (GenreDefinition genre : mods.getGenre()) {
            addElementType(dc.getTypes(), genre.getValue());
        }
        addOriginInfo(mods.getOriginInfo(), dc);
        addLanguage(mods.getLanguage(), dc);
        for (PhysicalDescriptionDefinition physicalDesc : mods.getPhysicalDescription()) {
            for (FormDefinition form : physicalDesc.getForm()) {
                addElementType(dc.getFormats(), form.getValue());
            }
            for (Extent extent : physicalDesc.getExtent()) {
                addElementType(dc.getFormats(), extent.getValue());
            }
        }
        addStringPlusLanguage(dc.getDescriptions(), mods.getAbstract());
        addStringPlusLanguage(dc.getDescriptions(), mods.getNote());
        for (SubjectDefinition subject : mods.getSubject()) {
            addStringPlusLanguage(dc.getSubjects(), subject.getTopic());
            addStringPlusLanguage(dc.getSubjects(), subject.getGeographic());
            addStringPlusLanguage(dc.getSubjects(), subject.getTemporal());
            for (SubjectNameDefinition subjectName : subject.getName()) {
                addStringPlusLanguage(dc.getSubjects(), subjectName.getNamePart());
            }
        }
        addStringPlusLanguage(dc.getSubjects(), mods.getClassification());
        return dc;
    }

    @Override
    public NdkMetadataHandler.ModsWrapper toJsonObject(ModsDefinition mods, Context ctx) {
        RdaModsWrapper wrapper = new RdaModsWrapper();
        wrapper.setMods(mods);
        if (mods.getRecordInfo().isEmpty() || mods.getRecordInfo().get(0).getDescriptionStandard().isEmpty()) {
            return wrapper;
        }
        String descriptionStandard = mods.getRecordInfo().get(0).getDescriptionStandard().get(0).getValue();
        mods.getRecordInfo().get(0).getDescriptionStandard().clear();
        if (descriptionStandard.equalsIgnoreCase(ModsConstants.VALUE_DESCRIPTIONSTANDARD_RDA)) {
            wrapper.setRdaRules(true);
        } else {
            wrapper.setRdaRules(false);
        }
        return wrapper;
    }

    @Override
    public ModsDefinition fromJsonObject(ObjectMapper jsMapper, String json, Context ctx) throws IOException {
        RdaModsWrapper wrapper = jsMapper.readValue(json, RdaModsWrapper.class);
        ModsDefinition mods = wrapper.getMods();
        StringPlusLanguagePlusAuthority descriptionStandard = new StringPlusLanguagePlusAuthority();
        if (wrapper.getRdaRules() != null && wrapper.getRdaRules()) {
            descriptionStandard.setValue(ModsConstants.VALUE_DESCRIPTIONSTANDARD_RDA);
        } else {
            descriptionStandard.setValue(ModsConstants.VALUE_DESCRIPTIONSTANDARD_AACR);
        }
        if (mods.getRecordInfo().isEmpty()) {
            RecordInfoDefinition recordInfo = new RecordInfoDefinition();
            recordInfo.getDescriptionStandard().add(0, descriptionStandard);
            mods.getRecordInfo().add(0, recordInfo);
        } else {
            mods.getRecordInfo().get(0).getDescriptionStandard().add(0, descriptionStandard);
        }
        return mods;
    }
}
