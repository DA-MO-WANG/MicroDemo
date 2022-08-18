package com.company.javax_xml_bind.util;

import javax.xml.bind.*;
import java.io.StringReader;
import java.io.StringWriter;

public class JaxpUtil {
    public static String toXML(Object obj) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setListener(new JaxpMarshallerListener());
        marshaller.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT,true);
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj,writer);
        return writer.toString();
    }

    //XML转对象
    public static <T> T XmlToObject(String xml, Class<T> valueType) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(valueType);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (T) unmarshaller.unmarshal(new StringReader(xml));
    }
}
