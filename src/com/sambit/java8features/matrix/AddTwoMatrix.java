package com.sambit.java8features.matrix;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int A[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                A[i][j] = sc.nextInt();
                System.out.print(A[i][j] +" ");
            }
        }
    }
}
