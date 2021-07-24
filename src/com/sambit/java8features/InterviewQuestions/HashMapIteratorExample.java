package com.sambit.java8features.InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorExample {
    public static void main(String[] args) {
        String str = "Hello";

        Map<String, String>map = new HashMap<>();
        map.put("India","Delhi");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Russia","Moscow");
        System.out.println(map);

        Iterator<String> keySet = map.keySet().iterator();
        while(keySet.hasNext()){
            String key = keySet.next();
            map.put(key, map.get(key)+" H");
        }
        System.out.println(map);
    }
}
