import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));
        executor.execute(() -> queue.add(sc.nextLine()));
        executor.shutdown();
        String input = queue.poll();
        String[] tokens = input.split(" ");
        int arrayLength = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);
        int Q = Integer.parseInt(tokens[2]);
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = Integer.parseInt(tokens[4 * i + 4]);
            b[i] = Integer.parseInt(tokens[4 * i + 5]);
            c[i] = Integer.parseInt(tokens[4 * i + 6]);
            d[i] = Integer.parseInt(tokens[4 * i + 7]);
        }
        solve(arrayLength, M, Q, a, b, c, d);
    }

    private static void solve(int arrayLength, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        // Implement the solution here
    }
}