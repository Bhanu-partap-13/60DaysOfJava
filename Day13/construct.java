// ---------------------------------------------------  
// 🌟 Constructors in Java:
//
// 1️⃣ What is a Constructor?  
//      - A **constructor** is a special method used to initialize objects.  
//      - It **automatically executes** when an object is created.  
//      - It **sets initial values** for an object's properties.  
//
// 2️⃣ Features of a Constructor:  
//      - **Same name as the class**.  
//      - **No return type (not even void)**.  
//      - Called automatically when `new` keyword is used.  
//
// 3️⃣ Syntax:  
//      ```java
//      class ClassName {  
//          ClassName() {  
//              // Constructor Body  
//          }  
//      }
//      ```  
//
// 4️⃣ Rules of Constructors:  
//      - If no constructor is defined, Java **provides a default constructor**.  
//      - Constructors **can be overloaded** (multiple constructors with different parameters).  
//      - A **constructor cannot return a value**.  
// ---------------------------------------------------  
package Day13;
import java.util.Scanner; // Import Scanner class for user input  

// ---------------------------------  
// 1️⃣ Defining a Class with a Constructor  
// ---------------------------------  
class Car {  
    // Properties (Instance Variables)  
    String brand;  
    int speed;  

    // ---------------------------------  
    // 🔹 Constructor to Initialize Properties  
    // ---------------------------------  
    Car() {  
        System.out.println("🚗 A new car is created!");
        brand = "Unknown";  
        speed = 0;  
    }  

    // ---------------------------------  
    // 🔹 Parameterized Constructor  
    // ---------------------------------  
    Car(String b, int s) {  
        brand = b;  
        speed = s;  
    }  

    // ---------------------------------  
    // 🔹 Method to Display Car Details  
    // ---------------------------------  
    void drive() {  
        System.out.println(brand + " is driving at " + speed + " km/h.");  
    }  
}  

// ---------------------------------  
// 2️⃣ Using Constructors in a Class  
// ---------------------------------  
public class construct {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  

        // ---------------------------------  
        // 1️⃣ Using Default Constructor  
        // ---------------------------------  
        Car car1 = new Car(); // Calls default constructor  
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
        String userBrand = input.next();  
        System.out.print("Enter car speed: ");  
        int userSpeed = input.nextInt();  

        Car userCar = new Car(userBrand, userSpeed);  
        userCar.drive(); // Calling method on user-created object  

        input.close();  
    }  
}  
