package com.sambit.java8features.codinginterview;

public class Employee {
    private int id;
    private String empName;
    private int deptid;
    private String status = "active";
    private int salary;

    public Employee(int id, String empName, int deptid, String status, int salary) {
        this.id = id;
        this.empName = empName;
        this.deptid = deptid;
        this.status = status;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", deptid=" + deptid +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
}
