import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int factor = 0;
    static int[] b;
    static int res = 0;

    static int calculateProduct(int n) {
        return factor * n;
    }

    static void recursiveLoopOne(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
    }

    static void recursiveLoopTwo(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateProduct(n));
        b = new int[future.get()];

        recursiveLoopOne(a, n);
        recursiveLoopTwo(a, n);
        System.out.println(res);

        executorService.shutdown();
    }
}