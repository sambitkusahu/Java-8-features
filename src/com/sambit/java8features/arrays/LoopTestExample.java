package com.sambit.java8features.arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopTestExample {
    public static void main(String[] args) throws IOException {
        Map<String, List<String>>map = new HashMap<>();
        int count = 3;
        int i;
       // String file = "D:\\JAVA\\Test_1.txt";
        File file = new File("D:\\JAVA\\Test_1.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("D:\\JAVA\\Test_1.txt")));
        String lineText;
        while ((lineText = bufferedReader.readLine()) != null){
            if(map.containsKey(lineText)){
                List list = map.get(lineText);
                list.add(lineText);
            }else{
                List list = new ArrayList();
                list.add(lineText);
                map.put(lineText, list);
            }
        }
        bufferedReader.close();
        System.out.println(map);
    }
}
