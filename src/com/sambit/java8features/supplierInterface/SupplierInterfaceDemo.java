package com.sambit.java8features.supplierInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Hello supplier";
        String msg = supplier.get();
       //System.out.println(msg);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        int res = list1.stream().findAny().orElse(5);

        List<String> list2 = Arrays.asList("a","b","c","d","e");
        //String result = list2.stream().findAny().orElseGet(supplier);
        String result1 = list2.stream().findAny().orElseGet(()-> "Its supplier..");
        System.out.println("Result is : "+ result1);
    }
}
