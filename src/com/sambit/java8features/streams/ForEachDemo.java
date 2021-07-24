package com.sambit.java8features.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Michael");
        names.add("Robert");
        names.add("Dillion");
        names.add("Subbu");

       // names.stream().forEach(t-> System.out.println(t));
       //names.stream().forEach(System.out::println);

       Map<Integer, String> map = new HashMap<>();
       map.put(1, "John");
       map.put(2, "Simon");
       map.put(3, "Micky");
       map.put(4, "Thomas");
       //If you use direct forEach like below, you will not be getting stream methods to perform your multiple operation with method chaining.
       //map.forEach((key,val) -> System.out.println(key + " -> "+ val));

       //Use stream to perform method chaining to perform multiple operation.
        //forEach accepts consumer interface
        //filter accepts predicate interface
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
    }
}
