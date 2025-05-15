// Yeh file batayega @Autowired annotation kya hota hai!
// @Autowired Spring mein use hota hai, jo ek tarah ka "magic helper" hai.
// Jaise tum mummy se bolte ho "khana de do," aur woh de deti hain, @Autowired bhi automatically cheez deta hai!

// Hum Spring ka chhota sa example banayenge without real Spring
import java.lang.annotation.*;

// Yeh ek fake @Autowired annotation hai, samajhne ke liye
@Retention(RetentionPolicy.RUNTIME)
@interface Autowired {}

// Yeh ek class hai jo khana banati hai
class Kitchen {
    void cook() {
        System.out.println("Yummy khana ban gaya!");
    }
}

// Yeh ek class hai jo khana mangta hai
class Chef {
    // @Autowired bolta hai: "Mujhe Kitchen automatically de do!"
    @Autowired
    Kitchen kitchen;

    // Constructor jo kitchen set karta hai (jaise Spring karta hai)
    Chef() {
        this.kitchen = new Kitchen(); // Yeh fake Spring ka kaam hai
    }

    void makeFood() {
        kitchen.cook();
    }
}

class AutowiredExample {
    public static void main(String[] args) {
        // Chef ko banaya, woh khud kitchen le lega
        Chef chef = new Chef();
        chef.makeFood(); // Yeh "Yummy khana ban gaya!" print karega
    }
}