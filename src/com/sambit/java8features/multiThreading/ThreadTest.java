package com.sambit.java8features.multiThreading;

public class ThreadTest {
    public static void main(String[] args) {
        Thread td = new Thread(()->{
            System.out.println("Thread one executed..");
        });
        td.start();
    }
}
