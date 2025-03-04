// ---------------------------------------------------  
// 🌟 Interface in Java:
//
// 1️⃣ What is an Interface?  
//      - An **interface** in Java is a reference type, similar to a class, that can contain only **constants, method signatures**, default methods, static methods, and nested types.
//      - Interfaces cannot contain **instance fields** or **constructors**.  
//      - A class that implements an interface must provide **implementations for all its methods** (unless the class is abstract).
//
// 2️⃣ Key Characteristics of Interfaces:  
//      ✅ **Methods** – Interfaces can have abstract methods (methods without a body).  
//      ✅ **Default Methods** – Interfaces can also define methods with default implementations.  
//      ✅ **Multiple Inheritance** – A class can implement multiple interfaces.  
//      ✅ **No Constructors** – Interfaces cannot be instantiated directly.
//
// 3️⃣ Example of Interface in Java:  
//      - We define an interface `Animal` with a method `speak()`.  
//      - The classes `Dog` and `Cat` implement the interface and provide their own implementations of `speak()`.  
//
// 4️⃣ Default Interface Behavior:  
//      ```java
//      interface Animal {  
//          void speak();  
//      }  
//      
//      class Dog implements Animal {  
//          public void speak() {  
//              System.out.println("Woof!");  
//          }  
//      }  
//      
//      public class Main {  
//          public static void main(String[] args) {  
//              Animal myDog = new Dog();  
//              myDog.speak();  // Output: Woof!  
//          }  
//      }  
//      ```  
//
// ---------------------------------------------------  

// ---------------------------------  
// 1️⃣ Example: Interface in Java  
// ---------------------------------  
package Day23;
interface Animal {  
    void speak();  // Abstract method (no body)  
}  

class Dog implements Animal {  
    public void speak() {  
        System.out.println("Woof!");  // Dog's implementation of speak()  
    }  
}  

class Cat implements Animal {  
    public void speak() {  
        System.out.println("Meow!");  // Cat's implementation of speak()  
    }  
}  

public class interfaces {  
    public static void main(String[] args) {  
        Animal myDog = new Dog();  
        Animal myCat = new Cat();  
        
        myDog.speak();  // Output: Woof!  
        myCat.speak();  // Output: Meow!  
    }  
}  
