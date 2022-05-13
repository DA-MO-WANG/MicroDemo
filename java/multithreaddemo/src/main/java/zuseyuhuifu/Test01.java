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
    static long id = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                id = thread.getId();
                try {

                    if(x == 10)  thread.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread1.start();

        Thread thread = Thread.currentThread();
        try {
            thread.wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.

    }
}
