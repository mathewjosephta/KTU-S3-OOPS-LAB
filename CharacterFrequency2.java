// EXPERIMENT 2

/* Write a Java Program to find the frequency of a given character in a string. */

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to find its frequency: ");
        char ch = sc.next().charAt(0); // Reads a single character input from the user

        // Initialize the frequency counter
        int frequency = 0;

        // Loop through the string to count occurrences of the given character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }

        // Print the result
        System.out.println("Frequency of '" + ch + "' in the string is: " + frequency);

        // Closing the scanner
        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter a string: programming
Enter the character to find its frequency: g
Frequency of 'g' in the string is: 2

*/
