package zuseyuhuifu;

/**
 * @Description TO DO
 * @Classname test01
 * @Date 2022/5/13 18:36
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
public class Test01 {
    static int x = 10;
    public static void main(String[] args) {

        if (x == 20) {
            System.out.println(1000000000);
        }
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                x = 20;

            }
        });
        thread1.start();

    }
}
