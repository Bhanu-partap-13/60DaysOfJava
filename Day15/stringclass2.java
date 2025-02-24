package Day15;
import java.util.Arrays; // For printing array results  
/*                                                          String Constructor in Java
 * String emptyString = ""; // empty string
 * String nullString = null; // null string
 * String str = "Hello, World!"; // string with value
 * String str = new String("Hello, World!"); // string with value
 * String buffer = new StringBuffer("Hello, World!"); // string with value
 * String builder = new StringBuilder("Hello, World!"); // string with value 
 */
public class stringclass2 {

// ---------------------------------------------------  
// 🌟 String Methods & String Constructors in Java:
//
// 1️⃣ What is a String?  
//      - A **String** in Java is a sequence of characters.  
//      - Strings in Java are **immutable** (cannot be changed after creation).  
//      - Defined using **double quotes ("")**.  
//
// 2️⃣ String Creation Methods:  
//      - **String Literal:** `String s = "Hello";` (Stored in String Pool)  
//      - **Using `new` Keyword:** `String s = new String("Hello");` (Stored in Heap)  
//
// 3️⃣ String Constructors:  
//      - **String(String str)** → Creates a copy of an existing string.  
//      - **String(char[] charArray)** → Converts a character array into a string.  
//      - **String(byte[] byteArray)** → Converts a byte array into a string.  
//      - **String(StringBuffer sb)** → Converts a `StringBuffer` into a string.  
//      - **String(StringBuilder sb)** → Converts a `StringBuilder` into a string.  
//
// 4️⃣ Commonly Used String Methods:  
//      - `length()` → Returns the number of characters in the string.  
//      - `charAt(index)` → Returns the character at the given index.  
//      - `substring(start, end)` → Extracts a portion of the string.  
//      - `toLowerCase()` / `toUpperCase()` → Converts string to lowercase/uppercase.  
//      - `trim()` → Removes leading and trailing spaces.  
//      - `equals(str)` / `equalsIgnoreCase(str)` → Compares two strings.  
//      - `contains(str)` → Checks if a substring exists in a string.  
//      - `replace(old, new)` → Replaces characters or substrings.  
//      - `split(delimiter)` → Splits a string into an array.  
//      - `concat(str)` → Appends one string to another.  
//
// ---------------------------------------------------  


// ---------------------------------  
// 1️⃣ Demonstrating String Constructors  
// ---------------------------------  

    public static void main(String[] args) {  

        // ---------------------------------  
        // 🔹 Creating Strings using Constructors  
        // ---------------------------------  
        String str1 = new String("Hello World"); // String from another string  
        char[] charArray = { 'J', 'a', 'v', 'a' };  
        String str2 = new String(charArray); // String from char array  

        byte[] byteArray = { 72, 101, 108, 108, 111 };  
        String str3 = new String(byteArray); // String from byte array  

        // Displaying Strings  
        System.out.println("🔹 String from String: " + str1);  
        System.out.println("🔹 String from Char Array: " + str2);  
        System.out.println("🔹 String from Byte Array: " + str3);  

        // ---------------------------------  
        // 🔹 Common String Methods  
        // ---------------------------------  
        String sample = "  Java Programming  ";  
        System.out.println("\n💡 Original String: \"" + sample + "\"");  

        // 1️⃣ Getting Length  
        System.out.println("🔹 Length: " + sample.length());  

        // 2️⃣ Accessing Characters  
        System.out.println("🔹 Character at index 5: " + sample.charAt(5));  

        // 3️⃣ Extracting a Substring  
        System.out.println("🔹 Substring (5 to 16): " + sample.substring(5, 16));  

        // 4️⃣ Converting to Uppercase & Lowercase  
        System.out.println("🔹 To Uppercase: " + sample.toUpperCase());  
        System.out.println("🔹 To Lowercase: " + sample.toLowerCase());  

        // 5️⃣ Removing Extra Spaces  
        System.out.println("🔹 Trimmed String: \"" + sample.trim() + "\"");  

        // 6️⃣ Checking Equality  
        System.out.println("🔹 Equals 'java programming' (case-sensitive): " + sample.trim().equals("java programming"));  
        System.out.println("🔹 Equals Ignore Case: " + sample.trim().equalsIgnoreCase("java programming"));  

        // 7️⃣ Checking if String Contains a Substring  
        System.out.println("🔹 Contains 'Program': " + sample.contains("Program"));  

        // 8️⃣ Replacing Characters  
        System.out.println("🔹 Replace 'Java' with 'Python': " + sample.replace("Java", "Python"));  

        // 9️⃣ Splitting a String  
        String sentence = "Java,Python,C++,JavaScript";  
        String[] languages = sentence.split(",");  
        System.out.println("🔹 Split String into Array: " + Arrays.toString(languages));  

        // 🔟 Concatenation  
        String greeting = "Hello, ";  
        System.out.println("🔹 Concatenated String: " + greeting.concat("World!"));  
    }  

}