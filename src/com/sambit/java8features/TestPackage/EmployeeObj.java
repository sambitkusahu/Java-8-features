package com.sambit.java8features.TestPackage;

import java.util.ArrayList;
import java.util.List;

public class EmployeeObj {
    public static void main(String[] args) {
        EmployeeObj obj1 = new EmployeeObj();
        List<AddressDetails> address = obj1.getAddress();
        System.out.println(address);
    }

    public List<AddressDetails>getAddress(){
        List<AddressDetails> addressList = new ArrayList<>();
        addressList.add(new AddressDetails("abc", "hyd","102"));
        addressList.add(new AddressDetails("def", "bang","204"));
        addressList.add(new AddressDetails("rft", "pune","308"));
        return addressList;
    }
}


