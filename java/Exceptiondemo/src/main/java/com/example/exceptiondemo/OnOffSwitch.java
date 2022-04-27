package com.example.exceptiondemo;

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
        while (count >= 0) {
            try {
                Thread.currentThread().wait(3000);
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

