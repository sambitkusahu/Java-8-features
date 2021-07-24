package com.sambit.java8features.InterviewQuestions;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA\\Test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //StringBuffer lineTxt = new StringBuffer();
        String lineTxt;
        int count = 1;
        while (( lineTxt = bufferedReader.readLine()) != null){
            if(count % 2 == 0){
                count++;
                continue;
            }

            count++;
            System.out.println(lineTxt);
        }

        bufferedReader.close();
    }
}
