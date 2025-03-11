
## 1️⃣ **Explain what you have to do in the question .**  

    **Concert Ticket Summary**  

    **Input format:**  
    - A string representing the concert name.  
    - An integer representing the seat number.  
    - A float representing the ticket price.  
    - A boolean representing ticket availability.  

    **Output format:**  
    - Displays the concert details in a formatted summary.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | Summer Music Fest | Concert Name: Summer Music Fest |
    | 12 | Seat Number: 12 |
    | 59.99 | Ticket Price: 59.99 |
    | true | Available: true |

    | Input 2: | Output 2: |
    |----------|-----------|
    | Marakuma Nenjam | Concert Name: Marakuma Nenjam |
    | 34 | Seat Number: 34 |
    | 75.50 | Ticket Price: 75.50 |
    | false | Available: false |

    ```java
    import java.util.Scanner;

    public class TicketSummary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String concertName = scanner.nextLine();
            int seatNumber = scanner.nextInt();
            float ticketPrice = scanner.nextFloat();
            boolean isAvailable = scanner.nextBoolean();

            System.out.println("Concert Name: " + concertName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.printf("Ticket Price: %.2f%n", ticketPrice);
            System.out.println("Available: " + isAvailable);
        }
    }
    ```

---

## 2️⃣ **Explain what you have to do in the question .**  

    **Personalized Welcome Message**  

    **Input format:**  
    - A string representing the user's name.  

    **Output format:**  
    - Prints `"Welcome, X!"` where `X` is the user's name.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | Sarah | Welcome, Sarah! |

    | Input 2: | Output 2: |
    |----------|-----------|
    | Micheal | Welcome, Micheal! |

    ```java
    import java.util.Scanner;

    public class WelcomeMessage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Welcome, " + name + "!");
        }
    }
    ```

---

## 3️⃣ **Explain what you have to do in the question .**  

    **Calculate Total Salary**  

    **Input format:**  
    - Three floating-point numbers representing the salaries.  

    **Output format:**  
    - Prints the total salary formatted to two decimal places.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 2500.75 | Rs. 8202.13 |
    | 3000.4 | |
    | 2700.98 | |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 10075.00 | Rs. 53161.30 |
    | 15000.70 | |
    | 28085.60 | |

    ```java
    import java.util.Scanner;

    public class TotalSalary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float pam = scanner.nextFloat();
            float jim = scanner.nextFloat();
            float dwight = scanner.nextFloat();

            float total = pam + jim + dwight;
            System.out.printf("Rs. %.2f%n", total);
        }
    }
    ```

---

## 4️⃣ **Explain what you have to do in the question .**  

    **Square and Cube Calculation**  

    **Input format:**  
    - A single integer `n`.  

    **Output format:**  
    - Prints the square and cube of `n`.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 5 | Square of 5 is 25 |
    |   | Cube of 5 is 125 |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 39 | Square of 39 is 1521 |
    |   | Cube of 39 is 59319 |

    ```java
    import java.util.Scanner;

    public class SquareCube {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            int square = num * num;
            int cube = num * num * num;

            System.out.println("Square of " + num + " is " + square);
            System.out.println("Cube of " + num + " is " + cube);
        }
    }
    ```
---

## 5️⃣ **Explain what you have to do in the question .**  

    **Unary Plus and Minus Operations**  

    **Input format:**  
    - An integer `N`.  

    **Output format:**  
    - Prints `"Unary Plus: X"` and `"Unary Minus: Y"` where `X = +N` and `Y = -N`.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 12 | Unary Plus: 12 |
    |    | Unary Minus: -12 |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 629 | Unary Plus: 629 |
    |    | Unary Minus: -629 |

    ```java
    import java.util.Scanner;

    public class UnaryOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            System.out.println("Unary Plus: " + (+n));
            System.out.println("Unary Minus: " + (-n));
        }
    }
    ```
---


## 📜 License  
This repository is open-source and available for learning and practice. 🚀  
