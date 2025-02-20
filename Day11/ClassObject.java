// ---------------------------------------------------  
// 🌟 Classes & Objects in Java:
//
// 1️⃣ What is a Class?  
//  - A **class** is a blueprint/template for creating objects.  
//      - It defines **properties (variables)** and **actions (methods)**.  
//
// 2️⃣ What is an Object?  
//   - An **object** is a real-world instance of a class.  
//      - It has **unique values** and **can use class methods**.  
//
// 3️⃣ Syntax:  
//   - `class ClassName { /* properties and methods */ }`  
//      - `ClassName obj = new ClassName();` → Creating an object.  
//
// 4️⃣ Rules of Classes & Objects:  
//  - A **class** can have multiple **objects**.  
//    - Objects **store different data** but **share the same class structure**.  
//      - Objects can **call methods** to perform actions.  
// ---------------------------------------------------  
package Day11;
 
import java.util.Scanner; // Import Scanner class for user input  

// ---------------------------------  
// 1️⃣ Defining a Class  
// ---------------------------------  
class Car {  
    // Properties (Instance Variables)  
    String brand;  
    int speed;  

    // Method (Action)  
    void drive() {  
        System.out.println(brand + " is driving at " + speed + " km/h.");  
    }  
}  

// ---------------------------------  
// 2️⃣ Using Objects of a Class  
// ---------------------------------  
public class ClassObject {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  

        // ---------------------------------  
        // 1️⃣ Creating Objects  
        // ---------------------------------  
        Car myCar = new Car();  // Creating an object  
        myCar.brand = "Toyota"; // Assigning values  
        myCar.speed = 120;  

        Car anotherCar = new Car();  
        anotherCar.brand = "Honda";  
        anotherCar.speed = 100;  

        // ---------------------------------  
        // 2️⃣ Calling Methods  
        // ---------------------------------  
        myCar.drive();  
        anotherCar.drive();  

        // ---------------------------------  
        // 3️⃣ Taking User Input for an Object  
        // ---------------------------------  
        Car userCar = new Car();  
        System.out.print("\nEnter car brand: ");  
        userCar.brand = input.next();  
        System.out.print("Enter car speed: ");  
        userCar.speed = input.nextInt();  

        userCar.drive(); // Calling method on user-created object  

        input.close();  
    }  
}  

