package Day39;

// 🌟 1️⃣ Custom Exception Class
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class custommulticatch {
    public static void main(String[] args) {

        // ----------------------------------------
        // 🌟 2️⃣ Handling Multiple Exceptions (Custom Multi-Catch)
        // ----------------------------------------
        try {
            int num = Integer.parseInt("xyz"); // NumberFormatException
            checkInput(-5); // Throws InvalidInputException
        } catch (NumberFormatException | InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // ----------------------------------------
        // 🌟 3️⃣ Combining Multi-Catch with finally
        // ----------------------------------------
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed! Cleanup done.");
        }

        // ----------------------------------------
        // 🌟 4️⃣ Best Practices for Multi-Catch
        // ----------------------------------------
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException gracefully.");
        } catch (Exception e) {
            // Catching generic Exception should always be last
            System.out.println("A general exception occurred: " + e);
        }

        System.out.println("Program execution continued...");
    }

    // Method to throw a custom exception
    public static void checkInput(int value) throws InvalidInputException {
        if (value < 0) {
            throw new InvalidInputException("Negative values are not allowed.");
        }
    }
}
