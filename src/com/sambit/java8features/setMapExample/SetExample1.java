package com.sambit.java8features.setMapExample;

import java.util.*;
import java.util.stream.Collectors;

public class SetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("15241#3254");
        set.add("52624#5241");

        Set<String> collectedVal = set.stream().map(acc -> acc.split("#")[0]).collect(Collectors.toSet());
        System.out.println(collectedVal);

    }
}
