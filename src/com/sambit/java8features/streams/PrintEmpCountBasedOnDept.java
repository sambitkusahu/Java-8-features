package com.sambit.java8features.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Print Employee count based on each department.
//Grouping by takes two input params.
public class PrintEmpCountBasedOnDept {
    public static void main(String[] args) {
        List<Employee> allEmployees = Database.getAllEmployees();
        Map<Integer, Long> empCountByDept = allEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        System.out.println(empCountByDept);

    }
}
