package com.sambit.java8features.InterviewQuestions;

/*Two ways we can instantiate singleton design pattern, Early instantiation, lazy instantiation*/
public class SingletonDesignPatterns {
    private static SingletonDesignPatterns singletonObj = null; //static obj

    private SingletonDesignPatterns(){} //private constructor

    public static SingletonDesignPatterns getObj(){
        if(singletonObj == null){
            synchronized (SingletonDesignPatterns.class){
                singletonObj = new SingletonDesignPatterns();
            }
        }
        return singletonObj;
    }

}

class Test{
    public static void main(String[] args) {
        SingletonDesignPatterns sg = SingletonDesignPatterns.getObj();
        SingletonDesignPatterns ss = SingletonDesignPatterns.getObj();
        System.out.println(sg);
        System.out.println(ss);

    }
}
