package version1;

/**
 * @Description 不允许外部来new
 * @Classname Singleton
 * @Date 2023/6/2 10:29
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("对象被创建!");
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
