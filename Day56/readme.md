# Day 56: Radix Sort MCQs 🎯

## Beginner Level Questions

### 1. What is Radix Sort?
- [x] A non-comparative integer sorting algorithm
- [ ] A comparison-based sorting algorithm
- [ ] A sorting algorithm that only works on strings
- [ ] A random shuffling algorithm

### 2. What is the time complexity of Radix Sort?
- [x] O(d * (n + k)) where d is the number of digits, n is the number of elements, and k is the range
- [ ] O(n log n)
- [ ] O(n²)
- [ ] O(1)

### 3. What type of sort is Radix Sort?
- [ ] In-place sort
- [x] Not-in-place sort
- [ ] Hybrid sort
- [ ] Quick sort variant

### 4. Which sorting algorithm is used as a subroutine in Radix Sort?
- [x] Counting Sort
- [ ] Bubble Sort
- [ ] Quick Sort
- [ ] Merge Sort

### 5. What is the main advantage of Radix Sort?
- [x] It can sort numbers in linear time
- [ ] It requires less memory
- [ ] It's always faster than Quick Sort
- [ ] It can sort any data type

### 6. Which of these is a requirement for Radix Sort?
- [x] Numbers must have same number of digits
- [ ] Numbers must be positive only
- [ ] Array must be partially sorted
- [ ] Array must have even length

### 7. In which order does Radix Sort process digits?
- [x] Least significant digit to most significant digit
- [ ] Most significant digit to least significant digit
- [ ] Random digit order
- [ ] Middle digits first

## Code-Based Questions

### 8. What will be the first pass result for array [170, 45, 75, 90, 802]?
- [x] [170, 90, 802, 45, 75]
- [ ] [45, 75, 90, 170, 802]
- [ ] [802, 170, 90, 75, 45]
- [ ] [75, 45, 90, 170, 802]

### 9. Which method is used to find the largest number in array for Radix Sort?
```java
static int getMax(int arr[], int n)
```
- [x] A linear search through array
- [ ] Binary search
- [ ] Recursive search
- [ ] No search needed

### 10. What is the purpose of this line in Radix Sort?
```java
count[(arr[i] / exp) % 10]++
```
- [x] Counting occurrences of each digit
- [ ] Sorting the array
- [ ] Finding maximum element
- [ ] Creating output array

### 11. How many counting arrays are needed for Radix Sort?
- [x] One array of size 10 (for digits 0-9)
- [ ] Multiple arrays for each digit
- [ ] Equal to array length
- [ ] Two arrays always

### 12. Which data structure is essential for Radix Sort implementation?
- [x] Arrays
- [ ] Linked List
- [ ] Tree
- [ ] Stack

### 13. What happens if negative numbers are given to basic Radix Sort?
- [x] It fails to sort correctly
- [ ] It sorts them normally
- [ ] It ignores negative numbers
- [ ] It converts them to positive

### 14. How to determine number of digits in largest number for Radix Sort?
```java
int d = (int)Math.log10(max) + 1;
```
- [x] Using logarithm with base 10
- [ ] Using string length
- [ ] Using division method
- [ ] Using binary conversion

## Coding Problems  

### Problem 1: Sort Array Using Radix Sort
Implement Radix Sort to sort an array of positive integers in ascending order.

**Input format:**
- First line: Integer n (size of array)
- Second line: n space-separated integers

**Output format:**
- n space-separated sorted integers

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 5 | 45 75 90 170 802 |
| 170 45 75 90 802 | |

| Input 2: | Output 2: |
| -------- | --------- |
| 4 | 12 34 67 89 |
| 67 34 89 12 | |

### Problem 2: Sort Numbers by Last Digit
Sort numbers based on their last digit using Radix Sort principle.

**Input format:**
- First line: Integer n (size of array)
- Second line: n space-separated integers

**Output format:**
- Numbers sorted by last digit

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 4 | 440 121 352 893 |
| 121 440 893 352 | |

| Input 2: | Output 2: |
| -------- | --------- |
| 3 | 120 451 302 |
| 451 302 120 | |

### Problem 3: Find Duplicates After Sorting
Use Radix Sort to sort array and then find duplicate elements.

**Input format:**
- First line: Integer n (size of array)
- Second line: n space-separated integers

**Output format:**
- Space-separated duplicate numbers

**Example:**

| Input 1: | Output 1: |
| -------- | --------- |
| 6 | 23 45 |
| 23 45 23 67 45 89 | |

| Input 2: | Output 2: |
| -------- | --------- |
| 5 | 11 |
| 11 22 11 33 44 | |
---
*Note: Questions are designed to help understand Radix Sort conceptually and practically.*