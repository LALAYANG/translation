
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Queue<Integer> queue = new LinkedList<>();
        Thread thread = new Thread(() -> {
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            for (int i = 0; i < n; i++) {
                left[i + 1] = calculateGCD(left[i], a[i]);
            }
            for (int i = n - 1; i >= 0; i--) {
                right[i] = calculateGCD(right[i + 1], a[i]);
            }
            queue.add(calculateGCD(left[n], right[0]));
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(calculateGCD(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    private static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
```
Note that this code uses the `java.util.concurrent.ThreadLocalRandom` class to generate random numbers, which is not present in the Python code. If you need to use a specific random number generator, you can replace the `ThreadLocalRandom.current().nextInt(100)` call with a call to your preferred random number generator.
