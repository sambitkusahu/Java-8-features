package com.sambit.java8features.immutableclass;

public class TestClass {
    public static void main(String[] args) {
        AgeMutableClass age = new AgeMutableClass();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(2021);

        immutableExample immutableExample = new immutableExample(1,"Sambit", age);

        System.out.println(immutableExample.getAge().getYear());
        //age.setYear(1989);
        immutableExample.getAge().setYear(1989);
        System.out.println(immutableExample.getAge().getYear());
    }
}
