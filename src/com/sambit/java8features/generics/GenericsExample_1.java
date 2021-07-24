package com.sambit.java8features.generics;
/*
 * Type safe
 * Type Casting will be taken care by generics
 * If you are designing a generics method, any type can be passed to it.
 * Even you can pass custom DTO(data transfer object to it)
 *
 */

import java.util.ArrayList;
import java.util.List;

public class GenericsExample_1 {
    public static void main(String[] args) {
        System.out.println(listMethod("Apple", "Orange"));
        System.out.println(genericMethod("Banana", "Guava"));
        System.out.println(genericMethod(100, 200));
        System.out.println(genericMethod('A', 'B'));
        System.out.println(genericMethod(new Student(), new Student()));
    }
    static <T> List<T> genericMethod(T s1, T s2){
        List<T> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return list;
    }

    static List<String> listMethod(String s1, String s2){
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return list;
    }
}

class Student{

}


