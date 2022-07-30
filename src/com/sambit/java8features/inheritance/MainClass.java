package com.sambit.java8features.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.print();
        ex.print1();
        Animal pig = new Pig();
        Animal goat = new Goat();
        Animal elephant = new Elephant();

        pig.sound();
    }
}

class Example extends Example2{
    public void print(){
        System.out.println("Emaple class printed...");
    }
}

class Example2{
    public void print1(){
        System.out.println("Emaple2 class printed...");
    }
}
