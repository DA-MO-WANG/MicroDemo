package factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import test.DowJonesNewsListener;

public class XmlBeanFactory {
    public static void main(String[] args) {
        //创建一个负责bean注册管理的对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanFactory container = (BeanFactory)bindViaXMLFile(beanFactory);
        DowJonesNewsListener dowJonesNewsListener = (DowJonesNewsListener)container.getBean("djNewsListener");
        dowJonesNewsListener.postProcessIfNecessary("123");

    }

    public static BeanFactory bindViaXMLFile(BeanDefinitionRegistry registry) {
        //BeanDefinitionReader实现
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        //把读取到的xml内容映射到
        reader.loadBeanDefinitions("news-config.xml");
        return (BeanFactory)registry;
    }
}
