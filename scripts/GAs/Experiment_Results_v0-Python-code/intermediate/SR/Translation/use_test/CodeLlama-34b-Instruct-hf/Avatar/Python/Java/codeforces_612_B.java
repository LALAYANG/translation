```java
import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class CalculateProduct {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        int variable_1_10 = 0;
        Queue<Integer> calculationQueue = new Queue<>();

        Thread calculationThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculateProduct(variable_1_10, n);
                calculationQueue.add(result);
            }
        });
        calculationThread.start();
        calculationThread.join();
        int calculationResult = calculationQueue.remove();
        int[] resultArray = new int[n];

        recursiveArray(0, n, 1, resultArray);
        int res = 0;
        recursiveSum(1, n, 1, res);
        System.out.println(res);
    }

    private static int calculateProduct(int variable_1_10, int n) {
        return variable_1_10 * n;
    }

    private static void recursiveArray(int i, int stop, int step, int[] resultArray) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        resultArray[a[i] - 1] = i;
        recursiveArray(i + step, stop, step, resultArray);
    }

    private static void recursiveSum(int i, int stop, int step, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(resultArray[i] - resultArray[i - 1]);
        recursiveSum(i + step, stop, step, res);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `java.util.concurrent.Thread` and `java.util.concurrent.Queue` classes to implement the threading and queueing functionality. The `calculateProduct` method is a Java implementation of the `calculate_product` function in the Python code. The `recursiveArray` and `recursiveSum` methods are Java implementations of the `recursive_array` and `recursive_sum` functions in the Python code. The `main` method is the entry point of the program, and it takes the input from the user and prints the output.
