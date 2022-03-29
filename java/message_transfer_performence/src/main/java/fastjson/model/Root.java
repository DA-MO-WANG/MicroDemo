package fastjson.model;

import java.io.Serializable;

public class Root implements Serializable {
    private static final long serialVersionUID = -9223365650070458532L;
    Header service_header;
    Body service_body;

    public Root(Header service_header, Body service_body) {
        this.service_header = service_header;
        this.service_body = service_body;
    }

    @Override
    public String toString() {
        return "{" +
                "  \"service_header\": {\n" +
                "    \"chnl_time\": "+service_header.getChnl_time()+",\n" +
                "    \"open_id\": "+service_header.getOpen_id()+",\n" +
                "    \"crypt\": "+service_header.getCrypt()+",\n" +
                "    \"rsp_code\": "+service_header.getRsp_code()+",\n" +
                "    \"chnl_date\": "+service_header.getChnl_date()+",\n" +
                "    \"rsp_msg\": "+service_header.getRsp_msg()+",\n" +
                "    \"chnl\": "+service_header.getChnl()+",\n" +
                "    \"chnl_flow\": "+service_header.getChnl_flow()+
                "  },\n" +
                "  \"service_body\": {\n" +
                "    \"activity_no\": "+service_body.getActivity_no()+",\n" +
                "    \"activity_name\": "+service_body.getActivity_name()+",\n" +
                "    \"annual_fee\": "+service_body.getAnnual_fee() +
                "  }\n" +
                "}";
    }
}
