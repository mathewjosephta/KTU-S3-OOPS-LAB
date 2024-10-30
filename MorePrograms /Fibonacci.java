/* Write a Java program that prints the Fibonacci series up to a specified number of terms */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        // Initializing the first two terms of the series
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        // Closing the scanner
        sc.close();
    }
}

// SAMPLE OUTPUT 
/*
Enter the number of terms in the Fibonacci series: 7

Fibonacci Series up to 7 terms:
0 1 1 2 3 5 8
*/
