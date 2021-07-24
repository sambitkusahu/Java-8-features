package com.sambit.java8features.abstractFactoryDesignPattern;

public class ExperianceAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String profession) {
        if(profession == null)
            return null;
        if(profession.equalsIgnoreCase("Teacher")){
            return new ExperianceTeacher();
        }else if(profession.equalsIgnoreCase("Engineer")){
            return new ExperianceEngineer();
        }
        return null;
    }
}
