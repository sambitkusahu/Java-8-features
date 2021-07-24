package com.sambit.java8features.InterviewQuestions;

public class AmstrongNumberExample {
    public static void main(String[] args) {
        //151
        System.out.println(isAmstrongNum(151));
    }

    private static boolean isAmstrongNum(int num){
        int remainder = 0, reverse = 0, sum=0, original;
        original = num;
        while(num != 0){
            //Remainder returns the last digit
            remainder = num %10;

            //Make the cube of the digit and store it
            sum += (remainder* remainder*remainder);

            //Remove the last digit from the num
            num = num/10;

        }
        return (original == sum);
    }
}
