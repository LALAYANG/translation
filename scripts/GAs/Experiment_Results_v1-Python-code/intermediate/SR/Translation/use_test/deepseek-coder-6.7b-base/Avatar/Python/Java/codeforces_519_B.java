```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
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
        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            Future<Integer> future = executor.submit(() -> calculateSum(i, x));
            try {
                x = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < n; i++) {
            y += b[i];
        }
        for (int i = 0; i < n; i++) {
            sumC += c[i];
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - sumC));
        executor.shutdown();
    }

    public static int calculateSum(int i, int x) {
        return x + i;
    }
}
```

