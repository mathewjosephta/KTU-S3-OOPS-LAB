import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWithExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();

                // Check for division by zero
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }

                // Perform the division
                result = num1 / num2;
                System.out.println("Result: " + result);
                validInput = true; // Input is valid, exit the loop

            } catch (ArithmeticException e) {
                // Catch the ArithmeticException (e.g., division by zero)
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                // Catch if the input is not a number
                System.out.println("Error: Please enter valid numeric values.");
                sc.next(); // Clear the invalid input
            } catch (Exception e) {
                // Catch any other unexpected exceptions
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        // This block will always execute, regardless of whether an exception occurred
        System.out.println("Exiting the program.");
        sc.close();
    }
}
