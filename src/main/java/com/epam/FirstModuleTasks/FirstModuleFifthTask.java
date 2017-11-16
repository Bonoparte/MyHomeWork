package com.epam.FirstModuleTasks;

import java.util.Scanner;

public class FirstModuleFifthTask {
    public static void main(String[] args) {
        System.out.print("Enter the matrix dimension n(matrix n x n): ");
        Scanner in = new Scanner(System.in);
        int matrixDim = in.nextInt();
        int[][] matrix = new int[matrixDim][matrixDim];
        for (int i=0; i<matrixDim; i++){
            for(int j=0; j<matrixDim; j++){
                if (i == j || i == (matrixDim-j-1))
                    matrix[i][j] = 1;
                if (j != matrixDim-1)
                    System.out.print(matrix[i][j]+" ");
                else
                    System.out.println(matrix[i][j]);
            }
        }
    }
}
