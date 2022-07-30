package com.sambit.java8features.InterviewQuestions;

public class FinalExample {
    public final String gender;
    public final String name;

//    private String s1;
//    private String s2;

    public FinalExample(String s1, String s2) {
        this.gender = s1;
        this.name = s2;
    }

    @Override
    public String toString() {
        return "FinalExample{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class mainEx{
    public static void main(String[] args) {
        FinalExample fn = new FinalExample("Male", "Sam");

    }
}