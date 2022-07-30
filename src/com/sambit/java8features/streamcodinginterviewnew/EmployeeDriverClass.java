package com.sambit.java8features.streamcodinginterviewnew;

import java.util.*;
import java.util.stream.Collectors;
//https://github.com/javaTechiess/org/blob/main/src/javatechies/org/stream/EmployeeStreamDemo.java
public class EmployeeDriverClass {
   static List<Employee>employeeList = new ArrayList<>();
    public static void main(String[] args) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();
        method8();
        method9();
        method11();
        method12();
        method13();
        method14();
        method15();

    }

    public static void method1(){
        System.out.println("Query 1 : How many male and female employees are there in the organization?");
        Map<String, Long> noOfMaleAndFemaleEmployees =
                employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("No Of Male And Female Employees : "+ noOfMaleAndFemaleEmployees);
    }

    public static void method2(){
        System.out.println("Query 2 : Print the name of all departments in the organization?");
        List<String> allDepartments = employeeList.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toList());
        System.out.println("AllDepartments = " + allDepartments);
    }

    public static void method3(){
        System.out.println("Query 3 : What is the average age of male and female employees?");
        Map<String, Double> averageAgeOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("averageAgeOfMaleAndFemaleEmployee = " + averageAgeOfMaleAndFemaleEmployee);
    }

    public static void method4(){
        System.out.println("Query 4 : Get the details of highest paid employee in the organization?");
        Optional<Employee> highestPaidEmployee = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("highestPaidEmployee = " + highestPaidEmployee);
    }

    public static void method5(){
        System.out.println("Query 5 : Get the names of all employees who have joined after 2015?");
        List<String> employeeJoinedAfter2015 = employeeList.stream()
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeeJoinedAfter2015);

        employeeList.stream()
                .filter(emp-> emp.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void method6(){
        System.out.println("Query 6 : Count the number of employees in each department?");
        Map<String, Long> employeeCountByDepartment  = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        employeeCountByDepartment.entrySet()
                .stream().forEach(System.out::println);
    }

    public static void method7(){
        System.out.println("Query 7 : What is the average salary of each department?");
        Map<String, Double> avgSalaryOfDepartments = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("avgSalaryOfDepartments = " + avgSalaryOfDepartments);
    }

    public static void method8(){
        System.out.println("Query 8 : Get the details of youngest male employee in the product development department?");
        //First Approach
        Optional<Employee> youngestMaleEmployeeInProductDevelopment = employeeList.stream()
                .filter(emp -> emp.getDepartment() == "Product Development" && emp.getGender() == "Male")
                .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
        System.out.println(youngestMaleEmployeeInProductDevelopment.get().getName());
        //Second Approach
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
                .filter(emp -> emp.getDepartment() == "Product Development" && emp.getGender() == "Male")
                .min(Comparator.comparing(Employee::getAge));
        System.out.println("youngestMaleEmployeeInProductDevelopmentWrapper = " + youngestMaleEmployeeInProductDevelopmentWrapper);
    }

    public static void method9(){
        System.out.println("Query 9 : Who has the most working experience in the organization?");
        //First Approach
        Optional<Employee> seniorMostEmployee = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
        System.out.println("seniorMostEmployee = " + seniorMostEmployee.get().getName());
        
        //Second Approach
        Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));
        System.out.println("seniorMostEmployeeWrapper = " + seniorMostEmployeeWrapper.get().getName());
    }

    public static void method10(){
        System.out.println("Query 10 : How many male and female employees are there in the sales and marketing team?");
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing = employeeList.stream()
                .filter(emp -> emp.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("countMaleFemaleEmployeesInSalesMarketing = " + countMaleFemaleEmployeesInSalesMarketing);
    }

    public static void method11(){
        System.out.println("Query 11 : What is the average salary of male and female employees?");
        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("avgSalaryOfMaleAndFemaleEmployees = " + avgSalaryOfMaleAndFemaleEmployees);
    }

    public static void method12(){
        System.out.println("Query 12 : List down the names of all employees in each department?");
        //First Approach
        Map<String, List<Employee>> employeeListByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("employeeListByDepartment = " + employeeListByDepartment);
        //Second Approach
        Map<String, List<Employee>> employeeListByDepartmentWrapper = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        System.out.println("employeeListByDepartmentWrapper = " + employeeListByDepartmentWrapper);
    }

    public static void method13(){
        System.out.println("Query 13 : What is the average salary and total salary of the whole organization?");
        DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("employeeSalaryStatistics.getAverage() = " + employeeSalaryStatistics.getAverage());

        System.out.println("employeeSalaryStatistics.getSum() = " + employeeSalaryStatistics.getSum());
        //Total Salary of all Employees
        Double totalSalaryOfAllEmployees = employeeList.stream()
                .map(Employee::getSalary)
                .reduce(0.0, (sal1, sal2) -> sal1 + sal2);
        System.out.println("totalSalaryOfAllEmployees = " + totalSalaryOfAllEmployees);
        
        //Average salary of all employees.
        Double averageSalaryofAllEmployees = employeeList.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("averageSalaryofAllEmployees = " + averageSalaryofAllEmployees);

    }

    public static void method14(){
        System.out.println("Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
        Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
        System.out.println("partitionEmployeesByAge = " + partitionEmployeesByAge);
        partitionEmployeesByAge.entrySet().stream().forEach(System.out::println);
    }

    public static void method15(){
        System.out.println("Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");
        Optional<Employee> oldestEmployee  = employeeList.stream()
                .max(Comparator.comparing(Employee::getAge));
        System.out.println("oldestEmployee.get().getName() = " + oldestEmployee.get().getName());
        System.out.println("oldestEmployee.get().getAge() = " + oldestEmployee.get().getAge());
        System.out.println("oldestEmployee.get().getDepartment() = " + oldestEmployee.get().getDepartment());

        Optional<Employee> oldestEmployeeInOrg = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
        System.out.println("oldestEmployeeInOrg.get().getName() = " + oldestEmployeeInOrg.get().getName());
        System.out.println("oldestEmployeeInOrg.get().getAge() = " + oldestEmployeeInOrg.get().getAge());
        System.out.println("oldestEmployeeInOrg.get().getDepartment() = " + oldestEmployeeInOrg.get().getDepartment());
    }
}
