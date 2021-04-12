package com.vinnersk.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Common {

    public static String[] splitKeyWithForwardSlash(String key) {
        String[] keys = key.split("/");
        return keys;
    }

    public static boolean isValidJson(String jsonData) {
        try {
            new JSONObject(jsonData);
        } catch (JSONException jsonObjectException) {
            try {
                new JSONArray(jsonData);
            } catch (JSONException jsonArrayException) {
                return false;
            }
        }
        return true;
    }
}
