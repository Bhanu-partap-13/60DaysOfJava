// Yeh file batayega @Override annotation kya hai!
// Annotation ek tarah ka "tag" hota hai jo code ko extra info deta hai.
// Jaise school mein teacher bolte hain "yeh kaam special hai," annotation bhi aisa hi karta hai!
package Day60;
// Yeh ek simple example hai jo batata hai ki @Override kaise kaam karta hai



class Animal {
    // Yeh ek method hai jo sound banata hai
    void makeSound() {
        System.out.println("Koi bhi sound!");
    }
}

class Dog extends Animal {
    // @Override ka matlab hai: "Main apne parent (Animal) ka method change kar raha hoon!"
    // Jaise tum apne bade bhai ke game ko apne style mein khelte ho!
    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}

class OverrideExample {
    public static void main(String[] args) {
        // Dog object banaya, ab dekho kya sound aata hai
        Dog dog = new Dog();
        dog.makeSound(); // Yeh "Woof Woof!" print karega
    }
}