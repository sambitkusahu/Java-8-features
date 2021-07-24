package com.sambit.java8features.interviewJavaPrograms;

public class FibonacciUsingRecursion {
    static int n1 = 0, n2 = 1, result;

    public static void main(String[] args) {
        System.out.print(n1 +", "+ n2);
        printFibonacci(8);
    }
    static void printFibonacci(int count){
        if(count > 0){
            result = n1 + n2;
            System.out.print(", "+ result);
            n1 = n2;
            n2 = result;
            printFibonacci(count-1);
        }
    }
}
