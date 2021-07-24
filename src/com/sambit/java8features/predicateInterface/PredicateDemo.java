package com.sambit.java8features.predicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (a)-> a % 2 == 0;
        boolean result = predicate.test(5);
        System.out.println(result);
        //Using stream we can write the code like this
        //filter method accepts predicate, which return true or false based on some condition.
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        list1.stream().filter(t -> t % 2 == 0).forEach( e -> System.out.println("Print Even numbers : "+ e));
    }
}
