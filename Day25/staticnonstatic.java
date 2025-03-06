package Day25;
// ---------------------------------------------------  
//  Static and Non-Static Methods in Nested Classes in Java:
//
// 1️⃣ Overview:
//      - In Java, a class can contain another class (nested class).
//      - Nested classes can be either **static** (static nested classes) or **non-static** (inner classes).
//
// 2️⃣ Static Nested Class:
//      - Declared with the `static` keyword.
//      - Can contain both **static** and **non-static** methods.
//      - **Static methods** in a static nested class can be called without creating an instance of the nested class.
//      - Cannot directly access non-static (instance) members of the outer class.
//      
// 3️⃣ Inner Class (Non-Static Nested Class):
//      - Declared without the `static` keyword.
//      - Can contain only **non-static** methods (except for static final constants).
//      - Has access to both instance and static members of the outer class.
//      
// 4️⃣ Syntax Examples:
//      - Static Nested Class:
//          ```java
//          class Outer {
//              static class StaticNested {
//                  static void staticMethod() { /*...*/ }
//                  void nonStaticMethod() { /*...*/ }
//              }
//          }
//          ```  
//      - Inner Class:
//          ```java
//          class Outer {
//              class Inner {
//                  void display() { /*...*/ }
//              }
//          }
//          ```  
//
// ---------------------------------------------------  

class Outer {
    // Instance and static members of the outer class
    int instanceValue = 10;
    static int staticValue = 20;

    // ---------------------------------  
    // 1️⃣ Static Nested Class  
    // ---------------------------------  
    static class StaticNested {
        // Static method in static nested class
        static void staticMethod() {
            System.out.println("Static method in Static Nested Class.");
            // Can access static members of Outer directly:
            System.out.println("Accessing Outer staticValue: " + staticValue);
            // Cannot access instanceValue of Outer directly.
        }

        // Non-static method in static nested class
        void nonStaticMethod() {
            System.out.println("Non-static method in Static Nested Class.");
            System.out.println("Accessing Outer staticValue: " + staticValue);
            // Cannot access instanceValue of Outer directly.
        }
    }

    // ---------------------------------  
    // 2️⃣ Inner Class (Non-Static Nested Class)  
    // ---------------------------------  
    class Inner {
        // Only non-static methods can be declared here (except static final constants)
        void display() {
            System.out.println("Method in Inner Class.");
            // Can access both instance and static members of Outer:
            System.out.println("Accessing Outer instanceValue: " + instanceValue);
            System.out.println("Accessing Outer staticValue: " + staticValue);
        }
    }
}

public class staticnonstatic {
    public static void main(String[] args) {
        // ---------------------------------  
        // Calling a static method of Static Nested Class  
        // ---------------------------------  
        Outer.StaticNested.staticMethod();

        // ---------------------------------  
        // Creating an instance of the Static Nested Class to call non-static method  
        // ---------------------------------  
        Outer.StaticNested nestedObj = new Outer.StaticNested();
        nestedObj.nonStaticMethod();

        // ---------------------------------  
        // Creating an instance of Outer to access Inner Class  
        // ---------------------------------  
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}
