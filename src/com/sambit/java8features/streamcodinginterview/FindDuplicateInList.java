package com.sambit.java8features.streamcodinginterview;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 100, "Active", 1000));
        employees.add(new Employee(4, "Mike", 103, "Active", 2000));
        employees.add(new Employee(3, "Shon", 104, "Active", 4000));
        employees.add(new Employee(5, "Kelly", 106, "Active", 6000));
        employees.add(new Employee(3, "Shon", 104, "Active", 4000));
        employees.add(new Employee(4, "Mike", 103, "Active", 2000));
        //Filter Example
        employees.stream().filter(emp -> emp.getSalary() >= 4000).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("*******************");
        //Remove Duplicates from list
        employees.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("*******************");
        //Put the duplicates into a Map
        Map<Employee, Long> collectedObj = employees.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collectedObj);
        //Sort element
        System.out.println("********Comparable Interface***********");
        List<Employee> sortedObj = employees.stream().sorted((emp1, emp2)-> emp1.getEmpName().compareTo(emp2.getEmpName())).collect(Collectors.toList());
        System.out.println(sortedObj);
        System.out.println("********Comparator Interface***********");
        List<Employee> sortByComparator = employees.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).collect(Collectors.toList());
        System.out.println(sortByComparator);

    }
}
