package com.sambit.java8features.TestPackage;

public class SingletonExample {
    private static SingletonExample singletonObj;

    private SingletonExample(){};

    public static SingletonExample getObj(){
        if(singletonObj == null){
            singletonObj = new SingletonExample();
        }
        return singletonObj;
    }
}

class Main{
    public static void main(String[] args) {
        SingletonExample obj1 = SingletonExample.getObj();
        SingletonExample obj2 = SingletonExample.getObj();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
    }
}
