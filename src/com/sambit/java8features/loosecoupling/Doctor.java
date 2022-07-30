package com.sambit.java8features.loosecoupling;

public class Doctor implements Job{
    @Override
    public void show() {
        System.out.println("Doctor....");
    }
}
