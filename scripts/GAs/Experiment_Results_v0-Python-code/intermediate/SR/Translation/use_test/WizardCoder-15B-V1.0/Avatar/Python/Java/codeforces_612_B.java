```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] variable_1_10 = {0};
        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Runnable worker = () -> {
            int result = calculateProduct(variable_1_10, n);
            queue.offer(result);
        };
        executor.execute(worker);
        try {
            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculationResult = queue.poll();
        int[] resultArray = new int[n];
        Arrays.fill(resultArray, -1);
        recursiveArray(0, n, 1, resultArray);
        int res = 0;
        recursiveSum(1, n, 1, resultArray, res);
        System.out.println(res);
    }

    private static int calculateProduct(int[] variable_1_10, int n) {
        return variable_1_10[0] * n;
    }

    private static void recursiveArray(int i, int stop, int step, int[] resultArray) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        resultArray[a[i] - 1] = i;
        recursiveArray(i + step, stop, step, resultArray);
    }

    private static void recursiveSum(int i, int stop, int step, int[] resultArray, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(resultArray[i] - resultArray[i - 1]);
        recursiveSum(i + step, stop, step, resultArray, res);
    }
}
```
