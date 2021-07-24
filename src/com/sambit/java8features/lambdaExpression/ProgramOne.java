package com.sambit.java8features.lambdaExpression;

interface Profession{
    void professionName();
}
//No need to implement the interface in your class, Just can directly define your interface body using functional interface.
public class ProgramOne {
    public static void main(String[] args) {
        //Lambda Expression can be implemented in functional interface.
        //The interface which will have only one abstract method is called functional interface.
        //It can have one or more default and static methods.

        Profession profession = ()->{
            System.out.println("Teacher Profession");
        };
        profession.professionName();
    }
}
