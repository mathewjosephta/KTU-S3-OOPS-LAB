//EXPERIMENT 5

/*Write a java program to check whether a number is palindrome or not*/

import java.util.Scanner;

public class PalindromeCheck5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Storing the original number
        int originalNumber = number;
        int reverse = 0;

        // Reversing the number
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        // Checking if the original number and reversed number are the same
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        // Closing the scanner
        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter a number: 121

121 is a palindrome.
*/
