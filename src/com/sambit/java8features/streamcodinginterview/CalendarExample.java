package com.sambit.java8features.streamcodinginterview;

import java.util.Calendar;
import java.util.stream.IntStream;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        long startTime = cal.getTimeInMillis();
        long result = 0L;
        for (int i = 1; i < 10000000; i++) {
            result += i;
        }
        long endTime = cal.getTimeInMillis();
        System.out.println("Start Time : "+ startTime + "  EndTime: "+ endTime);
        System.out.println("Total time taken : " + (endTime-startTime));
        System.out.println(result);
    }
}
