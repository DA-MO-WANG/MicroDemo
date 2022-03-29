package fastjson;

import com.alibaba.fastjson.JSONObject;
import fastjson.model.Root;

public class FastJsonUtil {
    public static void parseByFastJson(String json) {
        
        Root root = (Root)JSONObject.parse(json);
        System.out.println(root.toString());
    }
}
