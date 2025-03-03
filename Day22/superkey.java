package Day22;


class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
    String name="Ankit";
    void find(){
        System.out.println("Animal is on search");
    }
}
class Dog extends Animal{
    Dog(){
        super();
    }
    void wake(){
        super.find();
        System.out.println(super.name);
    }
}
public class superkey {
    public static void main(String[] args){
        Dog d = new Dog(); 
        d.wake();
    }
}
