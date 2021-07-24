package com.sambit.java8features.InterviewQuestions;

import java.util.Stack;
//Convert Integer to Binary....
public class IntegerToBinary {
    public static void main(String[] args) {
        printBinary(10);
    }

   public static void printBinary(int num){
        Stack st = new Stack();
        while(num > 0){
            int rem = num % 2;
            st.push(rem);
            num = num / 2;
        }

        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
   }
}