package com.sambit.java8features.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindSecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> allEmployees = Database.getAllEmployees();
        //Find 3 highest salary from the employee object
        Stream<Employee> filteredEmp = allEmployees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3);
        filteredEmp.forEach(System.out::println);
        System.out.println("***********************");
        //Find second highest salary from employee object
        Optional<Employee> first = allEmployees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
        if(first.isPresent())
            System.out.println(first.get());
    }
}
