package Day43;
import java.io.*;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        // 1️. Reading from the console using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // 2️. Writing to a file using FileWriter
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("This is a test file.\n");
            writer.write("Hello, " + name + "!\n");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 3️. Reading from a file using FileReader
        try (FileReader reader = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(reader)) {
            System.out.println("\nReading from file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // 4️. Using ByteArrayInputStream for byte data
        byte[] byteData = "Hello, Byte Stream!".getBytes();
        ByteArrayInputStream byteArrayInput = new ByteArrayInputStream(byteData);
        System.out.println("\nReading from ByteArrayInputStream:");
        int i;
        while ((i = byteArrayInput.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println();

        scanner.close();
    }
}
