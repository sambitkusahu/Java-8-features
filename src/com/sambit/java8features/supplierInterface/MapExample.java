package com.sambit.java8features.supplierInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        Set<String> hset = new HashSet<String>();
        hset.add("test");
        hset.add("test1");
        hset.add("test2");
        hset.add("test3");
        hset.add("test4");
        //Convert List to MAP
        Map<String, Integer>map = new HashMap<String, Integer>();
        map = hset.stream().collect(Collectors.toMap(Function.identity(), String::hashCode));
        map.forEach((s, integer) -> {
            System.out.println(s);
            System.out.println(integer);
        });
    }
}
