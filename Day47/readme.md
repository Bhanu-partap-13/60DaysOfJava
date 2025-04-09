# Day 47: Understanding Generic Classes in Java

Today, I explored the concept of **Generic Classes** in Java. Below are some beginner-friendly multiple-choice questions (MCQs) and code-based questions to help reinforce the topic.

---

## Beginner-Friendly Questions

### 1. What is the main purpose of generics in Java?
- [x] To enable type safety at compile time  
- [ ] To improve runtime performance  
- [ ] To allow multiple inheritance  
- [ ] To simplify syntax  

### 2. Which keyword is used to define a generic class in Java?
- [ ] `extends`  
- [ ] `implements`  
- [x] `<T>`  
- [ ] `super`  

### 3. Can a generic class have multiple type parameters?
- [x] Yes  
- [ ] No  

### 4. What does `<T>` represent in a generic class?
- [ ] A method name  
- [x] A type parameter  
- [ ] A variable name  
- [ ] A package name  

### 5. Which of the following is a valid declaration of a generic class?
- [x] `class MyClass<T> {}`  
- [ ] `class MyClass<> {}`  
- [ ] `class MyClass {}`  
- [ ] `class MyClass<T, U, V>`  

### 6. Can generics be used with primitive types in Java?
- [ ] Yes  
- [x] No  

### 7. What is the correct way to instantiate a generic class?
- [x] `MyClass<Integer> obj = new MyClass<>();`  
- [ ] `MyClass<int> obj = new MyClass<>();`  
- [ ] `MyClass obj = new MyClass<>();`  
- [ ] `MyClass<> obj = new MyClass<>();`  

---

## Code-Based Questions

### 1. What will the following code output?

```java
class GenericClass<T> {
    private T data;
    public GenericClass(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}
public class Main {
    public static void main(String[] args) {
        GenericClass<String> obj = new GenericClass<>("Hello");
        System.out.println(obj.getData());
    }
}
```

- [x] `Hello`  
- [ ] `null`  
- [ ] Compilation error  
- [ ] Runtime error  

### 2. Which of the following is true about the code below?

```java
class MyClass<T extends Number> {
    private T value;
    public MyClass(T value) {
        this.value = value;
    }
}
```

- [x] The generic type `T` must be a subclass of `Number`.  
- [ ] The generic type `T` can be any type.  
- [ ] The code will not compile.  
- [ ] The generic type `T` must be a primitive type.  

### 3. What will the following code print?

```java
class MyClass<T> {
    public void display(T value) {
        System.out.println(value);
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>();
        obj.display(42);
    }
}
```

- [x] `42`  
- [ ] Compilation error  
- [ ] Runtime error  
- [ ] `null`  

### 4. What is the output of the following code?

```java
class MyClass<T> {
    private T data;
    public MyClass(T data) {
        this.data = data;
    }
    public void display() {
        System.out.println(data.getClass().getName());
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass<String> obj = new MyClass<>("Test");
        obj.display();
    }
}
```

- [x] `java.lang.String`  
- [ ] `Test`  
- [ ] Compilation error  
- [ ] Runtime error  

### 5. Which of the following is true about the code below?

```java
class MyClass<T> {
    public T add(T a, T b) {
        return a + b;
    }
}
```

- [ ] The code will compile successfully.  
- [ ] The code will throw a runtime error.  
- [x] The code will not compile because `+` cannot be applied to generic types.  
- [ ] The code will not compile because `T` is not defined.  

### 6. What will the following code output?

```java
class MyClass<T> {
    private T data;
    public MyClass(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>(100);
        System.out.println(obj.getData());
    }
}
```

- [x] `100`  
- [ ] `null`  
- [ ] Compilation error  
- [ ] Runtime error  

### 7. What is the purpose of the wildcard `?` in generics?

- [x] To represent an unknown type  
- [ ] To represent a primitive type  
- [ ] To represent a fixed type  
- [ ] To represent a type parameter  

---

## Coding-Based Problems

### 1. Find the Maximum Element Using a Generic Method

**Explain what you have to do in the question:**  
Write a generic method to find the maximum element in an array of any type that implements the `Comparable` interface.

**Topic Name:**  
Generic Methods in Java

**Input format:**  
- An array of elements of type `T` where `T` implements `Comparable`.

**Output format:**  
- The maximum element in the array.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| [3, 5, 1, 9, 2] | 9 |
| ["apple", "orange", "banana"] | orange |

| Input 2: | Output 2: |
| -------- | --------- |
| [10.5, 3.2, 7.8] | 10.5 |
| [100, 200, 50] | 200 |

**Solution:**

```java
class GenericUtils {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 9, 2};
        System.out.println("Max Integer: " + GenericUtils.findMax(intArray));

        String[] strArray = {"apple", "orange", "banana"};
        System.out.println("Max String: " + GenericUtils.findMax(strArray));
    }
}
```

---

### 2. Implement a Generic Stack

**Explain what you have to do in the question:**  
Create a generic stack class that supports basic stack operations like `push`, `pop`, and `peek`.

**Topic Name:**  
Generic Classes in Java

**Input format:**  
- A series of operations (`push`, `pop`, `peek`) on the stack.

**Output format:**  
- The result of the operations.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| push(10), push(20), peek(), pop() | 20, 20 |
| push("A"), push("B"), pop(), peek() | B, A |

| Input 2: | Output 2: |
| -------- | --------- |
| push(1.1), push(2.2), peek(), pop() | 2.2, 2.2 |
| push(100), pop(), pop() | 100, Stack is empty |

**Solution:**

```java
class GenericStack<T> {
    private java.util.ArrayList<T> stack = new java.util.ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack.get(stack.size() - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());

        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("A");
        stringStack.push("B");
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Peek: " + stringStack.peek());
    }
}
```

---

### 3. Filter Elements Using a Generic Method

**Explain what you have to do in the question:**  
Write a generic method to filter elements from a list based on a condition provided by a functional interface.

**Topic Name:**  
Generics with Functional Interfaces

**Input format:**  
- A list of elements of type `T`.
- A condition to filter the elements.

**Output format:**  
- A list of elements that satisfy the condition.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| [1, 2, 3, 4, 5], x -> x > 3 | [4, 5] |
| ["apple", "banana", "cherry"], x -> x.startsWith("b") | ["banana"] |

| Input 2: | Output 2: |
| -------- | --------- |
| [10, 20, 30, 40], x -> x < 25 | [10, 20] |
| ["cat", "dog", "elephant"], x -> x.length() > 3 | ["elephant"] |

**Solution:**

```java
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class GenericFilter {
    public static <T> List<T> filter(List<T> list, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (condition.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Filtered Numbers: " + GenericFilter.filter(numbers, x -> x > 3));

        List<String> words = List.of("apple", "banana", "cherry");
        System.out.println("Filtered Words: " + GenericFilter.filter(words, x -> x.startsWith("b")));
    }
}
```