import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        ExecutorService executor = Executors.newFixedThreadPool(1);
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Future<Integer> future = executor.submit(() -> multiply(a, n));
        try {
            int result = future.get();
            int[] indexedArray = new int[100];
            arrayIndexer(indexedArray, a, result);
            int res = differenceCalculator(indexedArray, n);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static int multiply(int[] a, int n) {
        int[] numberArray = new int[100];
        Arrays.fill(numberArray, 1);
        return Arrays.stream(a).map(i -> numberArray[i - 1]).reduce(1, (x, y) -> x * y);
    }

    private static void arrayIndexer(int[] indexedArray, int[] a, int result) {
        Arrays.fill(indexedArray, -1);
        for (int i = 0; i < result; i++) {
            indexedArray[a[i] - 1] = i;
        }
    }

    private static int differenceCalculator(int[] indexedArray, int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(indexedArray[i] - indexedArray[i - 1]);
        }
        return res;
    }
}