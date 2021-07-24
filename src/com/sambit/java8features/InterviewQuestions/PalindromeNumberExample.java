package com.sambit.java8features.InterviewQuestions;

public class PalindromeNumberExample {
    public static void main(String[] args) {
        System.out.println("Number is palindrome : " + isPalindrome(151));
    }
    private static boolean isPalindrome(int num){
        int remainder = 0, reverse = 0, original = num;
        while(num != 0){
            remainder = num % 10;
            reverse = (reverse * 10)+ remainder;
            num = num /10;
        }
        return (original == reverse);
    }
}
