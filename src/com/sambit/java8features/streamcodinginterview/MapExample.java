package com.sambit.java8features.streamcodinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("john","debbie","simon");
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        num.stream().map(n-> n*n).collect(Collectors.toList()).forEach(System.out::println);
    }
}
