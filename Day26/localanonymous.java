package Day26;
// ---------------------------------------------------  
//  Local and Anonymous Classes in Java:
//
// 1️. What is a Local Class?  
//      - A **local class** is a class defined **inside a method**.  
//      - It is used only within that method and cannot be accessed outside of it.  
//      - Local classes can access final or effectively final variables of the enclosing method.
//
// 2️. What is an Anonymous Class?  
//      - An **anonymous class** is a class without a name that is defined and instantiated in a single expression.  
//      - It is used when you need to override methods or implement an interface quickly without creating a separate class file.
//      - They are commonly used for event handling or creating simple one-off objects.
//
// 3️. Syntax Examples:
//      - Local Class:
//          ```java
//          public void someMethod() {
//              class LocalClass {
//                  void display() {
//                      System.out.println("Hello from Local Class!");
//                  }
//              }
//              LocalClass obj = new LocalClass();
//              obj.display();
//          }
//          ```  
//      - Anonymous Class:
//          ```java
//          Runnable r = new Runnable() {
//              public void run() {
//                  System.out.println("Hello from Anonymous Class!");
//              }
//          };
//          new Thread(r).start();
//          ```  
//
// ---------------------------------------------------  

public class localanonymous{
    public static void main(String[] args) {
        
        // ---------------------------------  
        // 1️⃣ Example: Local Class  
        // ---------------------------------  
        System.out.println("Using Local Class:");
        // Defining a local class inside a method
        class LocalPrinter {
            void printMessage() {
                System.out.println("Hello from Local Class!");
            }
        }
        // Creating an instance of the local class and calling its method
        LocalPrinter localObj = new LocalPrinter();
        localObj.printMessage();
        
        // ---------------------------------  
        // 2️⃣ Example: Anonymous Class  
        // ---------------------------------  
        System.out.println("\nUsing Anonymous Class:");
        // Creating an anonymous class that implements the Runnable interface
        Runnable runnableObj = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        // Creating a Thread using the anonymous class and starting it
        Thread thread = new Thread(runnableObj);
        thread.start();
        
        
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
