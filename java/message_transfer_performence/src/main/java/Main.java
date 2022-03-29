import com.google.gson.Gson;
import json.FastJsonUtil;
import json.GsonUtil;
import json.QmikjsonUtil;

public class Main {

    public static void main(String[] args) {
        //fastjson
        FastJsonUtil.parseByFastJson();
        GsonUtil.parseByGson();
        QmikjsonUtil.parseByQmikjson();
    }
}
