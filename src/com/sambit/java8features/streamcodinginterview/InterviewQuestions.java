package com.sambit.java8features.streamcodinginterview;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestions {
    public static void main(String[] args) {
        //write a program to find duplicates in integer using stream
        List<Integer> intList = Arrays.asList(5,2,4,5,6,3,2,5,4,6,7);
        Set<Integer> intSet = new HashSet<>();
        Set<Integer> dulicateIntegers = intList.stream().filter(num -> !intSet.add(num)).collect(Collectors.toSet());
        System.out.println(dulicateIntegers);
        System.out.println("*********************");

        //Write a program to multiply two numbers using Functional interface
        MultiplyFuntionalInterface multiplication = (a,b)-> a * b;
        int result = multiplication.multiply(3, 5);
        System.out.println(result);
        System.out.println("*********************");

        //Difference between skip and limit, example
        //Skip, it will skip the elements from the start
        intList.stream().skip(3).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("*********************");

        //Limit, You can limit your result, result will not beyond your limit
        intList.stream().limit(5).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("*********************");

        //Count the no of occurrence of words given sting using java
        String str = "hyderabad code fun IT world hyderabad code hello hi";
        String[] strArray = str.split(" ");
        Map<String, Long> occurrenceWords = Arrays.asList(strArray).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occurrenceWords);

    }
}
