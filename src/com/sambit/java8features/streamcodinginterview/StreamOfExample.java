package com.sambit.java8features.streamcodinginterview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Zeera","John", "Mike", "Tako","Apple");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println("************");
        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
