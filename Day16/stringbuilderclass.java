// ---------------------------------------------------  
// 🌟 StringBuilder in Java:
//
// 1️. What is StringBuilder?  
//      - `StringBuilder` is a **mutable** sequence of characters.  
//      - Unlike `String`, it can be modified **without creating a new object**.  
//      - It is **faster** than `StringBuffer` (not thread-safe but efficient).  
//
// 2️. Why Use StringBuilder?  
//      - **Better Performance:** Faster than `String` for modifications.  
//      - **Efficient Memory Usage:** Doesn't create unnecessary objects.  
//      - **Supports Many Operations:** Append, Insert, Replace, Delete, etc.  
//
// 3️. Creating a StringBuilder:  
//      - **`StringBuilder()`** → Creates an empty `StringBuilder`.  
//      - **`StringBuilder(String str)`** → Initializes with a given string.  
//      - **`StringBuilder(int capacity)`** → Creates with a specific capacity.  
//
// 4️. Commonly Used StringBuilder Methods:  
//      - `append(str)` → Adds a string at the end.  
//      - `insert(index, str)` → Inserts a string at the given index.  
//      - `replace(start, end, str)` → Replaces a portion of the string.  
//      - `delete(start, end)` → Removes a portion of the string.  
//      - `reverse()` → Reverses the string.  
//      - `length()` → Returns the length of the string.  
//      - `charAt(index)` → Returns the character at the given index.  
//      - `setCharAt(index, char)` → Changes a character at a specific index.  
//      - `toString()` → Converts `StringBuilder` to a regular `String`.  
//
// ---------------------------------------------------  
package Day16;
// ---------------------------------  
// 1️. Demonstrating StringBuilder  
// ---------------------------------  
public class stringbuilderclass {  
    public static void main(String[] args) {  

        // ---------------------------------  
        // 🔹 Creating a StringBuilder  
        // ---------------------------------  
        StringBuilder sb = new StringBuilder("Hello");  
        System.out.println("💡 Original StringBuilder: " + sb);  

        // ---------------------------------  
        // 🔹 Appending a String  
        // ---------------------------------  
        sb.append(" World");  
        System.out.println("🔹 After Append: " + sb);  

        // ---------------------------------  
        // 🔹 Inserting a String at a Position  
        // ---------------------------------  
        sb.insert(5, " Java");  
        System.out.println("🔹 After Insert: " + sb);  

        // ---------------------------------  
        // 🔹 Replacing a Portion of the String  
        // ---------------------------------  
        sb.replace(6, 10, "Python");  
        System.out.println("🔹 After Replace: " + sb);  

        // ---------------------------------  
        // 🔹 Deleting Characters  
        // ---------------------------------  
        sb.delete(6, 12);  
        System.out.println("🔹 After Delete: " + sb);  

        // ---------------------------------  
        // 🔹 Reversing the String  
        // ---------------------------------  
        sb.reverse();  
        System.out.println("🔹 After Reverse: " + sb);  

        // ---------------------------------  
        // 🔹 Getting Length and Capacity  
        // ---------------------------------  
        sb.reverse(); // Reverse it back  
        System.out.println("🔹 Length: " + sb.length());  
        System.out.println("🔹 Capacity: " + sb.capacity());  

        // ---------------------------------  
        // 🔹 Accessing and Modifying Characters  
        // ---------------------------------  
        System.out.println("🔹 Character at index 2: " + sb.charAt(2));  
        sb.setCharAt(2, 'X');  
        System.out.println("🔹 After setCharAt(2, 'X'): " + sb);  

        // ---------------------------------  
        // 🔹 Converting to String  
        // ---------------------------------  
        String finalString = sb.toString();  
        System.out.println("🔹 Converted to String: " + finalString);  
    }  
}  
