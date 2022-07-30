package com.sambit.java8features.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PrintActiveAndInactiveEmp {
    public static void main(String[] args) {
        List<Employee> allEmployees = Database.getAllEmployees();
        //Get Active employee list, use filter to get desired result
        List<Employee> activeEmpList = allEmployees.stream().
                filter(emp -> emp.getStatus().equalsIgnoreCase("Active"))
                .collect(Collectors.toList());
        System.out.println("activeEmpList = " + activeEmpList);
        //Get Inactive employee list
        List<Employee> inactiveEmpList = allEmployees.stream()
                .filter(emp -> emp.getStatus().equalsIgnoreCase("Inactive"))
                .collect(Collectors.toList());

        System.out.println("inactiveEmpList = " + inactiveEmpList);
    }
}
