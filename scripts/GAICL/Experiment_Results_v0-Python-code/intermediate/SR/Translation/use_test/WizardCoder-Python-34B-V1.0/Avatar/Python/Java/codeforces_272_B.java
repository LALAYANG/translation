```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] sequence = new int[n + m];
        for (int i = 0; i < n + m; i++) {
            sequence[i] = scanner.nextInt();
        }
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int condition_flag1 = 181;
        int condition_flag2 = 797;
        int outer_loop_limit = 560;
        int outer_loop_step = 559;
        int[] storage = new int[outer_loop_limit];
        int[] unique_function_values = new int[outer_loop_limit];
        int count = 0;
        for (int i = 0; i < outer_loop_limit; i++) {
            for (int j = 0; j < sequence.length; j++) {
                int value = sequence[j];
                int y = f(value);
                if ((condition_flag1 & condition_flag2) != 0) {
                    if (storage[y] == 0) {
                        storage[y] = value;
                        unique_function_values[count] = y;
                        count++;
                    } else {
                        storage[y] += value;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += unique_function_values[i] * unique_function_values[i];
        }
        return (sum - count) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2 != 0) {
                y++;
            }
            n /= 2;
        }
        return y;
    }
}
```

Test input:
2
7 1

Expected output:
0 
