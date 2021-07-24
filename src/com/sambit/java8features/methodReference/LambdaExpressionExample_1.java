package com.sambit.java8features.methodReference;

import java.util.Comparator;

public class LambdaExpressionExample_1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run method called");
            }
        };

        runnable.run();
    }
}
