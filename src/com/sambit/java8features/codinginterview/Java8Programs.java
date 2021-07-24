package com.sambit.java8features.codinginterview;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Java8Programs {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101,"Siva",101,"active",5000));
        empList.add(new Employee(102,"Siva",101,"active",3000));
        empList.add(new Employee(103,"Siva",102,"inactive",2500));
        empList.add(new Employee(104,"Siva",102,"inactive",2000));
        empList.add(new Employee(105,"Siva",102,"active",4000));
        empList.add(new Employee(106,"Siva",101,"active",2000));
        empList.add(new Employee(107,"Siva",102,"inactive",3500));

        //Print emp details based on department.
        Map<Integer, List<Employee>> empListBasedonDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptid, Collectors.toList()));

        empListBasedonDept.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + "--- " +entry.getValue());
        });
        // Print number of employees for each department.
        Map<Integer, Long> empCountByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptid, Collectors.counting()));
        empCountByDept.forEach((key, val)->{
            System.out.println("Dept : "+ key + " -- " +"Count: "+val);
        });

        //Print the active and inactive employees form the collection.
        long activeEmpCount = empList.stream().filter(emp -> emp.getStatus().equals("active")).count();
        long inactiveEmpCount = empList.stream().filter(emp -> emp.getStatus().equals("inactive")).count();
        System.out.println("Active Emp Count: "+ activeEmpCount);
        System.out.println("Inactive Emp Count: "+ inactiveEmpCount);

        //Print max and min salary from given collection
        Optional<Employee> maxSalary = empList.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> minSalary= empList.stream().min(Comparator.comparing(emp -> emp.getSalary()));

        System.out.println("Max Salary: "+ maxSalary);
        System.out.println("Min Salary: "+ minSalary);

        //Print max salary of an employee from each department.
        Map<Integer, Optional<Employee>> maxSalaryofAnEmpByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptid, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        maxSalaryofAnEmpByDept.forEach((key, val)->{
            System.out.println("Dept : "+ key +"  "+ val);
        });

    }
}
