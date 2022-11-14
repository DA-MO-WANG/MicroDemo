package com.company;

import javax.swing.plaf.IconUIResource;
import java.text.DecimalFormat;

public class Main {
    static int count = 1;
    public static void main(String[] args) {
	// 新知识点-double数据的展示问题——两种情况下会展示成科学计数法
        // >0 ====> 在小数点前超过7位
        // <0 ====> 小数点后超过3位
        double x = 0.0000001;
        int temp = 0;
        //要求业务上的最高精确度-这里是小数点后8位精确
        DecimalFormat d = new DecimalFormat("#,##0.00000000");
        String format = d.format(x);
        do{
            //截留住0.之后的部分，包括点在内
            String sub = format.substring(format.length() - count);
            System.out.println(sub);
            if(sub.equals(".")) break;
            temp = Integer.valueOf(sub);

            count++;
        }while (temp <= 0);
        //String doubleV = format.substring(0,format.length() - count + 2);


        //System.out.println(doubleV);
    }
}
