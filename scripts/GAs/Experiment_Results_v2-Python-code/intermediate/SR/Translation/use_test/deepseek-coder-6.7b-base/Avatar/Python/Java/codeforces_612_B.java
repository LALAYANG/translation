```
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] numberArray = new int[1];
        Queue<Integer> queueMultiply0 = new LinkedBlockingQueue<>();
        Thread threadMultiply0 = new Thread(() -> {
            int multiplicationResult = multiply(numberArray, n);
            queueMultiply0.add(multiplicationResult);
        });
        threadMultiply0.start();
        threadMultiply0.join();
        int[] indexedArray = queueMultiply0.poll();
        for (int i = 0; i < n; i++) {
            indexedArray[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(indexedArray[i] - indexedArray[i - 1]);
        }
        System.out.println(res);
    }

    public static int[] multiply(int[] numberArray, int n) {
        return numberArray;
    }
}
```

