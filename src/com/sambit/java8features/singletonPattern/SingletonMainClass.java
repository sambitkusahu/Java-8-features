package com.sambit.java8features.singletonPattern;

public class SingletonMainClass {
    public static void main(String[] args) {
        SingletonClass singletonObj = SingletonClass.getInstance();
        singletonObj.showMessage();

        SingletonClass singletonObj1 = SingletonClass.getInstance();
        singletonObj1.showMessage();
    }
}
