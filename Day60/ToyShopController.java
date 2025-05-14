// Ye file Spring MVC ko explain karta hai
// Socho Toy Shop ka counter hai jaha customer aata hai
// Customer bolta hai "Mujhe toy chahiye" aur shop toy dikhata hai
// Spring MVC aisa hi hai - website pe customer request bhejta hai, aur hum answer dete hai

package Day60;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Ye Controller class hai - jaise shop ka counter
@Controller // Ye batata hai ke ye Spring MVC ka controller hai
public class ToyShopController {

    // @GetMapping ka matlab customer ne website pe "/toys" khola
    // Jaise customer counter pe bolta hai "Toy dikhao"
    @GetMapping("/toys")
    @ResponseBody // Ye website pe direct message bhejta hai
    public String showToys() {
        return "Yaha Teddy Bear aur Car toys hai!";
    }
}

// Asli mein ye code website banata hai
// Agar browser mein "localhost:8080/toys" likho, toh "Yaha Teddy Bear aur Car toys hai!" dikhega