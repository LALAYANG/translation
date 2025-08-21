import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int[] resultArray;
    static int res = 0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        resultArray = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateProduct(n));
        recursiveArray(a, n, 1);
        recursiveSum(a, n, 1);
        System.out.println(res);
        executorService.shutdown();
    }

    static int calculateProduct(int n) {
        int[] variable_1_10 = new int[1];
        return variable_1_10[0] * n;
    }

    static void recursiveArray(int[] a, int n, int step) {
        if (step == 0 || (step > 0 && n >= a.length) || (step < 0 && n <= a.length)) {
            return;
        }
        resultArray[a[n] - 1] = n;
        recursiveArray(a, n + step, step);
    }

    static void recursiveSum(int[] a, int n, int step) {
        if (step == 0 || (step > 0 && n >= a.length) || (step < 0 && n <= a.length)) {
            return;
        }
        res += Math.abs(resultArray[n] - resultArray[n - 1]);
        recursiveSum(a, n + step, step);
    }
}