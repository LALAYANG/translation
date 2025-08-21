import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }
        editorial(N, P);
    }

    private static void editorial(int N, int[] P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] base = new int[1];
        int offset = 1;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateValue(base, N, offset);
            resultQueue.put(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculatedResult = resultQueue.take();
        int[] a = new int[calculatedResult];
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int tmp = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp += 1;
                maxLen = Math.max(maxLen, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    private static int calculateValue(int[] base, int N, int offset) {
        return base[0] * (N + offset);
    }
}