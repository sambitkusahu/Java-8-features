package com.sambit.java8features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateExample {
    private static final String DATE_FORMAT = "MMM d, yyyy HH:mm a";
    public static void main(String[] args) {
        String dt = LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("dt = " + dt);
    }
}
