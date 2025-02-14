package Day3;

public class variable {
    
    // Instance Variable (belongs to an object, different for each instance)
int instanceVar = 10; 
    
    // Static Variable (belongs to class, shared among all objects)
static String staticVar = "I am static";
    
public void localVariableExample() {
        // Local Variable (declared inside a method, exists only inside it)
    double localVar = 3.14;
    System.out.println("Local Variable: " + localVar);
}
public static void main(String[] args) {
        // Variable Declaration and Initialization
int number;  // Declaration
number = 100; // Initialization
char letter = 'A'; // Direct initialization
boolean isJavaFun = true; 

        // Printing Variables
System.out.println("Declared and Initialized Variable: " + number);
System.out.println("Character Variable: " + letter);
System.out.println("Boolean Variable: " + isJavaFun);

        // Accessing Instance Variable (need an object)
variable obj = new variable();
System.out.println("Instance Variable: " + obj.instanceVar);

        // Accessing Static Variable (directly using class name)
System.out.println("Static Variable: " + variable.staticVar);

        // Calling method that contains a local variable
obj.localVariableExample();
    }
}

//If you want to run the code - 'java -cp . Day2.datatype' (Run the commmand on Terminal)