# Practice Questions on Java Topics

## 1. Array Manipulation

**Explain what you have to do in the question:**
Write a program to find the maximum and minimum elements in an array.

**Input format:**
- An integer `n` representing the size of the array.
- `n` space-separated integers representing the elements of the array.

**Output format:**
- Two integers representing the maximum and minimum elements in the array.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5 1 2 3 4 5 | 5 1 |
| 4 10 20 30 40 | 40 10 |

## 2. String Reversal

**Explain what you have to do in the question:**
Write a program to reverse a given string.

**Input format:**
- A single string.

**Output format:**
- The reversed string.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| hello | olleh |
| world | dlrow |

## 3. StringBuilder Usage

**Explain what you have to do in the question:**
Write a program to append a string to another string using `StringBuilder`.

**Input format:**
- Two strings.

**Output format:**
- The concatenated string.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| hello world | helloworld |
| java programming | javaprogramming |

## 4. Inheritance Example

**Explain what you have to do in the question:**
Create a base class `Animal` with a method `sound()`. Create a derived class `Dog` that overrides the `sound()` method.

**Input format:**
- No input required.

**Output format:**
- The sound made by the dog.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| - | Woof Woof |
| - | Woof Woof |

## 5. Loop through Array

**Explain what you have to do in the question:**
Write a program to print all elements of an array using a loop.

**Input format:**
- An integer `n` representing the size of the array.
- `n` space-separated integers representing the elements of the array.

**Output format:**
- The elements of the array, each on a new line.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 3 1 2 3 | 1 2 3 |
| 4 10 20 30 40 | 10 20 30 40 |

## 6. Switch Case Example

**Explain what you have to do in the question:**
Write a program to display the day of the week based on an integer input (1 for Monday, 2 for Tuesday, etc.).

**Input format:**
- An integer representing the day of the week.

**Output format:**
- The name of the day.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 1 | Monday |
| 5 | Friday |

## 7. Constructor Overloading

**Explain what you have to do in the question:**
Create a class `Rectangle` with two constructors: one that takes two parameters (length and width) and one that takes one parameter (side) for a square.

**Input format:**
- Two integers for the first constructor.
- One integer for the second constructor.

**Output format:**
- The area of the rectangle.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 4 5 | 20 |
| 3 | 9 |

## 8. Access Modifiers

**Explain what you have to do in the question:**
Create a class with private, protected, and public members. Write methods to access and modify these members.

**Input format:**
- No input required.

**Output format:**
- The values of the members before and after modification.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| - | Initial values: 0 0 0 Modified values: 1 2 3 |
| - | Initial values: 0 0 0 Modified values: 1 2 3 |

## 9. Array Sorting

**Explain what you have to do in the question:**
Write a program to sort an array of integers in ascending order.

**Input format:**
- An integer `n` representing the size of the array.
- `n` space-separated integers representing the elements of the array.

**Output format:**
- The sorted array.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5 3 1 4 2 5 | 1 2 3 4 5 |
| 4 10 20 5 15 | 5 10 15 20 |

## 10. Palindrome Check

**Explain what you have to do in the question:**
Write a program to check if a given string is a palindrome.

**Input format:**
- A single string.

**Output format:**
- `true` if the string is a palindrome, `false` otherwise.

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| madam | true |
| hello | false |




## Answers

### 1. Array Manipulation

```java
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
```

### 2. String Reversal

```java
import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}
```

### 3. StringBuilder Usage

```java
import java.util.Scanner;

public class StringBuilderUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        StringBuilder sb = new StringBuilder(str1);
        sb.append(str2);
        System.out.println(sb.toString());
    }
}
```

### 4. Inheritance Example

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
```

### 5. Loop through Array

```java
import java.util.Scanner;

public class LoopThroughArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
```

### 6. Switch Case Example

```java
import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println(dayName);
    }
}
```

### 7. Constructor Overloading

```java
class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    public int getArea() {
        return length * width;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        System.out.println(rect1.getArea());
        Rectangle rect2 = new Rectangle(3);
        System.out.println(rect2.getArea());
    }
}
```

### 8. Access Modifiers

```java
class AccessModifiers {
    private int privateVar;
    protected int protectedVar;
    public int publicVar;

    public AccessModifiers() {
        privateVar = 0;
        protectedVar = 0;
        publicVar = 0;
    }

    public void setPrivateVar(int value) {
        privateVar = value;
    }

    public int getPrivateVar() {
        return privateVar;
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("Initial values: " + obj.getPrivateVar() + " " + obj.protectedVar + " " + obj.publicVar);
        obj.setPrivateVar(1);
        obj.protectedVar = 2;
        obj.publicVar = 3;
        System.out.println("Modified values: " + obj.getPrivateVar() + " " + obj.protectedVar + " " + obj.publicVar);
    }
}
```

### 9. Array Sorting

```java
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
```

### 10. Palindrome Check

```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
```