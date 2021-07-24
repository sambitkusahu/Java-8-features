package com.sambit.java8features.InterviewQuestions;

import java.util.ArrayList;

class CustomArrayList<String> extends ArrayList<String> {
    @Override
    public boolean add(String s) {
        if(this.contains(s)){
            return true;
        }else{
            return super.add(s);
        }
    }
}

public class UniqueElementsInArrayList{
    public static void main(String args[]){
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Good Morning");
        list.add("Hi");
        System.out.println(list);
    }
}
