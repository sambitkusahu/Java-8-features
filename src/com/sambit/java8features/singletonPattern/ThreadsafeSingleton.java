package com.sambit.java8features.singletonPattern;

public class ThreadsafeSingleton {
    //private static object reference.
    private static ThreadsafeSingleton singletonInstance;

    //private constructor
    private ThreadsafeSingleton(){}

    //method to get the instance
    public static synchronized ThreadsafeSingleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new ThreadsafeSingleton();
        }
        return singletonInstance;
    }
}
