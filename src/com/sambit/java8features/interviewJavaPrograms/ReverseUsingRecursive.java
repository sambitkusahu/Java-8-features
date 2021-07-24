package com.sambit.java8features.interviewJavaPrograms;

public class ReverseUsingRecursive {
    public static void main(String[] args) {
        String str1 = recursiveMethod("Hello");
        System.out.println(str1);
    }
    public static String recursiveMethod(String str){
        if((null == str) || (str.length() <= 1)){
            return str;
        }
        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
