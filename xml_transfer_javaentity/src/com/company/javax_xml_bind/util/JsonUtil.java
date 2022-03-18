package com.company.javax_xml_bind.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private JsonUtil() {

    }
    ObjectMapper mapper = new ObjectMapper();
    private static JsonUtil jsonUtil = new JsonUtil();
    public static JsonUtil getJsonUtil() {
        return jsonUtil;
    }

    public String objectToJsonstr(Object obj) {
        return getJsonUtil().mapper.valueToTree(obj).toString();
    }
}
