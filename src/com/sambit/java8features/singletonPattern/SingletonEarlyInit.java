package com.sambit.java8features.singletonPattern;

public class SingletonEarlyInit {
    private static SingletonEarlyInit singletonInstance = new SingletonEarlyInit();

    private SingletonEarlyInit(){}

    public static SingletonEarlyInit getInstance(){
        return singletonInstance;
    }

}

class TestSingletonInstance{
    public static void main(String[] args) {
        System.out.println(SingletonEarlyInit.getInstance().hashCode());
        System.out.println(SingletonEarlyInit.getInstance().hashCode());
        System.out.println(SingletonEarlyInit.getInstance().hashCode());
    }
}
