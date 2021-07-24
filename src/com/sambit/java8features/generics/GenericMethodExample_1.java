package com.sambit.java8features.generics;

public class GenericMethodExample_1 {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1,2,3,4,5};
        String[] strArray = new String[]{"sam","Bob","Anne"};
       // printData(intArray);
        printDataGenericMethod(intArray);
        printDataGenericMethod(strArray);

    }
    //Method only accepts Integer as parameter
    public static void printData(Integer[] t){
        for(Integer data: t){
            System.out.println(data);
        }
    }

    //Method excepts any type of paramater - Generic Method
    //Generic method only accepts reference types, not primitive types.
    //This me thod capable of printing any type of array (Interger, String, Character etc), but only reference types allowed.
    public static <T> void printDataGenericMethod(T[] t){
        for(T data: t){
            System.out.println(data);
        }
    }
}
