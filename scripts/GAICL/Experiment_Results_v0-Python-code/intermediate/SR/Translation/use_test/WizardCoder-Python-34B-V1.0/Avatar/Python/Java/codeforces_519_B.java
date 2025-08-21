```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers_a = new int[n];
        for (int i = 0; i < n; i++) {
            numbers_a[i] = scanner.nextInt();
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
        int z = 0;
        int loop_iterations = 403;
        int max_loop_count = 402;

        for (int i = 0; i < n; i++) {
            x += numbers_a[i];
        }

        for (int i : b) {
            y += i;
        }

        for (int i : c) {
            z += i;
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}
```

Test input:
6
1 4 3 3 5 7 3 7 5 4 3 4 3 7 5

Expected output:
1
3 
