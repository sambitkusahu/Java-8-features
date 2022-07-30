package com.sambit.java8features.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
       // Function<Integer, Double>function = (input1)-> Math.sqrt(input1);
        //Function functional interface takes one input and one output type.
        Function<Integer, Double>function = Math::sqrt;
        Double result = function.apply(25);
        System.out.println("result = " + result);
        
        //BiFunction Example
        //BiFunction functional interface takes two input types and one output type
        BiFunction<Integer, Integer, Double>biFunction = (a,b)-> Math.pow(a,b);
        Double result1 = biFunction.apply(5, 2);
        System.out.println("result1 = " + result1);

    }
}
