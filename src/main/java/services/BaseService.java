package services;

import com.crowdar.api.rest.MethodsService;
import com.google.gson.JsonArray;

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_WSPACE = new ThreadLocal<>();
    public static final ThreadLocal<String> ID_USER = new ThreadLocal<>();
    public static final ThreadLocal<String> ID_ENTRY = new ThreadLocal<>();
    public static final ThreadLocal<String> START_ENTRY = new ThreadLocal<>();
    public static final ThreadLocal<String> END_ENTRY = new ThreadLocal<>();
    public static final ThreadLocal<String> DESCRIPTION_ENTRY = new ThreadLocal<>();
    public static final ThreadLocal<String> NEW_DESCRIPTION = new ThreadLocal<>();
}
