package com.sambit.java8features.abstractFactoryDesignPattern;

public class FactoryPatternMainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
        Profession eng = abstractFactory.getProfession("Engineer");
        eng.print();
    }
}
