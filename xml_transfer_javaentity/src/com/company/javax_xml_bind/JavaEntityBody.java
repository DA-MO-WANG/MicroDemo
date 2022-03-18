package com.company.javax_xml_bind;

import com.company.javax_xml_bind.util.JsonUtil;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBody",propOrder = {
        "name","apIdType","certNo","embName"
})
public class JavaEntityBody {
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "apIdType")
    private String apIdType;
    @XmlElement(name = "certNo")
    private String certNo;
    @XmlElement(name = "embName")
    private String embName;
    @XmlElementWrapper(name = "address")
    @XmlElement(name = "addres")
    private List<AddressEntity> addressEntityList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApIdType() {
        return apIdType;
    }

    public void setApIdType(String apIdType) {
        this.apIdType = apIdType;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getEmbName() {
        return embName;
    }

    public void setEmbName(String embName) {
        this.embName = embName;
    }

    public List<AddressEntity> getAddressEntityList() {
        return addressEntityList;
    }

    public void setAddressEntityList(List<AddressEntity> addressEntityList) {
        this.addressEntityList = addressEntityList;
    }

    @Override
    public String toString() {
        return JsonUtil.getJsonUtil().objectToJsonstr(this);
    }
}
