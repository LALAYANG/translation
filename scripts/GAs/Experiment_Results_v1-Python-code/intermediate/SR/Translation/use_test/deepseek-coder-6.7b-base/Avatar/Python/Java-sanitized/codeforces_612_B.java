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
        int[] b = new int[n];
        int factor = 0;
        Queue<Integer> queue = new LinkedList<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            int product = calculateProduct(n, factor);
            queue.add(product);
            return product;
        });
        try {
            future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        b = queue.poll();
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(res);
    }

    public static int calculateProduct(int n, int factor) {
        return factor * n;
    }
}