//Experiment : 8
/*Write a Java program that read from a file and write to file by handling all file related ex-
ceptions.*/

import java.io.*;
import java.util.Scanner;

public class FileExceptions8 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the output file path
        System.out.print("Enter the output file path to save your text: ");
        String outputFilePath = scanner.nextLine();

        // Declare BufferedWriter
        BufferedWriter bw = null;

        try {
            // Initialize BufferedWriter with a FileWriter pointing to the output file
            bw = new BufferedWriter(new FileWriter(outputFilePath));

            System.out.println("Enter text to save to file (type 'exit' to finish):");

            String userInput;
            // Read text input from user until they type "exit"
            while (true) {
                userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if the user types "exit"
                }
                // Write the input to the output file
                bw.write(userInput);
                bw.newLine(); // Add a new line after writing each input
            }

            // Print success message
            System.out.println("Text input saved to file successfully.");

        } catch (IOException e) {
            // Handle input/output errors that may occur during writing
            System.out.println("Error: An I/O error occurred during file operations.");
            e.printStackTrace();
        } finally {
            // Ensure BufferedWriter is closed
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to close resources properly.");
                e.printStackTrace();
            }
        }

        // Close the scanner
        scanner.close();

        // Reading the text from the output file
        try {
            // Create a new Scanner for reading the file
            BufferedReader br = new BufferedReader(new FileReader(outputFilePath));
            System.out.println("\nReading from the saved file:");

            String line;
            // Read and print the contents of the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}



//SAMPLE OUTPUT
/*
1. Successful Output:
     File read and write operation completed successfully.
2. Error Scenario (if input.txt is not found):
     Error: An I/O error occurred during file operations.
     java.io.FileNotFoundException: input.txt (The system cannot find the file specified)
   	 at java.base/java.io.FileInputStream.open0(Native Method)
	   at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	   at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
	   at java.base/java.io.FileReader.<init>(FileReader.java:75)
	   at FileReadWrite.main(FileReadWrite.java:11)
3. Error Scenario (if there is an issue closing resources):
     File read and write operation completed successfully.
     Error: Failed to close resources properly.
     java.io.IOException: Stream closed
	   at java.base/java.io.BufferedWriter.ensureOpen(BufferedWriter.java:107)
	   at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:129)
	   at java.base/java.io.BufferedWriter.close(BufferedWriter.java:273)
	   at FileReadWrite.main(FileReadWrite.java:27)


*/
