package com.sambit.java8features.streamcodinginterview;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {
    public static void main(String[] args) {
        System.out.println("Current Date : "+ LocalDate.now());
        System.out.println("Current Time : "+ LocalTime.now());
        System.out.println("Current Date and Time : "+ LocalDateTime.now());
    }
}
