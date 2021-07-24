package com.sambit.java8features.singletonPattern;

public class LazyInitializationSingleton {
    //Private static object reference
    private static LazyInitializationSingleton singletonInstance;

    //Private constructor
    private LazyInitializationSingleton(){}

    //method to access the instance from outside.
    public static LazyInitializationSingleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new LazyInitializationSingleton();
        }
        return singletonInstance;
    }
}
