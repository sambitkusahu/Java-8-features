package com.sambit.java8features.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread extends Thread {
    static Map<Integer, String>map = new ConcurrentHashMap<>();
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            map.put(103, "D");
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(100,"A");
        map.put(101,"B");
        map.put(102,"C");
        CustomThread cd = new CustomThread();
        cd.start(); //Start main thread
        for(Object o: map.entrySet()){
            System.out.println(o);
            Thread.sleep(1000);
        }
        System.out.println(map);
        //In ConcurrentHashMap segment locking or bucket locking will happen.
        //It wont lock the whole underlying collection, it will just lock the segment on which it w3ill perform the opeartion
        //That's why concurrentHashMap is thread safe and used in multi threading.
    }
}
