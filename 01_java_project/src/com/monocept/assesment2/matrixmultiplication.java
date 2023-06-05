package com.monocept.assesment2;

import java.util.Scanner;

public class matrixmultiplication {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows (m) of the first matrix: ");
        int m1 = input.nextInt();

        System.out.print("Enter the number of columns (n) of the first matrix: ");
        int n1 = input.nextInt();

        System.out.print("Enter the number of rows (m) of the second matrix: ");
        int m2 = input.nextInt();

        System.out.print("Enter the number of columns (n) of the second matrix: ");
        int n2 = input.nextInt();

        

        int[][] matrix1 = new int[m1][n1];
        int[][] matrix2 = new int[m2][n2];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("The result of matrix multiplication is:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;

        int[][] resultMatrix = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                int sum = 0;
                for (int k = 0; k < n1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        return resultMatrix;
    }

}
