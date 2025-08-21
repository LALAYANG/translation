
The provided Python code is a bit complex and contains several concepts that are not commonly used in Java programming. However, I can provide a basic outline of how the code could be translated to Java.

First, we need to import the necessary libraries:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
```
Next, we need to define the `calculateMedian` method, which is the main method that calculates the median of a given array. This method takes an array of integers as input and returns the median value.
```java
public static int calculateMedian(int[] arr) {
    // Sort the array
    Arrays.sort(arr);

    // Calculate the median
    int median = arr[arr.length / 2];

    // Return the median value
    return median;
}
```
Next, we need to define the `recursiveMedian` method, which is a recursive method that calculates the median of a given array using a recursive approach. This method takes an array of integers as input and returns the median value.
```java
public static int recursiveMedian(int[] arr) {
    // Base case: If the array has only one element, return that element
    if (arr.length == 1) {
        return arr[0];
    }

    // Recursive case: If the array has more than one element, calculate the median of the first half of the array
    int median = recursiveMedian(Arrays.copyOfRange(arr, 0, arr.length / 2));

    // Return the median value
    return median;
}
```
Next, we need to define the `subThread` method, which is a method that calculates the median of a given array using a sub-thread approach. This method takes an array of integers as input and returns the median value.
```java
public static int subThread(int[] arr) {
    // Create a new thread
    Thread thread = new Thread(() -> {
        // Calculate the median of the array
        int median = calculateMedian(arr);

        // Return the median value
        return median;
    });

    // Start the thread
    thread.start();

    // Wait for the thread to finish
    thread.join();

    // Return the median value
    return thread.get();
}
```
Finally, we need to define the `main` method, which is the entry point of the program. This method takes two command-line arguments: `N` and `X`. It then calculates the median of the array and prints the result.
```java
public static void main(String[] args) {
    // Parse the command-line arguments
    int N = Integer.parseInt(args[0]);
    int X = Integer.parseInt(args[1]);

    // Create an array of integers
    int[] arr = new int[N];

    // Fill the array with random integers
    for (int i = 0; i < N; i++) {
        arr[i] = ThreadLocalRandom.current().nextInt(1, N * 2);
    }

    // Calculate the median of the array
    int median = calculateMedian(arr);

    // Print the result
    System.out.println("Median: " + median);
}
```
Note that this is just a basic outline of how the code could be translated to Java, and it may not be the most efficient or idiomatic way to write the code in Java.
