package com.sambit.java8features.InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSumOftwo {
    public static void main(String[] args) {
        int[] arr = {2,5,4,9,8,7,3,4,6};
        int target = 13;
        int[] sum = findSum(arr, target);
        System.out.println(Arrays.toString(sum));
    }
    private static int[] findSum(int[] arr, int target){
        Map<Integer, Integer>map = new HashMap<>();
        int requiredVal = 0;
        for (int i=0; i<arr.length; i++){
            requiredVal = target - arr[i];
            if(map.containsKey(requiredVal)){
                return new int[]{map.get(requiredVal),i};
            }else{
                map.put(arr[i], i);
            }
        }
        throw new IllegalArgumentException("Invalid input...");
    }
}
