package com.sambit.java8features.lambdaExpression;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child Thread is running...");
            }
        });
        t.start();
        System.out.println("Parent Thread is running...");
    }
}
