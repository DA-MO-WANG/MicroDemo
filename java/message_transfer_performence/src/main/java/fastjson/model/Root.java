package fastjson.model;

public class Root {
    Header service_header;
    Body service_body;

    public Root(Header service_header, Body service_body) {
        this.service_header = service_header;
        this.service_body = service_body;
    }
}
