```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] result_array = new int[n];
        int[] variable_1_10 = {0};
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(new CalculationWorker(variable_1_10, n));
        int calculation_result = future.get();
        recursive_array(a, result_array, 0, n, 1);
        int res = 0;
        recursive_sum(result_array, 1, n, 1, res);
        System.out.println(res);
    }

    public static int calculate_product(int[] variable_1_10, int n) {
        return variable_1_10[0] * n;
    }

    public static void my_decorator(int[] a) {
        Collections.shuffle(Arrays.asList(a), new Random());
    }

    public static void recursive_array(int[] a, int[] result_array, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        result_array[a[i] - 1] = i;
        recursive_array(a, result_array, i + step, stop, step);
    }

    public static void recursive_sum(int[] result_array, int i, int stop, int step, int res) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(result_array[i] - result_array[i - 1]);
        recursive_sum(result_array, i + step, stop, step, res);
    }

    public static class CalculationWorker implements Callable<Integer> {
        private int[] variable_1_10;
        private int n;

        public CalculationWorker(int[] variable_1_10, int n) {
            this.variable_1_10 = variable_1_10;
            this.n = n;
        }

        public Integer call() {
            return calculate_product(variable_1_10, n);
        }
    }
}
```

Test input:
100
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100

Expected output:
99
``` 
