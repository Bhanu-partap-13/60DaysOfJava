# Modern Utility Classes in Java - MCQs

## Beginner-Friendly Questions

1. **Which utility class is used to work with collections in Java?**  
    - [x] `Collections`  
    - [ ] `Arrays`  
    - [ ] `Streams`  
    - [ ] `Optional`  

2. **What does the `Optional` class help to avoid?**  
    - [x] NullPointerException  
    - [ ] IndexOutOfBoundsException  
    - [ ] ArithmeticException  
    - [ ] ClassCastException  

3. **Which method in `Objects` class checks if two objects are equal?**  
    - [x] `Objects.equals()`  
    - [ ] `Objects.hash()`  
    - [ ] `Objects.toString()`  
    - [ ] `Objects.requireNonNull()`  

4. **What is the purpose of `Arrays.asList()`?**  
    - [x] Convert an array to a list  
    - [ ] Sort an array  
    - [ ] Create a new array  
    - [ ] Reverse an array  

5. **Which utility class provides methods for working with streams?**  
    - [x] `Collectors`  
    - [ ] `Collections`  
    - [ ] `Arrays`  
    - [ ] `Optional`  

6. **What does `Objects.requireNonNull()` do?**  
    - [x] Throws a `NullPointerException` if the object is null  
    - [ ] Checks if two objects are equal  
    - [ ] Converts an object to a string  
    - [ ] Creates a hash code for an object  

7. **Which method in `Math` class is used to find the maximum of two numbers?**  
    - [x] `Math.max()`  
    - [ ] `Math.min()`  
    - [ ] `Math.abs()`  
    - [ ] `Math.sqrt()`  

## Code-Oriented Questions

1. **What will `Collections.sort()` do to a list?**  
    - [x] Sort the list in ascending order  
    - [ ] Reverse the list  
    - [ ] Shuffle the list  
    - [ ] Remove duplicates from the list  

2. **What does `Optional.ofNullable()` return if the value is null?**  
    - [x] An empty `Optional`  
    - [ ] A `NullPointerException`  
    - [ ] The same null value  
    - [ ] A default value  

3. **Which method in `Collectors` is used to collect elements into a list?**  
    - [x] `Collectors.toList()`  
    - [ ] `Collectors.toSet()`  
    - [ ] `Collectors.joining()`  
    - [ ] `Collectors.groupingBy()`  

4. **What will `Arrays.binarySearch()` return if the element is not found?**  
    - [x] A negative value  
    - [ ] Zero  
    - [ ] The index of the last element  
    - [ ] An exception  

5. **Which method in `Objects` class generates a hash code for multiple objects?**  
    - [x] `Objects.hash()`  
    - [ ] `Objects.equals()`  
    - [ ] `Objects.toString()`  
    - [ ] `Objects.requireNonNull()`  

6. **What does `Math.random()` return?**  
    - [x] A random double between 0.0 (inclusive) and 1.0 (exclusive)  
    - [ ] A random integer  
    - [ ] A random double between 1.0 and 10.0  
    - [ ] A random boolean  

7. **Which method in `Collectors` is used to concatenate strings?**  
    - [x] `Collectors.joining()`  
    - [ ] `Collectors.toList()`  
    - [ ] `Collectors.toSet()`  
    - [ ] `Collectors.partitioningBy()`  

    ***
    ## Coding Problems on Modern Utility Classes

    ### Problem 1: Using `Optional` to Avoid NullPointerException

    **Explain what you have to do in the question:**  
    Write a program to demonstrate the use of `Optional` to avoid `NullPointerException`. The program should take a string input and check if it is null or not using `Optional`.

    **Topic Name:** Avoiding NullPointerException with `Optional`

    **Input format:**  
    - A single string input.

    **Output format:**  
    - If the string is not null, print the string in uppercase.  
    - If the string is null, print "No value present".

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | "hello"  | "HELLO"   |
    | null     | "No value present" |

    **Solution in Java:**
    ```java
    import java.util.Optional;

    public class OptionalExample {
        public static void main(String[] args) {
            String input = "hello"; // Change this to null to test the null case
            Optional<String> optionalInput = Optional.ofNullable(input);

            String result = optionalInput
                    .map(String::toUpperCase)
                    .orElse("No value present");

            System.out.println(result);
        }
    }
    ```

    ---

    ### Problem 2: Sorting a List Using `Collections.sort()`

    **Explain what you have to do in the question:**  
    Write a program to sort a list of integers in ascending order using `Collections.sort()`.

    **Topic Name:** Sorting with `Collections.sort()`

    **Input format:**  
    - A list of integers.

    **Output format:**  
    - The sorted list of integers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | [5, 2, 8, 1] | [1, 2, 5, 8] |
    | [10, 3, 7]   | [3, 7, 10]    |

    **Solution in Java:**
    ```java
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class CollectionsSortExample {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(1);

            Collections.sort(numbers);

            System.out.println(numbers);
        }
    }
    ```

    ---

    ### Problem 3: Using `Collectors.joining()` to Concatenate Strings

    **Explain what you have to do in the question:**  
    Write a program to concatenate a list of strings into a single string using `Collectors.joining()`.

    **Topic Name:** Concatenating Strings with `Collectors.joining()`

    **Input format:**  
    - A list of strings.

    **Output format:**  
    - A single concatenated string.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | ["Java", "is", "fun"] | "Java is fun" |
    | ["Hello", "World"]    | "Hello World" |

    **Solution in Java:**
    ```java
    import java.util.Arrays;
    import java.util.List;
    import java.util.stream.Collectors;

    public class CollectorsJoiningExample {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Java", "is", "fun");

            String result = words.stream()
                    .collect(Collectors.joining(" "));

            System.out.println(result);
        }
    }
    ```