package com.sambit.java8features.InterviewQuestions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sbf = new StringBuffer(str);

        String originalStr = str;
        String revStr = sbf.reverse().toString();
        if(originalStr.equalsIgnoreCase(revStr)){
            System.out.println("String is palindrome...");
        }else{
            System.out.println("String is not palindrome...");
        }
    }
}
