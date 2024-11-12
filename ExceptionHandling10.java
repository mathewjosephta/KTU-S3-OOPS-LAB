import java.util.Scanner;
public class DivisionWithExceptionHandling {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        try {
                System.out.print("Enter the first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();

                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }

                int result = num1/num2;
                System.out.println("Result ="+ result);
                    
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        } finally {
                System.out.println("Exiting the program.");
        }
        sc.close();
    }
}
