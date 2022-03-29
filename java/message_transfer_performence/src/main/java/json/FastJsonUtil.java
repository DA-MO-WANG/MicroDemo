package json;

import com.alibaba.fastjson.JSON;
import json.model.Root;
import util.FileUtil;

public class FastJsonUtil {
    public static void parseByFastJson() {
//        String json =  FileUtil.readToBuffer("/Users/richheart/IdeaProjects/microdemo/java/message_transfer_performence/src/main/resources/static/hrbcn.json");
//        JSONObject jsonMap = (JSONObject)JSON.parse(json);
//        String headstr = JSON.toJSONString(jsonMap.get("service_header"));
//        String bodystr = JSON.toJSONString(jsonMap.get("service_body"));
//        Header service_header =  JSON.parseObject(headstr, Header.class);
//        Body service_body =  JSON.parseObject(bodystr, Body.class);
//        Root root = new Root();
//        root.setService_body(service_body);
//        root.setService_header(service_header);

        String json =  FileUtil.readToBuffer("/Users/richheart/IdeaProjects/microdemo/java/message_transfer_performence/src/main/resources/static/hrbcn.json");
        long l1 = System.currentTimeMillis();
        Root root = JSON.parseObject(json,Root.class);
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

        //Root root = JSON.
        //System.out.println(root.toString());
    }
}
