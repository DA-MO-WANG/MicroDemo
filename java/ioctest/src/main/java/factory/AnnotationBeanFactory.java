package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.FXNewsProvider;

public class AnnotationBeanFactory {
    public static void main(String[] args) {
        //ApplicationContext容器，加载触发器配置
        //xml  component-scan标注了要扫描的包范围
        //@Compoment 标注了哪些类需要被注册到容器里
        //@Autowired 标注了哪里需要被注入，以及注入什么对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("anonation-config.xml");
        FXNewsProvider newsProvider = (FXNewsProvider)ctx.getBean("FXNewsProvider");
        newsProvider.getAndPersisNews();

        
    }
}
