package com.sambit.java8features.streamcodinginterview;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamGroupBy {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        list.add(new Employee(101,"John",401, "Active",9000));
        list.add(new Employee(102,"Debbie",402, "Active",5000));
        list.add(new Employee(103,"Mike",401, "Active",1000));
        list.add(new Employee(104,"Aally",403, "Active",3000));
        list.add(new Employee(105,"Tushar",205, "Inactive",50000));
        list.add(new Employee(106,"Syam",402, "Active",80000));
        list.add(new Employee(107,"Simon",401, "Inactive",40000));
        list.add(new Employee(108,"Tekila",403, "Active",30000));
        list.add(new Employee(109,"Zee",205, "Inactive",20000));
        
        //Print Employee Based on department
        Map<Integer, List<Employee>> empListBasedOnDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptid, Collectors.toList()));
        empListBasedOnDept.entrySet().forEach(entry -> System.out.println(entry.getKey() +"-----"+entry.getValue()));
        System.out.println("*********************************************");

        //Print Employee count based on department
        Map<Integer, Long> empCountByDeptId = list.stream().collect(Collectors.groupingBy(Employee::getDeptid, Collectors.counting()));
        empCountByDeptId.entrySet().forEach(entry -> System.out.println(entry.getKey()+"----------"+ entry.getValue()));
        System.out.println("**********************************************");

        //Get Active Employee list
        List<Employee> activeEmpList = list.stream().filter(emp -> emp.getStatus().equalsIgnoreCase("Active")).collect(Collectors.toList());
        activeEmpList.forEach(System.out::println);
        System.out.println("**********************************************");

        //Get Active and  Inactive Employee count
        long activeEmpCount = list.stream().filter(emp -> emp.getStatus().equalsIgnoreCase("Active")).count();
        long inactiveEmpCount = list.stream().filter(emp -> emp.getStatus().equalsIgnoreCase("Inactive")).count();
        System.out.println("Active Employee Count : "+ activeEmpCount);
        System.out.println("Inactive Employee Count : "+ inactiveEmpCount);
        System.out.println("**********************************************");

        //Min and Max salary Employee from the  given collection
        Optional<Employee> maxSalaryEmployee = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        Employee maxSalEmployee = maxSalaryEmployee.get();
        Optional<Employee> minSalaryEmployee = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        Employee minSalEmployee = minSalaryEmployee.get();
        System.out.println("Max Salary Employee"+ maxSalEmployee);
        System.out.println("Min Salary Employee"+ minSalEmployee);
        System.out.println("**********************************************");

        //Find the min and max salary from the given collection - Other way to achieve
        Optional<Employee> maxSal = list.stream().max(Comparator.comparing(Employee::getSalary));
        Employee maxSalary = maxSal.get();
        Optional<Employee> minSal = list.stream().min(Comparator.comparing(Employee::getSalary));
        Employee minSalary = minSal.get();
        System.out.println("Max Salary : "+ maxSalary);
        System.out.println("Min Salary : "+ minSalary);
        System.out.println("**********************************************");

        //Get Max Salary of an employee from each department.
        Map<Integer, Optional<Employee>> topEmpFromEachDept = list.stream()
                .collect(Collectors.groupingBy(Employee::getDeptid, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        topEmpFromEachDept.entrySet().forEach(System.out::println);

    }
}
