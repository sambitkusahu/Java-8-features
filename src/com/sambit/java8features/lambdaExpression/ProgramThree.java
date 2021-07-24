package com.sambit.java8features.lambdaExpression;

interface CalculateSubtraction {
    int subtraction(int a, int b);
}

public class ProgramThree {
    public static void main(String[] args) {
        CalculateSubtraction calculateSubtraction = (a, b) ->{
            return a - b ;
        };
       int sub =  calculateSubtraction.subtraction(50,15);
        System.out.println("Subtraction is : "+ sub);
    }
}
