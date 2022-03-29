package json;

import json.model.Root;
import org.qmik.qmikjson.JSON;
import util.FileUtil;

public class QmikjsonUtil {
    public static void parseByQmikjson() {
        String json =  FileUtil.readToBuffer("/Users/richheart/IdeaProjects/microdemo/java/message_transfer_performence/src/main/resources/static/hrbcn.json");

        long l1 = System.currentTimeMillis();
        Root root = JSON.parse(json,Root.class);
        //Root root = com.alibaba.fastjson.JSON.parseObject(json,Root.class);
        long l2 = System.currentTimeMillis();
        System.out.print("qmikjson耗时：");
        System.out.println(l2-l1);
    }
}
