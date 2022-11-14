package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x = 0.0000001;
        DecimalFormat d = new DecimalFormat("#,##0.00000000");
        String format = d.format(x);
        System.out.println(format);
    }
}
