package com.company;

import javax.swing.plaf.IconUIResource;
import java.text.DecimalFormat;

public class Main {
    static int count = 1;
    public static void main(String[] args) {
	// write your code here
        double x = 0.0000001;
        int temp = 0;
        DecimalFormat d = new DecimalFormat("#,##0.00000000");
        String format = d.format(x);
        do{
            String sub = format.substring(format.length() - count);
            if(sub.equals(".")) break;
            temp = Integer.valueOf(sub);
            count++;
        }while (temp <= 0);
        String doubleV = format.substring(0,format.length() - count + 2);


        System.out.println(doubleV);
    }
}
