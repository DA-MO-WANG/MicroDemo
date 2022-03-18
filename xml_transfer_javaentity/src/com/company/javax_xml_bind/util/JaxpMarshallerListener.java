package com.company.javax_xml_bind.util;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.sun.tools.javac.util.StringUtils;
import jdk.internal.util.xml.impl.Pair;

import javax.xml.bind.Marshaller;
import java.lang.reflect.Field;

public class JaxpMarshallerListener extends Marshaller.Listener{
    private static final Logger log = LoggerFactory.getLogger(JaxpMarshallerListener.class);

    public void beforeMarshal(Object source) {
        super.beforeMarshal(source);
        Field[] fields = source.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            try {
                if (f.getType() == String.class && f.get(source) == null) {
                    f.set(source, "");
                }
            } catch (IllegalAccessException e) {
                log.error("对象序列化字符串时出错",e);
            }
        }

    }
}
