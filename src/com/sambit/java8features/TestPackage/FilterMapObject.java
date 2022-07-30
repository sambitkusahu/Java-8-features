package com.sambit.java8features.TestPackage;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapObject {
    public static void main(String[] args) {
        Map<Integer, String>map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Ella");
        map.put(3, "Goldie");
        map.put(4, "Michael");

        Map<Integer, String> filteredMap = map.entrySet()
                .stream()
                .filter(m -> "John".equalsIgnoreCase(m.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("filteredMap = " + filteredMap);

    }
}
