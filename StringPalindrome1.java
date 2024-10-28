//EXPERIMENT 1

/* write a java program to check whether a STRING is palindrome or not */

import java.util.Scanner;

public class PalindromeStringCheck6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String originalString = sc.nextLine();

        // Convert the string to lowercase to ignore case sensitivity
        String str = originalString.toLowerCase();

        // Reversing the string
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }

        // Checking if the original string and reversed string are the same
        if (str.equals(reverseString)) {  
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

        // Closing the scanner
        sc.close();
    }
}


//SAMPLE OUTPUT
/*
Enter a string: Madam

Madam is a palindrome.

*/
