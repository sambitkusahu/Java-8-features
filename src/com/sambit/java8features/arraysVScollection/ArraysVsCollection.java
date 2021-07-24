package com.sambit.java8features.arraysVScollection;

import java.util.ArrayList;
import java.util.List;

/*
* Array is fixed in size, collection is growable. We can increase and decrease the size
* Arrays are not recommended when it comes to memory
* Collection are recommended to use
* Arrays are much faster than collection.
* Collection slower than Arrays.
* Arrays can hold object and primitive
* Collection can hold only objects not primitive
* */
public class ArraysVsCollection {
    public static void main(String[] args) {
        //Array, Type Safe, Type Cast
        String[] s = new String[5];
        s[0] = "JOhn";
        s[1] = "Nancy";

        System.out.println("String Array is : "+s);
        //List

        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Nancy");
        list.add("Sam");

        String name = list.get(1);
        System.out.println("Name : "+ name);
    }
}
