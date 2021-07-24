package com.sambit.java8features.InterviewQuestions;

import java.util.Scanner;

public class PalindromeExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindrome(str));
    }

    private static boolean palindrome(String str){
        int i =0, j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
