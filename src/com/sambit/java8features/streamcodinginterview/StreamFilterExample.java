package com.sambit.java8features.streamcodinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,45,87,63,52,12,1,2,4,9);
        list.stream().filter(e-> e>15).collect(Collectors.toList()).forEach(System.out::println);
    }
}
