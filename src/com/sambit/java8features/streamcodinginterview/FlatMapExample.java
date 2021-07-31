package com.sambit.java8features.streamcodinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        //flat map used to flattern the map
        //for example List<List<Integer>> to List<Integer> conversion, so we can perform the operation easily.
        List<Integer>list1 = Arrays.asList(1,2,3);
        List<Integer>list2 = Arrays.asList(4,5,6);
        List<Integer>list3 = Arrays.asList(9,8,7);
        List<List<Integer>>listOfList = Arrays.asList(list1, list2, list3);

        listOfList.stream()
                .flatMap(li -> li.stream()).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
