# Day 52: ArrayLists in Java

Today, I explored the topic of **Collections by Generics** and implemented **ArrayLists** in Java. Below are some beginner-friendly multiple-choice questions (MCQs) and a few code-based questions to help master this topic.

---

## Beginner-Friendly Questions

1. **What is the main advantage of using generics in Java?**  
    - [ ] It increases runtime errors.  
    - [x] It provides type safety.  
    - [ ] It makes the code slower.  
    - [ ] It removes the need for collections.  

2. **Which of the following is a valid declaration of a generic ArrayList?**  
    - [ ] `ArrayList list = new ArrayList();`  
    - [x] `ArrayList<String> list = new ArrayList<>();`  
    - [ ] `ArrayList<> list = new ArrayList<String>();`  
    - [ ] `ArrayList<String> list = new ArrayList();`  

3. **What does the `add()` method in an ArrayList do?**  
    - [x] Adds an element to the list.  
    - [ ] Removes an element from the list.  
    - [ ] Sorts the list.  
    - [ ] Clears the list.  

4. **Which package do you need to import to use ArrayList in Java?**  
    - [ ] `java.io`  
    - [x] `java.util`  
    - [ ] `java.lang`  
    - [ ] `java.net`  

5. **What happens if you try to add an element of the wrong type to a generic ArrayList?**  
    - [ ] It adds the element without any issue.  
    - [ ] It throws a runtime exception.  
    - [x] It causes a compile-time error.  
    - [ ] It removes all elements from the list.  

6. **Which method is used to retrieve an element from an ArrayList?**  
    - [ ] `getElement()`  
    - [x] `get()`  
    - [ ] `retrieve()`  
    - [ ] `fetch()`  

7. **What is the default initial capacity of an ArrayList in Java?**  
    - [ ] 5  
    - [ ] 8  
    - [x] 10  
    - [ ] 15  

---

## Code-Based Questions

1. **What will be the output of the following code?**  
    ```java
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    System.out.println(numbers.get(1));
    ```
    - [ ] 10  
    - [x] 20  
    - [ ] 30  
    - [ ] Compilation error  

2. **Which of the following code snippets correctly initializes a generic ArrayList?**  
    - [ ] `ArrayList list = new ArrayList();`  
    - [x] `ArrayList<Double> list = new ArrayList<>();`  
    - [ ] `ArrayList<> list = new ArrayList<Double>();`  
    - [ ] `ArrayList<Double> list = new ArrayList();`  

3. **What will happen if you try to access an index that is out of bounds in an ArrayList?**  
    - [ ] It will return `null`.  
    - [ ] It will add a new element at that index.  
    - [ ] It will silently ignore the operation.  
    - [x] It will throw an `IndexOutOfBoundsException`.  

4. **What is the output of the following code?**  
    ```java
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");
    names.remove(0);
    System.out.println(names.get(0));
    ```
    - [ ] Alice  
    - [x] Bob  
    - [ ] null  
    - [ ] Compilation error  

5. **Which method is used to check if an ArrayList is empty?**  
    - [ ] `isNull()`  
    - [x] `isEmpty()`  
    - [ ] `size()`  
    - [ ] `clear()`  

6. **What will the following code print?**  
    ```java
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(10);
    list.clear();
    System.out.println(list.size());
    ```
    - [ ] 2  
    - [ ] 1  
    - [x] 0  
    - [ ] Compilation error  

7. **Which of the following methods is used to replace an element in an ArrayList?**  
    - [ ] `replace()`  
    - [ ] `update()`  
    - [x] `set()`  
    - [ ] `modify()`  

    ## Coding Problems with Solutions

    ### 1. Find the Maximum Element in an ArrayList

    **Explain what you have to do in the question:**  
    Write a program to find the maximum element in a generic ArrayList of integers.

    **Topic Name:** Collections and Generics in Java

    **Input format:**  
    - A list of integers provided as input.

    **Output format:**  
    - The maximum integer in the list.

    **Example:**

    | Input 1:         | Output 1: |
    | ----------------- | --------- |
    | [10, 20, 30, 40] | 40        |
    | [5, 15, 25]      | 25        |

    | Input 2:         | Output 2: |
    | ----------------- | --------- |
    | [1, 2, 3, 4, 5]  | 5         |
    | [100, 50, 75]    | 100       |

    **Solution:**
    ```java
    import java.util.ArrayList;
    import java.util.Collections;

    public class MaxElement {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);

            int max = Collections.max(numbers);
            System.out.println("Maximum element: " + max);
        }
    }
    ```

    ---

    ### 2. Reverse an ArrayList

    **Explain what you have to do in the question:**  
    Write a program to reverse the elements of a generic ArrayList.

    **Topic Name:** Collections and Generics in Java

    **Input format:**  
    - A list of integers provided as input.

    **Output format:**  
    - The reversed list of integers.

    **Example:**

    | Input 1:         | Output 1:         |
    | ----------------- | ----------------- |
    | [1, 2, 3, 4, 5]  | [5, 4, 3, 2, 1]   |
    | [10, 20, 30]     | [30, 20, 10]      |

    | Input 2:         | Output 2:         |
    | ----------------- | ----------------- |
    | [7, 8, 9]        | [9, 8, 7]         |
    | [100, 200, 300]  | [300, 200, 100]   |

    **Solution:**
    ```java
    import java.util.ArrayList;
    import java.util.Collections;

    public class ReverseList {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            Collections.reverse(numbers);
            System.out.println("Reversed list: " + numbers);
        }
    }
    ```

    ---

    ### 3. Remove Duplicates from an ArrayList

    **Explain what you have to do in the question:**  
    Write a program to remove duplicate elements from a generic ArrayList.

    **Topic Name:** Collections and Generics in Java

    **Input format:**  
    - A list of integers provided as input.

    **Output format:**  
    - A list of integers with duplicates removed.

    **Example:**

    | Input 1:         | Output 1:         |
    | ----------------- | ----------------- |
    | [1, 2, 2, 3, 4]  | [1, 2, 3, 4]      |
    | [10, 10, 20, 30] | [10, 20, 30]      |

    | Input 2:         | Output 2:         |
    | ----------------- | ----------------- |
    | [5, 5, 5, 5]     | [5]               |
    | [100, 200, 100]  | [100, 200]        |

    **Solution:**
    ```java
    import java.util.ArrayList;
    import java.util.LinkedHashSet;

    public class RemoveDuplicates {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);

            LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
            numbers.clear();
            numbers.addAll(uniqueNumbers);

            System.out.println("List after removing duplicates: " + numbers);
        }
    }
    ```

---

Feel free to attempt these questions and revisit the concepts if needed. Happy coding!  