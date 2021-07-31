package com.sambit.java8features.streamcodinginterview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(4, "Four");
        map.put(1, "One");
        map.put(3, "Three");
        map.entrySet().stream().forEach(System.out::println);
        System.out.println("**********");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
