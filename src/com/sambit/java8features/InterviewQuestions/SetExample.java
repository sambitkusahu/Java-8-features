package com.sambit.java8features.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        StringBuffer acc = new StringBuffer();
        StringBuffer acc1 = new StringBuffer();
        acc.append("Hello");
        acc1.append("Hi");

        set.add(acc.toString().concat(acc1.toString()));
        System.out.println(set);

    }
}
