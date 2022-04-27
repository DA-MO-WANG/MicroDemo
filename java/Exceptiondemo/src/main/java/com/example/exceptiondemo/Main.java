package com.example.exceptiondemo;

public class Main {
    //异常声明占位效果
    public static void print() throws NullPointerException,ArithmeticException {
        System.out.println(11111);
    }

    class BaseException extends Exception {}
    class DerivedException extends BaseException {}

    void catcher() throws BaseException {
        try {
            throw new DerivedException();
        }catch (BaseException e) {
            throw e;
        }
    }
    public static void main(String[] args) {
        print();
        Main main = new Main();
        try {
            main.catcher();
        } catch (BaseException e) {
            e.printStackTrace();
        }
    }
}
