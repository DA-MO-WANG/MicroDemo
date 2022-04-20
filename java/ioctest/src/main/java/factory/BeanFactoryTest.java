package factory;



import test.DowJonesNewsListener;
import test.DowJonesNewsPersister;
import test.FXNewsProvider;

public class BeanFactoryTest {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanFactory container = (BeanFactory)bindViaCode(beanFactory);
    }

    public static BeanFactory bindViaCode(BeanDefinitionRegistry registry) {
        AbstractBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class,1,true);
        AbstractBeanDefinition newsListener = new RootBeanDefinition(DowJonesNewsListener.class,1,true);
        AbstractBeanDefinition newsPersister = new RootBeanDefinition(DowJonesNewsPersister.class,1,true);

        registry.registerBeanDefinition("djNewsProvider",newsProvider);
        registry.registerBeanDefinition("djListener",newsListener);
        registry.registerBeanDefinition("djPersister",newsPersister);

        ConstructorArgumentValues argValue = new ConstructorArgumentValues();
        argValue.addIndexedArgumentValue(0,newsListener);
        argValue.addIndexedArgumentValue(1,newsPersister);
        newsProvider.se

    }

}
