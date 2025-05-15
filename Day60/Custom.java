// Yeh file batayega custom annotation kya hota hai!
// Custom annotation hum khud banate hain, jaise apna special sticker!
// Iska use tab hota hai jab hum code ko apne hisaab se mark karna chahte hain.

import java.lang.annotation.*;

// Yeh humara apna annotation hai, naam hai @MySpecial
@Retention(RetentionPolicy.RUNTIME)
@interface MySpecial {
    String value(); // Yeh ek property hai, jaise sticker ka message
}

// Yeh ek class hai jo special kaam karti hai
@MySpecial(value = "Yeh mera favorite kaam hai!")
class SpecialTask {
    void doTask() {
        System.out.println("Main special kaam kar raha hoon!");
    }
}

class Custom {
    public static void main(String[] args) {
        // SpecialTask banaya
        SpecialTask task = new SpecialTask();
        task.doTask(); // Yeh "Main special kaam kar raha hoon!" print karega

        // Annotation ka message dekho
        MySpecial annotation = SpecialTask.class.getAnnotation(MySpecial.class);
        System.out.println(annotation.value()); // Yeh "Yeh mera favorite kaam hai!" print karega
    }
}