package com.sambit.java8features.streamcodinginterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupFromList {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList();
        list.add(new Employee(101,"John",100, "Active",9000));
        list.add(new Employee(102,"Debbie",101, "Active",5000));
        list.add(new Employee(103,"Mike",102, "Active",1000));
        list.add(new Employee(104,"Aally",103, "Active",3000));
        list.add(new Employee(105,"Fushar",104, "Active",100000));


        List<Employee> res = list.stream().distinct().collect(Collectors.toList());
       // System.out.println(res);

        List<Employee> sortedEmaployeeObj = list.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());

       list.stream().
               sorted(Comparator.comparing(Employee::getEmpName)
                       .thenComparing(Comparator.comparing(Employee::getDeptid)))
               .collect(Collectors.toList()).forEach(System.out::println);

    }
}
