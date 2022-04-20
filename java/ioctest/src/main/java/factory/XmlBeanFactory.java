package factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import test.DowJonesNewsListener;

public class XmlBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanFactory container = (BeanFactory)bindViaXMLFile(beanFactory);
        DowJonesNewsListener dowJonesNewsListener = (DowJonesNewsListener)container.getBean("djListener");
        dowJonesNewsListener.postProcessIfNecessary("123");

    }

    public static BeanFactory bindViaXMLFile(BeanDefinitionRegistry registry) {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("../news-config.xml");
        return (BeanFactory)registry;
    }
}
