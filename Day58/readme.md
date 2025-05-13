## Java Programming MCQs - Beginner Level

### Basic Questions

1. What is the entry point of a Java program?
- [x] `public static void main(String[] args)`
- [ ] `public void main()`
- [ ] `static void main()`
- [ ] `void main(String[] args)`

2. Which keyword is used to declare a constant in Java?
- [x] `final`
- [ ] `const`
- [ ] `static`
- [ ] `var`

3. What is the default value of an int variable?
- [x] 0
- [ ] null
- [ ] undefined
- [ ] 1

4. Which statement is true about Java?
- [x] Java is platform independent
- [ ] Java programs can only run on Windows
- [ ] Java is a purely functional programming language
- [ ] Java does not support object-oriented programming

5. Which data type is used to store decimal numbers in Java?
- [x] double
- [ ] int
- [ ] String
- [ ] char

6. What is the correct way to declare an array in Java?
- [x] `int[] numbers = new int[5];`
- [ ] `array numbers = new array(5);`
- [ ] `int numbers[] = array[5];`
- [ ] `int numbers = [5];`

7. Which access modifier makes a variable accessible only within its own class?
- [x] private
- [ ] public
- [ ] protected
- [ ] default

### Code-Based Questions

8. What will be the output of: `System.out.println(5 + 3 + "Hello");`?
- [x] `8Hello`
- [ ] `53Hello`
- [ ] `Hello53`
- [ ] Error

9. Given: `String str = null; System.out.println(str.length());`, what happens?
- [x] NullPointerException
- [ ] Prints 0
- [ ] Prints null
- [ ] Compilation Error

10. What is the value of x after: `int x = 5; x += 3 * 2;`?
- [x] 11
- [ ] 16
- [ ] 13
- [ ] 8

11. Which loop will execute at least once?
- [x] do-while loop
- [ ] while loop
- [ ] for loop
- [ ] for-each loop

12. What is the output of: `boolean a = true; boolean b = !a;`?
- [x] b is false
- [ ] b is true
- [ ] Compilation error
- [ ] Runtime error

13. In a switch statement, what keyword is used to exit the block?
- [x] break
- [ ] exit
- [ ] continue
- [ ] return

14. What happens when you divide an integer by zero?
- [x] ArithmeticException
- [ ] Returns 0
- [ ] Returns infinity
- [ ] Program crashes




### Code Implementation Questions

15. Write a program to implement Min Heap operations:
- [x] ```java
public void insert(int key) {
    if (size >= capacity) return;
    heap[size] = key;
    int current = size;
    while (current > 0 && heap[parent(current)] > heap[current]) {
        swap(current, parent(current));
        current = parent(current);
    }
    size++;
}
```
- [ ] ```java
public void insert(int key) {
    heap[size++] = key;
}
```
- [ ] ```java
public void insert(int key) {
    heap.add(key);
}
```
- [ ] ```java
public void push(int key) {
    heap[size] = key;
    size++;
}
```

16. Implement Huffman Coding compression:
- [x] ```java
class HuffmanNode {
    int data;
    char c;
    HuffmanNode left, right;
}
public HuffmanNode buildTree(int[] charFreq) {
    PriorityQueue<HuffmanNode> queue = new PriorityQueue<>();
    for(int i = 0; i < charFreq.length; i++) {
        if(charFreq[i] > 0) {
            queue.offer(createNode(charFreq[i], (char)i, null, null));
        }
    }
    while(queue.size() > 1) {
        HuffmanNode left = queue.poll();
        HuffmanNode right = queue.poll();
        queue.offer(createNode(left.data + right.data, '\0', left, right));
    }
    return queue.poll();
}
```
- [ ] ```java
public HuffmanNode buildTree(int[] freq) {
    return new HuffmanNode();
}
```
- [ ] ```java
public void compress(String text) {
    System.out.println(text.length());
}
```
- [ ] ```java
public String encode(String text) {
    return text;
}
```

17. Implement CRUD operations for a linked list:
- [x] ```java
public void create(int data) {
    Node newNode = new Node(data);
    if(head == null) {
        head = newNode;
        return;
    }
    Node temp = head;
    while(temp.next != null)
        temp = temp.next;
    temp.next = newNode;
}

public Node read(int position) {
    Node current = head;
    for(int i = 0; current != null && i < position; i++)
        current = current.next;
    return current;
}

public void update(int position, int data) {
    Node node = read(position);
    if(node != null)
        node.data = data;
}

public void delete(int position) {
    if(head == null) return;
    if(position == 0) {
        head = head.next;
        return;
    }
    Node prev = read(position - 1);
    if(prev != null && prev.next != null)
        prev.next = prev.next.next;
}
```
- [ ] ```java
public void addNode(int data) {
    nodes.add(data);
}
```
- [ ] ```java
public void removeNode(int data) {
    nodes.remove(data);
}
```
- [ ] ```java
public Node findNode(int data) {
    return null;
}
```