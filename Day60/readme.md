# Day 60: Java Spring Annotations and Entity MCQs

## Conceptual Questions

1. What is the primary purpose of the `@Autowired` annotation in Spring?
- [x] To automatically inject dependencies
- [ ] To create new instances of classes
- [ ] To override methods
- [ ] To define database tables

2. Which annotation is used to mark a class as a persistent entity in JPA?
- [x] @Entity
- [ ] @Table
- [ ] @Persistent
- [ ] @Database

3. When using `@Override`, what happens if the method doesn't actually override a superclass method?
- [x] Compilation error occurs
- [ ] Runtime error occurs
- [ ] Nothing happens
- [ ] Warning message appears

4. In Spring, where can `@Autowired` be used?
- [ ] Only on constructors
- [ ] Only on fields
- [ ] Only on setter methods
- [x] On constructors, fields, and setter methods

5. What is the purpose of `@Entity` annotation?
- [x] To specify that the class is an entity and is mapped to a database table
- [ ] To create a new database
- [ ] To define class methods
- [ ] To implement interfaces

6. Which of the following is true about `@Override`?
- [x] It helps in catching errors when method signatures don't match
- [ ] It creates a new method in the parent class
- [ ] It is mandatory for all inherited methods
- [ ] It improves application performance

7. By default, what is the name of the table mapped to an `@Entity` class?
- [x] The name of the class
- [ ] The name of the package
- [ ] The name specified in application.properties
- [ ] Table_Entity

## Code-Based Questions

8. What's wrong with this code?
```java
@Entity
class Student {
    @Autowired
    private String name;
}
```
- [x] String cannot be autowired as it's not a Spring bean
- [ ] @Entity is used incorrectly
- [ ] Class should be public
- [ ] Missing @Table annotation

9. Identify the correct usage:
```java
@Component
class CarService {
    @Autowired
    private EngineService engineService;
}
```
- [x] This is correct dependency injection
- [ ] EngineService should be final
- [ ] @Component is unnecessary
- [ ] Autowiring should be on constructor only

10. What will happen in this code?
```java
class Animal {
    void makeSound() {}
}
class Dog extends Animal {
    @Override
    void makeSound(String type) {}
}
```
- [x] Compilation error due to incorrect method signature
- [ ] Runtime error
- [ ] Code will work fine
- [ ] Warning message only

11. Which entity definition is correct?
```java
@Entity
public class Product {
    @Id
    private Long id;
    private String name;
}
```
- [x] Missing @GeneratedValue for id
- [ ] @Entity is misplaced
- [ ] Class should be abstract
- [ ] private fields are not allowed

12. What's the issue here?
```java
@Service
public class UserService {
    @Autowired
    private static UserRepository repository;
}
```
- [x] @Autowired cannot be used on static fields
- [ ] @Service is incorrect
- [ ] Repository should be final
- [ ] No issues in the code

13. Which is correct about this code?
```java
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String email;
}
```
- [x] This is a valid entity definition
- [ ] @Column cannot be used with unique
- [ ] GenerationType.AUTO is invalid
- [ ] email should be @Id

14. What will this code do?
```java
@Component
class PaymentService {
    @Autowired(required = false)
    private PaymentProvider provider;
}
```
- [x] Allow null if PaymentProvider bean is not found
- [ ] Throw exception at runtime
- [ ] Not compile
- [ ] Create a new PaymentProvider instance

## Code Implementation Questions

### 1. Repository Injection Problem
**Implement a Spring service that manages user data using constructor-based autowiring.**

**Input format:**
- User details (name, email)

**Output format:**
- Success/failure message for user operations

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| name="John", email="john@example.com" | "User created successfully" |
| name=null, email="invalid" | "Invalid user data" |

```java
@Service
public class UserService {
    private final UserRepository userRepository;
    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public String createUser(String name, String email) {
        if (name == null || email == null) return "Invalid user data";
        // Implementation logic
        return "User created successfully";
    }
}
```

### 2. Method Override Challenge
**Create a shape hierarchy with proper method overriding.**

**Input format:**
- Shape dimensions

**Output format:**
- Area calculation

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| radius=5 | "Circle area: 78.54" |
| length=4, width=6 | "Rectangle area: 24.0" |

```java
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

### 3. Entity Mapping Task
**Design an entity for product inventory.**

**Input format:**
- Product details (id, name, price)

**Output format:**
- Database record

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| id=1, name="Laptop", price=999.99 | "Product saved" |
| id=2, name="", price=-1 | "Invalid product" |

```java
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(precision = 10, scale = 2)
    private BigDecimal price;
}
```
