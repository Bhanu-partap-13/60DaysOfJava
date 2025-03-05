package Day24;
// ---------------------------------------------------  
// 🌟 Static and Default Methods in Java Interfaces:
//
// 1️⃣ What are Default Methods?  
//      - **Default methods** allow interfaces to provide an implementation for a method.
//      - They were introduced in Java 8 to enable adding new methods to interfaces 
//        without breaking existing implementations.
//      - Default methods are declared using the `default` keyword.
//      - They help in achieving **backward compatibility**.
//      
// 2️⃣ What are Static Methods in Interfaces?  
//      - **Static methods** in an interface belong to the interface itself, not to any instance.
//      - They are declared using the `static` keyword.
//      - They can be called using the interface name directly.
//      
// 3️⃣ Syntax:
//      - Default Method:
//          ```java
//          interface InterfaceName {
//              default returnType methodName(parameters) {
//                  // method body
//              }
//          }
//          ```
//      - Static Method:
//          ```java
//          interface InterfaceName {
//              static returnType methodName(parameters) {
//                  // method body
//              }
//          }
//          ```  
//
// 4️⃣ Why Use Them?
//      - **Default methods** let you add new functionality to interfaces without breaking existing code.
//      - **Static methods** help group utility functions related to the interface.
// ---------------------------------------------------  

// ---------------------------------  
// 1️⃣ Example: Default Method in an Interface  
// ---------------------------------  
interface Animal {
    // Abstract method: must be implemented by classes
    void makeSound();
    
    // Default method: provides a default implementation
    default void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Class implementing the interface
class Dog implements Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// ---------------------------------  
// 2️⃣ Example: Static Method in an Interface  
// ---------------------------------  
interface Utility {
    // Static method: belongs to the interface itself
    static void info() {
        System.out.println("Utility Interface provides helper methods.");
    }
}

// ---------------------------------  
// 3️⃣ Using Default and Static Methods  
// ---------------------------------  
public class staticdefault {
    public static void main(String[] args) {
        // Creating an object of Dog (implements Animal)
        Dog d = new Dog();
        
        // Calling the abstract method implemented by Dog
        d.makeSound();  // Output: Dog barks
        
        // Calling the default method from the interface (inherited by Dog)
        d.sleep();      // Output: Animal is sleeping...
        
        // Calling the static method directly from the interface
        Utility.info(); // Output: Utility Interface provides helper methods.
    }
}
