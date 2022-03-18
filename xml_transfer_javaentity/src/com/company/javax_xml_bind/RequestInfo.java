package com.company.javax_xml_bind;

import javax.xml.bind.annotation.*;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROOT",propOrder = {
        "header","body"})
@XmlRootElement(name = "ROOT")
public class RequestInfo {
    @XmlElement(name = "requestHead")
    private JavaEntityHeader header;
    @XmlElement(name = "requestBody")
    private JavaEntityBody body;

    public JavaEntityHeader getHeader() {
        return header;
    }

    public void setHeader(JavaEntityHeader header) {
        this.header = header;
    }

    public JavaEntityBody getBody() {
        return body;
    }

    public void setBody(JavaEntityBody body) {
        this.body = body;
    }
}
