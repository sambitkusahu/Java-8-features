package com.sambit.java8features.methodReference;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer>list = List.of(1,2,3,4,5,6,7,8);

      //  List<Integer>all = evaluate(list, n-> true);
       // List<Integer>all = evaluate(list, n-> n%2 ==0);
        List<Integer>all = evaluate(list, n-> n >3);
        System.out.println(all);
    }
    private static List<Integer>evaluate(List<Integer>values, Predicate<Integer>predicate){
        return values.stream().filter(predicate).collect(Collectors.toList());
    }
}
