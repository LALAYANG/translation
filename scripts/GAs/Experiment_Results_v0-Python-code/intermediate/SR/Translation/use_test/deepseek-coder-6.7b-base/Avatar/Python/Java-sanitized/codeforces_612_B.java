import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] resultArray = new int[n];
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateProduct(1, n));
        int calculationResult = future.get();
        executor.shutdown();
        resultArray = calculationResult;
        recursiveArray(0, n, 1);
        int res = 0;
        recursiveSum(1, n, 1);
        System.out.println(res);
    }

    public static int calculateProduct(int variable_1_10, int n) {
        return variable_1_10 * n;
    }

    public static void recursiveArray(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        resultArray[a[i] - 1] = i;
        recursiveArray(i + step, stop, step);
    }

    public static void recursiveSum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(resultArray[i] - resultArray[i - 1]);
        recursiveSum(i + step, stop, step);
    }
}