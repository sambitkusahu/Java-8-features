package com.sambit.java8features.abstractFactoryDesignPattern;

import com.sambit.java8features.factoryDesignPattern.Teacher;

public class TraineeAbstractFactory extends AbstractFactory {
    @Override
    Profession getProfession(String profession) {
        if(profession == null) return null;

        if(profession.equalsIgnoreCase("Teacher")){
            return new TraineeEngineer();
        }else if(profession.equalsIgnoreCase("Engineer")){
            return new TraineeEngineer();
        }
        return null;
    }
}
