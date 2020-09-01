package com.he.order_service.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author hewei
 * @date 2020/6/15
 */
public class JsonUtils
{
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static JsonNode str2JsonNode(String str)
    {
        JsonNode jsonNode = null;
        try
        {
            jsonNode = OBJECT_MAPPER.readTree(str);
        } catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return jsonNode;
    }
}
