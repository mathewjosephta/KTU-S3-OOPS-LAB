import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrices:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Declare two matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Input elements for the first matrix
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add matrices");
            System.out.println("2. Subtract matrices");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add the matrices
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            result[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    System.out.println("Result of Matrix Addition:");
                    printMatrix(result, rows, cols);
                    break;

                case 2:
                    // Subtract the matrices
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            result[i][j] = matrix1[i][j] - matrix2[i][j];
                        }
                    }
                    System.out.println("Result of Matrix Subtraction:");
                    printMatrix(result, rows, cols);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please choose again.");
                    break;
            }
        }
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
