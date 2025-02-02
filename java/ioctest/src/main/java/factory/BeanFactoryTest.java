package factory;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import test.DowJonesNewsListener;
import test.DowJonesNewsPersister;
import test.FXNewsProvider;

public class BeanFactoryTest {

    public static void main(String[] args) {
        //具体负责对象注册和管理的实现类--BeanFactory接口的实现类
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanFactory container = (BeanFactory)bindViaCode(beanFactory);
        DowJonesNewsListener dowJonesNewsListener = (DowJonesNewsListener)container.getBean("djListener");
        dowJonesNewsListener.postProcessIfNecessary("123");
    }

    public static BeanFactory bindViaCode(BeanDefinitionRegistry registry) {
        //保管注册对象的各种信息的实例：类型信息
        AbstractBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class,1,true);
        AbstractBeanDefinition newsListener = new RootBeanDefinition(DowJonesNewsListener.class,1,true);
        AbstractBeanDefinition newsPersister = new RootBeanDefinition(DowJonesNewsPersister.class,1,true);
        //注册逻辑，把封装的beandefinition注册到管理注册的类里
        registry.registerBeanDefinition("djNewsProvider",newsProvider);
        registry.registerBeanDefinition("djListener",newsListener);
        registry.registerBeanDefinition("djPersister",newsPersister);

        //构造器注入
        ConstructorArgumentValues argValue = new ConstructorArgumentValues();
        argValue.addIndexedArgumentValue(0,newsListener);
        argValue.addIndexedArgumentValue(1,newsPersister);
        newsProvider.setConstructorArgumentValues(argValue);

        return (BeanFactory)registry;

    }

}
