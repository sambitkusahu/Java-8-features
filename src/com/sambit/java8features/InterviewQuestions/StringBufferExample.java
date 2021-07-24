package com.sambit.java8features.InterviewQuestions;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer();

        StringBuffer sbf1 = new StringBuffer();
        sbf.append("Sambit");
        for (int i=0; i<10; i++){
            sbf.append("#"+i);
        }
        sbf.reverse();
        System.out.println(sbf.toString());
    }
}
