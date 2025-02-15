
// ---------------------------------------------------
// Access Modifiers in Java:
//
// 1. public    → Accessible from anywhere.
// 2. private   → Accessible only within the same class.
// 3. protected → Accessible within the same package & subclasses (even in different packages).
// 4. default   → Accessible within the same package (if no modifier is specified).
// ---------------------------------------------------

package Day4;

public class accessmodifier{
    
    // Public variable (Accessible from anywhere)
    public int publicVar = 10;

    // Private variable (Accessible only within this class)
    private String privateVar = "Private Access";

    // Protected variable (Accessible within the package & subclasses)
    protected double protectedVar = 3.14;

    // Default variable (No modifier, accessible within the same package)
    int defaultVar = 100;

    // Public Method
    public void publicMethod() {
        System.out.println("Public Method: ");
    }

    // Private Method (Only accessible inside this class)
    private void privateMethod() {
        System.out.println("Private Method: ");
    }

    // Protected Method (Accessible within the package & subclass)
    protected void protectedMethod() {
        System.out.println("Protected Method: ");
    }

    // Default Method (Accessible within the same package)
    void defaultMethod() {
        System.out.println("Default Method: ");
    }

    // Method to show that private members can be accessed inside the class
    public void showPrivate() {
        System.out.println("Private :" + privateVar);
        privateMethod(); // Calling private method
    }
    
    public static void main(String[] args) {
        // Creating an object of AccessModifiersExample
        accessmodifier obj = new accessmodifier();

        // Accessing Public Members
        System.out.println("Public Variable: " + obj.publicVar);
        obj.publicMethod(); 

        // Accessing Protected Members (Allowed because this class is in the same package)
        System.out.println("Protected Variable: " + obj.protectedVar);
        obj.protectedMethod(); 

        // Accessing Default Members (Allowed because this class is in the same package)
        System.out.println("Default Variable: " + obj.defaultVar);
        obj.defaultMethod(); 

        // Private Members (NOT ALLOWED outside the class, uncommenting will cause error)
        // System.out.println(obj.privateVar); //  ERROR
        // obj.privateMethod(); //  ERROR

        // Using a public method to access private members (Allowed)
        obj.showPrivate(); 
    }
}


//If you want to run the code - 'java -cp . Day4.accessmodifier' (Run the commmand on Terminal)