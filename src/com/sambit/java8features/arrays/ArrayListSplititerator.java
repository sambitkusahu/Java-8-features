package com.sambit.java8features.arrays;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListSplititerator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc@gmail.com");
        list.add("def@gmail.com");
        list.add("ghi@gmail.com");
        list.add("jkl@gmail.com");

        Spliterator<String> emails = list.spliterator();
        System.out.println("List of emails : ");
        emails.forEachRemaining((n)-> System.out.println(n));
    }
}
