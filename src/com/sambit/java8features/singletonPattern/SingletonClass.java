package com.sambit.java8features.singletonPattern;

public class SingletonClass {
    //Private and static object, Object will be created once due to private and static.
    //This is early initialization, when the class loads it will create the object.
    //In two ways we can create Singleton object, Early Initialization & Lazy initialization

    private static SingletonClass singletonObj = new SingletonClass();

    //Private Constructor, so class cant be instantiated from outside.
    private SingletonClass(){}

    //get the instance of the class
    public static SingletonClass getInstance(){
        return singletonObj;
    }

    public void showMessage(){
        System.out.println("Hash code of the class: "+ singletonObj);
    }
}
