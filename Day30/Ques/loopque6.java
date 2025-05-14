import java.util.Scanner;

public class loopque6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number = 10; // Target number
        int guess;

        while (true) { // Infinite loop until the correct guess
            System.out.print("Enter the number: "); // Ask user for input
            guess = s.nextInt(); // Take user input

            if (guess == number) {
                System.out.println("You have guessed the right number!");
                break; // Exit the loop after correct guess
            } else if (guess > number) {
                System.out.println("You have guessed higher than the actual number.");
            } else {
                System.out.println("You have guessed lower than the actual number.");
            }
        }
        s.close(); // Close the scanner
    }
}
