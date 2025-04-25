# TreeSet in Java - MCQs for Beginners

## Beginner-Friendly Questions

1. **What is the primary feature of a TreeSet in Java?**  
    - [x] Automatically sorts elements  
    - [ ] Allows duplicate elements  
    - [ ] Does not maintain any order  
    - [ ] Uses a hash table for storage  

2. **Which interface does TreeSet implement?**  
    - [ ] List  
    - [x] NavigableSet  
    - [ ] Map  
    - [ ] Queue  

3. **What happens if you try to add a duplicate element to a TreeSet?**  
    - [ ] It throws an exception  
    - [ ] It adds the duplicate element  
    - [x] It ignores the duplicate element  
    - [ ] It replaces the existing element  

4. **What is the time complexity of basic operations like add, remove, and contains in a TreeSet?**  
    - [ ] O(1)  
    - [x] O(log n)  
    - [ ] O(n)  
    - [ ] O(n^2)  

5. **Can a TreeSet contain `null` elements?**  
    - [ ] Yes, always  
    - [ ] Yes, but only one  
    - [x] No, it throws a `NullPointerException`  
    - [ ] It depends on the comparator  

6. **Which of the following is true about TreeSet?**  
    - [x] It is backed by a TreeMap  
    - [ ] It is synchronized by default  
    - [ ] It allows heterogeneous objects  
    - [ ] It uses a linked list for storage  

7. **How does TreeSet handle custom sorting?**  
    - [ ] It does not support custom sorting  
    - [x] By using a custom comparator  
    - [ ] By overriding the `toString` method  
    - [ ] By implementing the `Comparable` interface  

---

## Code-Oriented Questions

1. **What will be the output of the following code?**  
    ```java
    TreeSet<Integer> set = new TreeSet<>();
    set.add(5);
    set.add(1);
    set.add(3);
    System.out.println(set);
    ```
    - [ ] [5, 1, 3]  
    - [ ] [1, 3, 5]  
    - [x] [1, 3, 5] (sorted order)  
    - [ ] Compilation error  

2. **What happens if you try to add `null` to a TreeSet of integers?**  
    - [ ] It adds `null` successfully  
    - [ ] It replaces the first element with `null`  
    - [x] It throws a `NullPointerException`  
    - [ ] It ignores the `null` value  

3. **Which of the following code snippets will create a TreeSet with custom sorting?**  
    - [ ] `TreeSet<Integer> set = new TreeSet<>();`  
    - [x] `TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());`  
    - [ ] `TreeSet<Integer> set = new TreeSet<>(new HashSet<>());`  
    - [ ] `TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3));`  

4. **What will be the output of the following code?**  
    ```java
    TreeSet<String> set = new TreeSet<>();
    set.add("apple");
    set.add("banana");
    set.add("apple");
    System.out.println(set.size());
    ```
    - [ ] 3  
    - [ ] 0  
    - [x] 2  
    - [ ] 1  

5. **How can you retrieve the smallest element in a TreeSet?**  
    - [ ] `set.get(0);`  
    - [x] `set.first();`  
    - [ ] `set.peek();`  
    - [ ] `set.pollFirst();`  

6. **What will be the output of the following code?**  
    ```java
    TreeSet<Integer> set = new TreeSet<>();
    set.add(10);
    set.add(20);
    set.add(15);
    System.out.println(set.higher(15));
    ```
    - [ ] 10  
    - [ ] 15  
    - [x] 20  
    - [ ] null  

7. **Which method is used to get a subset of elements in a TreeSet?**  
    - [ ] `getSubset()`  
    - [x] `subSet()`  
    - [ ] `range()`  
    - [ ] `slice()`  

    ## Generics with TreeSet - Coding Problems

    ### 1. **Find Unique Elements in Sorted Order**

    **Explain what you have to do in the question:**  
    Write a program to read a list of integers and store them in a `TreeSet` to automatically sort and remove duplicates. Print the sorted unique elements.

    **Topic Name:**  
    TreeSet with Generics

    **Input format:**  
    - A list of integers separated by spaces.

    **Output format:**  
    - A sorted list of unique integers.

    **Example:**

    | Input 1:       | Output 1:      |
    | -------------- | -------------- |
    | `5 1 3 5 2 1`  | `1 2 3 5`      |
    | `10 20 10 30`  | `10 20 30`     |

    ```java
    import java.util.*;

    public class UniqueElements {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integers separated by spaces:");
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");
            
            TreeSet<Integer> set = new TreeSet<>();
            for (String num : numbers) {
                set.add(Integer.parseInt(num));
            }
            
            System.out.println("Sorted unique elements: " + set);
        }
    }
    ```

    ---

    ### 2. **Find the Range of Elements**

    **Explain what you have to do in the question:**  
    Write a program to find all elements in a `TreeSet` that fall within a given range `[low, high]`.

    **Topic Name:**  
    TreeSet with Generics

    **Input format:**  
    - A list of integers separated by spaces.  
    - Two integers `low` and `high` representing the range.

    **Output format:**  
    - A list of integers within the range `[low, high]`.

    **Example:**

    | Input 1:       | Output 1:      |
    | -------------- | -------------- |
    | `5 1 3 5 2 1`  | `2 3 5`        |
    | `10 20 10 30`  | `10 20`        |

    ```java
    import java.util.*;

    public class RangeElements {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integers separated by spaces:");
            String input = scanner.nextLine();
            System.out.println("Enter the range (low high):");
            int low = scanner.nextInt();
            int high = scanner.nextInt();
            
            TreeSet<Integer> set = new TreeSet<>();
            for (String num : input.split(" ")) {
                set.add(Integer.parseInt(num));
            }
            
            System.out.println("Elements in range [" + low + ", " + high + "]: " + set.subSet(low, true, high, true));
        }
    }
    ```

    ---

    ### 3. **Find the Closest Greater Element**

    **Explain what you have to do in the question:**  
    Write a program to find the smallest element in a `TreeSet` that is strictly greater than a given number.

    **Topic Name:**  
    TreeSet with Generics

    **Input format:**  
    - A list of integers separated by spaces.  
    - A single integer `x`.

    **Output format:**  
    - The smallest element greater than `x`, or `null` if no such element exists.

    **Example:**

    | Input 1:       | Output 1:      |
    | -------------- | -------------- |
    | `5 1 3 5 2 1`  | `3`            |
    | `10 20 10 30`  | `20`           |

    ```java
    import java.util.*;

    public class ClosestGreaterElement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integers separated by spaces:");
            String input = scanner.nextLine();
            System.out.println("Enter the number to find the closest greater element:");
            int x = scanner.nextInt();
            
            TreeSet<Integer> set = new TreeSet<>();
            for (String num : input.split(" ")) {
                set.add(Integer.parseInt(num));
            }
            
            Integer higher = set.higher(x);
            System.out.println("Closest greater element: " + (higher != null ? higher : "null"));
        }
    }
    ```


---  

