//EXPERIMENT 3

/* write a java program to print largest of three numbers */

import java.util.Scanner;

public class LargestOfThree3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Taking input for three numbers
        System.out.println("Enter three numbers:");
        System.out.print("First number: ");
        int num1 = sc.nextInt();
        System.out.print("Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Third number: ");
        int num3 = sc.nextInt();

        // Finding the largest number
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Printing the largest number
        System.out.println("The largest number is: " + largest);

        // Closing the scanner
        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter three numbers:
First number: 10
Second number: 25
Third number: 15

The largest number is: 25

*/
