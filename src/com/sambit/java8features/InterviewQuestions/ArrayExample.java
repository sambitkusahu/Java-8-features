package com.sambit.java8features.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,0,4,3,0,0,7};
        int len = arr.length;

        int count=0;
        for(int i=0; i<len;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        while(count < len){
            arr[count++] = 0;
        }

        //print the array
        for(int i: arr){
            System.out.print(i+ " ");
        }

    }
}
