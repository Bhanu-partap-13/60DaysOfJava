# Day 50: Wildcards in Java

Today, I explored the topic of **Wildcards in Java**. Below are some beginner-friendly multiple-choice questions (MCQs) and code-based questions to help reinforce the concepts.

---

## Beginner-Friendly Questions

1. **What is the purpose of wildcards in Java generics?**  
    - [ ] To define a fixed type for a generic class  
    - [x] To allow flexibility in specifying types  
    - [ ] To restrict the use of generics  
    - [ ] To improve runtime performance  

2. **Which symbol is used to denote a wildcard in Java generics?**  
    - [ ] #  
    - [ ] $  
    - [x] ?  
    - [ ] *  

3. **What does `List<?>` mean in Java?**  
    - [x] A list of unknown type  
    - [ ] A list of integers  
    - [ ] A list of strings  
    - [ ] A list of objects  

4. **What is the difference between `List<?>` and `List<Object>`?**  
    - [ ] They are the same  
    - [x] `List<?>` accepts any type, while `List<Object>` only accepts objects  
    - [ ] `List<?>` is invalid syntax  
    - [ ] `List<Object>` is more flexible  

5. **Which wildcard allows reading but not writing to a collection?**  
    - [ ] ? extends Object  
    - [x] ? extends T  
    - [ ] ? super T  
    - [ ] ?  

6. **Which wildcard allows writing but restricts reading from a collection?**  
    - [ ] ? extends T  
    - [ ] ?  
    - [x] ? super T  
    - [ ] ? extends Object  

7. **Can wildcards be used with methods in Java?**  
    - [x] Yes  
    - [ ] No  

---

## Code-Based Questions

1. **What will the following code print?**

    ```java
    List<? extends Number> list = Arrays.asList(1, 2, 3);
    System.out.println(list.get(0));
    ```
    - [x] 1  
    - [ ] 2  
    - [ ] Compilation error  
    - [ ] Runtime error  

2. **Which of the following is valid?**

    ```java
    List<? super Integer> list = new ArrayList<>();
    list.add(10);
    ```
    - [x] Valid  
    - [ ] Invalid  

3. **What is the output of this code?**

    ```java
    List<?> list = Arrays.asList("A", "B", "C");
    System.out.println(list.get(1));
    ```
    - [ ] A  
    - [x] B  
    - [ ] Compilation error  
    - [ ] Runtime error  

4. **Which of the following will cause a compilation error?**

    ```java
    List<? extends Number> list = new ArrayList<>();
    list.add(10);
    ```
    - [ ] Valid  
    - [x] Compilation error  

5. **What does this code do?**

    ```java
    List<? super String> list = new ArrayList<>();
    list.add("Hello");
    ```
    - [x] Adds "Hello" to the list  
    - [ ] Causes a compilation error  
    - [ ] Causes a runtime error  
    - [ ] Does nothing  

6. **What is the output of this code?**

    ```java
    List<? super Integer> list = Arrays.asList(1, 2, 3);
    System.out.println(list.get(0));
    ```
    - [ ] 1  
    - [ ] Compilation error  
    - [x] Runtime error  
    - [ ] 3  

7. **Which of the following is true about wildcards?**  
    - [x] They provide flexibility in generics  
    - [ ] They restrict the use of generics  
    - [ ] They are only used with collections  
    - [ ] They are mandatory in generics  

---

## Coding-Based Problems

### 1. **Filter Numbers from a Mixed List**

**Explain what you have to do in the question:**  
Write a program to filter out numbers from a mixed list using wildcards in Java.

**Topic Name:** Wildcards with `? extends`

**Input format:**  
- A list containing elements of different types (e.g., integers, strings, etc.).

**Output format:**  
- A list containing only the numbers from the input list.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| [1, "A", 2.5, "B", 3] | [1, 2.5, 3] |

| Input 2: | Output 2: |
| -------- | --------- |
| ["X", "Y", 10, 20] | [10, 20] |

**Solution:**

```java
import java.util.*;

public class FilterNumbers {
    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList(1, "A", 2.5, "B", 3);
        List<Number> numbers = filterNumbers(mixedList);
        System.out.println(numbers);
    }

    public static List<Number> filterNumbers(List<?> list) {
        List<Number> result = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Number) {
                result.add((Number) obj);
            }
        }
        return result;
    }
}
```

---

### 2. **Find Maximum in a List of Numbers**

**Explain what you have to do in the question:**  
Write a program to find the maximum number in a list using wildcards in Java.

**Topic Name:** Wildcards with `? extends`

**Input format:**  
- A list of numbers (e.g., integers, doubles, etc.).

**Output format:**  
- The maximum number in the list.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| [1, 2, 3, 4, 5] | 5 |

| Input 2: | Output 2: |
| -------- | --------- |
| [10.5, 20.1, 15.3] | 20.1 |

**Solution:**

```java
import java.util.*;

public class FindMaximum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(findMax(numbers));
    }

    public static <T extends Number> T findMax(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        T max = list.get(0);
        for (T num : list) {
            if (num.doubleValue() > max.doubleValue()) {
                max = num;
            }
        }
        return max;
    }
}
```

---

### 3. **Add Elements to a List with Lower Bound Wildcards**

**Explain what you have to do in the question:**  
Write a program to add elements to a list using lower bound wildcards in Java.

**Topic Name:** Wildcards with `? super`

**Input format:**  
- A list with a lower bound of a specific type (e.g., `Integer`).

**Output format:**  
- The updated list after adding elements.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| [1, 2], [3, 4] | [1, 2, 3, 4] |

| Input 2: | Output 2: |
| -------- | --------- |
| [10], [20, 30] | [10, 20, 30] |

**Solution:**

```java
import java.util.*;

public class AddElements {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>(Arrays.asList(1, 2));
        addElements(list, Arrays.asList(3, 4));
        System.out.println(list);
    }

    public static void addElements(List<? super Integer> list, List<Integer> elements) {
        list.addAll(elements);
    }
}
```
Practice these questions to master the concept of wildcards in Java!  