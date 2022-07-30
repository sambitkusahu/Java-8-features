package com.sambit.java8features.generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMethodExample_2 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = map(1,"One");
        System.out.println(map1);
        Map<String, String> map2 = map("Hello", "World");
        System.out.println(map2);
    }
    public static <K,V> Map<K,V> map(K key, V value){
        Map<K,V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

}

