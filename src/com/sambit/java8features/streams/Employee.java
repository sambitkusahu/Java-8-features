package com.sambit.java8features.streams;

public class Employee {
    private Integer id;
    private String name;
    private Integer deptId;
    private String status;
    private Integer Salary;

    public Employee(Integer id, String name, Integer deptId, String status, Integer salary) {
        this.id = id;
        this.name = name;
        this.deptId = deptId;
        this.status = status;
        Salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                ", status='" + status + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
