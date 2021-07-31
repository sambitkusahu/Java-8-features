package com.sambit.java8features.InterviewTestPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));

    }
    public static boolean isPrime(int num){
        boolean isprime = false;
        int[] divisors = {2,3,5,7};
        if(Arrays.stream(divisors).anyMatch(a-> a == num)){
            isprime = true;
        }else if(Arrays.stream(divisors).anyMatch(a-> num % a == 0)){
            isprime = false;
        }else{
            isprime = true;
        }
        return isprime;
    }
}
