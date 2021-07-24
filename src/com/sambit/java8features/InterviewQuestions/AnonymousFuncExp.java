package com.sambit.java8features.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class AnonymousFuncExp {
    public static void main(String args[]){
        List<String> ll =new ArrayList<String>();
        ll.add("My");
        ll.add("Babu");
        ll.add("Iritates");
        ll.add("Me");
        ll.add("I");
        ll.add("hate");
        ll.add("him");
ll.forEach((f)->{
    System.out.println(f);
});

    }


}
