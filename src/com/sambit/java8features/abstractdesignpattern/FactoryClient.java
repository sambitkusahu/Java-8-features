package com.sambit.java8features.abstractdesignpattern;

public class FactoryClient {
    public static void main(String[] args) {
        Factoryclass fact = new Factoryclass();
        Profession doctor = fact.getProfession("Doctor");
        doctor.printProfession();
    }
}
