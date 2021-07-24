package com.sambit.java8features.InterviewQuestions;
//Early Instantiation
public class Singleton {
    private static final Singleton singletonObj = new Singleton();

    private Singleton(){}

    public static Singleton getObj(){
        return singletonObj;
    }
}

class Test1{
    public static void main(String[] args) {
        Singleton ss = Singleton.getObj();
        Singleton sg = Singleton.getObj();
        System.out.println(ss.hashCode());
        System.out.println(sg.hashCode());
    }
}
