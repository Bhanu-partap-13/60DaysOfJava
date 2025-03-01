package Day20;
// single method having multiple functions under same name.
//for eg : car  it has values like: milege and functions like: acceleration

//Why we need Polymorphism??
//It alllows programmer to use same function name and redefine it in child class which has different implementation of same method.

/*
Types of Polymorphism:
1. Compile time polymorphism
2. Run time polymorphism

1. Compile time polymorphism:
    - Method overloading
    - Operator overloading

2. Run time polymorphism:
    - Method overriding
    - Dynamic method dispatch
    - Abstract class
    - Interface
 */

 /*
  Method Overloading:
    - It is compile time polymorphism
    - It is also called as static polymorphism
    - It is achieved by having multiple methods with same name but different parameters
    - It is achieved by changing number of parameters or type of parameters or sequence of parameters
    - Return type of method is not considered for method overloading

  Operator Overloading:
    - It is compile time polymorphism
    - It is also called as static polymorphism
    - It is achieved by having multiple operators with same name but different parameters
    - It is achieved by changing number of parameters or type of parameters or sequence of parameters
    - Return type of operator is not considered for operator overloading
  */
public class polymorphism {
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a + b;

    }
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
    }
}


//Difference between method overloading and method overridding
/*
Method Overloading:
    - It is compile time polymorphism
    - It is also called as static polymorphism
    - It is achieved by having multiple methods with same name but different parameters
    - It is achieved by changing number of parameters or type of parameters or sequence of parameters
    - Return type of method is not considered for method overloading

Method Overriding:
    - It is run time polymorphism
    - It is also called as dynamic polymorphism
    - It is achieved by having multiple methods with same name and same parameters in parent and child class
    - It is achieved by using @Override annotation
    - Return type of method is considered for method overriding
    - It is achieved by using 'super' keyword
    - It is achieved by using 'final' keyword
    - It is achieved by using 'abstract' keyword
    - It is achieved by using interface
 */

 //Method overiding example:
class A{
    public void display(){
        System.out.println("Display method of class A");
    }
}
class B extends A{
    @Override
    public void display(){
        System.out.println("Display method of class B");
    }
}
class C extends A{
    @Override
    public void display(){
        System.out.println("Display method of class C");
    }
}    
class Test{
    public static void main(String[] args) {
        A a = new A();
        a.display();
        B b = new B();
        b.display();
        C c = new C();
        c.display();
    }
}

//Output:
// Display method of class A
// Display method of class B
// Display method of class C

