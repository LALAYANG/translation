import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_612_B {
    static int[] numberArray = {0};
    static int[] indexedArray;
    static int res = 0;
    static int n;
    static int[] a;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, queue);
        executor.execute(Main::multiplyThread);
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        indexedArray = numberArray;
        arrayIndexer(0, n, 1);
        differenceCalculator(1, n, 1);
        System.out.println(res);
    }

    private static void multiplyThread() {
        int[] multiplicationResult = multiply(numberArray, n);
        numberArray = multiplicationResult;
    }

    private static int[] multiply(int[] numberArray, int n) {
        int[] result = new int[numberArray.length * n];
        for (int i = 0; i < numberArray.length; i++) {
            result[i] = numberArray[i] * n;
        }
        return result;
    }

    private static void arrayIndexer(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        indexedArray[a[i] - 1] = i;
        arrayIndexer(i + step, stop, step);
    }

    private static void differenceCalculator(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(indexedArray[i] - indexedArray[i - 1]);
        differenceCalculator(i + step, stop, step);
    }
}