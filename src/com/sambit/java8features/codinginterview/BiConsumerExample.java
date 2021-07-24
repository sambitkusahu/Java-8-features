package com.sambit.java8features.codinginterview;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = ( a,  b) -> System.out.println(a+b);
        biConsumer.accept(10,5);
    }
}
