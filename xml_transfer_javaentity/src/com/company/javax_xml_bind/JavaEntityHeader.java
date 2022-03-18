package com.company.javax_xml_bind;

import com.company.javax_xml_bind.util.JsonUtil;

import javax.xml.bind.annotation.*;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHead",propOrder = {
        "chn1","openId","chnlDate","chnlTime"
})
public class JavaEntityHeader {
    @XmlElement(name = "chnl")
    private String chn1;
    @XmlElement(name = "openId")
    private String openId;
    @XmlElement(name = "chnlDate")
    private String chnlDate;
    @XmlElement(name = "chnlTime")
    private String chnlTime;

    public String getChn1() {
        return chn1;
    }

    public void setChn1(String chn1) {
        this.chn1 = chn1;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getChnlDate() {
        return chnlDate;
    }

    public void setChnlDate(String chnlDate) {
        this.chnlDate = chnlDate;
    }

    public String getChnlTime() {
        return chnlTime;
    }

    public void setChnlTime(String chnlTime) {
        this.chnlTime = chnlTime;
    }

    @Override
    public String toString() {
        return JsonUtil.getJsonUtil().objectToJsonstr(this);
    }
}
