//Using assertions in Java

// As we know by default, assertions are disabled in Java. To enable assertions, we need to use the -ea flag while running the program.

//Syntax:
// java -ea ClassNAme


/* 
int age = -1;
assert age > 0 "Age must be positive";
// If the assertion fails, the program will throw an AssertionError.
*/

// 🌟 Using Assertions in Java 🌟
// -------------------------------------------
// 1️. Assertions are used to test assumptions during development.
// 2️. They are disabled by default and need to be enabled using `-ea` flag while running the program.
// 3️. If an assertion fails, an `AssertionError` is thrown.
// -------------------------------------------
package Day36;
public class assertions {
    public static void main(String[] args) {
        System.out.println("🔹 Java Assertions Example 🔹\n");

        // ---------------------------
        // 1️⃣ Using Assertions to Validate Age
        // ---------------------------
        int age = -1;  //  Invalid age
        assert age > 0 : "Age must be positive!";
        System.out.println("✅ Age is valid: " + age);

        // ---------------------------
        // 2️⃣ Checking Array Bounds with Assertions
        // ---------------------------
        int[] numbers = {1, 2, 3, 4, 5};
        int index = 6; //  Invalid index
        assert index >= 0 && index < numbers.length : "Index out of bounds!";
        System.out.println("Element at index " + index + ": " + numbers[index]);
    }
}
