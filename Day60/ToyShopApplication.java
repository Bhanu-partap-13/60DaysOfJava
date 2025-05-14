// Ye file Spring Boot ko explain karta hai
// Socho Toy Shop kholna hai, lekin furniture, counter, toys sab lagana padta hai
// Spring Boot ek magic kit hai jo shop ko 2 minute mein ready kar deta hai!
// Isme sab kuch already set hota hai - bas program chala do

package Day60;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Ye Spring Boot ka main class hai
@SpringBootApplication // Ye magic command hai jo shop ko ready karta hai
public class ToyShopApplication {
    public static void main(String[] args) {
        // Ye line shop ko khol deta hai
        // Jaise ek button dabao aur shop start!
        SpringApplication.run(ToyShopApplication.class, args);
    }
}

// Is file ko chalaoge toh Spring Boot ek website banayega
// Aur upar wala ToyShopController ka code bhi kaam karega
// Matlab customer "/toys" pe jayega aur toys dekh sakta hai