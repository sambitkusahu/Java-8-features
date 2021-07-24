package com.sambit.java8features.setMapExample;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
       List<Color> colors = new ArrayList<>();
        colors.add(new Color("Red", "#454"));
        colors.add(new Color("Red", "#454"));
        colors.add(new Color("Green", "#157"));

        Set<String> set = new HashSet<>();
        set.add("ACTIVE|JIJF");
        set.add("HELLO|ikgt");
        set.add("MORNING|iktgh");
        set.add("5145|ikght");
        set.add("IJND|ikg");
        Set<String> collectedVal = set.stream().map(acc -> acc.split("|")[1]).collect(Collectors.toSet());
        System.out.println(collectedVal);

        Map<String, String> map = new HashMap<>();
        map.put("1", "abc");
        map.put("2", "abc");
        map.put("3", "abc");

       // set.stream().anyMatch(p-> p.equals("HELLO"));
     //   Set<String>filteredSet =  set.stream().filter(p-> (p.contains("HELLO UYDUYUYD HU"))).collect(Collectors.toSet());
        boolean isFound = set.stream().anyMatch(p-> p.equals("JID JHDJH DHGF KJF FH HU JHJHF HF "));

        //Assign lefthand side variable -> Ctrl + Alt + v OR Alt + Enter
    }

    public static String findAccount(String lineTxt, Set<String>set){
        String data = null;
        for(String str: set){
            if(lineTxt.contains(str)){
                data = str;
                break;
            }
        }
        return data;
    }
}
