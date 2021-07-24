package com.sambit.java8features.InterviewTestPrograms;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("Main method called");
        Thread thread = new Thread(()->{
            System.out.println("Thread started..");
            System.out.println(Thread.currentThread().getName());
        });
            }
}
