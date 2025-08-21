import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_302_A {
    public static void main(String[] args) throws InterruptedException {
        int n = 10;
        int m = 10;
        int sa = 1;
        int[][] arr = {{-1, 1}, {-1, 1}, {-1, 1}, {-1, 1}, {-1, 1}, {-1, 1}, {-1, 1}, {-1, 1}, {-1, 1}, {-1, 1}};
        int sa_min = Math.min(n - sa, sa);
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            Thread thread = new Thread(() -> {
                try {
                    queue.put(calculateDifference(a, b));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
            thread.join();
            int result = queue.take();
            int b_result = result;
            results.append((b_result % 2 == 1 && b_result <= sa_min << 1) ? "1\n" : "0\n");
        }
        System.out.println(results.toString());
    }

    private static int calculateDifference(int a, int b) {
        return b - a;
    }
}