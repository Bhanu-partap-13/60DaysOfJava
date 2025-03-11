
## 1. Maya's Two-Digit Digit Sum Checker

**Problem Statement:**  
Maya is given a two-digit number and needs to find the sum of its digits.  
The program should then print the sum along with a message indicating whether 
the sum is less than 10 or not. If the provided number is not a valid two-digit 
number, print "Not a valid two-digit number."

**Input format:**  
- A single integer n.

**Output format:**  
- If n is a two-digit number:
    if the sum is 10 or more.
- If n is not a valid two-digit number, print:



**Example:**

| Input | Output |
|-------|--------|
| 12    | Digit Sum: 3  
       The sum of the digits is less than 10. |
| 29    | Digit Sum: 11  
       The sum of the digits is not less than 10. |
| 55    | Digit Sum: 10  
       The sum of the digits is not less than 10. |
| 345   | Not a valid two-digit number. |

---

## 2. Ravi's Leap Year Checker

**Problem Statement:**  
Ravi needs to determine whether a given year is a leap year or not. A year is a 
leap year if it is divisible by 4 but not by 100, unless it is also divisible by 400.

**Input format:**  
- A single integer N representing the year (1990 ≤ N ≤ 2100).

**Output format:**  
- If N is a leap year, print:
- Otherwise, print:

**Example:**

| Input | Output               |
|-------|----------------------|
| 2000  | 2000 is a Leap Year  |
| 2023  | 2023 is not a Leap Year |

---

## 3. Arun's Student Pass/Fail Evaluator

**Problem Statement:**  
Arun needs a program that takes marks for five subjects and determines if the 
student has passed or failed based on the average score. The student passes if 
the average is 50 or above.

**Input format:**  
- Five space-separated integers representing the marks for five subjects.

**Output format:**  
- First line:  
- Second line:  
if the average is 50 or more, otherwise:


**Example:**

| Input             | Output                                  |
|-------------------|-----------------------------------------|
| 50 60 70 80 90    | Average score: 70  
                      The student has passed           |
| 39 25 30 45 67    | Average score: 41  
                      The student has failed           |

---

## 4. EstatePro Lease Calculator

**Problem Statement:**  
EstatePro is automating lease calculations and payment method suggestions. The 
program calculates the total lease cost based on monthly rent and lease duration.
Depending on the total cost, it suggests a payment method:
- ≤ 1000: Payment by cash or check.
- Between 1000 and 5000 (inclusive): Payment by credit card.
- > 5000: Payment by bank transfer.

**Input format:**  
- First integer: Monthly rent.
- Second integer: Lease duration (in months).

**Output format:**  
- First line: (distance formatted to one decimal place)
- Second line:


**Example:**

| Input      | Output                                                                 |
|------------|------------------------------------------------------------------------|
| 500 12     | Total Cost: 6000  
             Payment Method Suggestion: Payment by bank transfer is recommended. |
| 800 3      | Total Cost: 2400  
             Payment Method Suggestion: Payment by credit card is recommended.     |
| 150 5      | Total Cost: 750  
             Payment Method Suggestion: Payment by cash or check                   |

---

## 5. Alex's Point Proximity and Orientation Analyzer

**Problem Statement:**  
Alex needs a program to determine which of two points is closer to the origin 
(0, 0) and the orientation of the line segment connecting them. The orientation 
is defined as:
- Vertical: if the x-coordinates are the same.
- Horizontal: if the y-coordinates are the same.
- Oblique: if neither the x-coordinates nor the y-coordinates are the same.

**Input format:**  
- Four space-separated integers: x1 y1 x2 y2.

**Output format:**  
- First line:


**Example:**

| Input         | Output                                   |
|---------------|------------------------------------------|
| -2 0 6 0     | Closer Distance: 2.0  
                Orientation: Horizontal            |
| 3 4 0 0      | Closer Distance: 0.0  
                Orientation: Oblique               |
| 1 6 1 8      | Closer Distance: 6.1  
                Orientation: Vertical              |

---

## 6. Vishal is playing with numbers and wants to check if the second integer is exactly twice the first.

**Input format:**  
- Two integers separated by space.

**Output format:**  
- Prints `true` if the second number is twice the first, otherwise `false`.

**Example:**

| Input 1: | Output 1: |
|----------|-----------|
| 14 28    | true      |

| Input 2: | Output 2: |
|----------|-----------|
| 15 29    | false     |

| Input 3: | Output 3: |
|----------|-----------|
| 50 25    | false     |

---

## 7. Zara and Mike’s Savings Comparison

**Problem Statement:**  
Compare the savings of Zara and Mike, and calculate the result as follows:
- If Zara's savings is greater than Mike's, subtract Mike's savings from Zara's and multiply by 2.
- Otherwise, add their savings and multiply by 2.

**Input format:**  
- Two integers representing Zara's and Mike's savings.

**Output format:**  
- Prints the result in the format:  


**Example:**

| Input 1: | Output 1: |
|----------|-----------|
| 100 250  | Result of (100 > 250 ? 100 - 250 : 100 +250) * 2: 700 |

| Input 2: | Output 2: |
|----------|-----------|
| 20 15    | Result of (20 > 15 ? 20 - 15 : 20 +15) * 2: 10 |

---

## 8. John's BMI Calculator

**Problem Statement:**  
Calculate the Body Mass Index (BMI) using the provided weight and height, and 
determine if it falls within a healthy range (18.5 to 24.9).

**Input format:**  
- Two double values representing weight (in kg) and height (in meters).

**Output format:**  
- First line prints the BMI rounded to two decimal places:

- Second line prints either `"Healthy Range"` if BMI is within 18.5 and 24.9 
(inclusive) or `"Not in Healthy Range"` otherwise.

**Example:**

| Input 1:    | Output 1:       |
|-------------|-----------------|
| 65.8 1.75   | BMI: 21.49      |
|             | Healthy Range   |

| Input 2:    | Output 2:         |
|-------------|-------------------|
| 124.3 1.87  | BMI: 35.55        |
|             | Not in Healthy Range |

---

## 9. John's Exam Performance

**Problem Statement:**  
Based on three subject marks and a user choice, calculate and print either the 
average, the highest, or the lowest mark.

**Input format:**  
- Three integers representing the subject marks.
- One integer representing the choice (1 for Average, 2 for Highest, 3 for Lowest).

**Output format:**  
- If choice is 1:
- If choice is 2:
- If choice is 3:

**Example:**

| Input 1:   | Output 1:         |
|------------|-------------------|
| 62 77 57 1 | Average Marks: 65.33 |

| Input 2:   | Output 2:         |
|------------|-------------------|
| 98 95 92 2 | Highest Marks: 98.0  |

| Input 3:   | Output 3:         |
|------------|-------------------|
| 46 52 50 3 | Lowest Marks: 46.0   |

---

## 10. Sandeep's Credit Score Calculator

**Problem Statement:**  
Based on the user choice, calculate and print one of the following:
- **Credit Score:** Use the number of late payments to determine the score from the array `[800, 750, 700, 650, 600, 550]`.
- **Debt Score:**  
- If debt ratio ≤ 30: Good  
- If debt ratio ≤ 50: Average  
- Otherwise: Poor
- **Income Score:**  
- If income ≥ 50000: Good  
- If income > 30000: Average  
- Otherwise: Poor

**Input format:**  
- First integer: Choice (1 for Credit Score, 2 for Debt Score, 3 for Income Score).
- Second input: Integer (for late payments if choice is 1) or double (for debt ratio or income) depending on the choice.

**Output format:**  
- For choice 1:
- For choice 2:
- For choice 3:

**Example:**

| Input 1: | Output 1:         |
|----------|-------------------|
| 1 3      | Credit Score: 650 |

| Input 2: | Output 2:         |
|----------|-------------------|
| 2 44.5   | Debt Score: Average |

| Input 3: | Output 3:         |
|----------|-------------------|
| 3 130570 | Income Score: Good  |

================================================================================
*/

/* 
 ========================================
 CODE SECTION: All Problems in One File
 ========================================
*/

// 1. Maya's Two-Digit Digit Sum Checker
class DigitSumChecker {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int n = scanner.nextInt();
      if(n < 10 || n > 99) {
          System.out.println("Not a valid two-digit number.");
      } else {
          int tens = n / 10;
          int ones = n % 10;
          int sum = tens + ones;
          System.out.println("Digit Sum: " + sum);
          if(sum < 10) {
              System.out.println("The sum of the digits is less than 10.");
          } else {
              System.out.println("The sum of the digits is not less than 10.");
          }
      }
  }
}

---
// 2. Ravi's Leap Year Checker
class LeapYearChecker {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int year = scanner.nextInt();
      boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
      if(isLeap) {
          System.out.println(year + " is a Leap Year");
      } else {
          System.out.println(year + " is not a Leap Year");
      }
  }
}

---
// 3. Arun's Student Pass/Fail Evaluator
class StudentResult {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int m1 = scanner.nextInt();
      int m2 = scanner.nextInt();
      int m3 = scanner.nextInt();
      int m4 = scanner.nextInt();
      int m5 = scanner.nextInt();
      int sum = m1 + m2 + m3 + m4 + m5;
      int average = sum / 5;
      System.out.println("Average score: " + average);
      if(average >= 50) {
          System.out.println("The student has passed");
      } else {
          System.out.println("The student has failed");
      }
  }
}

---
// 4. EstatePro Lease Calculator
class LeaseCalculator {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int monthlyRent = scanner.nextInt();
      int leaseDuration = scanner.nextInt();
      int totalCost = monthlyRent * leaseDuration;
      System.out.println("Total Cost: " + totalCost);
      if(totalCost <= 1000) {
          System.out.println("Payment Method Suggestion: Payment by cash or check");
      } else if(totalCost <= 5000) {
          System.out.println("Payment Method Suggestion: Payment by credit card is recommended.");
      } else {
          System.out.println("Payment Method Suggestion: Payment by bank transfer is recommended.");
      }
  }
}

---
// 5. Alex's Point Proximity and Orientation Analyzer
class PointOrientation {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int x1 = scanner.nextInt();
      int y1 = scanner.nextInt();
      int x2 = scanner.nextInt();
      int y2 = scanner.nextInt();
      double d1 = Math.sqrt(x1 * x1 + y1 * y1);
      double d2 = Math.sqrt(x2 * x2 + y2 * y2);
      double closerDistance = Math.min(d1, d2);
      java.text.DecimalFormat df = new java.text.DecimalFormat("0.0");
      System.out.println("Closer Distance: " + df.format(closerDistance));
      String orientation;
      if(x1 == x2) {
          orientation = "Vertical";
      } else if(y1 == y2) {
          orientation = "Horizontal";
      } else {
          orientation = "Oblique";
      }
      System.out.println("Orientation: " + orientation);
  }
}

---
// 6. Vishal is playing with numbers and wants to check if the second integer is exactly twice the first.
class CheckDouble {
  public static void main(String[] args) {
      java.util.Scanner s = new java.util.Scanner(System.in);
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      System.out.println(n1 * 2 == n2);
  }
}

---
// 7. Zara and Mike’s Savings Comparison
class SavingsComparison {
  public static void main(String[] args) {
      java.util.Scanner s = new java.util.Scanner(System.in);
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      int result = (n1 > n2) ? (n1 - n2) * 2 : (n1 + n2) * 2;
      System.out.println("Result of (" + n1 + " > " + n2 + " ? " + n1 + " - " + n2 + " : " + n1 + " +" + n2 + ") * 2: " + result);
  }
}

---
// 8. John's BMI Calculator
class BMICalculator {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      double weight = scanner.nextDouble();
      double height = scanner.nextDouble();
      double bmi = weight / (height * height);
      System.out.printf("BMI: %.2f%n", bmi);
      System.out.println((bmi >= 18.5 && bmi <= 24.9) ? "Healthy Range" : "Not in Healthy Range");
  }
}

---

// 9. John's Exam Performance
class ExamResults {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int m1 = scanner.nextInt();
      int m2 = scanner.nextInt();
      int m3 = scanner.nextInt();
      int choice = scanner.nextInt();
      switch (choice) {
          case 1:
              double average = (m1 + m2 + m3) / 3.0;
              System.out.printf("Average Marks: %.2f%n", average);
              break;
          case 2:
              System.out.println("Highest Marks: " + Math.max(m1, Math.max(m2, m3)) + ".0");
              break;
          case 3:
              System.out.println("Lowest Marks: " + Math.min(m1, Math.min(m2, m3)) + ".0");
              break;
      }
  }
}

---

// 10. Sandeep's Credit Score Calculator
class CreditScoreCalculator {
  public static void main(String[] args) {
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      int choice = scanner.nextInt();
      switch (choice) {
          case 1:
              int latePayments = scanner.nextInt();
              int[] scores = {800, 750, 700, 650, 600, 550};
              System.out.println("Credit Score: " + scores[latePayments]);
              break;
          case 2:
              double debtRatio = scanner.nextDouble();
              if (debtRatio <= 30) {
                  System.out.println("Debt Score: Good");
              } else if (debtRatio <= 50) {
                  System.out.println("Debt Score: Average");
              } else {
                  System.out.println("Debt Score: Poor");
              }
              break;
          case 3:
              double income = scanner.nextDouble();
              if (income >= 50000) {
                  System.out.println("Income Score: Good");
              } else if (income > 30000) {
                  System.out.println("Income Score: Average");
              } else {
                  System.out.println("Income Score: Poor");
              }
              break;
      }
  }
}

---