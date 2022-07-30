package com.sambit.java8features.multiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumberUsingCallable {
    public static int[] array = IntStream.rangeClosed(0,5000).toArray();
    public static int total = IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //callable always return something and Runnable interface do not return anything

        Callable callable1 = ()->{
            int sum = 0;
            for(int i=0; i<array.length/2; i++){
                sum = sum+array[i];
            }
            return sum;
        };

        Callable callable2 = ()->{
            int sum = 0;
            for(int i=array.length/2; i<array.length; i++){
                sum = sum + array[i];
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1,callable2);
        //Callable always return something and it returns future, now we will be getting list of future.
        List<Future<Integer>>results = executorService.invokeAll(taskList);

        int k = 0;
        int sum = 0;
        for(Future<Integer> result: results){
            sum = sum + result.get();
            System.out.println("Sum of "+ (++k) + " is "+ result.get());
        }
        System.out.println("Sum of the callable is :"+ sum);
        System.out.println("Correct sum of Intstream is :"+ total);
        executorService.shutdown();
    }
}
