package com.sambit.java8features.constructorChaining;

public class Test_1 {

    public Test_1() {
        this(20, 30);
        System.out.println("Default Constructor called..");
    }

    public Test_1(int i) {
        System.out.println("I value is : "+ i);
    }

    public Test_1(int i, int j) {
        System.out.println("I value is : "+ i +" J value is " + j);
    }
}

class MainClass{
    public static void main(String[] args) {
        Test_1 t = new Test_1();
    }
}
