package Day21;

// Object Class and Overriding toString(), toEquals() and hashCode() methods

// ---------------------------------------------------  
// 🌟 Object Class and toString() Method in Java:
//
// 1️⃣ What is the Object Class?  
//      - **Object** is the **root class** of Java's class hierarchy.  
//      - Every class in Java **implicitly** inherits from the Object class.  
//      - It provides **common methods** that every Java class can use.  
//
// 2️⃣ Important Methods in Object Class:  
//      ✅ **toString()** – Returns a string representation of an object.  
//      ✅ **equals()** – Compares two objects for equality.  
//      ✅ **hashCode()** – Returns a unique integer for an object.  
//      ✅ **clone()** – Creates a copy of an object.  
//      ✅ **getClass()** – Returns runtime class information.  
//      ✅ **finalize()** – Called before an object is garbage collected.  
//
// 3️⃣ What is the toString() Method?  
//      - `toString()` is a method of the Object class that **returns a string representation of an object**.  
//      - By default, `toString()` returns:  
//        `"ClassName@HashCode"` (not very useful).  
//      - **Override `toString()`** to provide meaningful output.  
//
// 4️⃣ Default toString() Behavior:  
//      ```java
//      class MyClass { }  
//
//      public class Main {  
//          public static void main(String[] args) {  
//              MyClass obj = new MyClass();  
//              System.out.println(obj.toString());  // Output: MyClass@1a2b3c  
//          }  
//      }
//      ```  
//
// ---------------------------------------------------  

// ---------------------------------  
// 1️⃣ Example: Default toString() Method  
// ---------------------------------  
class Person {  
    String name;  
    int age;  

    Person(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
}  

public class objectclasses {  
    public static void main(String[] args) {  
        Person p1 = new Person("Alice", 25);  
        System.out.println(p1);  // 👀 Default toString() -> Person@HashCode  
    }  
}  

//Similarly Overiding equals() and hashCode() methods
// ---------------------------------
// 3️⃣ Overriding equals() Method in Java:
// ---------------------------------

// 1️⃣ What is the equals() Method?
//      - The `equals()` method is used to compare two objects for equality.
//      - By default, `equals()` compares memory addresses (==).

// 2️⃣ Overriding equals() Method:
//      - Override `equals()` to compare objects based on their contents.
//      - The `equals()` method should be consistent, reflex
//      - Override `hashCode()` when overriding `equals()`.
//      - Use `instanceof` to check if the object is of the correct type.

// 3️⃣ Default equals() Behavior:
//      - By default, `equals()` compares memory addresses (==).
//      class MyClass { }

//      public class Main {
//          public static void main(String[] args) {
//              MyClass obj1 = new MyClass();
//              MyClass obj2 = new MyClass();
//              System.out.println(obj1.equals(obj2));  // Output: false
//          }
//      }

// ---------------------------------

// ---------------------------------
// 4️⃣ Overriding hashCode() Method in Java:
// ---------------------------------

// 1️⃣ What is the hashCode() Method?
//      - The `hashCode()` method returns a unique integer for an object.
//      - It is used to store objects in collections like HashMap.

// 2️⃣ Overriding hashCode() Method:
//      - Override `hashCode()` when overriding `equals()`.
//      - The `hashCode()` method should return the same value for equal objects.
//      - Use the same fields in `equals()` and `hashCode()`.
//      - Use the `Objects` class to generate hash codes.

// 3️⃣ Default hashCode() Behavior:
//      - By default, `hashCode()` returns the memory address of an object.
//      - It is not consistent across different JVM runs.

// 4️⃣ Example: Overriding hashCode() Method:

//      class Person {
//          String name;
//          int age;

//          Person(String name, int age) {
//              this.name = name;
//              this.age = age;
//          }

//          @Override
//          public int hashCode() {
//              return Objects.hash(name, age);
//          }
//      }
//      ```
// ---------------------------------
