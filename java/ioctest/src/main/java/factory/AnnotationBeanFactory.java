package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.FXNewsProvider;

public class AnnotationBeanFactory {
    public static void main(String[] args) {
        //
        ApplicationContext ctx = new ClassPathXmlApplicationContext("anonation-config.xml");
        FXNewsProvider newsProvider = (FXNewsProvider)ctx.getBean("FXNewsProvider");
        newsProvider.getAndPersisNews();
    }
}
