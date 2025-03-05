package Day24;
// ---------------------------------------------------  
// 🌟 Final Keyword in Java:
//
// 1️⃣ What is the Final Keyword?  
//      - The **final keyword** is used to restrict the user.  
//      - It can be applied to **variables**, **methods**, and **classes**.
//      - A **final variable** cannot have its value changed once assigned.
//      - A **final method** cannot be overridden by subclasses.
//      - A **final class** cannot be extended (inherited from).
//
// 2️⃣ Why Use the Final Keyword?
//      - **Final variables** are used to create constants, which are unchangeable.
//      - **Final methods** prevent subclasses from changing the method implementation.
// 3️⃣ Syntax of the Final Keyword:  
//      - Final Variable:  
//          `final dataType variableName = value;`  
//      - Final Method:  
//          `final returnType methodName(parameters) { /* method body */ }`  
//      - Final Class:  
//          `final class ClassName { /* class body */ }`  
//
// 4️⃣ Example: Using Final in Java  
//      ```java
//      // Final variable example
//      final int maxScore = 100;
//
//      // Final method example in a class
//      class BaseClass {
//          final void showMessage() {
//              System.out.println("This is a final method in BaseClass.");
//          }
//      }
//
//      // Final class example
//      final class MathConstants {
//          final double PI = 3.14159;
//          final void displayPI() {
//              System.out.println("Value of PI: " + PI);
//          }
//      }
//
//      // Attempting to extend MathConstants will cause a compile-time error
//      // class ExtendedConstants extends MathConstants { } 
//
//      public class FinalKeywordDemo {
//          public static void main(String[] args) {
//              System.out.println("Max Score: " + maxScore);
//
//              BaseClass base = new BaseClass();
//              base.showMessage();
//
//              MathConstants constants = new MathConstants();
//              constants.displayPI();
//          }
//      }
//      ```  
// ---------------------------------------------------  

// ---------------------------------  
// 1️⃣ Example: Final Variable Usage  
// ---------------------------------
/*
public class finalkey {
    public static void main(String[] args) {
        final int maxScore = 100; // Final variable: value cannot change after initialization
        System.out.println("Max Score: " + maxScore);
        // Uncommenting the next line will cause a compile-time error:
        // maxScore = 200; 
    }
}
*/
// ---------------------------------  
// 2️⃣ Example: Final Method Usage  
// ---------------------------------  
/* 
class BaseClass {
    // Final method: cannot be overridden by any subclass
    final void showMessage() {
        System.out.println("This is a final method in BaseClass.");
    }
}

class DerivedClass extends BaseClass {
    // Attempting to override the final method will result in an error:
    // void showMessage() { System.out.println("Overridden message."); }
}

public class finalkey {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.showMessage(); // Calls the final method from BaseClass
    }
}
*/
// ---------------------------------  
// 3️⃣ Example: Final Class Usage  
// ---------------------------------  
final class FinalClass {
    void display() {
        System.out.println("This is a final class and cannot be extended.");
    }
}

// The following would cause a compile-time error because FinalClass is final:
// class SubClass extends FinalClass { }

public class finalkey {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.display();
    }
}
