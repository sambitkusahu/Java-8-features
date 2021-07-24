package com.sambit.java8features.InterviewQuestions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(palindrome(num));
    }

    private static boolean palindrome(int num){
        int reverseNum = 0, remainder, originalNum = num;
        while(num != 0){
             remainder = num %10;
             reverseNum = (reverseNum * 10)+ remainder;
             num = num/10;
        }
        return originalNum == reverseNum;
    }
}
