package com.HackerRank.Exer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.time.*;
public class DateAndTme_10 {
    public static void main(String[] args) {

        System.out.println("test "+ findDay(05,05,2012));

    }

    public static String findDay(int month, int day, int year) {

        //legacy method

//        Calendar cal = Calendar.getInstance();
//        cal.set(year, month - 1, day);
//        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//        return cal.getDisplayName(dayOfWeek, Calendar.LONG, Locale.getDefault());

        // using time library
        return java.time.format.DateTimeFormatter.ofPattern("EEEE")
                .format(LocalDate.of(year, month, day)).toUpperCase();

    }
}
