package com.sambit.java8features.methodReference;

public class MethodRefExample {
    public static void main(String[] args) {
        Thread t = new Thread(MethodRefExample::printMessage);
        t.start();
    }
    public static void printMessage(){
        System.out.println("Print message method called..");
    }
}
