package Day11;

public class questions {
/* 
1️⃣ Create a Book class with properties title, author, and price. Write a constructor to initialize them and a method to display book details.
2️⃣ Design a BankAccount class with methods deposit() and withdraw(). Ensure that the balance cannot be negative.
3️⃣ Create a Rectangle class that calculates area and perimeter using methods.
4️⃣ Write a program where a class Employee contains a method to calculate and display salary. Create multiple employee objects with different salaries.
5️⃣ Create a Calculator class with overloaded methods to add two, three, or four numbers.
*/

/*
1️⃣
 class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("📖 Book Title: " + title);
        System.out.println("👨‍💼 Author: " + author);
        System.out.println("💰 Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 29.99);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 15.50);

        // Displaying details
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}





2️⃣
class BankAccount {
    private double balance;

    // Constructor
    BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("⚠️ Balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: $" + amount);
        } else {
            System.out.println("⚠️ Cannot deposit a negative amount!");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💵 Withdrawn: $" + amount);
        } else {
            System.out.println("⚠️ Insufficient balance or invalid amount!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("🏦 Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.displayBalance();
        account.deposit(50);
        account.withdraw(30);
        account.withdraw(150);
        account.displayBalance();
    }
}



3️⃣
class Rectangle {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("📏 Area: " + rect.calculateArea());
        System.out.println("📏 Perimeter: " + rect.calculatePerimeter());
    }
}

 */
}
