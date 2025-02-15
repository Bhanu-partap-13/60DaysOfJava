package Day6;

// - Use if to specify a block of code to be executed, if a specified condition is True.
// - Use else to specify a block of code to be executed, if a same condition is False.
// - Use else if to specify a new condition to test, if a first condition is False.
// - Use switch to specify many alternative blocks of code is Executed .
// ---------------------------------------------------
// Conditional Statements in Java:
//
// 1️⃣ if statement:
//      - Executes a block of code **only if** the condition is true.
//
// 2️⃣ if-else statement:
//      - Executes one block **if the condition is true**,
//        otherwise executes another block.
//
// 3️⃣ if-elseif-else statement:
//      - Checks multiple conditions one by one.
//      - Executes the first block where condition is true.
//
// 4️⃣ switch statement:
//      - Works with **int, char, String, enums** (not float/double).
//      - Uses "case" values and "break" to stop execution.
//
// ---------------------------------------------------

import java.util.Scanner; // Import Scanner class for user input

public class ConditionDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object for input

        // ---------------------------------
        // 1️⃣ if Statement
        // ---------------------------------
        System.out.println("Enter a numebr: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("positive number.");
        }

        // ---------------------------------
        // 2️⃣ if-else Statement
        // ---------------------------------
        if (num % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }

        // ---------------------------------
        // 3️⃣ if-elseif-else Statement
        // ---------------------------------
        System.out.println("\nEnter your marks (out of 100): ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // ---------------------------------
        // 4️⃣ switch Statement
        // ---------------------------------
        System.out.println("\nEnter a day number (1-7): ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Enter a number between 1 and 7.");
        }

        input.close(); // Close Scanner object
    }
}



