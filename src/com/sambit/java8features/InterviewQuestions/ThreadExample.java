package com.sambit.java8features.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ThreadExample {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Hi","Hello", "India","Bye");
        Thread t = new Thread(ThreadExample::printMsg);
        t.start();
        list.stream().forEach(System.out::println);
    }

    private static void printMsg(){
        System.out.println("Hello...");
    }
}
