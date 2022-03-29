package fastjson;

import com.alibaba.fastjson.JSONObject;
import fastjson.model.Root;
import util.FileUtil;

public class FastJsonUtil {
    public static void parseByFastJson() {
        String json =  FileUtil.readToBuffer("/Users/richheart/IdeaProjects/microdemo/java/message_transfer_performence/src/main/resources/static/hrbcn.json");
        Object root = JSONObject.parse(json);
        System.out.println(root.toString());
    }
}
