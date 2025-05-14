package Day46;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

public class FileDemo {
    // Hi there! Let's learn about files in Java! 🎈
    // Think of files like your toy boxes where you keep different toys

    // First, we'll learn how to create a new toy box (file)
    public static void createFile() {
        try {
            File myFile = new File("mytoybox.txt");
            if (myFile.createNewFile()) {
                System.out.println("Yay! We made a new toy box!");
            }
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong!");
        }
    }

    // Now, let's write something in our toy box (like putting toys in)
    public static void writeToFile() {
        try {
            FileWriter writer = new FileWriter("mytoybox.txt");
            writer.write("My favorite toy is a teddy bear!");
            writer.close();
            System.out.println("We put the toy in the box!");
        } catch (IOException e) {
            System.out.println("Oops! We couldn't write in the box!");
        }
    }

    // Let's read what's in our toy box (checking what toys we have)
    public static void readFromFile() {
        try {
            Scanner reader = new Scanner(new File("mytoybox.txt"));
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Oops! We couldn't open the toy box!");
        }
    }

    // Sometimes we need to delete our toy box
    public static void deleteFile() {
        File myFile = new File("mytoybox.txt");
        if (myFile.delete()) {
            System.out.println("The toy box is gone!");
        } else {
            System.out.println("Oops! We couldn't remove the toy box!");
        }
    }

    // Add a main method to run the code
    public static void main(String[] args) {
        createFile();
        writeToFile();
        readFromFile();
        deleteFile();
    }
}