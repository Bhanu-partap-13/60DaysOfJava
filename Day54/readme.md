# Day 54: Mastering HashMaps in Java

Today, I explored the topic of HashMaps in Java. Below are some beginner-friendly multiple-choice questions (MCQs) and some code-based (COD) questions to help you master this topic.

---

## Beginner-Friendly Questions

1. **What is a HashMap in Java?**  
    - [ ] A collection that stores elements in a sorted order.  
    - [x] A collection that stores key-value pairs.  
    - [ ] A collection that allows duplicate keys.  
    - [ ] A collection that implements the List interface.  

2. **Which package contains the HashMap class?**  
    - [ ] java.io  
    - [x] java.util  
    - [ ] java.lang  
    - [ ] java.net  

3. **Can a HashMap have duplicate keys?**  
    - [ ] Yes, it allows duplicate keys.  
    - [x] No, keys must be unique.  
    - [ ] Only if the values are different.  
    - [ ] Only if the keys are of the same type.  

4. **What happens when you insert a duplicate key in a HashMap?**  
    - [ ] It throws an exception.  
    - [ ] It adds a new entry.  
    - [x] It replaces the old value with the new value.  
    - [ ] It ignores the new value.  

5. **What is the default initial capacity of a HashMap?**  
    - [ ] 4  
    - [ ] 8  
    - [x] 16  
    - [ ] 32  

6. **What is the time complexity of retrieving a value from a HashMap?**  
    - [x] O(1)  
    - [ ] O(n)  
    - [ ] O(log n)  
    - [ ] O(n^2)  

7. **Which method is used to check if a key exists in a HashMap?**  
    - [ ] containsValue()  
    - [x] containsKey()  
    - [ ] getKey()  
    - [ ] hasKey()  

---

## Code-Based Questions (COD)

1. **What will be the output of the following code?**  
    ```java
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "A");
    map.put(2, "B");
    map.put(1, "C");
    System.out.println(map.get(1));
    ```  
    - [ ] A  
    - [ ] B  
    - [x] C  
    - [ ] null  

2. **How can you iterate over a HashMap?**  
    - [x] Using a for-each loop with entrySet().  
    - [ ] Using a while loop with keySet().  
    - [ ] Using a do-while loop with values().  
    - [ ] Using a traditional for loop.  

3. **What will the following code print?**  
    ```java
    HashMap<String, Integer> map = new HashMap<>();
    map.put("X", 10);
    map.put("Y", 20);
    System.out.println(map.containsKey("Z"));
    ```  
    - [ ] 10  
    - [ ] 20  
    - [x] false  
    - [ ] true  

4. **What is the output of this code?**  
    ```java
    HashMap<String, Integer> map = new HashMap<>();
    map.put("A", 1);
    map.put("B", 2);
    map.remove("A");
    System.out.println(map.size());
    ```  
    - [ ] 1  
    - [x] 1  
    - [ ] 2  
    - [ ] 0  

5. **Which method is used to get all keys from a HashMap?**  
    - [x] keySet()  
    - [ ] values()  
    - [ ] entrySet()  
    - [ ] getKeys()  

6. **What will the following code output?**  
    ```java
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    System.out.println(map.get(3));
    ```  
    - [ ] One  
    - [ ] Two  
    - [ ] 3  
    - [x] null  

7. **What does the following code do?**  
    ```java
    HashMap<String, String> map = new HashMap<>();
    map.clear();
    ```  
    - [ ] Removes a specific key-value pair.  
    - [ ] Adds a new key-value pair.  
    - [x] Removes all key-value pairs.  
    - [ ] Does nothing.  

    ## Coding Problems on HashMaps

    ### 1. Count the Frequency of Elements

    **Explain what you have to do in the question:**  
    Write a program to count the frequency of each element in an array using a HashMap.

    **Topic Name:** Frequency Count Using HashMap

    **Input format:**  
    - An integer `n` representing the size of the array.  
    - An array of `n` integers.

    **Output format:**  
    - Each unique element of the array followed by its frequency.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 5        | 1 -> 2    |
    | 1 2 1 3 2| 2 -> 2    |
    |          | 3 -> 1    |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 4        | 4 -> 1    |
    | 4 4 4 4  | 4 -> 4    |

    **Solution in Java:**
    ```java
    import java.util.HashMap;
    import java.util.Scanner;

    public class FrequencyCounter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            for (int key : frequencyMap.keySet()) {
                System.out.println(key + " -> " + frequencyMap.get(key));
            }
            sc.close();
        }
    }
    ```

    ---

    ### 2. Find the First Non-Repeating Character in a String

    **Explain what you have to do in the question:**  
    Write a program to find the first non-repeating character in a string using a HashMap.

    **Topic Name:** First Non-Repeating Character

    **Input format:**  
    - A single string `s`.

    **Output format:**  
    - The first non-repeating character, or `-1` if all characters repeat.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | "swiss"  | w         |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | "aabb"   | -1        |

    **Solution in Java:**
    ```java
    import java.util.HashMap;

    public class FirstNonRepeating {
        public static void main(String[] args) {
            String s = "swiss";
            HashMap<Character, Integer> charCount = new HashMap<>();

            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            for (char c : s.toCharArray()) {
                if (charCount.get(c) == 1) {
                    System.out.println(c);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
    ```

    ---

    ### 3. Group Anagrams Together

    **Explain what you have to do in the question:**  
    Write a program to group anagrams from a list of strings using a HashMap.

    **Topic Name:** Group Anagrams

    **Input format:**  
    - An integer `n` representing the number of strings.  
    - An array of `n` strings.

    **Output format:**  
    - Groups of anagrams.

    **Example:**

    | Input 1: | Output 1: |
    | -------- | --------- |
    | 6        | [eat, tea, ate] |
    | eat tea tan ate nat bat | [tan, nat] |
    |          | [bat]          |

    | Input 2: | Output 2: |
    | -------- | --------- |
    | 3        | [abc, bca, cab] |
    | abc bca cab |             |

    **Solution in Java:**
    ```java
    import java.util.*;

    public class GroupAnagrams {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] strs = new String[n];
            for (int i = 0; i < n; i++) {
                strs[i] = sc.next();
            }

            HashMap<String, List<String>> anagramMap = new HashMap<>();
            for (String str : strs) {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String sorted = new String(charArray);

                anagramMap.putIfAbsent(sorted, new ArrayList<>());
                anagramMap.get(sorted).add(str);
            }

            for (List<String> group : anagramMap.values()) {
                System.out.println(group);
            }
            sc.close();
        }
    }
    ```


---

Practice these questions to solidify your understanding of HashMaps in Java!  