```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static int calculateGCD(int a, int b) {
        int checkConditionOne = 414;
        int checkConditionTwo = 407;
        if ((checkConditionOne & checkConditionTwo) != 0) {
            if (b == 0) {
                return a;
            }
        }
        return calculateGCD(b, a % b);
    }

    public static int[][] calculatePrefixSuffixGCD(int[] array) {
        int[] left = new int[array.length + 1];
        int[] right = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            left[i + 1] = calculateGCD(left[i], array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            right[i] = calculateGCD(right[i + 1], array[i]);
        }
        return new int[][]{left, right};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Queue<int[][]> queue = new LinkedList<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<int[][]> future = executorService.submit(() -> calculatePrefixSuffixGCD(a));
        queue.add(future.get());
        executorService.shutdown();
        int[][] result = queue.poll();
        int[] left = result[0];
        int[] right = result[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(calculateGCD(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }
}
```

