package com.sambit.java8features.abstractdesignpattern;

public class Factoryclass {
    Profession getProfession(String professionName){
        if(professionName == null)
            return null;
        if(professionName.equalsIgnoreCase("Doctor"))
            return new Doctor();
        if(professionName.equalsIgnoreCase("Engineer"))
            return new Engineer();
        if(professionName.equalsIgnoreCase("Teacher"))
            return new Teacher();
        return null;
    }
}
