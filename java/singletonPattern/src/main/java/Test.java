import version4.Singleton;

import java.util.stream.LongStream;

/**
 * @Description TO DO
 * @Classname Test
 * @Date 2023/6/2 10:32
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class Test {
    public static void main(String[] args) {
       // Singleton singleton = Singleton.getInstance();
        LongStream.rangeClosed(1,1000)
                .parallel()
                .forEach(i -> Singleton.getInstance().sayHello());

        version5.Singleton singleton = version5.Singleton.SINGLETON;

    }
}
