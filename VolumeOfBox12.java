//EXPERIMENT 12

/* write a Java program that calculates the volume of a box using two methods: one to calculate the volume and another to display the volume */

import java.util.Scanner;
class Box {
    double width, height, depth;

    // Method to calculate the volume of the box
    double calculateVolume() {
        return width * height * depth;
    }

    // Method to display the volume of the box
    void displayVolume() {
        double volume = calculateVolume();
        System.out.println("Volume of the box: " + volume);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating first object myBox1
        Box myBox1 = new Box();
        System.out.println("Enter the dimensions of myBox1 (width, height, depth): ");
        myBox1.width = sc.nextDouble();
        myBox1.height = sc.nextDouble();
        myBox1.depth = sc.nextDouble();

        // Creating second object myBox2
        Box myBox2 = new Box();
        System.out.println("Enter the dimensions of myBox2 (width, height, depth): ");
        myBox2.width = sc.nextDouble();
        myBox2.height = sc.nextDouble();
        myBox2.depth = sc.nextDouble();

        // Displaying the volume of myBox1
        System.out.println("For myBox1:");
        myBox1.displayVolume();

        // Displaying the volume of myBox2
        System.out.println("For myBox2:");
        myBox2.displayVolume();

        sc.close();
    }
}

//SAMPLE OUTPUT
/*
Enter the dimensions of myBox1 (width, height, depth): 
10
20
15
Enter the dimensions of myBox2 (width, height, depth): 
5
8
12
For myBox1:
Volume of the box: 3000.0
For myBox2:
Volume of the box: 480.0
*/
