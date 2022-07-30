package com.sambit.java8features.InterviewQuestions;

public class PusheshsElemToStartOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,0,4,3,0,0,7};
        int len = arr.length-1;

        for(int i=arr.length-1; i>=0; i-- ){
            if(arr[i] != 0){
                arr[len] = arr[i];
                len--;
            }
        }

        while(len >=0){
            arr[len]= 0;
            len--;
        }

        for(int i: arr)
            System.out.print(i +" ");
    }
}
