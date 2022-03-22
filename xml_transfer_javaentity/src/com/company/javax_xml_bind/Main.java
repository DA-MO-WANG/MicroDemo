package com.company.javax_xml_bind;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //JavaEntityBody body = new JavaEntityBody();
        Calendar calendar = Calendar.getInstance();
        String calendarType = calendar.getCalendarType();
        System.out.println(calendarType);


    }
}
