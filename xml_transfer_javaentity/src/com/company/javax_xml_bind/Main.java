package com.company.javax_xml_bind;

import java.util.Calendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        JavaEntityBody body = new JavaEntityBody();
        Calendar calendar = Calendar.getInstance();
        String calendarType = calendar.getCalendarType();
        System.out.println(calendarType);
        try {
            System.out.println(test01());
        }catch (RuntimeException e) {
            System.out.println(1111111);
        }

    }

    private static String test01() {
        try {
            int a = 5 / 0;
        }catch (RuntimeException e) {
            throw new RuntimeException(e);

        }finally {
            return "2222222";
        }
    }
}
