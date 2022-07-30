package com.sambit.java8features.TestPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDriver {
    public static void main(String[] args) {
        List<Employee_Test> employeeList = Arrays.asList(
                new Employee_Test("John", 25, 10000.00),
                new Employee_Test("Ella", 27, 20000.00),
                new Employee_Test("Steve", 24, 12000.00),
                new Employee_Test("Smith", 18, 14000.00),
                new Employee_Test("Sally", 21, 18000.00)
        );

        List<Employee_Test> filteredEmpList = employeeList.stream()
                .map(e -> {
                    if (e.getAge() > 25) {
                        e.setSalary(e.getSalary() * 2.20);
                    }
                    return e;
                }).collect(Collectors.toList());

    employeeList.stream().forEach(System.out::println);


        employeeList.stream()
                .filter(emp-> emp.getAge() > 25)
                .map(emp->{
                    emp.setSalary(emp.getSalary()*1.10);
                    return emp;
                })
                .collect(Collectors.toList());

    }
}
