package com.vinnersk.utils;

import org.json.JSONObject;

public class Parser {

	public String parse(String data, String keyWithSlash) {
		String[] keys = Common.splitKeyWithForwardSlash(keyWithSlash);
		String value = "";
		if (Common.isValidJson(data)) {
			JSONObject jsonData = new JSONObject(data);

			for (String key : keys) {
				String jsonObjectType = jsonData.get(key).getClass().getTypeName();
				if ("org.json.JSONObject".equals(jsonObjectType)) {
					jsonData = (JSONObject) jsonData.get(key);
					value = jsonData.toString();
				} else {
					value = jsonData.getString(key);
				}

			}
		}
		return value;
	}
}
