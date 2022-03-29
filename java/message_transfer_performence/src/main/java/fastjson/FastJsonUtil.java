package fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import fastjson.model.Root;
import util.FileUtil;

public class FastJsonUtil {
    public static void parseByFastJson() {
        String json =  FileUtil.readToBuffer("/Users/richheart/IdeaProjects/microdemo/java/message_transfer_performence/src/main/resources/static/hrbcn.json");
        JSONObject rootObject = JSONObject.parseObject(json);
        Root root = JSON.toJavaObject(rootObject,Root.class);
        System.out.println(root.toString());
    }
}
