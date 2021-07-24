package com.sambit.java8features.interviewJavaPrograms;
//Amstrong number examples are 153, 370, 371
import java.util.Scanner;

public class AmstrongNumberExample {
    public static void main(String args[]){
        int input, sum = 0, mod, amstrongNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        input = sc.nextInt();
        amstrongNumber = input;
        while(input != 0){
           mod = input % 10;
           sum = sum + (mod * mod * mod);
           input = input / 10;
        }
        if(sum == amstrongNumber)
            System.out.println("Number is a Amstrong number...");
        else
            System.out.println("Number is not a amstrong number..");
    }
}
