// ---------------------------------------------------
// 🌟 Variable Arguments (varargs) in Java:
//
// 1️⃣ What is varargs?
//      - Allows a method to accept **multiple arguments** of the same type.
//      - Declared using `...` (three dots).
//
// 2️⃣ Syntax:
//      - `returnType methodName(dataType... varName) { }`
//
// 3️⃣ Rules of varargs:
//      - **Only one varargs parameter per method**.
//      - **Must be the last parameter** in the method.
//
// ---------------------------------------------------

package Day10;

public class varargs {

    // ---------------------------------
    // 1️⃣ Sum of numbers using varargs
    // ---------------------------------
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // ---------------------------------
    // 2️⃣ Concatenating multiple strings using varargs
    // ---------------------------------
    static String concatenate(String... words) {
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        return result.toString().trim(); // Remove extra space
    }

    // ---------------------------------
    // 3️⃣ Find maximum value using varargs
    // ---------------------------------
    static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required.");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // ---------------------------------
    // 4️⃣ Display multiple numbers using varargs
    // ---------------------------------
    static void displayNumbers(int... nums) {
        System.out.print("Numbers: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ---------------------------------
    // 5️⃣ Varargs with normal parameters
    // ---------------------------------
    static void printInfo(String name, int age, String... hobbies) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Hobbies: ");
        for (String hobby : hobbies) {
            System.out.print(hobby + ", ");
        }
        System.out.println("\n");
    }

    // ---------------------------------
    // Main Method - Testing Varargs
    // ---------------------------------
    public static void main(String[] args) {
        // Testing sum()
        System.out.println("Sum: " + sum(10, 20, 30, 40)); // Output: 100

        // Testing concatenate()
        System.out.println("Concatenation: " + concatenate("Hello", "Java", "World!")); // Output: Concatenation: Hello Java World!

        // Testing findMax()
        System.out.println("Maximum: " + findMax(3, 8, 2, 10, 5)); // Output: Maximum: 10

        // Testing displayNumbers()
        displayNumbers(5, 10, 15, 20); // Output: Numbers: 5 10 15 20

        // Testing printInfo()
        printInfo("Bhanu", 22, "Coding", "Gaming", "Photography");
    }
}

/*
 Some Questions for you on Java:
 1️⃣ Sum of Numbers using Varargs
📝 Write a method that takes multiple integers as arguments and returns their sum.

int sum(int... numbers) { }
🔹 Example: sum(2, 3, 5, 10) → 20

2️⃣ Print Multiple Strings
📝 Create a method that takes multiple strings and prints each on a new line.

void printStrings(String... words) { }
🔹 Example:
printStrings("Hello", "Java", "World");

✅ Output:
Hello  
Java  
World  
 */

 //If you want to run the code - java -cp . Day10.varargs 