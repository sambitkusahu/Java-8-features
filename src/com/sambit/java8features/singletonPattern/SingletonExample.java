package com.sambit.java8features.singletonPattern;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonLazyLoading instance1 = SingletonLazyLoading.getInstance();
        SingletonLazyLoading instance2 = SingletonLazyLoading.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class SingletonLazyLoading{
    private static SingletonLazyLoading singltonInstance;
    private SingletonLazyLoading(){}

    public static SingletonLazyLoading getInstance(){
        if(singltonInstance == null){
            synchronized (SingletonLazyLoading.class){
                if(singltonInstance == null){
                    singltonInstance = new SingletonLazyLoading();
                }
            }
        }
        return singltonInstance;
    }
}


