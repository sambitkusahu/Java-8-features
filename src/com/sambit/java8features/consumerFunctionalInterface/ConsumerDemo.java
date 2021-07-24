package com.sambit.java8features.consumerFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo{
   public static void main(String[] args) {
       //Using lambda expression we can write in this way
        Consumer consume = (t)-> System.out.println("Print : "+ t);
        consume.accept(10);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        //list1.forEach(consume);
        list1.forEach(t-> System.out.println(t));

    }
}


/*
//old approach to write consume interface
 public class ConsumerDemo implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("Print : "+ t);
    }

    public static void main(String[] args) {

    }
}
 */