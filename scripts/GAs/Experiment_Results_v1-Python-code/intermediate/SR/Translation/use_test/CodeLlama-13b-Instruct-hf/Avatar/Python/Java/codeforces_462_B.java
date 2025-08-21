
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CalculateProduct {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String inputString = args[2];
        int multiplicand = 26;
        int multiplier = 1;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateProduct(multiplicand, multiplier);
            resultQueue.put(result);
        });

        calculationThread.start();
        calculationThread.join();

        int productResult = resultQueue.get();
        int[] count = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i) - 'A']++;
        }
        count.sort(Integer::compare);
        int res = 0;

        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                break;
            }
            k -= count[i];
            res += count[i] * count[i];
        }

        System.out.println(res);
    }

    private static int calculateProduct(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to create a thread that calculates the product, and the `java.util.concurrent.BlockingQueue` class to store the result of the calculation. The `java.util.concurrent.LinkedBlockingQueue` class is used to create a blocking queue that can be used to store the result of the calculation.

Also, the Java code uses the `java.lang.Integer` class to parse the command-line arguments and to perform arithmetic operations.

The `main` method of the `CalculateProduct` class takes three command-line arguments: `n`, `k`, and `inputString`. It then calculates the product of `multiplicand` and `multiplier`, and stores the result in a blocking queue.

The `calculateProduct` method is a helper method that calculates the product of two integers.

The `main` method then calculates the count of each letter in the input string, and sorts the count array in descending order. It then calculates the sum of the squares of the count array, and prints the result.

The Java code is similar to the Python code, but it uses Java's concurrency features to create a thread that calculates the product, and it uses Java's standard library classes to perform arithmetic operations and to store the result of the calculation.
