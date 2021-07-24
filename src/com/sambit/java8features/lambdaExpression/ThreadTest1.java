package com.sambit.java8features.lambdaExpression;

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t = new Thread("Test1");
        t.start();
        System.out.println(t.getState());
        System.out.println("main Thread");
    }
}
