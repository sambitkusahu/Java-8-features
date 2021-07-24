package com.sambit.java8features.factoryDesignPattern;
/*
* Factory Design pattern factory calss will be responsible for creating the object. Main class will not be knowing how the object being created.
* */
public class FactoryClass {

    public Profession getProfession(String profession){
        if(profession == null){
            return null;
        }
        if(profession.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }

        if(profession.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }
        return null;
    }
}
