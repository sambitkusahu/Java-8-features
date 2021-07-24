package com.sambit.java8features.interviewJavaPrograms;

public class PalliandromeExample2 {

    public static void main(String[] args) {
        boolean isPalliandrome = isPalliandrome("abccbaa");
        System.out.println("String is a palliandrome: "+ isPalliandrome);
    }

    static boolean isPalliandrome(String str){
        int i = 0;
        int j = str.length() -1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
