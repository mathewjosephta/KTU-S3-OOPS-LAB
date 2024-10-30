/* write a java program to check whether a number is armstrong or not */

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Storing the original number
        int originalNumber = number;

        // Determining the number of digits
        int numberOfDigits = String.valueOf(number).length();

        // Calculating the sum of digits each raised to the power of number of digits
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        // Checking if the original number and the calculated sum are the same
        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Closing the scanner
        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter a number: 153

153 is an Armstrong number.
*/
