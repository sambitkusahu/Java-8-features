package com.sambit.java8features.ArraysExample;

public class DuplicateExample {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,8,7,9,3,3};
        uniqueElements(arr,arr.length);
    }
    static void uniqueElements(int[] arr, int n){
       int[] arr2 = {arr[0]};
        for (int i = 1; i < n; i++){
          //  boolean flag = false;
            for(int j = 0; j < arr2.length; j++){
                if(arr[i] == arr[j]){
                    arr2[arr2.length] = 0;
                    arr2[arr2.length] = arr[i];
                    System.out.print(arr[i] + " , ");
                    break;
                }
            }
        }
    }
}
