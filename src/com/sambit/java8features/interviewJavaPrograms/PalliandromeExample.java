package com.sambit.java8features.interviewJavaPrograms;

public class PalliandromeExample {
    public static void main(String[] args) {
        boolean isPalliandrome = palliandrome("abccba");
        System.out.println(isPalliandrome);
    }
    static boolean palliandrome(String str){
        int i = 0;
        int j = str.length() - 1;
        for (i = 0; i < j; i++){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
