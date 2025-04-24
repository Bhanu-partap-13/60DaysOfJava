package Day9;

/*
 // Declare an array
dataType[] arrayName;

// Initialize an array with size
arrayName = new dataType[size];

// OR Declare and Initialize in one step
dataType[] arrayName = new dataType[size];

// OR Declare and Initialize with values
dataType[] arrayName = {value1, value2, value3, ...};

 */

public class intArr{
    public static void main(String[] args){
     //   int age[]; //declaration
     //   age = new int[5]; //allocation
       int age[] = new int[5];
       
       age[0] = 5;
       age[1] = 2;

       System.out.println(age[0]);
       System.out.println(age[1]);
       System.out.println(age[2]);
       System.out.println(age[3]);

       System.out.println(age.length); //length of the array

       //   String arr[] = new arr[10];
       //           OR
       String arr[] = {"ram","sham","ganesh"}; 
       
       for(int i=0; i<arr.length;i++){
        System.out.println("Name at "+i+" is: "+arr[i]);
    }
    
    for(String name: arr){
           System.out.println("Name is: "+name);

       }
    }
}


/*
  int[] numbers = new int[5]; // Creates an array of size 5

        Scanner input = new Scanner(System.in); // Scanner for user input

        // Step 2: Taking input for the array
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) { // Using .length to get array size
            numbers[i] = input.nextInt(); // Storing values in the array
        }

        // Step 3: Displaying array elements
        System.out.println("You entered: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // Accessing array elements
        }
 */

 /*
  Important Points: ✅ Fixed Size: The size of an array cannot be changed after initialization.
                    ✅ Indexing: Array indices start from 0 (first element) to length-1.
                    ✅ Access Elements: Use arrayName[index] to access elements.
                    ✅ array.length Property: Helps find the size of the array.
  */

  
//If you want to run the code - 'java -cp . Day7.practice' (Run the commmand on Terminal)
