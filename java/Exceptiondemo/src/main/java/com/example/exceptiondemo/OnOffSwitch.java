package com.example.exceptiondemo;

import java.util.concurrent.TimeUnit;

/**
 * @Description TO DO
 * @Classname Switch
 * @Date 2022/4/27 16:57
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
class Switch {
    private boolean state = false;
    public boolean read() {
        return state;
    }
    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }


}

class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}
public class OnOffSwitch {
    private static int count = 6;
    private static Switch sw = new Switch();
    public static void f() throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        //思路：利用异常来控制一段代码的跳出；利用循环来反复调用；循环次数来控制调用的次数
        //finally 和 循环中的break配合，可以达到控制调用次数的目的
        while (count >= 0) {
            try {
                //等待调用这个方法的线程完成
                Thread.currentThread().join(3000 * 60 * 60);
                // 等待3s时间
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                sw.on();
                count--;
                f();
                sw.off();
            } catch (OnOffException1 e) {
                System.out.println("OnOffException1");
                sw.off();
            } catch (OnOffException2 e) {
                System.out.println("OnOffException2");
                sw.off();
            }finally {
                if(count == 3) {
                    break;
                }
            }
        }

    }
}

