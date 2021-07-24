package com.sambit.java8features.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumofTwoNum {
    public static void main(String[] args) {
    int[] arr = {4,3,4,8,7,4,6};
    int target = 8;
        int[] result = twoSum(arr, target);
        //int[] result = twoSum_1(arr, target);
        System.out.println(Arrays.toString(result));
    }
    //First approach
    public static int[] twoSum(int[]arr, int target){
        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution..");
    }
    //Second Approach
    public static int[] twoSum_1(int[] num, int target){
        for(int i=0; i<num.length; i++){
            for(int j=i+1;j<num.length; j++ ){
                if(num[i] == target-num[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("Not valid input...");
    }

    //Third Approach
}
