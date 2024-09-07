//EXPERIMENT 14

/*  Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. 
It also has a method named 'printSalary( )' which prints the salary of the Employee. 
Two classes 'Officer' and 'Manager' inherits the 'Employee' class. 
The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and
print the same. (Exercise to understand inheritance).  */

import java.util.Scanner;
class Employee {
    // Member variables
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print the salary
    void printSalary() {
        System.out.println("Salary: $" + salary);
    }

    // Method to print general details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

// Derived class Officer
class Officer extends Employee {
    // Additional member variable
    String specialization;

    // Constructor
    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to print details specific to Officer
    void printOfficerDetails() {
        printDetails();
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

// Derived class Manager
class Manager extends Employee {
    // Additional member variable
    String department;

    // Constructor
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to print details specific to Manager
    void printManagerDetails() {
        printDetails();
        System.out.println("Department: " + department);
        printSalary();
    }
}

// Main class to test the implementation
public class employee14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Officer
        System.out.println("Enter details for Officer:");
        System.out.print("Name: ");
        String officerName = scanner.nextLine();
        System.out.print("Age: ");
        int officerAge = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Phone Number: ");
        String officerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String officerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double officerSalary = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Specialization: ");
        String officerSpecialization = scanner.nextLine();

        Officer officer = new Officer(officerName, officerAge, officerPhoneNumber, officerAddress, officerSalary, officerSpecialization);

        // Input for Manager
        System.out.println("\nEnter details for Manager:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Phone Number: ");
        String managerPhoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        System.out.print("Department: ");
        String managerDepartment = scanner.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary,
        managerDepartment);

        // Print details
        System.out.println("\nOfficer Details:");
        officer.printOfficerDetails();

        System.out.println("\nManager Details:");
        manager.printManagerDetails();

        // Close the scanner
        scanner.close();
    }
}
