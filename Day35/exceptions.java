//What is the Exception
/*An exception is an event that disrupts the normal flow of program's execution */

/*
 PURPOSE:
 * To handle the runtime errors
 * To maintain the normal flow of the program
 */
//Exceptions ar unexpected events that occur during the execution of a program.
//Types: Checked and Unchecked
//Checked: Compile time exceptions
//Unchecked: Runtime exceptions




// 🌟 Java Exception Handling Guide 🌟
// ---------------------------------------------
// 1️.Exception Class Hierarchy
//    - Throwable
//        - Exception  (Checked Exceptions)
//        - RuntimeException (Unchecked Exceptions)
//        - Error  (JVM-related, e.g., OutOfMemoryError)

// 2️.Types of Exceptions
//    - Checked Exceptions (Handled at compile-time) ➝ IOException, SQLException
//    - Unchecked Exceptions (Happen at runtime) ➝ ArithmeticException, NullPointerException

// 3️.Handling Exceptions using try-catch-finally
package Day35;
public class exceptions {
    public static void main(String[] args) {
        System.out.println("🔹 Exception Handling in Java 🔹\n");

        // ---------------------------
        // 1️⃣ Try-Catch Example
        // ---------------------------
        try {
            int a = 10, b = 0;
            int result = a / b; //  This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // ---------------------------
        // 2️⃣ Finally Block
        // ---------------------------
        try {
            System.out.println("\nOpening resource...");
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); //  ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("✅ Finally block executed (Resource closed).");
        }

        // ---------------------------
        // 3️⃣ Custom Exception Example
        // ---------------------------
        try {
            validateAge(15);  // 🚨 This will throw Custom Exception
        } catch (InvalidAgeException e) {
            System.out.println("\nCustom Exception Caught: " + e.getMessage());
        }
    }

    // Custom Exception Class
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("✅Age is valid.");
        }
    }
}

// ---------------------------
// 4️⃣ Creating a Custom Exception Class
// ---------------------------
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
