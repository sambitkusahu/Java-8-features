package com.sambit.java8features.interviewJavaPrograms;

public class FibonacciExample {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, result, swapnumber;
        System.out.print(n1 +", "+ n2 );
        for(int i = 2; i<10; i++){
            result = n1 + n2;
            System.out.print(", "+ result);
            n1 = n2;
            n2 = result;
        }
    }
}
