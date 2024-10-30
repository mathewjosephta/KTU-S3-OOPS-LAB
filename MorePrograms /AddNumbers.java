
/* write a java program to add two numbers(int , float and double ) from user input */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adding two integers
        System.out.println("Enter two integers:");
        System.out.print("First integer: ");
        int intNum1 = sc.nextInt();
        System.out.print("Second integer: ");
        int intNum2 = sc.nextInt();
        int intSum = intNum1 + intNum2;
        System.out.println("Sum of integers: " + intSum);

        // Adding two floats
        System.out.println("\nEnter two floats:");
        System.out.print("First float: ");
        float floatNum1 = sc.nextFloat();
        System.out.print("Second float: ");
        float floatNum2 = sc.nextFloat();
        float floatSum = floatNum1 + floatNum2;
        System.out.println("Sum of floats: " + floatSum);

        // Adding two doubles
        System.out.println("\nEnter two doubles:");
        System.out.print("First double: ");
        double doubleNum1 = sc.nextDouble();
        System.out.print("Second double: ");
        double doubleNum2 = sc.nextDouble();
        double doubleSum = doubleNum1 + doubleNum2;
        System.out.println("Sum of doubles: " + doubleSum);

        // Closing the scanner
        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter two integers:
First integer: 5
Second integer: 10

Enter two floats:
First float: 2.5
Second float: 3.4

Enter two doubles:
First double: 1.234567
Second double: 9.876543

Sum of integers: 15
Sum of floats: 5.9
Sum of doubles: 11.11111

*/

