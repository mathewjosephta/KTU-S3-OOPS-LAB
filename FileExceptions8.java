//Experiment : 9
/*Write a Java program that read from a file and write to file by handling all file related ex-
ceptions.*/

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Initialize names of input and output files
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Declare BufferedReader and BufferedWriter
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Initialize BufferedReader with a FileReader pointing to the input file
            br = new BufferedReader(new FileReader(inputFilePath));

            // Initialize BufferedWriter with a FileWriter pointing to the output file
            bw = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            // Read from the input file and write to the output file
            while ((line = br.readLine()) != null) {
                bw.write(line);
            }

            // Print success message
            System.out.println("File read and write operation completed successfully.");

        } catch (IOException e) {
            // Handle input/output errors that may occur during writing or reading
            System.out.println("Error: An I/O error occurred during file operations.");
            e.printStackTrace();
        } finally {
            // Ensure resources are closed
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                // Handle exceptions that may occur while closing the resources
                System.out.println("Error: Failed to close resources properly.");
                e.printStackTrace();
            }
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
