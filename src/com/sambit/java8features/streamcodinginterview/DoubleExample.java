package com.sambit.java8features.streamcodinginterview;

public class DoubleExample {
    public static void main(String[] args) {
        Double val = getVal();
        System.out.println(val);
    }

    public static Double getVal(){
        double a = 5.2;
        double b = 4.2;
        Double c = a * b;
        return  c;
    }
}
