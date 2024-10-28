import java.util.Scanner;

public class DivisionWithExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        try {
            System.out.print("Enter the first number: ");
            num1 = sc.nextDouble();
            
            System.out.print("Enter the second number: ");
            num2 = sc.nextDouble();

            
            result = num1 / num2; //
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Catch the ArithmeticException (e.g., division by zero)
            System.out.println("Error: Cannot divide by zero.");

        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // This block will always execute, regardless of whether an exception occurred
            System.out.println("Exiting the program.");
            sc.close();
        }
    }
}
