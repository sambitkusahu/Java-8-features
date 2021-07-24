package com.sambit.java8features.codinginterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicateUsingStreams {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(5,3,4,1,3,5,3,7,9,6,4,9,4,3,5);
        List<String> stringList = Arrays.asList("Syam", "Mohan","Kumar","Syam","Mohan");
        Map<Integer, Long> result = numList.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        result.forEach((key, val)-> {
            System.out.println(key +" - "+val);
        });

        Map<String, Long> strResult = stringList.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        strResult.forEach((key, val)->{
            System.out.println(key +" - "+val);
        });

    }
}
