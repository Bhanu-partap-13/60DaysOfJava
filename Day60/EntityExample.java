// Yeh file batayega @Entity annotation kya hai!
// @Entity JPA (Hibernate) mein use hota hai, jo database ke liye kaam karta hai.
// Jaise tum apni kitab ko "Student" naam ke dabbe mein rakhte ho, @Entity bolta hai "yeh class special dabba hai!"

import java.lang.annotation.*;

// Yeh ek fake @Entity annotation hai, samajhne ke liye
@Retention(RetentionPolicy.RUNTIME)
@interface Entity {}

// Yeh ek class hai jo Student ko represent karta hai
@Entity
class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void showDetails() {
        System.out.println("Naam: " + name + ", Roll Number: " + rollNumber);
    }
}

class Main {
    public static void main(String[] args) {
        // Student banaya, jaise database mein save hota hai
        Student student = new Student("Rahul", 101);
        student.showDetails(); // Yeh "Naam: Rahul, Roll Number: 101" print karega
    }
}