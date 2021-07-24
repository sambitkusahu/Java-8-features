package com.sambit.java8features.InterviewTestPrograms;

public class ThreadExample1 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("Runnable Thread started...");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
