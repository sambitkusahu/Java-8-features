package com.sambit.java8features.immutableExample;

public class App {
    public static void main(String[] args) {

        Address address = new Address("Hyd", "Telangana");
        Student student = new Student(123, "Sambit",address);

        System.out.println(student);

        Address homeAddress = student.getAddress();
        homeAddress.setCity("Blr");
        homeAddress.setState("Karnataka");

        System.out.println(student);
    }
}
