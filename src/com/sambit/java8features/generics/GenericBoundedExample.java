package com.sambit.java8features.generics;

public class GenericBoundedExample {
    public static void main(String[] args) {
        inspect(100.01);
        Integer display = display(100, 200);
        System.out.println(display);
        Integer max = FindMaximum.findMax(10, 20, 30);
        System.out.println(max);


    }
    public static <T extends Number> void inspect(T t){
        System.out.println("T type is : "+ t.getClass().getName());
    }

    public static <T extends Comparable> T display(T t1, T t2){
        return t1.compareTo(t2) > 0 ? t1 : t2 ;
    }
}

class FindMaximum{
    public static <T extends Comparable> T findMax(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max) > 0)
            max = t2;
        if(t3.compareTo(max)>0)
            max = t3;
        return max;
    }
}
