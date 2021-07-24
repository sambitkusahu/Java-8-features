package com.sambit.java8features.setMapExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("5264");
        list.add("5265");
        list.add("5266");
        list.add("5267");
        String val = "565";
        Set<String> set = new HashSet<String>();
        for(String str: list){
            set.add(str+val);
        }
        System.out.println(set);
    }
}
