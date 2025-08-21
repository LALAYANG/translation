Here is the Java translation of the Python code:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    static int n;
    static int[] a;
    static int[] variable_1_10;
    static BlockingQueue<int[]> calculationQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        variable_1_10 = new int[1];

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        executor.execute(() -> {
            int[] result = calculateProduct(variable_1_10, n);
            try {
                calculationQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);

        int[] calculationResult = calculationQueue.poll();
        int[] resultArray = calculationResult;

        recursiveArray(0, n, 1, resultArray);

        int res = 0;
        recursiveSum(1, n, 1, resultArray, res);
        System.out.println(res);
    }

    public static int[] calculateProduct(int[] variable_1_10, int n) {
        return Arrays.stream(variable_1_10).map(operand -> operand * n).toArray();
    }

    public static void recursiveArray(int i, int stop, int step, int[] resultArray) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        resultArray[a[i] - 1] = i;
        recursiveArray(i + step, stop, step, resultArray);
    }

    public static void recursiveSum(int i, int stop, int step, int[] resultArray, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(resultArray[i] - resultArray[i - 1]);
        recursiveSum(i + step, stop, step, resultArray, res);
    }
}
```

Please note that Java does not have a direct equivalent to Python's threading library. Therefore, I used Java's `ThreadPoolExecutor` to achieve similar functionality. Also, Java does not have a direct equivalent to Python's decorator. Therefore, I removed the decorator from the code.

