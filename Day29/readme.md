## 1️⃣ **Check If the Second Integer is Twice the First**  

    **Vishal is playing with numbers and wants to check if the second integer is exactly twice the first.**  

    **Input format:**  
    - Two integers separated by space.  

    **Output format:**  
    - Prints `true` if the second number is twice the first, otherwise `false`.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 14 28 | true |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 15 29 | false |

    | Input 3: | Output 3: |
    |----------|-----------|
    | 50 25 | false |

    ```java
    import java.util.Scanner;

    public class CheckDouble {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            System.out.println(n1 * 2 == n2);
        }
    }
    ```

---

## 2️⃣ **Zara and Mike’s Savings Comparison**  

    **Compare savings and compute result based on the difference or sum.**  

    **Input format:**  
    - Two integers `a` and `b`, representing Zara's and Mike's savings.  

    **Output format:**  
    - Prints the calculated result based on comparison and operator precedence.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 100 250 | Result of (100 > 250 ? 100 - 250 : 100 +250) * 2: 700 |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 20 15 | Result of (20 > 15 ? 20 - 15 : 20 +15) * 2: 10 |

    ```java
    import java.util.Scanner;

    public class SavingsComparison {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int result = (n1 > n2) ? (n1 - n2) * 2 : (n1 + n2) * 2;  
            System.out.println("Result of ("+n1+" > " +n2+" ? "+n1+" - "+n2+" : "+n1+" +"+n2+") * 2: "+result);
        }
    }
    ```

---

## 3️⃣ **John's BMI Calculator**  

    **Calculate BMI and determine if it's within a healthy range.**  

    **Input format:**  
    - Two double values representing weight (kg) and height (m).  

    **Output format:**  
    - Prints `BMI: X` rounded to two decimal places.  
    - Prints `"Healthy Range"` or `"Not in Healthy Range"`.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 65.8 1.75 | BMI: 21.49 |
    |          | Healthy Range |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 124.3 1.87 | BMI: 35.55 |
    |          | Not in Healthy Range |

    ```java
    import java.util.Scanner;

    public class BMICalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double weight = scanner.nextDouble();
            double height = scanner.nextDouble();
            
            double bmi = weight / (height * height);
            System.out.printf("BMI: %.2f%n", bmi);
            System.out.println((bmi >= 18.5 && bmi <= 24.9) ? "Healthy Range" : "Not in Healthy Range");
        }
    }
    ```

---

## 4️⃣ **John's Exam Performance**  

    **Calculate average, highest, or lowest marks based on user choice.**  

    **Input format:**  
    - Three integers representing subject marks.  
    - One integer (1 for Average, 2 for Highest, 3 for Lowest).  

    **Output format:**  
    - Prints `"Average Marks: X"`, `"Highest Marks: X"`, or `"Lowest Marks: X"` based on user choice.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 62 77 57 1 | Average Marks: 65.33 |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 98 95 92 2 | Highest Marks: 98.0 |

    | Input 3: | Output 3: |
    |----------|-----------|
    | 46 52 50 3 | Lowest Marks: 46.0 |

    ```java
    import java.util.Scanner;

    public class ExamResults {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
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
    ```

---

## 5️⃣ **Sandeep's Credit Score Calculator**  

    **Compute Credit Score, Debt Score, or Income Score based on user choice.**  

    **Input format:**  
    - One integer (1 for Credit Score, 2 for Debt Score, 3 for Income Score).  
    - One integer or double value depending on choice.  

    **Output format:**  
    - Prints the respective score based on user input.  

    **Example:**  

    | Input 1: | Output 1: |
    |----------|-----------|
    | 1 3 | Credit Score: 650 |

    | Input 2: | Output 2: |
    |----------|-----------|
    | 2 44.5 | Debt Score: Average |

    | Input 3: | Output 3: |
    |----------|-----------|
    | 3 130570 | Income Score: Good |

    ```java
    import java.util.Scanner;

    public class CreditScoreCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
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
    ```

---

## 📜 License  
This repository is open-source and available for learning and practice. 🚀  
