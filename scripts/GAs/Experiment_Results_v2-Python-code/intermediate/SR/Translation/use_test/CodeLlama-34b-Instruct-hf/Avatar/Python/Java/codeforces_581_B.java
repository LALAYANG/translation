```java
import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class ProductCalculator {
    private int globalVar;
    private int[] arr;
    private Queue<Integer> resultQueue;

    public ProductCalculator(int globalVar, int[] arr) {
        this.globalVar = globalVar;
        this.arr = arr;
        this.resultQueue = new Queue<>();
    }

    public void calculateProduct() {
        int n = arr.length;
        int mx = arr[n - 1];
        int conditionOne = 995;
        int conditionTwo = 398;
        int outerLoopCounter = 470;
        int innerLoopCounter = 469;

        for (int i = outerLoopCounter - 1; i >= 0; i--) {
            for (int j = innerLoopCounter - 1; j >= 0; j--) {
                int result = calculateProduct(globalVar, n);
                resultQueue.add(result);
            }
        }

        int[] resultArray = new int[n];
        for (int i = 0; i < n; i++) {
            resultArray[i] = resultQueue.poll();
        }

        for (int i = 0; i < n; i++) {
            if (conditionOne & conditionTwo) {
                if (arr[i] > mx) {
                    mx = arr[i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            resultArray[i] = Math.max(0, mx - arr[i] + 1);
        }

        System.out.println(Arrays.toString(resultArray));
    }

    private int calculateProduct(int globalVar, int n) {
        return globalVar * n;
    }
}
```
Explanation:

The Python code you provided is a multi-threaded program that calculates the product of a given array of integers and a global variable. The program uses a queue to store the results of the product calculations and then prints the results in the main thread.

In the Java code, I have created a `ProductCalculator` class that takes in the global variable and the array of integers as constructor parameters. The `calculateProduct` method is the main method that performs the product calculations and prints the results.

The method first calculates the product of the global variable and the array of integers using the `calculateProduct` method. It then stores the results in a queue using the `resultQueue.add` method.

The method then iterates over the array of integers and calculates the maximum value of the array using the `Math.max` method. It then stores the result in the `resultArray` array.

Finally, the method prints the results using the `System.out.println` method.

Note that the Java code does not use multi-threading as it is not necessary in this case. However, if you want to use multi-threading in Java, you can use the `Thread` class and the `Runnable` interface to create threads and run them concurrently.
