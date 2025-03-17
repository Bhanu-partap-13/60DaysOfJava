// ---------------------------------------------------  
// 🌟 Lambda Expressions in Java:
//
// 1️. What is a Lambda Expression?  
//      - A **lambda expression** is a concise way to represent an anonymous function.  
//      - It provides a clear and concise way to implement **functional interfaces** (interfaces with a single abstract method).  
//      - Introduced in **Java 8**, lambda expressions enable functional programming capabilities in Java.
//
// 2️. Key Features of Lambda Expressions:  
//       **Simplified Syntax** – Reduces boilerplate code by eliminating the need for anonymous class implementations.  
//       **Functional Programming** – Facilitates writing code in a functional style, promoting immutability and statelessness.  
//       **Enhanced Readability** – Leads to more readable and maintainable code.
//
// 3️. Syntax of a Lambda Expression:  
//      ```java
//      (parameters) -> expression
//      ```  
//      - **Parameters**: A comma-separated list of input parameters; parentheses can be omitted if there's a single parameter.  
//      - **Arrow Token (`->`)**: Separates the parameter list from the body of the lambda.  
//      - **Expression**: The body of the lambda; can be a single expression or a block of statements.
//
// 4️. Example: Using Lambda Expressions with Functional Interfaces  
// ---------------------------------------------------  
package Day31;

@FunctionalInterface //marzi hai likhna hai likho warna nhi likho
interface Operation {
    int operate(int a, int b);  // Abstract method
}

public class lambdaexp {
    public static void main(String[] args) {
        // ---------------------------------
        // Using Lambda Expressions to Implement the Functional Interface
        // ---------------------------------
        
        // Lambda expression for addition
        Operation addition = (a, b) -> a + b;
        
        // Lambda expression for multiplication
        Operation multiplication = (a, b) -> a * b;
        
        // Calling the operate() method using lambda implementations
        System.out.println("Addition: " + addition.operate(10, 20));           // Output: 30
        System.out.println("Multiplication: " + multiplication.operate(10, 20)); // Output: 200
        
        // ---------------------------------
        // Using a Method Reference with a Functional Interface
        // ---------------------------------
        // Here we use a method reference to the static method 'subtract' of the Calculator class.
        Operation subtraction = Calculator::subtract;
        System.out.println("Subtraction: " + subtraction.operate(20, 10));       // Output: 10
    }
}

// A helper class with a static method for subtraction
class Calculator {
    static int subtract(int a, int b) {
        return a - b;
    }
}
