package com.sambit.java8features.abstractFactoryDesignPattern;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean isTrainee){
        if(isTrainee){
            return new TraineeAbstractFactory();
        }else{
            return new ExperianceAbstractFactory();
        }
    }
}
