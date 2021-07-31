package com.sambit.java8features.streamcodinginterview;

public class MainThreadExample {
    public static void main(String[] args) {
        //Print the main thread
        System.out.println(Thread.currentThread().getName());

        Thread tt = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread tt has started...");
            }
        });

        tt.start();
    }
}
