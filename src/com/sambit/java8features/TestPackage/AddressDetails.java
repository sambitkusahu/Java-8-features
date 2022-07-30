package com.sambit.java8features.TestPackage;

public class AddressDetails {
    private String street;
    private String  city;
    private String houseNo;

    public AddressDetails(String street, String city, String houseNo) {
        this.street = street;
        this.city = city;
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "AddressDetails{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", houseNo='" + houseNo + '\'' +
                '}';
    }
}
