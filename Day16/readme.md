# Day 16: StringBuilder in Java

## Beginner-Friendly Questions

1. **What is the primary purpose of the `StringBuilder` class in Java?**
    - [ ] To create immutable strings
    - [x] To create mutable strings
    - [ ] To perform mathematical operations
    - [ ] To handle file I/O operations

2. **Which method is used to append a string to a `StringBuilder` object?**
    - [ ] add()
    - [x] append()
    - [ ] insert()
    - [ ] concat()

3. **How do you create a new `StringBuilder` object with an initial string "Hello"?**
    - [ ] `StringBuilder sb = new StringBuilder();`
    - [ ] `StringBuilder sb = "Hello";`
    - [x] `StringBuilder sb = new StringBuilder("Hello");`
    - [ ] `StringBuilder sb = StringBuilder("Hello");`

4. **Which method is used to reverse the characters in a `StringBuilder` object?**
    - [ ] flip()
    - [ ] invert()
    - [x] reverse()
    - [ ] rotate()

5. **What is the default capacity of a `StringBuilder` object if no initial capacity is specified?**
    - [ ] 8
    - [ ] 16
    - [x] 16
    - [ ] 32

6. **Which method is used to delete a sequence of characters in a `StringBuilder` object?**
    - [ ] remove()
    - [ ] erase()
    - [x] delete()
    - [ ] cut()

7. **How can you convert a `StringBuilder` object to a `String` object?**
    - [ ] `toStringBuilder()`
    - [ ] `convertToString()`
    - [x] `toString()`
    - [ ] `buildString()`

***

## Questions Based on Code

1. **What will be the output of the following code?**
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println(sb.toString());
    ```
    - [ ] Hello
    - [ ] World
    - [x] Hello World
    - [ ] HelloWorld

2. **What will be the output of the following code?**
    ```java
    StringBuilder sb = new StringBuilder("Java");
    sb.insert(4, " Programming");
    System.out.println(sb.toString());
    ```
    - [ ] Java
    - [ ] Programming
    - [x] Java Programming
    - [ ] JavaProgramming

3. **What will be the output of the following code?**
    ```java
    StringBuilder sb = new StringBuilder("abcdef");
    sb.delete(1, 3);
    System.out.println(sb.toString());
    ```
    - [ ] abcdef
    - [ ] abdef
    - [x] adef
    - [ ] acdef

4. **What will be the output of the following code?**
    ```java
    StringBuilder sb = new StringBuilder("12345");
    sb.reverse();
    System.out.println(sb.toString());
    ```
    - [ ] 12345
    - [ ] 54321
    - [x] 54321
    - [ ] 12354

5. **What will be the output of the following code?**
    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.setCharAt(1, 'a');
    System.out.println(sb.toString());
    ```
    - [ ] Hello
    - [ ] Hallo
    - [x] Hallo
    - [ ] Hella

6. **What will be the output of the following code?**
    ```java
    StringBuilder sb = new StringBuilder("abcdef");
    sb.replace(1, 4, "XYZ");
    System.out.println(sb.toString());
    ```
    - [ ] aXYZef
    - [ ] aXYZdef
    - [x] aXYZef
    - [ ] abcXYZ

7. **What will be the output of the following code?**
    ```java
    StringBuilder sb = new StringBuilder();
    sb.append("Java");
    sb.append(" ");
    sb.append("Programming");
    System.out.println(sb.toString());
    ```
    - [ ] JavaProgramming
    - [ ] Java Programming
    - [x] Java Programming
    - [ ] Java_Programming

    ***
    
    ## Coding Problems

    ### Problem 1: Concatenate Strings

    **Explain what you have to do in the question:**
    Concatenate multiple strings using `StringBuilder`.

    **Topic name:**
    String Concatenation

    **Input format:**
    - A list of strings to concatenate.

    **Output format:**
    - A single concatenated string.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | ["Hello", " ", "World"] | Hello World |
    | ["Java", " ", "Programming"] | Java Programming |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | ["Good", " ", "Morning"] | Good Morning |
    | ["String", "Builder"] | StringBuilder |

    ### Solution:
    ```java
    public class ConcatenateStrings {
        public static void main(String[] args) {
            String[] input = {"Hello", " ", "World"};
            StringBuilder sb = new StringBuilder();
            for (String str : input) {
                sb.append(str);
            }
            System.out.println(sb.toString());
        }
    }
    ```

    ### Problem 2: Reverse a String

    **Explain what you have to do in the question:**
    Reverse a given string using `StringBuilder`.

    **Topic name:**
    String Reversal

    **Input format:**
    - A single string to reverse.

    **Output format:**
    - The reversed string.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | "Hello" | olleH |
    | "Java" | avaJ |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | "Programming" | gnimmargorP |
    | "StringBuilder" | redliuBgnirtS |

    ### Solution:
    ```java
    public class ReverseString {
        public static void main(String[] args) {
            String input = "Hello";
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
    ```

    ### Problem 3: Replace Substring

    **Explain what you have to do in the question:**
    Replace a substring within a string using `StringBuilder`.

    **Topic name:**
    Substring Replacement

    **Input format:**
    - A string, the start index, the end index, and the replacement string.

    **Output format:**
    - The modified string with the substring replaced.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | "abcdef", 1, 4, "XYZ" | aXYZef |
    | "HelloWorld", 5, 10, "Java" | HelloJava |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | "123456", 2, 5, "ABC" | 12ABC6 |
    | "StringBuilder", 6, 12, "Buffer" | StringBuffer |

    ### Solution:
    ```java
    public class ReplaceSubstring {
        public static void main(String[] args) {
            String input = "abcdef";
            int start = 1;
            int end = 4;
            String replacement = "XYZ";
            StringBuilder sb = new StringBuilder(input);
            sb.replace(start, end, replacement);
            System.out.println(sb.toString());
        }
    }
    ```