```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int sumC = 0;
        for (int i : arrayA) {
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            new Thread(() -> {
                int result = calculateSum(i, x);
                resultQueue.add(result);
            }).start();
            x = resultQueue.take();
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            sumC += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - sumC));
    }

    private static int calculateSum(int i, int x) {
        return x + i;
    }
}
```

Please note that the Java code does not include the statistical functions `ttest_ind` and `shuffle` from the Python code. These functions are not available in Java's standard library. If you need to use these functions, you may need to find a suitable library or implement them yourself.

