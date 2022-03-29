package json;


import com.google.gson.Gson;
import json.model.Root;
import util.FileUtil;

public class GsonUtil {
    public static void parseByGson() {
        String json =  FileUtil.readToBuffer("/Users/richheart/IdeaProjects/microdemo/java/message_transfer_performence/src/main/resources/static/hrbcn.json");
        long l1 = System.currentTimeMillis();
        Gson gson = new Gson();
        gson.fromJson(json,)
        Root root = JSON.parseObject(json,Root.class);
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
    }
}
