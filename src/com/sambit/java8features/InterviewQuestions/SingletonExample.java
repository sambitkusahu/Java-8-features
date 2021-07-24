package com.sambit.java8features.InterviewQuestions;
//Lazy Instantiation
class SingletonClass {
    private static SingletonClass singletonInstance = null;
    public String s;
    private SingletonClass(){
        s = "Hello";
    }
    public static SingletonClass getInstance(){
        if(singletonInstance == null){
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }
}


class SingletonExample{
    public static void main(String[] args) {
        SingletonClass x = SingletonClass.getInstance();
        SingletonClass y = SingletonClass.getInstance();
        SingletonClass z = SingletonClass.getInstance();

        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
    }
}