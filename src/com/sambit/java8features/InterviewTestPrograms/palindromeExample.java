package com.sambit.java8features.InterviewTestPrograms;

import java.util.Stack;

public class palindromeExample {
    public static void main(String[] args) {
        //number is palindrome or not ?  eg 515, 151, 212

        System.out.println(isPalindrome(151));
    }

    public static boolean isPalindrome(int num){
        int rem, result = 0, originalNum = num;
       while(num > 0){
           rem = num % 10;
           result = (result *10)+rem;
           num = num/10;
       }
       return (result == originalNum);
    }
}
