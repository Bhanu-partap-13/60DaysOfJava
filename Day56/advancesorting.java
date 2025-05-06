import java.util.*;

class advancesorting {

  public static void radixSort(int[] arr) {
    int max = Arrays.stream(arr).max().getAsInt();

    for(int exp = 1; max/exp > 0; exp *= 10) {
      countSort(arr, exp);
    }
  }

  private static void countSort(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];

    Arrays.fill(count, 0);

    for(int i=0; i<n; i++) {
      count[(arr[i] / exp) % 10]++;
    }

    System.out.println("\nCount array for " + exp + " : " + Arrays.toString(count));

    for(int i=1; i<10; i++) {
      count[i] = count[i] + count[i-1];
    }

    System.out.println("Updated count array " + Arrays.toString(count));

    for(int i=n-1; i>=0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }

    System.out.println("Output array " + Arrays.toString(output));
    
    System.arraycopy(output, 0, arr, 0, n);
    
  }
  
  public static void main(String[] args) {
    int[] arr = {29, 83, 471, 36, 91, 8};

    System.out.println("Origin array: " + Arrays.toString(arr));
    radixSort(arr);
    System.out.println("Sorted array: " + Arrays.toString(arr));
  }
}

/*
 Let me explain you that code 
 import java.util.*; -> Imports Java’s utility classes, such as Arrays (used for array operations).
 class advancesorting{ }  -- > Defines a class called advancesorting.
  public static void radixSort(int arr[]) { } -> radixSort(int[] arr) — Main Sorting Method
    int max = Arrays.stream(arr).max().getAsInt(); // Find largest number
      for(int exp = 1; max/exp > 0; exp *= 10) { // llop through each position as we hanffor 1s,10s,100s
        countSort(arr, exp);  // Sorts the array based on the current digit (place value).
        int[] output = new int[n]; // Temp array to hold sorted elements.
        int[] count = new int[10]; // 0-9 digits (Hold frquency of the digits)
        Arrays.fill(count, 0);
        for(int i=0; i<n; i++) {
        count[(arr[i] / exp) % 10]++; // arr[i] = 471 and exp = 10, (471 / 10) % 10 = 7 → increment count[7].
    }
        for(int i=1; i<10; i++) {
        count[i] += count[i-1]; //Updates count to show actual positions in output array.
    }
        for(int i=n-1; i>=0; i--) { //Places items into output based on the digit’s count
        output[count[(arr[i] / exp) % 10] - 1] = arr[i];
        count[(arr[i] / exp) % 10]--;
    }
        System.arraycopy(output, 0, arr, 0, n); //Copies sorted values from output to arr.
        public static void main(String[] args) {
            int[] arr = {29, 83, 471, 36, 91, 8};
            System.out.println("Origin array: " + Arrays.toString(arr));
            radixSort(arr); //call
            System.out.println("Sorted array: " + Arrays.toString(arr));

    }
 */