package com.sambit.java8features.streamcodinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("john","debbie","simon");
        List<Integer> num = Arrays.asList(1,2,3,4,5);
       list.stream()
               .map(name-> name)
               .peek(System.out::println);
    }
}
