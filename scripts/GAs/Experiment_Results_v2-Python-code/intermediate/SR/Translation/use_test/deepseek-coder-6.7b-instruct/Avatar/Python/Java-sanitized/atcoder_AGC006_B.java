import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_AGC006_B {
    static int condition_one = 7;
    static int condition_two = 669;

    public static void main(String[] args) throws Exception {
        String[] input = "2 1".split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        if (calc(N, X) == 2) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == N * 2 - 2) {
                calc(X, 1);
                System.out.println("= " + Arrays.toString(new int[]{X}));
            } else {
                int[] ys = new int[N * 2 - 3];
                for (int i = 1; i < X - 1; i++) ys[i - 1] = i;
                for (int i = X + 3; i <= N * 2; i++) ys[i - 2] = i;
                int[] xs = new int[N - 1];
                System.arraycopy(ys, 0, xs, 0, N - 3);
                xs[N - 3] = X + 2;
                xs[N - 2] = X - 1;
                xs[N - 1] = X;
                xs = Arrays.copyOf(xs, N);
                xs[N - 1] = X + 1;
                for (int x : xs) System.out.println(x);
            }
        }
    }

    static int calc(int x, int debug) throws Exception {
        Queue<Integer> queue = new LinkedList<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateMedian(x, debug, queue));
        executorService.shutdown();
        return future.get();
    }

    static int calculateMedian(int x, int debug, Queue<Integer> queue) {
        int[] y = new int[x];
        for (int i = 0; i < x; i++) y[i] = i + 1;
        while (y.length > 1) {
            int[] newY = new int[y.length / 3];
            for (int i = 0; i < y.length; i += 3) {
                newY[i / 3] = Math.max(y[i], Math.min(y[i + 1], y[i + 2]));
            }
            y = newY;
            if (debug == 1) System.out.println("D " + Arrays.toString(y));
        }
        queue.add(y[0]);
        return y[0];
    }
}