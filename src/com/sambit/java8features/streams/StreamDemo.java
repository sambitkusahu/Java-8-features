package com.sambit.java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> arlist = new ArrayList<Integer>();
        arlist.add(10);
        arlist.add(20);
        arlist.add(30);

        List<Integer> newArrayList = new ArrayList<Integer>();
        newArrayList = arlist.stream().filter(num-> num >= 15).collect(Collectors.toList());
    //    newArrayList.stream().forEach(x -> System.out.println(x));
     //   newArrayList.stream().forEach(System.out::println); //Method reference example

     //   arlist.stream().filter(x -> x%2 == 0).forEach(System.out::println);

        //map example in Stream
       // arlist.stream().map(i -> i*i).forEach(System.out::println);
        newArrayList = arlist.stream().map(i -> i*i).collect(Collectors.toList());
        newArrayList.forEach(System.out::println);
    }
}
