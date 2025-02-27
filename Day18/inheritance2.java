package Day18;


//Multiple Inheritance in Java
// class Animal{
//     void eat(){
//         System.out.println("Aniaml is eating");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog is Barking");
//     }
// }
// class BabyDog extends Dog{
//     void weep(){
//         System.out.println("Dog is Weeping");
//     }
// }

// class inheritance2{
// public static void main(String[] args){
//     BabyDog d = new BabyDog();
//     d.weep();
//     d.bark();
//     d.eat();
// }
// }

//Heirarchical Inheritance - two or more classes inherits the single class, it is known as heirarchical Inheritance.    

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class Cat extends Animal{
    void meow() {
        System.out.println("meaowing");
    }
}

class inheritance2{
    public static void main(String[] args){
        Cat c = new Cat();
        c.meow();
        c.eat();
       // c.bark(); -> ye error dega
    }
}

//Multiple inheritance is not supported in Java

// Class A{
// void msg(){
//     System.out.println("Hello");
// }
// }
// Class B{
// void msg(){
//     System.out.println("Welcome");
// }
// }
// Class C extends A,B{

//     public static void main(String[] args){
//         C.obj= new C();
//         obj.msg
//     }
// }