package com.sambit.java8features;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<String>();
        arrList.add("One");
        arrList.add("Two");
        arrList.add("Two");
        arrList.add("Odd");

       // arrList.forEach(a -> System.out.println(a));

        for(String abc : arrList){
            System.out.println(abc);
        }
    }
}
