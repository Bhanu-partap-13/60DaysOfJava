# Day 59: Java Beans MCQs 🎯

## Basic Questions

1. What is a JavaBean? 
    - [ ] A regular Java class
    - [x] A class that follows specific conventions
    - [ ] A database component
    - [ ] An interface

2. Which is a mandatory requirement for a JavaBean?
    - [ ] Must have methods
    - [ ] Must have properties
    - [x] Must have a no-argument constructor
    - [ ] Must implement Serializable

3. What naming convention is used for getter methods in JavaBeans?
    - [ ] get()
    - [ ] getVariable()
    - [x] getPropertyName()
    - [ ] returnProperty()

4. Which access modifier should be used for JavaBean properties?
    - [ ] public
    - [x] private
    - [ ] protected
    - [ ] default

5. What prefix is used for boolean property getter methods?
    - [ ] get
    - [x] is
    - [ ] has
    - [ ] check

6. JavaBeans are:
    - [ ] Abstract classes
    - [ ] Interfaces
    - [x] Reusable software components
    - [ ] Static classes

7. Which method naming convention is correct for a property named 'studentName'?
    - [ ] getname()
    - [ ] GetStudentName()
    - [x] getStudentName()
    - [ ] student_name()

## Code-Based Questions

8. Which code represents a valid JavaBean property?
    ```java
    - [ ] public String name;
    - [ ] private static name;
    - [x] private String name;
    - [ ] protected String name;
    ```

9. What's wrong with this JavaBean code?
    ```java
    public class Student {
         private String name;
         public Student(String name) {
              this.name = name;
         }
    }
    ```
    - [x] Missing no-argument constructor
    - [ ] Wrong property name
    - [ ] Wrong access modifier
    - [ ] Missing getter/setter

10. Which getter implementation is correct?
     ```java
     - [ ] public name() { return name; }
     - [x] public String getName() { return name; }
     - [ ] public void getName() { return name; }
     - [ ] public String get() { return name; }
     ```

11. What's the correct way to declare a boolean property in JavaBean?
     ```java
     - [x] private boolean active;
     public boolean isActive() { return active; }
     - [ ] private boolean active;
     public boolean getActive() { return active; }
     - [ ] public boolean active;
     public boolean isActive() { return active; }
     - [ ] protected boolean active;
     public boolean getActive() { return active; }
     ```

12. Which code follows JavaBean conventions?
     ```java
     - [x] public void setAge(int age) { this.age = age; }
     - [ ] public void changeAge(int age) { this.age = age; }
     - [ ] public int age(int age) { this.age = age; }
     - [ ] void setAge(int age) { this.age = age; }
     ```

13. What's wrong with this setter method?
     ```java
     public String setName(String name) {
          this.name = name;
          return name;
     }
     ```
    - [ ] Wrong parameter type
    - [ ] Wrong method name
    - [x] Wrong return type (should be void)
    - [ ] Wrong access modifier

14. Which is a valid JavaBean class declaration?
     ```java
     - [x] public class Student implements Serializable {
          private String name;
          public Student() {}
          public String getName() { return name; }
          public void setName(String name) { this.name = name; }
     }
     - [ ] class Student {
          public String name;
          public void getName() { return name; }
     }
     - [ ] protected class Student {
          private String name;
          public String getName() { return name; }
     }
     - [ ] public class Student {
          String name;
          public void get() { return name; }
     }
     ```

15. How do JavaBeans differ from interfaces?
    - [x] JavaBeans are concrete classes while interfaces are abstract contracts
    - [ ] JavaBeans are interfaces with implementation
    - [ ] JavaBeans and interfaces are the same
    - [ ] JavaBeans cannot implement interfaces

16. Which statement about JavaBeans vs Interfaces is correct?
    ```java
    - [ ] Both must have implementations
    - [x] Interfaces define contract, JavaBeans implement functionality
    - [ ] Both can have instance variables
    - [ ] Both must be abstract
    ```

    
  ## Coding Problems

    17. Create a Student JavaBean
    **Create a Student JavaBean with properties: id, name, and grade. Implement proper encapsulation.**

    **Input format:**
    - Student details through setter methods

    **Output format:**
    - Student details through getter methods

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | id=1, name="John", grade="A" | Student{id=1, name=John, grade=A} |
    | id=2, name="Alice", grade="B+" | Student{id=2, name=Alice, grade=B+} |

    18. Employee Salary Calculator
    **Create an Employee JavaBean that calculates total salary with basic pay and bonus.**

    **Input format:**
    - Basic pay and bonus amounts

    **Output format:**
    - Total salary after calculation

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | basicPay=50000, bonus=5000 | Total Salary: 55000 |
    | basicPay=45000, bonus=3000 | Total Salary: 48000 |

    19. Bank Account Manager
    **Implement a BankAccount JavaBean with methods for deposit and withdrawal.**

    **Input format:**
    - Initial balance and transaction amounts

    **Output format:**
    - Updated balance after each transaction

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | balance=1000, deposit=500 | New Balance: 1500 |
    | balance=1500, withdraw=200 | New Balance: 1300 |