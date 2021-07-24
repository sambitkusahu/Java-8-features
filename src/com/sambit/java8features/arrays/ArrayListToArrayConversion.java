package com.sambit.java8features.arrays;

import java.util.ArrayList;
import java.util.List;
//Convert Array list to aray
public class ArrayListToArrayConversion {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(10);
        listInteger.add(20);
        listInteger.add(30);
        listInteger.add(40);
        listInteger.add(50);
        Integer[] arr = new Integer[listInteger.size()];
        arr = listInteger.toArray(arr);

        System.out.println("Print the array..");
        for(Integer x: arr){
            System.out.println(x + " ");
        }
    }
}
