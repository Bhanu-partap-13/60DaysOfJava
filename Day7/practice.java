package Day7;

// ---------------------------------------------------
// Understanding Java Basics
// ---------------------------------------------------
// In this code, we'll show examples of the following:
// 1. Identifiers and Keywords
// 2. Wrapper Class
// 3. Access Modifiers
// 4. Operators
// 5. If-else and Switch Statements
// ---------------------------------------------------

import java.util.Scanner; // Import Scanner class for user input

// This class demonstrates various Java basics
public class practice {

    // Main method - Entry point of the program
    public static void main(String[] args) {

        // ---------------------------------------------------
        // 1️⃣ Identifiers and Keywords
        // ---------------------------------------------------
        // Identifiers are names given to variables, methods, or classes.
        int age = 25; // 'age' is an identifier (variable name)
        String city = "New York"; // 'city' is an identifier

        // Printing values to show Identifiers in action
        System.out.println("Age: " + age);   // 'age' is an identifier
        System.out.println("City: " + city); // 'city' is an identifier

        // ---------------------------------------------------
        // 2️⃣ Wrapper Class
        // ---------------------------------------------------
        // Java provides Wrapper Classes to handle primitive data types as objects
        Integer num = 100; // 'Integer' is a wrapper class for the primitive type 'int'
        System.out.println("Number (Wrapper Class): " + num);

        // Converting string to Integer using the wrapper class method
        String str = "50";
        Integer parsedInt = Integer.parseInt(str); // Using Integer wrapper class to convert string to int
        System.out.println("Parsed Integer: " + parsedInt);

        // ---------------------------------------------------
        // 3️⃣ Access Modifiers
        // ---------------------------------------------------
        // Access modifiers in Java determine the visibility of classes, methods, and variables.

        // Demonstrating private access modifier
        Person person = new Person();
        person.setName("Elisa");
        System.out.println("Person's name: " + person.getName());

        // ---------------------------------------------------
        // 4️⃣ Operators
        // ---------------------------------------------------
        // Java supports arithmetic, relational, logical, and other operators

        int x = 5, y = 10;
        
        // Arithmetic Operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("x + y = " + (x + y)); // Addition
        System.out.println("x - y = " + (x - y)); // Subtraction
        System.out.println("x * y = " + (x * y)); // Multiplication
        System.out.println("y / x = " + (y / x)); // Division

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("x == y: " + (x == y)); // Equality check
        System.out.println("x != y: " + (x != y)); // Inequality check
        System.out.println("x < y: " + (x < y)); // Less than comparison

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(x > 3) && (y < 15): " + ((x > 3) && (y < 15))); // AND operator
        System.out.println("(x < 3) || (y > 5): " + ((x < 3) || (y > 5))); // OR operator

        // ---------------------------------------------------
        // 5️⃣ if-else and switch Statements
        // ---------------------------------------------------
        
        Scanner scanner = new Scanner(System.in); // Scanner object to take user input

        // If-Else Example
        System.out.print("\nEnter a number to check if it's positive or negative: ");
        int numb = scanner.nextInt();

        if (numb > 0) {
            System.out.println("The number is positive.");
        } else if (numb < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch Case Example
        System.out.print("\nEnter a number between 1 and 3 to check the day: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is Wednesday.");
                break;
            default:
                System.out.println("Invalid day input!");
        }

        scanner.close(); // Close scanner after use
    }
}

// ---------------------------------------------------
// Person Class Demonstrating Access Modifiers
// ---------------------------------------------------
class Person {
    // Private field: Can only be accessed within the class
    private String name;

    // Public getter method
    public String getName() {
        return name;
    }

    // Public setter method
    public void setName(String name) {
        this.name = name;
    }
}


//If you want to run the code - 'java -cp . Day7.practice' (Run the commmand on Terminal)
