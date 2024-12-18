//EXPERIMENT 7

/* Write a file handling program in Java with reader/writer. */

import java.io.*;
import java.util.Scanner;

public class FileHandling7{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Case 1: Write to File
                    System.out.print("Enter the file name to write to: ");
                    String writeFileName = sc.nextLine();

                    try {
                        FileWriter fw = new FileWriter(writeFileName, true); // Open in append mode
                        BufferedWriter bw = new BufferedWriter(fw);

                        System.out.println("Enter the text to write to the file:");
                        String txt = sc.nextLine();

                        bw.write(txt);
                        bw.close();
                        fw.close();
                        System.out.println("Data has been written to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred while writing to the file: " + e.getMessage());
                    }
                    break;

                case 2:
                    // Case 2: Read from File
                    System.out.print("Enter the file name to read from: ");
                    String readFileName = sc.nextLine();

                    try {
                        FileReader fr = new FileReader(readFileName);
                        BufferedReader br = new BufferedReader(fr);
                        String line;

                        System.out.println("File content:");
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }

                        br.close();
                        fr.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found: " + e.getMessage());
                    } catch (IOException e) {
                        System.out.println("An error occurred while reading the file: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Case 3: Exit
                    System.out.println("Exiting...");
                    sc.close();
                    break;

                default:
                    // Invalid Choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

//SAMPLE OUTPUT 
/*
Menu:
1. Write to File
2. Read from File
3. Exit
Enter your choice: 1
Enter the file name to write to: myfile.txt
Enter the text to write to the file:
Hello, this is a test!
Data has been written to the file.

Menu:
1. Write to File
2. Read from File
3. Exit
Enter your choice: 2
Enter the file name to read from: myfile.txt
File content:
Hello, this is a test!

Menu:
1. Write to File
2. Read from File
3. Exit
Enter your choice: 3
Exiting...
*/
