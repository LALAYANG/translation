```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    static int n;
    static int[] a;
    static int[] variable_1_10 = {0};
    static BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Thread calculationThread = new Thread(() -> {
            int result = calculateProduct(variable_1_10, n);
            try {
                calculationQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        calculationThread.join();
        int calculationResult = calculationQueue.poll();
        int[] resultArray = new int[calculationResult];

        recursiveArray(0, n, 1, resultArray);
        int res = 0;
        recursiveSum(1, n, 1, resultArray, res);
        System.out.println(res);
    }

    public static int calculateProduct(int[] variable_1_10, int n) {
        return variable_1_10[0] * n;
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

Please note that Java does not have a direct equivalent to Python's decorator. The decorator in the original Python code is used to wrap the recursive functions, but it does not affect the functionality of the code. Therefore, it is not included in the Java translation.

