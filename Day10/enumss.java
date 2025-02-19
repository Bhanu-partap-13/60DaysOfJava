// ---------------------------------------------------
// 🌟 Enums in Java:
//
// 1️⃣ What is an Enum?
//      - Enum (short for **enumeration**) is a special class representing a group of constants.
//      - It is used when we have a fixed set of predefined values.
//
// 2️⃣ Syntax:
//      - `enum EnumName { CONSTANT1, CONSTANT2, CONSTANT3, ... }`
//
// 3️⃣ Rules of Enums:
//      - **Cannot extend another class** because it already extends `java.lang.Enum`.
//      - **Can implement interfaces**.
//      - **Can have constructors, methods, and fields**.
//
// ---------------------------------------------------
package Day10;

import java.util.Scanner; 

// ---------------------------------
// 1️⃣ Enum for Days of the Week
// ---------------------------------
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// ---------------------------------
// 2️⃣ Enum with Constructor & Method
// ---------------------------------
enum Size {
    SMALL(10), MEDIUM(20), LARGE(30);

    private int value; // Instance variable

    // Constructor
    Size(int value) {
        this.value = value;
    }

    // Method to get the value
    public int getValue() {
        return value;
    }
}

// ---------------------------------
// 3️⃣ Using Enum in a Switch Case
// ---------------------------------
public class enumss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------------------------------
        // 1️⃣ Using Enum Values
        // ---------------------------------
        System.out.println("Today is: " + Day.WEDNESDAY);

        // ---------------------------------
        // 2️⃣ Looping Through Enum Values
        // ---------------------------------
        System.out.println("\nAll Days of the Week:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // ---------------------------------
        // 3️⃣ Using Enum in a Switch Statement
        // ---------------------------------
        System.out.print("\nEnter a day (e.g., MONDAY): ");
        String userInput = input.next().toUpperCase();
        Day selectedDay = Day.valueOf(userInput);

        switch (selectedDay) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! 🎉");
                break;
            default:
                System.out.println("It's a weekday.💻");
        }

        // ---------------------------------
        // 4️⃣ Using Enum with Methods
        // ---------------------------------
        System.out.println("\nSizes and values:");
        for (Size s : Size.values()) {
            System.out.println(s + " has value " + s.getValue());
        }

        input.close();
    }
}
