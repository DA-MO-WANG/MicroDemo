package com.example.exceptiondemo.gouzaoqi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        }catch (FileNotFoundException e) {
            System.out.println("无法打开 "+ fname);
            throw e;
        }catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("in.close() 不成功");
            }
            throw e;

        }finally {

        }
    }
    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine 失败");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() 成功");
        } catch (IOException e) {
            throw new RuntimeException("in.close() 失败");
        }
    }
}
