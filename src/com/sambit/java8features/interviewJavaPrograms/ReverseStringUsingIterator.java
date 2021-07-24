package com.sambit.java8features.interviewJavaPrograms;
//Reverse a String with toCharArray() method.
public class ReverseStringUsingIterator {
    public static void main(String[] args) {
        String str = "Hello";
        char[] strArray = str.toCharArray();
        for(int i = strArray.length-1; i>=0; i--){
            System.out.println(strArray[i]);
        }
    }
}
