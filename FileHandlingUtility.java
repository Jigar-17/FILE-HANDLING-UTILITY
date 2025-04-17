import java.io.*;
import java.util.Scanner;

public class FileHandlingUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "CodTech_file.txt";

        try {
            // 1️ WRITE: Create and write initial content

            FileWriter writer = new FileWriter(fileName);
            writer.write(" CodTech Internship File Handling Task\n");
            writer.write(" This file demonstrates read, write, and modify operations in Java.\n");
            writer.close();
            System.out.println(" File created and initial content written to '" + fileName + "'\n");

            // 2️ READ: Display current file content

            System.out.println(" Reading contents of '" + fileName + "':\n");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // 3️ MODIFY: Update content to the file

            System.out.print(" Enter a line to append to the file: ");
            String newLine = scanner.nextLine();

            FileWriter appender = new FileWriter(fileName, true); // true = append mode
            appender.write(newLine + "\n");
            appender.close();
            System.out.println(" New content appended to the file.\n");

            // Final read to show updated content

            System.out.println("Updated contents of '" + fileName + "':\n");
            BufferedReader updatedReader = new BufferedReader(new FileReader(fileName));
            while ((line = updatedReader.readLine()) != null) {
                System.out.println(line);
            }
            updatedReader.close();

        } catch (IOException e) {
            System.out.println(" An error occurred while handling the file.");
            e.printStackTrace();
        } 
    }
}
