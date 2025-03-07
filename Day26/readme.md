# Day 26: Local Classes and Anonymous Classes in Java

## Beginner Friendly Questions

1. **What is a local class in Java?**
    - [ ] A class defined outside any method
    - [x] A class defined within a method
    - [ ] A class defined within a package
    - [ ] A class defined within an interface

2. **Can a local class access local variables of the method in which it is defined?**
    - [x] Yes, but only if they are final or effectively final
    - [ ] No, it cannot access local variables
    - [ ] Yes, it can access any local variables
    - [ ] Yes, but only if they are static

3. **What is an anonymous class in Java?**
    - [ ] A class with no name defined outside any method
    - [ ] A class with no name defined within a package
    - [x] A class with no name defined and instantiated in a single expression
    - [ ] A class with no name defined within an interface

4. **Can an anonymous class implement an interface?**
    - [x] Yes
    - [ ] No
    - [ ] Only if the interface has a single method
    - [ ] Only if the interface is public

5. **Which of the following is true about local classes?**
    - [ ] They can be declared as public
    - [ ] They can be declared as static
    - [x] They can be declared as abstract
    - [ ] They can be declared as protected

6. **Can an anonymous class extend a class?**
    - [x] Yes
    - [ ] No
    - [ ] Only if the class is abstract
    - [ ] Only if the class is final

7. **Which of the following is a correct way to create an anonymous class?**
    - [ ] `new InterfaceName() { /* implementation */ };`
    - [ ] `new ClassName() { /* implementation */ };`
    - [x] Both of the above
    - [ ] None of the above

## Code-Based Questions

1. **What will be the output of the following code?**
    ```java
    public class Test {
         public void method() {
              class Local {
                    void print() {
                         System.out.println("Hello from Local class");
                    }
              }
              Local local = new Local();
              local.print();
         }
         public static void main(String[] args) {
              new Test().method();
         }
    }
    ```
    - [ ] Compilation error
    - [ ] Runtime error
    - [x] Hello from Local class
    - [ ] No output

2. **What will be the output of the following code?**
    ```java
    interface Greeting {
         void greet();
    }
    public class Test {
         public static void main(String[] args) {
              Greeting greeting = new Greeting() {
                    public void greet() {
                         System.out.println("Hello from Anonymous class");
                    }
              };
              greeting.greet();
         }
    }
    ```
    - [ ] Compilation error
    - [ ] Runtime error
    - [x] Hello from Anonymous class
    - [ ] No output

3. **What will be the output of the following code?**
    ```java
    public class Test {
         public void method() {
              final int x = 10;
              class Local {
                    void print() {
                         System.out.println(x);
                    }
              }
              Local local = new Local();
              local.print();
         }
         public static void main(String[] args) {
              new Test().method();
         }
    }
    ```
    - [ ] Compilation error
    - [ ] Runtime error
    - [x] 10
    - [ ] No output

4. **What will be the output of the following code?**
    ```java
    public class Test {
         public static void main(String[] args) {
              Runnable r = new Runnable() {
                    public void run() {
                         System.out.println("Running in Anonymous class");
                    }
              };
              new Thread(r).start();
         }
    }
    ```
    - [ ] Compilation error
    - [ ] Runtime error
    - [x] Running in Anonymous class
    - [ ] No output

5. **What will be the output of the following code?**
    ```java
    public class Test {
         public void method() {
              int x = 10;
              class Local {
                    void print() {
                         System.out.println(x);
                    }
              }
              Local local = new Local();
              local.print();
         }
         public static void main(String[] args) {
              new Test().method();
         }
    }
    ```
    - [ ] Compilation error
    - [ ] Runtime error
    - [x] 10
    - [ ] No output

6. **What will be the output of the following code?**
    ```java
    public class Test {
         public static void main(String[] args) {
              new Thread(new Runnable() {
                    public void run() {
                         System.out.println("Anonymous class running");
                    }
              }).start();
         }
    }
    ```
    - [ ] Compilation error
    - [ ] Runtime error
    - [x] Anonymous class running
    - [ ] No output

7. **What will be the output of the following code?**
    ```java
    public class Test {
         public void method() {
              final int x = 10;
              class Local {
                    void print() {
                         System.out.println(x);
                    }
              }
              Local local = new Local();
              local.print();
         }
         public static void main(String[] args) {
              new Test().method();
         }
    }
    ```
    - [ ] Compilation error
    - [ ] Runtime error
    - [x] 10
    - [ ] No output

    ***
    ## Problem Statements
    ### 1
    **Explain what you have to do in the question .**

    **Local Class Example**

    **Input format:**
    - No input required

    **Output format:**
    - The output will be a message printed by the local class

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | Hello from Local class |

    ```java
    public class Test {
        public void method() {
            class Local {
                 void print() {
                     System.out.println("Hello from Local class");
                 }
            }
            Local local = new Local();
            local.print();
        }
        public static void main(String[] args) {
            new Test().method();
        }
    }
    ```
    
    ***
    ### 2
    **Explain what you have to do in the question .**

    **Anonymous Class Example**

    **Input format:**
    - No input required

    **Output format:**
    - The output will be a message printed by the anonymous class

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | Hello from Anonymous class |

    ```java
    interface Greeting {
        void greet();
    }
    public class Test {
        public static void main(String[] args) {
            Greeting greeting = new Greeting() {
                 public void greet() {
                     System.out.println("Hello from Anonymous class");
                 }
            };
            greeting.greet();
        }
    }
    ```

    ***
    ### 3
    **Explain what you have to do in the question .**

    **Anonymous Class with Runnable Example**

    **Input format:**
    - No input required

    **Output format:**
    - The output will be a message printed by the anonymous class running in a thread

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | No input | Anonymous class running |

    ```java
    public class Test {
        public static void main(String[] args) {
            new Thread(new Runnable() {
                 public void run() {
                     System.out.println("Anonymous class running");
                 }
            }).start();
        }
    }
    ```