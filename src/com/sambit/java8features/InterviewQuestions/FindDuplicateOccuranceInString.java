package com.sambit.java8features.InterviewQuestions;

import java.util.*;

public class FindDuplicateOccuranceInString {
    public static void main(String[] args) {
        String str = "I am am learning code in java java";
        String str1 = "hjdhhjdshihdshfdf";
        findDuplicate(str);
        findDuplicateChar(str1);
    }

    private static void findDuplicate(String str){
        Map<String, Integer> map = new HashMap();
        String[] arr = str.split(" ");
        for(String st: arr){
            if(map.containsKey(st)){
               map.put(st, map.get(st) + 1);
            }else{
                map.put(st, 1);
            }
        }
        Set<String> keySet = map.keySet();
        for(String str1: keySet){
           // System.out.println("The word : "+str1 + " - Occurance : "+ map.get(str1));
        }
    }

    private static void findDuplicateChar(String str){
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: arr){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
     /*   Iterator<Character> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Character next = iterator.next();
            System.out.println("Character : "+ next + " - Occurance is : "+ map.get(next));
        } */

        map.keySet().stream().forEach(key -> System.out.println("Key : "+ key + " - Occurance is : "+ map.get(key)));
    }
}
