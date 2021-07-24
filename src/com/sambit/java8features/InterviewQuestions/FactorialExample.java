package com.sambit.java8features.InterviewQuestions;

public class FactorialExample {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21
        int a = 0, b = 1, c, i=0, sum;
        System.out.print(a +",");
        System.out.print(b +",");

        while(i < 10){
            sum = a +b;
            System.out.print(sum +",");
            a = b;
            b = sum;
            i++;
        }
    }
}
