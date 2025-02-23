// ---------------------------------------------------  
//  `this` Keyword & Initializer Block in Java:
//

// 1️. What is `this` Keyword?  
//      - `this` is a **reference variable** that refers to the **current object**.  
//      - It helps to **differentiate between instance variables and method parameters**.  
//      - It allows calling **other constructors** within the same class.  
//      - It can be used to **call methods from the same object**.  
//

// 2️. Features of `this` Keyword:  
//      - Always **refers to the current instance of the class**.  
//      - Can be used to **invoke constructors** using `this()`.  
//      - Cannot be used inside **static methods** (since `this` belongs to an object).  

// 3️. Syntax:  
//      ```java
//      class ClassName {  
//          int variable;  
//
//          ClassName(int variable) {  
//              this.variable = variable; // Refers to instance variable  
//          }  
//      }
//      ```  

// 4️. What is an Initializer Block?  
//      - A **special block** inside a class that runs **before the constructor**.  
//      - It is used for **common initialization code** for all constructors.  
//      - Declared using `{}` (without any method or constructor).  

// 5️. Features of Initializer Block:  
//      - Executes **before any constructor** in the class.  
//      - Useful for **shared initialization** (e.g., setting default values).  
//      - Runs **each time an object is created**.  
// 6️. Syntax:  
//      ```java
//      class ClassName {  
//          {  
//              // Initializer Block  
//              System.out.println("Initializer Block Executed");  
//          }  
//          
//          ClassName() {  
//              System.out.println("Constructor Executed");  
//          }  
//      }
//      ```  
// ---------------------------------------------------  
package Day14;
import java.util.Scanner; // Import Scanner class for user input  

// ---------------------------------  
// 1️. Defining a Class with `this` Keyword & Initializer Block  
// ---------------------------------  
class Car {  
    // Properties (Instance Variables)  
    String brand;  
    int speed;  

    // ---------------------------------  
    // 🔹 Initializer Block (Executes Before Constructor)  
    // ---------------------------------  
    {  
        System.out.println("🚗 Initializer Block: Setting up Car!");
        brand = "Unknown";  
        speed = 0;  
    }  

    // ---------------------------------  
    // 🔹 Default Constructor  
    // ---------------------------------  
    Car() {  
        System.out.println("🛠️ Default Constructor Called!");  
    }  

    // ---------------------------------  
    // 🔹 Parameterized Constructor using `this`  
    // ---------------------------------  
    Car(String brand, int speed) {  
        this(); // Calls the default constructor  
        this.brand = brand; // Using `this` to differentiate instance variable  
        this.speed = speed;  
    }  

    // ---------------------------------  
    // 🔹 Method to Display Car Details  
    // ---------------------------------  
    void drive() {  
        System.out.println(brand + " is driving at " + speed + " km/h.");  
    }  

    // ---------------------------------  
    // 🔹 Calling Another Method Using `this`  
    // ---------------------------------  
    void updateSpeed(int speed) {  
        this.speed = speed;  
        this.drive(); // Calls drive() method from the same object  
    }  
}  

// ---------------------------------  
// 2️. Using `this` Keyword & Initializer Block in a Class  
// ---------------------------------  
public class thisandintializer {  
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);  

        // ---------------------------------  
        // 1️⃣ Using Default Constructor  
        // ---------------------------------  
        Car car1 = new Car(); // Calls Initializer Block + Default Constructor  
        car1.drive();  

        // ---------------------------------  
        // 2️⃣ Using Parameterized Constructor  
        // ---------------------------------  
        Car car2 = new Car("Toyota", 120);  
        Car car3 = new Car("Honda", 100);  

        // ---------------------------------  
        // 3️⃣ Calling Methods  
        // ---------------------------------  
        car2.drive();  
        car3.drive();  

        // ---------------------------------  
        // 4️⃣ Taking User Input for an Object  
        // ---------------------------------  
        System.out.print("\nEnter car brand: ");  
        String userBrand = s.next();  
        System.out.print("Enter car speed: ");  
        int userSpeed = s.nextInt();  

        Car userCar = new Car(userBrand, userSpeed);  
        userCar.drive(); // Calling method on user-created object  

        // ---------------------------------  
        // 5️⃣ Updating Speed Using `this` Keyword  
        // ---------------------------------  
        System.out.print("\nEnter new speed for " + userCar.brand + ": ");  
        int newSpeed = s.nextInt();  
        userCar.updateSpeed(newSpeed); // Calls method using `this` Keyword 
    }  
}  
