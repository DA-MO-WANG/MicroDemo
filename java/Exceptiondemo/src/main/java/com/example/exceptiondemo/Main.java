package com.example.exceptiondemo;

public class Main {
    //异常声明占位效果
    public static void print() throws NullPointerException,ArithmeticException {
        System.out.println(11111);
    }
    public static void main(String[] args) {
        print();
    }
}
