//EXPERIEMENT 13
/*Write a Java program that reads the marks of 3 students using a constructor*/

import java.util.Scanner;
class Student {
    double mark1, mark2, mark3;

    // Constructor to initialize the marks
    Student(double m1, double m2, double m3) {
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    // Method to calculate the total marks
    double calculateTotalMarks() {
        return mark1 + mark2 + mark3;
    }

    // Method to display the total marks
    void displayTotalMarks(int studentNumber) {
        double total = calculateTotalMarks();
        System.out.println("Total marks for Student " + studentNumber + ": " + total);
    }
}

public class MarksSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to hold 3 students
        Student[] students = new Student[3];

        // Input marks for 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Enter the first mark: ");
            double mark1 = sc.nextDouble();
            System.out.print("Enter the second mark: ");
            double mark2 = sc.nextDouble();
            System.out.print("Enter the third mark: ");
            double mark3 = sc.nextDouble();

            // Create a new student object and store in the array
            students[i] = new Student(mark1, mark2, mark3);
        }

        // Display total marks for each student
        for (int i = 0; i < 3; i++) {
            students[i].displayTotalMarks(i + 1);
        }

        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter marks for Student 1:
Enter the first mark: 85
Enter the second mark: 90
Enter the third mark: 88
Enter marks for Student 2:
Enter the first mark: 78
Enter the second mark: 82
Enter the third mark: 80
Enter marks for Student 3:
Enter the first mark: 92
Enter the second mark: 88
Enter the third mark: 95
Total marks for Student 1: 263.0
Total marks for Student 2: 240.0
Total marks for Student 3: 275.0

*/
