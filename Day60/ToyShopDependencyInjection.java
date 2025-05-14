// Ye file Dependency Injection ko explain karta hai in Spring Framework
// Socho ek Toy Shop hai. Shop ko toys chahiye bechne ke liye.
// Lekin shop khud toys nahi banata, koi aur toys deta hai.
// Dependency Injection (DI) aisa hi hai - Spring shop ko toys deta hai!


package Day60;
// Ye file Dependency Injection ko explain karta hai in Spring Framework

import org.springframework.beans.factory.annotation.Autowired; // Ye import Spring se hai jo DI ke liye zaroori hai
import org.springframework.stereotype.Component; // Ye import Spring ko batata hai ke ye class ek component hai


// Ye ek Toy class hai - isme toy ka naam hota hai
class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Ye ToyShop class hai - isko toys chahiye
@Component // Ye Spring ko batata hai ke ye ek "bean" hai
class ToyShop {
    private Toy toy;

    // @Autowired ka matlab hai Spring khud toy dega
    // Jaise shopkeeper ko koi toy de deta hai, shop nahi banata
    @Autowired
    public ToyShop(Toy toy) {
        this.toy = toy;
    }

    public void showToy() {
        System.out.println("Shop mein ye toy hai: " + toy.getName());
    }
}

// Ye main class hai jo program chalati hai
public class ToyShopDependencyInjection {
    public static void main(String[] args) {
        // Asli Spring mein ApplicationContext hota hai, yaha simple rakha
        // Maan lo Spring ek magic box hai jo toys aur shop banata hai
        Toy toy = new Toy("Teddy Bear");
        ToyShop shop = new ToyShop(toy);
        shop.showToy(); // Output: Shop mein ye toy hai: Teddy Bear
    }
}