# Day 49: Using Bounded Types and Wildcards in Java

Today, I explored the topic of **Using Bounded Types and Wildcards in Java**. Below are some beginner-friendly multiple-choice questions (MCQs) and some code-based questions to help master this topic.

---

## Beginner-Friendly Questions

### 1. What is the purpose of bounded types in Java Generics?
- [ ] To restrict the type to only primitive types.  
- [x] To restrict the type to a specific range of classes or interfaces.  
- [ ] To allow any type without restrictions.  
- [ ] To enforce compile-time errors for all types.  

### 2. Which keyword is used to define an upper bound in Java Generics?
- [ ] `extends`  
- [x] `extends`  
- [ ] `super`  
- [ ] `implements`  

### 3. What does the wildcard `?` represent in Java Generics?
- [x] An unknown type.  
- [ ] A specific type.  
- [ ] A primitive type.  
- [ ] A final type.  

### 4. Which of the following is a valid use of bounded wildcards?
- [x] `List<? extends Number>`  
- [ ] `List<? implements Number>`  
- [ ] `List<? super implements Number>`  
- [ ] `List<? extends int>`  

### 5. What does `List<? super Integer>` mean?
- [ ] The list can only contain `Integer` objects.  
- [x] The list can contain `Integer` or its superclasses.  
- [ ] The list can contain `Integer` or its subclasses.  
- [ ] The list can only contain `Object` type.  

### 6. Can wildcards be used with methods in Java?
- [x] Yes, they can be used in method parameters.  
- [ ] No, they are only for class-level declarations.  
- [ ] Yes, but only in return types.  
- [ ] No, wildcards are not allowed in methods.  

### 7. What is the main advantage of using wildcards in Java Generics?
- [x] Flexibility in accepting different types.  
- [ ] Restricting the type to a specific class.  
- [ ] Avoiding runtime errors.  
- [ ] Enforcing strict type safety.  

---

## Code-Based Questions

### 1. What will the following code print?
```java
List<? extends Number> list = Arrays.asList(1, 2.5, 3);
System.out.println(list.get(1));
```
- [ ] Compilation error.  
- [ ] `1`  
- [x] `2.5`  
- [ ] `3`  

### 2. Which of the following is valid for the method signature below?
```java
public void process(List<? super Integer> list) { }
```
- [x] `process(new ArrayList<Object>());`  
- [x] `process(new ArrayList<Number>());`  
- [ ] `process(new ArrayList<Double>());`  
- [ ] `process(new ArrayList<String>());`  

### 3. What is the output of the following code?
```java
List<? super Integer> list = new ArrayList<>();
list.add(10);
System.out.println(list.get(0));
```
- [ ] Compilation error.  
- [x] `10`  
- [ ] `null`  
- [ ] Runtime exception.  

### 4. Which of the following is valid for `List<? extends Number>`?
- [x] `List<Integer>`  
- [x] `List<Double>`  
- [ ] `List<String>`  
- [ ] `List<Object>`  

### 5. What will happen if you try to add an element to a `List<? extends Number>`?
- [ ] The element will be added successfully.  
- [ ] Compilation error if the element is not a `Number`.  
- [x] Compilation error for any element.  
- [ ] Runtime exception.  

### 6. What is the output of the following code?
```java
List<? super Integer> list = new ArrayList<>();
list.add(5);
list.add(10);
System.out.println(list.size());
```
- [ ] Compilation error.  
- [ ] `0`  
- [x] `2`  
- [ ] Runtime exception.  

### 7. Which of the following is true about bounded wildcards?
- [x] `List<? extends Number>` allows reading but not writing.  
- [ ] `List<? super Number>` allows reading but not writing.  
- [ ] `List<? extends Number>` allows both reading and writing.  
- [ ] `List<? super Number>` allows neither reading nor writing.  

## Coding-Based Problems

### 1. Find the Sum of Numbers in a List Using Bounded Wildcards

**Explain what you have to do in the question:**  
Write a method that accepts a list of numbers (using bounded wildcards) and calculates the sum of all the numbers in the list.

**Topic Name:** Using Bounded Wildcards in Java  

**Input format:**  
- A list of numbers (e.g., integers, doubles, etc.).

**Output format:**  
- The sum of all numbers in the list.

**Example:**  

| Input 1:               | Output 1: |
| ----------------------- | --------- |
| List: [1, 2, 3, 4, 5]  | 15        |
| List: [1.5, 2.5, 3.0]  | 7.0       |

```java
import java.util.List;

public class BoundedWildcardExample {
    public static double calculateSum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
```

---

### 2. Add Elements to a List Using Lower Bounded Wildcards

**Explain what you have to do in the question:**  
Write a method that accepts a list with a lower bound of `Integer` and adds a series of integers to the list.

**Topic Name:** Using Lower Bounded Wildcards in Java  

**Input format:**  
- A list with a lower bound of `Integer`.

**Output format:**  
- The updated list after adding integers.

**Example:**  

| Input 1:               | Output 1:          |
| ----------------------- | ------------------ |
| List: []               | List: [10, 20, 30] |
| List: [5]              | List: [5, 10, 20]  |

```java
import java.util.List;

public class LowerBoundedWildcardExample {
    public static void addElements(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }
}
```

---

### 3. Find the Maximum Element in a List Using Bounded Wildcards

**Explain what you have to do in the question:**  
Write a method that accepts a list of numbers (using bounded wildcards) and finds the maximum element in the list.

**Topic Name:** Using Bounded Wildcards in Java  

**Input format:**  
- A list of numbers (e.g., integers, doubles, etc.).

**Output format:**  
- The maximum number in the list.

**Example:**  

| Input 1:               | Output 1: |
| ----------------------- | --------- |
| List: [1, 2, 3, 4, 5]  | 5         |
| List: [1.5, 2.5, 3.0]  | 3.0       |

```java
import java.util.List;

public class MaxElementExample {
    public static Number findMax(List<? extends Number> list) {
        if (list.isEmpty()) return null;
        Number max = list.get(0);
        for (Number num : list) {
            if (num.doubleValue() > max.doubleValue()) {
                max = num;
            }
        }
        return max;
    }
}
```

---

Feel free to try these questions and solidify your understanding of **Bounded Types and Wildcards in Java**!  