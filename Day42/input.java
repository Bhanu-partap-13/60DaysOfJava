// ---------------------------------------------------  
// 🌟 I/O Fundamentals in Java:
//
// 1️. What is I/O in Java?  
//      - Java provides various classes for handling **Input and Output (I/O)** operations.
//      - The most commonly used I/O classes are found in the **java.io** and **java.nio** packages.
//
// 2️. Commonly Used I/O Classes:
//       Scanner - for reading input from the console.
//       BufferedReader - for efficient input reading.
//       FileWriter - for writing to a file.
//       FileReader - for reading from a file.
// ---------------------------------------------------  

import java.io.*;  // Importing required classes
import java.util.Scanner;

public class IOFundamentals {
    public static void main(String[] args) {
        // ---------------------------------
        // 1️. Using Scanner to Read User Input
        // ---------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // ---------------------------------
        // 2️. Using BufferedReader for Input
        // ---------------------------------
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Your age is: " + age);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        // ---------------------------------
        // 3️. Writing Data to a File using FileWriter
        // ---------------------------------
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, " + name + "! Your age is " + age + ".\n");
            writer.close();
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // ---------------------------------
        // 4️. Reading Data from a File using FileReader
        // ---------------------------------
        try {
            FileReader reader = new FileReader("output.txt");
            int character;
            System.out.println("Reading from file: ");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        scanner.close(); // Closing the scanner
    }
}
