package com.sambit.java8features.generics;

public class FindMaximumMultipleBound {
    public static void main(String[] args) {
        Integer max = findMax(10, 20, 50);
        System.out.println(max);
        Double max1 = findMax(1.02, 2.10, 14.30);
        System.out.println(max1);
    }
    //This method can accepts only Number(Integer, Float, Double etc) and compare it.
    public static <T extends Number & Comparable> T findMax(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max) > 0)
            max = t2;
        if(t3.compareTo(max)>0)
            max = t3;
        return max;
    }
}
