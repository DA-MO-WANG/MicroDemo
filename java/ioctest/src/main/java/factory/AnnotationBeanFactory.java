package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.FXNewsProvider;

public class AnnotationBeanFactory {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("anonation-config.xml");
    FXNewsProvider newsProvider = (FXNewsProvider)ctx.getBean("FXNewsProvider");
    
}
