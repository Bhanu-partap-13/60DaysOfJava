# Utility Classes in Java (Legacy Classes)

This document contains multiple-choice questions (MCQs) to help beginners master the topic of utility classes in Java, specifically focusing on legacy classes. The questions are divided into two sections: beginner-friendly questions and code-based questions.

---

## Beginner-Friendly Questions

### 1. Which of the following is a legacy utility class in Java?
- [x] `Vector`
- [ ] `ArrayList`
- [ ] `HashMap`
- [ ] `LinkedList`

### 2. What is the main characteristic of the `Hashtable` class?
- [x] It is synchronized.
- [ ] It is unsynchronized.
- [ ] It allows `null` keys.
- [ ] It is part of the `java.util.concurrent` package.

### 3. Which legacy class is used for stack operations in Java?
- [x] `Stack`
- [ ] `Deque`
- [ ] `PriorityQueue`
- [ ] `TreeSet`

### 4. What is the default capacity of a `Vector` when it is initialized without specifying a size?
- [x] 10
- [ ] 0
- [ ] 1
- [ ] 16

### 5. Which method is used to add an element to a `Vector`?
- [x] `addElement()`
- [ ] `add()`
- [ ] `put()`
- [ ] `insert()`

### 6. Can a `Hashtable` contain `null` values?
- [ ] Yes
- [x] No

### 7. Which legacy class implements a last-in, first-out (LIFO) data structure?
- [x] `Stack`
- [ ] `Vector`
- [ ] `Queue`
- [ ] `HashSet`

---

## Code-Based Questions

### 1. What will be the output of the following code snippet?
```java
Vector<Integer> vector = new Vector<>();
vector.add(10);
vector.add(20);
System.out.println(vector.size());
```
- [x] 2
- [ ] 10
- [ ] 20
- [ ] 0

### 2. Which method is used to remove all elements from a `Vector`?
- [x] `clear()`
- [ ] `removeAll()`
- [ ] `deleteAll()`
- [ ] `purge()`

### 3. What will happen if you try to insert a `null` key into a `Hashtable`?
- [ ] It will allow the key.
- [ ] It will replace the existing key.
- [x] It will throw a `NullPointerException`.
- [ ] It will silently ignore the key.

### 4. What does the `capacity()` method of a `Vector` return?
- [x] The current capacity of the `Vector`.
- [ ] The number of elements in the `Vector`.
- [ ] The maximum number of elements the `Vector` can hold.
- [ ] The size of the `Vector`.

### 5. What will be the output of the following code snippet?
```java
Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.pop());
```
- [x] `B`
- [ ] `A`
- [ ] `null`
- [ ] `Exception`

### 6. Which method is used to check if a `Stack` is empty?
- [x] `isEmpty()`
- [ ] `empty()`
- [ ] `size() == 0`
- [ ] `clear()`

### 7. What will be the output of the following code snippet?
```java
Hashtable<Integer, String> table = new Hashtable<>();
table.put(1, "One");
table.put(2, "Two");
System.out.println(table.get(1));
```
- [x] `One`
- [ ] `Two`
- [ ] `null`
- [ ] `Exception`

---

### Coding Problems on Legacy Utility Classes

#### 1. Reverse a Stack Using Another Stack

**Explain what you have to do in the question:**  
Write a program to reverse the elements of a `Stack` using another `Stack`.

**Topic Name:**  
Stack Operations

**Input format:**  
- The number of elements in the stack.  
- The elements of the stack.

**Output format:**  
- The reversed stack.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5        | 5         |
| 1 2 3 4 5 | 4 3 2 1 |

| Input 2: | Output 2: |
| -------- | --------- |
| 3        | 3         |
| 10 20 30 | 20 10     |

**Solution:**
```java
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Stack<Integer> reversedStack = reverseStack(stack);
        while (!reversedStack.isEmpty()) {
            System.out.print(reversedStack.pop() + " ");
        }
    }

    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        return tempStack;
    }
}
```

---

#### 2. Check if a `Vector` Contains a Specific Element

**Explain what you have to do in the question:**  
Write a program to check if a `Vector` contains a specific element.

**Topic Name:**  
Vector Operations

**Input format:**  
- The number of elements in the `Vector`.  
- The elements of the `Vector`.  
- The element to search for.

**Output format:**  
- `true` if the element is found, otherwise `false`.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5        | true      |
| 10 20 30 40 50 |      |
| 30       |           |

| Input 2: | Output 2: |
| -------- | --------- |
| 4        | false     |
| 1 2 3 4  |           |
| 5        |           |

**Solution:**
```java
import java.util.Vector;

public class VectorContains {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        int searchElement = 30;
        System.out.println(vector.contains(searchElement));
    }
}
```

---

#### 3. Find the Frequency of Elements in a `Hashtable`

**Explain what you have to do in the question:**  
Write a program to count the frequency of elements in a `Hashtable`.

**Topic Name:**  
Hashtable Operations

**Input format:**  
- The number of key-value pairs in the `Hashtable`.  
- The key-value pairs.

**Output format:**  
- The frequency of each value.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5        | One: 2    |
| 1 One    | Two: 1    |
| 2 Two    |           |
| 3 One    |           |

| Input 2: | Output 2: |
| -------- | --------- |
| 4        | A: 2      |
| 1 A      | B: 1      |
| 2 B      |           |
| 3 A      |           |

**Solution:**
```java
import java.util.Hashtable;
import java.util.HashMap;

public class HashtableFrequency {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "One");
        table.put(2, "Two");
        table.put(3, "One");

        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String value : table.values()) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        for (String key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key));
        }
    }
}
```

Practice these questions to solidify your understanding of legacy utility classes in Java!  