package com.sambit.java8features.lambdaExpression;

interface Calculator{
    void sum(int a, int b);
}

public class ProgramTwo {
    public static void main(String[] args) {
        Calculator calculator = (a, b)->{
            System.out.println("Sum is : "+ (a+b));
        };
        calculator.sum(52, 12);
    }

}
