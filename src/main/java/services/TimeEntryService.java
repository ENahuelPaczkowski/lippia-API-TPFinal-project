package services;

import api.model.Project.ProjectResponse;
import api.model.timeEntry.TimeEntryResponse;
import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import com.google.gson.JsonArray;

import java.util.HashMap;
import java.util.Map;

public class TimeEntryService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, TimeEntryResponse.class,setParams());
    }

    public static Response gets(String jsonName) {
        return get(jsonName, TimeEntryResponse[].class,setParamsUserId(setParams()));
    }

    public static Response put(String jsonName){ return put(jsonName, TimeEntryResponse.class, setParamsUpdate(setParams()));}

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("wSpace",ID_WSPACE.get());
        return params;
    }

    private static Map<String, String> setParamsUserId(Map<String, String> params){
        params.put("userId",ID_USER.get());
        return params;
    }

    private static Map<String, String> setParamsUpdate(Map<String, String> params){
        params.put("start",START_ENTRY.get());
        params.put("desciption",NEW_DESCRIPTION.get());
        params.put("end",END_ENTRY.get());
        params.put("entryId",ID_ENTRY.get());
        return params;
    }
}
