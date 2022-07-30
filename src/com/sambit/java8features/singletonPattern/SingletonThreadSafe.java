package com.sambit.java8features.singletonPattern;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonInstance;

    private SingletonThreadSafe(){

    }

    public static synchronized SingletonThreadSafe getInstance(){
        if(singletonInstance == null){
            singletonInstance = new SingletonThreadSafe();
        }
        return singletonInstance;
    }
}

class Test12{
    public static void main(String[] args) {
        System.out.println(SingletonThreadSafe.getInstance().hashCode());
        System.out.println(SingletonThreadSafe.getInstance().hashCode());
    }
}
