package com.sambit.java8features.generics;

public class GenericRawExample {
    public static void main(String[] args) {
        ShapeClass shape = new ShapeClass();
        shape.setT(100);
        System.out.println("Data is : "+ shape.getT());
    }
}
//We made a generic class to pass any kind of data
class ShapeClass<T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}