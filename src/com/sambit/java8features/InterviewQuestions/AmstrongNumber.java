package com.sambit.java8features.InterviewQuestions;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isAmstrongNum(num));
    }
    //1 5 3
    private static boolean isAmstrongNum(int num){
        int remainder, originalNum = num, sum = 0;
        while(num != 0){
            remainder = num % 10;
            sum = sum +(remainder * remainder * remainder);
            num = num /10;
        }
        return originalNum == sum;
    }

}
