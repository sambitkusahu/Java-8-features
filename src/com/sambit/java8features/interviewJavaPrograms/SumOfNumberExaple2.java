package com.sambit.java8features.interviewJavaPrograms;

import java.util.Scanner;

public class SumOfNumberExaple2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
          //  sum = sum + str.charAt(i) - 48 ; // str.charAt(i) will retrun the ASCII value thats why we are substracting from 48, because ASCII value starts from 48
            sum = sum + Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}

/*
* ASCII value of 0 is 48
* 0 -> 48
* 1 -> 49
* 2 -> 50
* 3 -> 51
* 4 -> 52
* 5 -> 53
* */