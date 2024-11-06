//EXPERIMENT 3

/*Write a Java program to multiply two matrices*/

import java.util.Scanner;

public class MatrixMultiplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading dimensions for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = sc.nextInt();

        // Reading dimensions for the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = sc.nextInt();

        // Validating the matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. The number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return;
        }

        // Initializing matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] result = new int[rows1][cols2];

        // Reading elements of the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Reading elements of the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Printing the result matrix
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Closing the scanner
        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter the number of rows for the first matrix: 2
Enter the number of columns for the first matrix: 3
Enter the number of rows for the second matrix: 3
Enter the number of columns for the second matrix: 2
Enter elements for the first matrix:
1 
2
3
4 
5 
6
Enter elements for the second matrix:
7
8
9 
10
11 
12

Resultant Matrix after multiplication:
58 64 
139 154 

*/
