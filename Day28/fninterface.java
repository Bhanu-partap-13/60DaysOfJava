// ---------------------------------------------------  
// 🌟 Functional Interfaces in Java:
//
// 1️⃣ What is a Functional Interface?  
//      - A **functional interface** is an interface that contains exactly one abstract method.  
//      - It is used as a target for lambda expressions and method references.  
//      - The `@FunctionalInterface` annotation is used to indicate a functional interface (optional but recommended).
//
// 2️⃣ Key Features of Functional Interfaces:  
//      ✅ Only one abstract method is allowed.
//      ✅ Can have default and static methods.
//      ✅ Facilitates the use of lambda expressions for more concise code.
//      ✅ Supports method references.
//
// 3️⃣ Syntax of a Functional Interface:  
//      ```java
//      @FunctionalInterface
//      interface Operation {
//          int operate(int a, int b);  // Abstract method
//      }
//      ```  
//
// 4️⃣ Example: Using a Functional Interface with Lambda Expressions  
// ---------------------------------------------------  
package Day28;
@FunctionalInterface
interface Operation {
    int operate(int a, int b);  // Abstract method
}

public class fninterface {
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
