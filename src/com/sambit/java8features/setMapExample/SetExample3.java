package com.sambit.java8features.setMapExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample3 {
    public static void main(String[] args) {
       Set<String>set = new HashSet<>();
       set.add("123#234");
       set.add("165#467");
       set.add("395#697");
       Set<String> collectedVal = set.stream().map(acc -> acc.split("#")[0]).collect(Collectors.toSet());
       System.out.println(collectedVal);
    }
}
