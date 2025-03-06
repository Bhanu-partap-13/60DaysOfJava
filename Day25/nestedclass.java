package Day25;
// ---------------------------------------------------  
// Nested Classes in Java:
//
// 1️ What is a Nested Class?  
//      - A **nested class** is a class defined inside another class.  
//      - It helps logically group classes that are only used in one place and increases encapsulation.
//      
// 2️ Types of Nested Classes:  
//      🔹 **Static Nested Class:**  
//            - Declared as static.  
//            - Behaves like a top-level class but is nested for logical grouping.
//            - Cannot access instance variables of the outer class directly.
//      
//      🔹 **Inner Class (Non-static Nested Class):**  
//            - Declared without the static modifier.  
//            - Associated with an instance of the outer class.
//            - Can access outer class's instance members directly.
//      
//      🔹 **Local Class:**  
//            - Defined within a method.
//      
//      🔹 **Anonymous Class:**  
//            - Defined and instantiated in one statement, without a name.
//
// 3️ Syntax Examples:
//      - Static Nested Class:
//          ```java
//          class Outer {
//              static class Nested {
//                  // members
//              }
//          }
//          ```  
//      - Inner Class:
//          ```java
//          class Outer {
//              class Inner {
//                  // members
//              }
//          }
//          ```  
//
// ---------------------------------------------------  

// ---------------------------------  
// 1️ Example: Static Nested Class  
// ---------------------------------  
class OuterStatic {
    // Instance variable of OuterStatic class
    int outerValue = 100;
    
    // Static nested class
    static class NestedStatic {
        void display() {
            System.out.println("Inside Static Nested Class.");
            // Cannot access non-static members of OuterStatic directly
        }
    }
}

// ---------------------------------  
// 2️ Example: Inner Class (Non-static Nested Class)  
// ---------------------------------  
class OuterInner {
    int outerValue = 200; // Instance variable
    
    // Inner class
    class Inner {
        void display() {
            // Can access outer class's members directly
            System.out.println("Inside Inner Class, outerValue: " + outerValue);
        }
    }
}

// ---------------------------------  
// 3️ Example: Local Class inside a Method  
// ---------------------------------  
class LocalClassExample {
    void method() {
        // Local class defined within a method
        class Local {
            void display() {
                System.out.println("Inside Local Class defined in a method.");
            }
        }
        Local local = new Local();
        local.display();
    }
}

// ---------------------------------  
// 4️ Example: Anonymous Class  
// ---------------------------------  
abstract class Greeting {
    abstract void sayHello();
}

public class nestedclass {
    public static void main(String[] args) {
        // Using Static Nested Class:
        OuterStatic.NestedStatic staticNested = new OuterStatic.NestedStatic();
        staticNested.display();  // Output: Inside Static Nested Class.
        
        // Using Inner Class:
        OuterInner outer = new OuterInner();
        OuterInner.Inner inner = outer.new Inner();
        inner.display();  // Output: Inside Inner Class, outerValue: 200.
        
        // Using Local Class:
        LocalClassExample localEx = new LocalClassExample();
        localEx.method();  // Output: Inside Local Class defined in a method.
        
        // Using Anonymous Class:
        Greeting greet = new Greeting() {
            void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        greet.sayHello();  // Output: Hello from Anonymous Class!
    }
}
