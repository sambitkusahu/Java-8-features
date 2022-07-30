package com.sambit.java8features.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("John","Mike","Simon");
        List<String> result = list.stream().filter(emp -> emp.length() >= 5).collect(Collectors.toList());
        System.out.println(result);

    }
}
