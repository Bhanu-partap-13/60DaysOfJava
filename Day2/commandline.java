package Day2;

public class commandline {
    //Command Line Arguments
    class Iamneo {
        public static void main(String[] args) // -----
        {   //                                        |   The command line arguments 
            //print first argument                    |     passed will be converted to 
            System.out.println(args[0]); // <----------     string and get stored  args[]
        }
    }
}
// JVM - (Java Virtual Machine) is an abstract machine the enables your computer to runa  java program.
// Java Program ----Java Compiler--> Java Byte Code ----JVM-----> Machine Code ------CPU------> Output
// JRE - Java Runtime Environment is a software package that provides java class libraries, Java Virtual Machine and other components to run Java Application.
// JDK - Java Developement Kit is a software developement kit required to develop Java Applications.
// JDK ---> JRE ---> JVM + Class Libraries 

//If you want to run the code - 'java -cp . Day2.commandline' (Run the commmand on Terminal)