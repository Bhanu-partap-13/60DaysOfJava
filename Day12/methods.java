// ---------------------------------------------------  
// 🌟 Methods in Java:
//
// 1️. What is a Method?  
//      - A **method** is a reusable block of code that performs a task.  
//      - It helps in **modular programming** and **code reusability**.  
//
// 2️. Why Use Methods?  
//      - **Avoid repetition** → Write once, use multiple times.  
//      - **Improve readability** → Break code into small, meaningful parts.  
//      - **Make debugging easier** → Fix errors in one place instead of multiple places.  
//
// 3️. Syntax of a Method:  
//      - `returnType methodName(parameters) { /* method body */ }`  
//      - Example: `int add(int a, int b) { return a + b; }`  
//
// 4️. Types of Methods in Java:  
//      - **1️. Predefined Methods** → Built-in (`Math.sqrt()`, `System.out.println()`)  
//      - **2️. User-Defined Methods** → Custom methods created by the programmer  
//      - **3️. Static Methods** → Can be called without an object  
//      - **4️. Instance Methods** → Need an object to be called  
//      - **5️. Method Overloading** → Same method name, different parameters  
// ---------------------------------------------------
package Day12;

import java.util.Scanner; // Import Scanner class for user input  

// ---------------------------------  
// 1️. Defining a Class with Methods  
// ---------------------------------  
class Calculator {  
    // Method to add two numbers  
    int add(int a, int b) {  
        return a + b;  
    }  

    // Method to subtract two numbers  
    int subtract(int a, int b) {  
        return a - b;  
    }  

    // Method to multiply two numbers  
    int multiply(int a, int b) {  
        return a * b;  
    }  

    // Static Method: Can be called without an object  
    static void greet() {  
        System.out.println("\nWelcome to the Calculator Program!");  
    }  
}  

// ---------------------------------  
// 2️. Using Methods in the Main Class  
// ---------------------------------  
public class methods {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  

        // Calling a Static Method  
        Calculator.greet();  

        // ---------------------------------  
        // 1️. Creating an Object to Call Methods  
        // ---------------------------------  
        Calculator calc = new Calculator();  

        // ---------------------------------  
        // 2️. Calling Instance Methods  
        // ---------------------------------  
        System.out.print("\nEnter first number: ");  
        int num1 = input.nextInt();  
        System.out.print("Enter second number: ");  
        int num2 = input.nextInt();  

        // Performing calculations using methods  
        System.out.println("Addition: " + calc.add(num1, num2));  
        System.out.println("Subtraction: " + calc.subtract(num1, num2));  
        System.out.println("Multiplication: " + calc.multiply(num1, num2));  

        input.close();  
    }  
}  
