package com.sambit.java8features.interviewJavaPrograms;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"John");
        hashMap.put(2,"Michael");
        hashMap.put(3,"Simon");
        hashMap.put(4,"Tina");
        hashMap.put(5,"Anne");
        //Convert HashMap values to list of String using addAll() method
        List<String> listStr = new ArrayList<String>();
        listStr.addAll(hashMap.values());

        for(String str: listStr){
            System.out.println(str);
        }
    }
}
