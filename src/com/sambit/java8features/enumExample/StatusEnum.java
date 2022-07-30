package com.sambit.java8features.enumExample;

import java.util.Arrays;

public enum StatusEnum {
    SUCCESS(200,"Success"),
    ERROR(500, "Error");
    private int statusCode;
    private String statusMessage;

    StatusEnum(int statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
}

class TestMain{
    public static void main(String[] args) {
        for(StatusEnum s: StatusEnum.values()){
            System.out.println(s.getStatusCode() +": "+s.getStatusMessage());
        }
        System.out.println(StatusEnum.ERROR.getStatusCode());
        System.out.println(StatusEnum.ERROR.getStatusMessage());
    }
}
