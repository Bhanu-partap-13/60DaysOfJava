# Day 51: Collections and Generics in Java

Today, I explored the topic of **Collections and Generics in Java**. Below are some beginner-friendly multiple-choice questions (MCQs) and some code-based (COD) questions to help master this topic.

---

## Beginner-Friendly Questions

1. **What is the main purpose of Generics in Java?**  
    - [ ] To make code slower  
    - [x] To ensure type safety  
    - [ ] To remove the need for collections  
    - [ ] To avoid compilation  

2. **Which of the following is a generic class in Java?**  
    - [ ] `String`  
    - [x] `ArrayList<E>`  
    - [ ] `Math`  
    - [ ] `Scanner`  

3. **What does `<E>` represent in a generic class?**  
    - [ ] A fixed type  
    - [x] A placeholder for a type parameter  
    - [ ] A method name  
    - [ ] A keyword  

4. **Which method is used to add elements to a generic `ArrayList`?**  
    - [ ] `insert()`  
    - [x] `add()`  
    - [ ] `put()`  
    - [ ] `append()`  

5. **What happens if you try to add a `String` to a `List<Integer>`?**  
    - [ ] It will compile successfully  
    - [ ] It will throw a runtime exception  
    - [x] It will cause a compilation error  
    - [ ] It will convert the `String` to `Integer`  

6. **Which of the following is a correct declaration of a generic method?**  
    - [ ] `public void method(T t)`  
    - [x] `public <T> void method(T t)`  
    - [ ] `public void <T> method(T t)`  
    - [ ] `public void method<T>(T t)`  

7. **What is the wildcard in Generics represented by?**  
    - [ ] `#`  
    - [ ] `@`  
    - [x] `?`  
    - [ ] `*`  

---

## Code-Based (COD) Questions

1. **What will be the output of the following code?**  
    ```java
    List<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Generics");
    System.out.println(list.get(1));
    ```
    - [ ] `Java`  
    - [x] `Generics`  
    - [ ] `null`  
    - [ ] Compilation error  

2. **What is the correct way to declare a generic `Map`?**  
    - [ ] `Map<K, V> map = new HashMap<>();`  
    - [x] `Map<String, Integer> map = new HashMap<>();`  
    - [ ] `Map<> map = new HashMap<>();`  
    - [ ] `Map map = new HashMap<String, Integer>();`  

3. **What will happen if you try to compile the following code?**  
    ```java
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add("Java");
    ```
    - [ ] It will compile successfully  
    - [ ] It will throw a runtime exception  
    - [x] It will cause a compilation error  
    - [ ] It will print `10`  

4. **What is the output of the following code?**  
    ```java
    List<?> list = new ArrayList<>();
    list.add(null);
    System.out.println(list.size());
    ```
    - [ ] Compilation error  
    - [ ] `0`  
    - [x] `1`  
    - [ ] Runtime exception  

5. **Which of the following is a valid use of bounded wildcards?**  
    - [x] `List<? extends Number>`  
    - [ ] `List<? implements Number>`  
    - [ ] `List<? super String>`  
    - [ ] `List<? extends Object>`  

6. **What will be the output of the following code?**  
    ```java
    List<Integer> list = Arrays.asList(1, 2, 3);
    for (int num : list) {
         System.out.print(num + " ");
    }
    ```
    - [x] `1 2 3`  
    - [ ] `123`  
    - [ ] Compilation error  
    - [ ] Runtime exception  

7. **What is the purpose of the `Comparator` interface in Java?**  
    - [ ] To compare primitive types  
    - [x] To define custom sorting logic  
    - [ ] To iterate over collections  
    - [ ] To convert collections to arrays  


    ## Coding Problems with Solutions

    ### 1. **Find the Frequency of Elements in a List**

    **Explain what you have to do in the question:**  
    Write a program to find the frequency of each element in a list using a `Map`.

    **Topic Name:** Collections and Generics

    **Input format:**  
    - A list of integers.

    **Output format:**  
    - A map showing the frequency of each integer.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | [1, 2, 2, 3, 3, 3] | {1=1, 2=2, 3=3} |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | [4, 4, 4, 4] | {4=4} |

    **Solution:**
    ```java
    import java.util.*;

    public class FrequencyCounter {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3);
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            for (int num : list) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            System.out.println(frequencyMap);
        }
    }
    ```

    ---

    ### 2. **Sort a List of Strings in Reverse Order**

    **Explain what you have to do in the question:**  
    Write a program to sort a list of strings in reverse order using a `Comparator`.

    **Topic Name:** Collections and Generics

    **Input format:**  
    - A list of strings.

    **Output format:**  
    - The list sorted in reverse order.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | ["apple", "banana", "cherry"] | ["cherry", "banana", "apple"] |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | ["dog", "cat", "elephant"] | ["elephant", "dog", "cat"] |

    **Solution:**
    ```java
    import java.util.*;

    public class ReverseSort {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("apple", "banana", "cherry");
            list.sort(Comparator.reverseOrder());

            System.out.println(list);
        }
    }
    ```

    ---

    ### 3. **Merge Two Lists and Remove Duplicates**

    **Explain what you have to do in the question:**  
    Write a program to merge two lists of integers and remove duplicates using a `Set`.

    **Topic Name:** Collections and Generics

    **Input format:**  
    - Two lists of integers.

    **Output format:**  
    - A single list with unique integers.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | [1, 2, 3], [3, 4, 5] | [1, 2, 3, 4, 5] |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | [10, 20], [20, 30] | [10, 20, 30] |

    **Solution:**
    ```java
    import java.util.*;

    public class MergeLists {
        public static void main(String[] args) {
            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(3, 4, 5);

            Set<Integer> mergedSet = new HashSet<>(list1);
            mergedSet.addAll(list2);

            List<Integer> mergedList = new ArrayList<>(mergedSet);
            System.out.println(mergedList);
        }
    }
    ```

---

Feel free to attempt these questions and revisit the topic for better understanding!  