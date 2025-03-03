package Day22;

// the 'instanceof' operator is used to test whether the object is an instance of the specified type (class or subclass or interface).


/*
 Syntax: object instanceof className
 🫥 object -> The object to check
 🫥 className -> The class and superclass to compare
 */

 /*
  Why instance of?
✅ To check type before casting → Prevents ClassCastException.
✅ Supports polymorphism → Works with parent-child relationships.
✅ Used in if conditions → To execute specific logic based on object type.
  */

class Animal{

}
class Dog extends Animal{
   void bark(){ System.out.println("Dog is barking");
}
}

public class instance {
 public static void main(String[] args){
    Dog d = new Dog();

    System.out.println(d instanceof Dog); // true
    System.out.println(d instanceof Animal); // true

    Animal a = new Animal();
    if(a instanceof Dog){
        Dog e = (Dog) a;
        e.bark();
    }
 }   
}

