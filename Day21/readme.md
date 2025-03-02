# Day 21: Object Class and Methods in Java

## Beginner-Friendly Questions

1. **What is the purpose of the `toString` method in Java?**
    - [ ] To compare two objects
    - [x] To return a string representation of an object
    - [ ] To convert a string to an object
    - [ ] To check if an object is null

2. **Which method is used to compare two objects for equality in Java?**
    - [ ] `toString`
    - [x] `equals`
    - [ ] `hashCode`
    - [ ] `compareTo`

3. **What does the `hashCode` method return?**
    - [ ] A string representation of an object
    - [ ] A boolean value
    - [x] An integer hash code value
    - [ ] A floating-point number

4. **Which class is the superclass of all classes in Java?**
    - [x] `Object`
    - [ ] `String`
    - [ ] `Class`
    - [ ] `System`

5. **What is the default implementation of the `toString` method in the `Object` class?**
    - [ ] Returns the object's name
    - [ ] Returns the object's type
    - [x] Returns a string consisting of the class name followed by the "@" character and the object's hash code
    - [ ] Returns the object's memory address

6. **Which method must be overridden to provide a meaningful comparison of objects?**
    - [ ] `toString`
    - [x] `equals`
    - [ ] `hashCode`
    - [ ] `finalize`

7. **What is the relationship between `equals` and `hashCode` methods?**
    - [ ] They are unrelated
    - [ ] `equals` calls `hashCode`
    - [x] If two objects are equal according to the `equals` method, they must have the same hash code
    - [ ] `hashCode` calls `equals`

## Code-Based Questions

1. **What will be the output of the following code?**
    ```java
    Object obj = new Object();
    System.out.println(obj.toString());
    ```
    - [x] A string consisting of the class name followed by "@" and the object's hash code
    - [ ] `null`
    - [ ] The object's memory address
    - [ ] The object's type

2. **Given the following class, what will `System.out.println(new MyClass().toString());` print?**
    ```java
    class MyClass {
         @Override
         public String toString() {
              return "MyClass instance";
         }
    }
    ```
    - [ ] The class name followed by "@" and the object's hash code
    - [x] `MyClass instance`
    - [ ] `null`
    - [ ] The object's memory address

3. **What will be the result of the following code?**
    ```java
    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println(str1.equals(str2));
    ```
    - [x] `true`
    - [ ] `false`
    - [ ] `null`
    - [ ] Compilation error

4. **What will be the result of the following code?**
    ```java
    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println(str1 == str2);
    ```
    - [ ] `true`
    - [x] `false`
    - [ ] `null`
    - [ ] Compilation error

5. **What will be the output of the following code?**
    ```java
    class MyClass {
         @Override
         public int hashCode() {
              return 42;
         }
    }
    MyClass obj = new MyClass();
    System.out.println(obj.hashCode());
    ```
    - [x] `42`
    - [ ] The object's memory address
    - [ ] The default hash code
    - [ ] Compilation error

6. **What will be the result of the following code?**
    ```java
    class MyClass {
         @Override
         public boolean equals(Object obj) {
              return this == obj;
         }
    }
    MyClass obj1 = new MyClass();
    MyClass obj2 = new MyClass();
    System.out.println(obj1.equals(obj2));
    ```
    - [ ] `true`
    - [x] `false`
    - [ ] `null`
    - [ ] Compilation error

7. **What will be the output of the following code?**
    ```java
    class MyClass {
         @Override
         public boolean equals(Object obj) {
              return obj instanceof MyClass;
         }
    }
    MyClass obj1 = new MyClass();
    MyClass obj2 = new MyClass();
    System.out.println(obj1.equals(obj2));
    ```
    - [x] `true`
    - [ ] `false`
    - [ ] `null`
    - [ ] Compilation error

    ***
    ## Problem Statements
    ### 1
    **Explain what you have to do in the question .**

    **Object Class Methods**

    **Input format:**
    - The input that the question requires

    **Output format:**
    - The output that the question requires

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | `new Object().toString()` | `java.lang.Object@<hashcode>` |
    | `new MyClass().toString()` | `MyClass instance` |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | `new String("hello").equals(new String("hello"))` | `true` |
    | `new String("hello") == new String("hello")` | `false` |

    ***
    ### 2
    **Explain what you have to do in the question .**

    **toString() Method**

    **Input format:**
    - The input that the question requires

    **Output format:**
    - The output that the question requires

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | `new Object().toString()` | `java.lang.Object@<hashcode>` |
    | `new MyClass().toString()` | `MyClass instance` |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | `new String("hello").toString()` | `hello` |
    | `new Integer(123).toString()` | `123` |


    ***
    ### 3
    **Explain what you have to do in the question .**

    **equals() Method**

    **Input format:**
    - The input that the question requires

    **Output format:**
    - The output that the question requires

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | `new String("hello").equals(new String("hello"))` | `true` |
    | `new Integer(123).equals(new Integer(123))` | `true` |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | `new String("hello") == new String("hello")` | `false` |
    | `new Integer(123) == new Integer(123)` | `false` |

    `Homework Questions `