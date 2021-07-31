package com.sambit.java8features.streamcodinginterview;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<=100; i++){
            System.out.println("I am Child Thread...");
        }
    }

    public static void main(String[] args) {
        RunnableDemo rd = new RunnableDemo();
        for (int i=1; i<=1000; i++){
            System.out.println("I am main Thread...");
        }
        Runnable target;
        Thread td = new Thread(rd);
        td.start();
    }
}
