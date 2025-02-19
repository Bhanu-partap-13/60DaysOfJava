package Day10;
/*
 // Declare a 2D array
dataType[][] arrayName;

// Initialize a 2D array with size
arrayName = new dataType[rows][columns];

// OR Declare and Initialize in one step
dataType[][] arrayName = new dataType[rows][columns];

// OR Declare and Initialize with values
dataType[][] arrayName = {
    {value1, value2, value3},
    {value4, value5, value6},
    {value7, value8, value9}
};
 */

 import java.util.Scanner; // Import Scanner for user input

public class array2D {
    public static void main(String[] args) {
            // Step 1: Declare and Initialize a 2D array
        int[][] matrix = new int[3][3];         // Creates a 3x3 matrix

        Scanner input = new Scanner(System.in);         // Scanner for user input
        // Step 2: Taking input for the 2D array
        System.out.println("Enter 9 numbers for the 3x3 matrix:");

        for (int i = 0; i < 3; i++) { // Loop through rows
            for (int j = 0; j < 3; j++) { // Loop through columns
                matrix[i][j] = input.nextInt(); // Storing values in the array
            }
        }
        // Step 3: Displaying the 2D array as a matrix
        
        System.out.println("The 3x3 Matrix is:");
        
        for (int i = 0; i < 3; i++) { // Loop through rows
            for (int j = 0; j < 3; j++) { // Loop through columns
                System.out.print(matrix[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }

        input.close(); // Closing Scanner
    }
}


//If you want to run the code - 'java -cp . Day10.2dArray' (Run the commmand on Terminal