package com.sambit.java8features.loosecoupling;

public class DriverClass {
    public static void main(String[] args) {
        CouplingClass couplingClass = new CouplingClass(new Engineer());
        couplingClass.showData();
    }
}
