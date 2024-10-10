//EXPERIMENT 16
/*Write a Java program that reads a line of integers, and then displays each integer, and the
sum of all the integers (Use String Tokenizer class of java.util).*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a line of integers
        System.out.print("Enter a line of integers separated by spaces: ");
        String line = sc.nextLine();

        // Create a StringTokenizer object to tokenize the input line
        StringTokenizer st = new StringTokenizer(line);

        int sum = 0;

        // Display each integer and calculate the sum
        System.out.println("The integers are:");
        while (st.hasMoreTokens()) {
            // Convert each token (which is a string) to an integer
            int num = Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum += num;
        }

        // Display the sum of all the integers
        System.out.println("The sum of the integers is: " + sum);

        sc.close();
    }
}


//SAMPLE OUTPUT
/*
Enter a line of integers separated by spaces: 10 20 30 40
The integers are:
10
20
30
40
The sum of the integers is: 100

*/
