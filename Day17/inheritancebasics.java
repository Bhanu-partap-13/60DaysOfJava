package Day17;

// ---------------------------------------------------  
// 🌟 Inheritance in Java:
//
// 1️⃣ What is Inheritance?  
//      - **Inheritance** is a mechanism where one class **acquires** the properties and behaviors of another class.  
//      - It helps in **code reusability** and **establishes relationships** between classes.  
//      - The class that is **inherited** is called the **Parent Class (Superclass)**.  
//      - The class that **inherits** is called the **Child Class (Subclass)**.  
//
// 2️⃣ Why Use Inheritance?  
//     Write once, use multiple times.  
//     Less redundant code.  
//     Clearly shows relationships between classes.  
//     Helps achieve method overriding.  
//
// 3️⃣ Types of Inheritance in Java:  
//      🔹 **Single Inheritance** → One class inherits from another.  
//      🔹 **Multilevel Inheritance** → A class inherits from another, which inherits from another.  
//      🔹 **Hierarchical Inheritance** → One parent class has multiple child classes.  
//      🔹 **Hybrid Inheritance** → combination of two types of inheritance  
//      ❌ **Multiple Inheritance** (not supported directly in Java)  
//
// 4️⃣ Syntax of Inheritance:  
//      ```java
//      class Parent {  
//          // Parent class code  
//      }  
//
//      class Child extends Parent {  
//          // Child class inherits Parent  
//      }  
//      ```  
//
// ---------------------------------------------------  

// ---------------------------------  
// 1️⃣ Example of **Single Inheritance**  
// ---------------------------------  
class Animal {  
    // Parent Class (Superclass)  
    String name = "Animal";  

    void eat() {  
        System.out.println(name + " is eating...");  
    }  
}  

// ---------------------------------  
// 🔹 Subclass (Child Class) Inheriting Animal  
// ---------------------------------  

class Dog extends Animal {  
    // Child Class (Subclass)  
    String breed = "Labrador";  

    void bark() {  
        System.out.println(breed + " is barking!");  
    }  
}  

// ---------------------------------  
// 2️⃣ Using Inheritance in the Main Class  
// ---------------------------------  
public class inheritancebasics{  
    public static void main(String[] args) {  
        // Creating an object of the Child class  
        Dog myDog = new Dog();  

        // Accessing Parent class properties and methods  
        System.out.println("Animal Name: " + myDog.name);  
        myDog.eat();  

        // Accessing Child class properties and methods  
        System.out.println("Dog Breed: " + myDog.breed);  
        myDog.bark();  
    }  
}  
