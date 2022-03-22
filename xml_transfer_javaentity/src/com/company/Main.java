package com.company;

import com.alibaba.fastjson.JSONObject;
import com.company.javax_xml_bind.AddressEntity;
import com.company.javax_xml_bind.JavaEntityBody;
import com.company.javax_xml_bind.JavaEntityHeader;
import com.company.javax_xml_bind.RequestInfo;
import com.company.javax_xml_bind.util.JaxpUtil;
import com.company.javax_xml_bind.util.XmlUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.jdom2.JDOMException;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
	// write your code here
        RequestInfo requestObj = new RequestInfo();
        JavaEntityBody body = new JavaEntityBody();
        List<AddressEntity>  addressList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            AddressEntity addressEntity = new AddressEntity();
            addressEntity.setCity("Beijing"+i);
            addressEntity.setDistrict("fangshan"+i);
            addressEntity.setState("hebeisheng"+i);
            addressList.add(addressEntity);
        }

        body.setAddressEntityList(addressList);

        body.setApIdType("222222");
        body.setCertNo("11111111111111111");
        body.setEmbName("hejjjjjjjjjjjjjjjj");
        body.setName("jjj");
        JavaEntityHeader requestHeader = new JavaEntityHeader();
        requestHeader.setChn1("10000000000");
        requestHeader.setChnlDate("20220902");
        requestHeader.setChnlTime("1010101001");
        requestHeader.setOpenId("2333333333333");
        requestObj.setHeader(requestHeader);
        requestObj.setBody(body);
        String res = "null";
        JSONObject json = null;
        try {
            res = JaxpUtil.toXML(requestObj);
            json = XmlUtils.xml2Json(res);
        } catch (JAXBException e) {
            e.printStackTrace();
            log.error("生成报文失败！");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        } finally {
            System.out.println(json);
        }


    }
}
