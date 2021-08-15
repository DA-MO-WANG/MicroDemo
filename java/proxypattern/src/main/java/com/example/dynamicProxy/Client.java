package com.example.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 与非动态代理不同的是，代理类和真实主题类，不是固定不变的，可以针对不同的业务方法，动态产生相应的代理类
 *
 * Proxy只负责动态代理类的创建，前提提供好需要的参数：抽象业务接口的类加载器、抽象业务接口列表、抽象业务类对应的调用处理类
 *
 * InvocationHandler 调用逻辑接口形式，具体的实现要在定义的业务处理类中实现，这个业务处理类可以包容各种个样的业务--靠构造方法传入Object实现
 * invoke方法是对调用的统一处理，方法参数：被代理的抽象业务类、被代理的方法，被代理方法的参数----第一个需要自己传入，其他不用管
 * 
 *
 */
public class Client {
    public static void main(String args[]) {
        //InvocationHandler
        //专门负责处理代理类的调用逻辑
        InvocationHandler handler = null;

        AbstractUserDao userDao = new UserDao();
        //自定义的请求处理程序类--他来给InvocationHandler 添加血肉
        //invoke怎么来实现
        handler = new DaoLogHandler(userDao);
        AbstractUserDao proxy = null;
        //Proxy类是jdk设计的负责动态代理类的创建的类
        //指定参数：抽象业务类的类加载器、抽象业务类接口列表、这个业务类对应的调用逻辑的处理器----》针对这个业务类的主题类就生成了
        proxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(),new Class[]{AbstractUserDao.class},handler);
        //也就是这个具体的代理类是在使用时生成的，而不是一开始就固定好的，然后开始调用业务方法就行--产生的效果就是加入第三方功能的效果
        proxy.findUserById("张无忌");

        System.out.println("-----------------------");
        AbstractDocumentDao docDao = new DocumentDao();
        handler = new DaoLogHandler(docDao);
        AbstractDocumentDao proxy_new = null;

        proxy_new = (AbstractDocumentDao)Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(),new Class[]{AbstractDocumentDao.class},handler);
        proxy_new.deleteDocumentById("D002");
    }
}
