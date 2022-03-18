package com.company.javax_xml_bind;

import com.company.javax_xml_bind.util.JsonUtil;

import javax.xml.bind.annotation.*;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addres",propOrder = {"state","city","district"})
public class AddressEntity {
    @XmlElement(name = "state")
    private String state;
    @XmlElement(name = "city")
    private String city;
    @XmlElement(name = "district")
    private String district;

    //private String address;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return JsonUtil.getJsonUtil().objectToJsonstr(this);
    }
}
