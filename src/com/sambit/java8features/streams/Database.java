package com.sambit.java8features.streams;

import java.util.Arrays;
import java.util.List;

public class Database {
   public static List<Employee> getAllEmployees(){
       return Arrays.asList(
               new Employee(101,"John",111,"Active",15000),
               new Employee(102,"Sally",112,"Inactive",20000),
               new Employee(103,"Mike",113,"Inactive",22000),
               new Employee(104,"Sena",112,"Active",12000),
               new Employee(105,"Tommy",115,"Active",19000),
               new Employee(106,"Karen",111,"Inactive",11000)
       );
   }
}
