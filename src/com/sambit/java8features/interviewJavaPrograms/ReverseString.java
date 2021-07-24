package com.sambit.java8features.interviewJavaPrograms;
//Using String buffer we can reverse a String.
public class ReverseString {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        String rev = String.valueOf(sbf.reverse());
        System.out.println(rev);
    }
}
