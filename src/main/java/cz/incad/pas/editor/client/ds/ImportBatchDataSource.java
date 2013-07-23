/*
 * Copyright (C) 2011 Jan Pokorsky
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package cz.incad.pas.editor.client.ds;

import com.google.gwt.core.client.GWT;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.Record;
import com.smartgwt.client.data.RestDataSource;
import com.smartgwt.client.data.fields.DataSourceDateTimeField;
import com.smartgwt.client.data.fields.DataSourceEnumField;
import com.smartgwt.client.data.fields.DataSourceIntegerField;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.types.DSDataFormat;
import com.smartgwt.client.types.DateDisplayFormat;
import cz.incad.pas.editor.client.ClientMessages;
import cz.incad.pas.editor.shared.rest.ImportResourceApi;
import java.util.LinkedHashMap;

/**
 *
 * @author Jan Pokorsky
 */
public final class ImportBatchDataSource extends RestDataSource {

    public static final String ID = "ImportBatchDataSource";
    public static final String FIELD_ID = ImportResourceApi.IMPORT_BATCH_ID;
    public static final String FIELD_PATH = ImportResourceApi.IMPORT_BATCH_FOLDER;
    public static final String FIELD_DESCRIPTION = ImportResourceApi.IMPORT_BATCH_DESCRIPTION;
    public static final String FIELD_TIMESTAMP = ImportResourceApi.IMPORT_BATCH_TIMESTAMP;
    public static final String FIELD_STATE = ImportResourceApi.IMPORT_BATCH_STATE;
    public static final String FIELD_USER_ID = ImportResourceApi.IMPORT_BATCH_USERID;
    public static final String FIELD_USER_DISPLAYNAME = ImportResourceApi.IMPORT_BATCH_USER;
    public static final String FIELD_PARENT = ImportResourceApi.IMPORT_BATCH_PARENTPID;

    public static final String FIELD_MODEL = ImportResourceApi.NEWBATCH_MODEL_PARAM;
    public static final String FIELD_DEVICE = ImportResourceApi.NEWBATCH_DEVICE_PARAM;
    public static final String FIELD_INDICES = ImportResourceApi.NEWBATCH_INDICES_PARAM;

    public ImportBatchDataSource() {
        setID(ID);

        setDataFormat(DSDataFormat.JSON);

        setDataURL(RestConfig.URL_IMPORT_BATCH);

        ClientMessages i18n = GWT.create(ClientMessages.class);

        DataSourceIntegerField id = new DataSourceIntegerField(FIELD_ID);
        id.setPrimaryKey(true);

        DataSourceTextField description = new DataSourceTextField(FIELD_DESCRIPTION);

        DataSourceTextField user = new DataSourceTextField(FIELD_USER_DISPLAYNAME);

        DataSourceIntegerField userId = new DataSourceIntegerField(FIELD_USER_ID);
        userId.setForeignKey(UserDataSource.ID + '.' + UserDataSource.FIELD_ID);

        DataSourceDateTimeField timestamp = new DataSourceDateTimeField(FIELD_TIMESTAMP);
        timestamp.setDateFormatter(DateDisplayFormat.TOEUROPEANSHORTDATETIME);

        DataSourceEnumField state = new DataSourceEnumField(FIELD_STATE);
        LinkedHashMap<String, String> states = new LinkedHashMap<String, String>();
        states.put(State.LOADING.name(), i18n.ImportBatchDataSource_State_LOADING());
        states.put(State.LOADING_FAILED.name(), i18n.ImportBatchDataSource_State_LOADING_FAILED());
        states.put(State.LOADED.name(), i18n.ImportBatchDataSource_State_LOADED());
        states.put(State.INGESTING.name(), i18n.ImportBatchDataSource_State_INGESTING());
        states.put(State.INGESTING_FAILED.name(), i18n.ImportBatchDataSource_State_INGESTING_FAILED());
        states.put(State.INGESTED.name(), i18n.ImportBatchDataSource_State_INGESTED());
        state.setValueMap(states);

        DataSourceTextField parent = new DataSourceTextField(FIELD_PARENT);
        parent.setHidden(true);

        setFields(id, description, userId, user, timestamp, state, parent);
        
        setOperationBindings(RestConfig.createAddOperation(), RestConfig.createUpdateOperation());
        
        setRequestProperties(RestConfig.createRestRequest(getDataFormat()));
    }

    public Record newBatch(String folderPath, String model, String device, Boolean indices) {
        Record r = new Record();
        r.setAttribute(FIELD_PATH, folderPath);
        if (model != null) {
            r.setAttribute(FIELD_MODEL, model);
        }
        if (indices != null) {
            r.setAttribute(FIELD_INDICES, indices);
        }
        if (device != null) {
            r.setAttribute(FIELD_DEVICE, device);
        }
        return r;
    }

    public static ImportBatchDataSource getInstance() {
        ImportBatchDataSource ds = (ImportBatchDataSource) DataSource.get(ID);
        ds = ds != null ? ds : new ImportBatchDataSource();
        return ds;
    }

    public static class BatchRecord {

        private final Record delegate;

        public BatchRecord(Record delegate) {
            this.delegate = delegate;
        }

        public String getId() {
            return delegate.getAttribute(FIELD_ID);
        }

        public void setId(String id) {
            delegate.setAttribute(FIELD_ID, id);
        }

        public String getParentPid() {
            return delegate.getAttribute(FIELD_PARENT);
        }

        public void setParentPid(String pid) {
            delegate.setAttribute(FIELD_PARENT, pid);
        }

        public State getState() {
            String attr = delegate.getAttribute(FIELD_STATE);
            return State.fromString(attr);
        }
    }

    /**
     * Copy of {@link cz.incad.pas.editor.server.imports.ImportBatchManager.ImportBatch.State State}.
     * XXX make it GWT accessible and remove this.
     */
    public enum State {
        EMPTY, LOADING, LOADING_FAILED, LOADED, INGESTING, INGESTING_FAILED, INGESTED;

        public static State fromString(String value) {
            try {
                return value == null ? null : valueOf(value);
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

}
