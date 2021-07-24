package com.sambit.java8features.interviewJavaPrograms;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int n = sc.nextInt();
        int startPoint = 1;
        int result = 1;
        while(startPoint <= n){
            result = result * startPoint;
            startPoint ++;
        }
        System.out.println(result);
    }
}
