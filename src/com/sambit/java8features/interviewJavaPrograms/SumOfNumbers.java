package com.sambit.java8features.interviewJavaPrograms;

import java.util.Scanner;

//Input will be 123 and output will be 6 (1 + 2 +3)
public class SumOfNumbers {
    public static void main(String args[]){
        int num, rem, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        while(num != 0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
