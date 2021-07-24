package com.sambit.java8features.factoryDesignPattern;
/*Main class is just need the object, wil not be aware how the factory class creating the object. This is called factory design pattern.*/
public class MyMainClass {
    public static void main(String[] args) {
        FactoryClass fact = new FactoryClass();
        Profession prof =  fact.getProfession("Teacher");
        prof.print();
    }
}
