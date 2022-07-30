package com.sambit.java8features.multiThreading;

public class VolatileExample {
    public static volatile boolean flag = false;
    public static void main(String[] args) {
        new Thread(()->{
           for(int i=0; i<100; i++){
               System.out.println("Value of i : "+ i);
           }
            flag = true;
        }).start();

        new Thread(()->{
            int i=1;
            //flag value will be retrieved from main memory not form the local thread cache.
            //This is the use case of volatile
            //When two threads shares the same variable that time we can declare that variable as volatile.
            //Only variable can be defined as volatile, methods and classes can't be defined as volatile.
            while(!flag){
                i++;
               // System.out.println("Second thread in loop: "+ i);
            }
            System.out.println("Value of i in second thread : "+ i);
        }).start();
    }
}
