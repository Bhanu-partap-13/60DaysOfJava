// ---------------------------------------------------
// Operators in Java:
//
// - Operators are special symbols that perform operations on variables and values.
// - Java has several types of operators used for different purposes.
//
// Types of Operators:
// 1️⃣ Arithmetic Operators (+, -, *, /, %)
// 2️⃣ Relational (Comparison) Operators (==, !=, >, <, >=, <=)
// 3️⃣ Logical Operators (&&, ||, !)
// 4️⃣ Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
// 5️⃣ Assignment Operators (=, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=)
// 6️⃣ Increment & Decrement Operators (++ and --)
// 7️⃣ Conditional (Ternary) Operator (? :)
// ---------------------------------------------------
package Day5;

public class OperatorsDemo {
    public static void main(String[] args) {

        // ---------------------------------
        // 1️⃣ Arithmetic Operators
        // ---------------------------------
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));   // 10 + 3 = 13
        System.out.println("Subtraction: " + (a - b));// 10 - 3 = 7
        System.out.println("Multiplication: " + (a * b)); // 10 * 3 = 30
        System.out.println("Division: " + (a / b));   // 10 / 3 = 3 (integer division)
        System.out.println("Modulus: " + (a % b));    // 10 % 3 = 1 (remainder)

        // ---------------------------------
        // 2️⃣ Relational (Comparison) Operators
        // ---------------------------------
        System.out.println("\nRelational Operators:");
        System.out.println(a + " == " + b + " : " + (a == b)); // false
        System.out.println(a + " != " + b + " : " + (a != b)); // true
        System.out.println(a + " > " + b + " : " + (a > b));   // true
        System.out.println(a + " < " + b + " : " + (a < b));   // false
        System.out.println(a + " >= " + b + " : " + (a >= b)); // true
        System.out.println(a + " <= " + b + " : " + (a <= b)); // false

        // ---------------------------------
        // 3️⃣ Logical Operators
        // ---------------------------------
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));  // false
        System.out.println("x || y: " + (x || y));  // true
        System.out.println("!x: " + (!x));          // false

        // ---------------------------------
        // 4️⃣ Bitwise Operators
        // ---------------------------------
        int m = 5, n = 3; // 5 = 101, 3 = 011 (Binary)
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n (AND): " + (m & n)); // 101 & 011 = 001 (1)
        System.out.println("m | n (OR): " + (m | n));  // 101 | 011 = 111 (7)
        System.out.println("m ^ n (XOR): " + (m ^ n)); // 101 ^ 011 = 110 (6)
        System.out.println("~m (NOT): " + (~m));       // ~(5) = -6 (inverting bits)
        System.out.println("m << 1 (Left Shift): " + (m << 1));  // 5 << 1 = 10
        System.out.println("m >> 1 (Right Shift): " + (m >> 1)); // 5 >> 1 = 2

        // ---------------------------------
        // 5️⃣ Assignment Operators
        // ---------------------------------
        int p = 10;
        System.out.println("\nAssignment Operators:");
        p += 5;  // p = p + 5;
        System.out.println("p += 5: " + p); // 15
        p -= 3;  // p = p - 3;
        System.out.println("p -= 3: " + p); // 12
        p *= 2;  // p = p * 2;
        System.out.println("p *= 2: " + p); // 24
        p /= 4;  // p = p / 4;
        System.out.println("p /= 4: " + p); // 6
        p %= 3;  // p = p % 3;
        System.out.println("p %= 3: " + p); // 0

        // ---------------------------------
        // 6️⃣ Increment & Decrement Operators
        // ---------------------------------
        int num = 5;
        System.out.println("\nIncrement & Decrement Operators:");
        System.out.println("num++: " + (num++)); // 5 (Post-increment: Use first, then increase)
        System.out.println("After num++: " + num); // 6
        System.out.println("++num: " + (++num)); // 7 (Pre-increment: Increase first, then use)
        System.out.println("num--: " + (num--)); // 7
        System.out.println("After num--: " + num); // 6

        // ---------------------------------
        // 7️⃣ Conditional (Ternary) Operator
        // ---------------------------------
        int q = 10, r = 20;
        int min = (q < r) ? q : r; // If q < r, return q; else return r
        System.out.println("\nTernary Operator:");
        System.out.println("Minimum value: " + min); // 10

        // ---------------------------------
        // 8️⃣ Operator Precedence
        // ---------------------------------
        System.out.println("\nOperator Precedence:");
        int result = 10 + 5 * 2 - 4 / 2; // Multiplication & Division first
        System.out.println("10 + 5 * 2 - 4 / 2 = " + result); // 10 + 10 - 2 = 18

    }
}


//If you want to run the code - 'java -cp . Day2.datatype' (Run the commmand on Terminal)