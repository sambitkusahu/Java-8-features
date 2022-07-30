package com.sambit.java8features.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenericMethodExampleWithReturnType {
    public static void main(String[] args) {
        Map<Integer, String> map1 = show(1, "one");

        System.out.println("map1 = " + map1);
        inspect(10);
        inspect(100.0);

        Integer result1 = display(25, 10);
        System.out.println("result1 = " + result1);
        List<Integer> intData = IntStream.range(1, 100).boxed().collect(Collectors.toList());
        upperBoundWildCardSum(intData);

    }

    /**
     * After static, it should be method type which we need to pass <K, V> to method param type
     * after that, the return type of method should be there. Return Type : Map<K, V>
     */
    public static <K , V> Map<K,V> show(K key, V value){
        Map<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    /**
     * If you extend some class, then you can use only that class or its subclasses.
     * In below example its extends Number class, so you can only pass numbers to this method
     * You can't pass Strings or other type to this method.
     */
    public static <T extends Number> void inspect(T t){
        System.out.println("T type is : "+ t.getClass().getName());
    }
    
    public static <T extends Comparable> T display(T t1, T t2){
        return t1.compareTo(t2) > 0 ? t1 : t2 ; 
    }

    /**
     * Upper Bound Example
     * extends comparable, you can use Comparable class and its subclasses.
     */
    public static <T extends Comparable> T findMax(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max) > 0)
            max = t2;
        if(t3.compareTo(max) > 0)
            max = t3;
        return max;
    }

    /**
     * Multiple Upper Bound Example
     * If you want to extend multiple class you can do with & operator.
     * Keep in mind first extends should be the Higher class, then subclass.
     * You can't keep the subclass first and then higher class in second.
     * This method will accept only Numbers and compare it. as it extends Number, Comparable class.
     */
    public static <T extends Number & Comparable> T multipleBound(T t1, T t2, T t3){
        T max = t1;
        if(t2.compareTo(max) > 0)
            max = t2;
        if(t3.compareTo(max) > 0)
            max = t3;
        return max;
    }
    /**
     * Upper Bounded wildcards example.
     * The question mark(?) represents wildcard in generic.
     * Which stands for unknown type in generics.
     * Now ? mark extends Number, means you can pass only numbers types and its subclasses.
     * In upper bound you can't modify the object (add, delete elem), this is the restriction upper bound is having.
     */
    public static  void upperBoundWildCardSum(List<? extends Number> list){
        int sum = 0;
        for(Number li : list){
            sum += li.longValue();
        }
        System.out.println("Total is : "+ sum);
    }

    /**
     * Upper Bound - ? extends class
     * Lower Bound - ? super class
     * upper bound will use extends, and Lower Bound will use super keyword.
     * When you are using super, we can pass the class and its base/super classes, not the subclasses.
     * Below example, you can pass Number or Object class, not the Integer class.
     * In LowerBound we can modify the object.
     */
    public static void lowerBoundExample(List<? super Number>list){
        for(Object num: list){
            System.out.println("Number is: "+ num);
        }
    }
    /**
     * Unbound example
     * List<?>list
     */
    public static void unboundExample(List<?>list){
        for(Object li: list){
            System.out.println("List is : "+ li);
        }
    }

}
