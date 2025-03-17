package Day23;
//process of hiding implementation details and showing only functionality to the user
//Abstract keyword - non-access modifier
//Abstract class - class which is declared with abstract keyword
//Abstract method - method which is declared without body
/* 
1️⃣ What is an Abstract Class?
✔ An abstract class is a class that cannot be instantiated (i.e., you cannot create objects of it).
✔ It is used to define a blueprint for other classes.
✔ Abstract classes may contain both abstract (unimplemented) and concrete (implemented) methods.
✔ Purpose: To achieve partial abstraction and enforce a common structure for subclasses.
2️⃣ What is an Abstract Method?
✔ An abstract method is a method without a body (implementation).
✔ It is declared but not defined in the abstract class.
✔ Must be overridden by subclasses to provide actual behavior.
*/
/* Abstract class
eg: abstract class Animal{ }
*/
/* Abstract method
eg: abstract void find(); 
*/
//1. Method must be abstract as the class is abstract
/*
 abstract class abc{
  abstract void test();
}
class check extends abc{
    void test(){
        System.out.println("Test is called");
    }
}

class Main{
    public static void main(String[] args){
        check c = new check();
        c.test();
    }
}
*/
abstract class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void find();
    public void wake(){
        System.out.println("Animal is waking up");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void find(){ //overrides the abstract function
        System.out.println("Dog is finding");
    }
}
public class abstraction {
    public static void main(String[] args){
        Dog d = new Dog("Ankit");
        d.find();
        d.wake();

        //for the down code
        grapes f = new grapes();
        apple a = new apple();
        a.find();
        f.find();
    }
}

/*
Output:    
Dog is finding
Animal is waking up
 */


abstract class fruit {
    fruit(){
        System.out.println("Find the fruit");
    }
    abstract void find();
}

class grapes extends fruit{
    grapes(){
        System.out.println("Grapes constructor is called");
    }
    void find(){
        System.out.println("Grapes are found");
    }
}

class apple extends fruit{
    void find(){
        System.out.println("Apple is found");
    }
}

//To run the code - `javac abstraction.java` then `java abstraction`    OR  java -cp . Day23.abstraction