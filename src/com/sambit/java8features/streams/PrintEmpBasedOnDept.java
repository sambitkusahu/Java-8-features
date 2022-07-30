package com.sambit.java8features.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Write a program to print employee details working iin each department.
public class PrintEmpBasedOnDept {
    public static void main(String[] args) {
        List<Employee> allEmployees = Database.getAllEmployees();
        Map<Integer, List<Employee>> employeeMap = allEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
        employeeMap.entrySet().forEach(emp->{
            System.out.println("Employee Key: "+ emp.getKey() + " ==== Employee Value"+ emp.getValue());
        });
    }
}
