import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(args[i + 1]) * N + i;
        }
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int element = A[i];
            int variable_3_9 = 2;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            new Thread(() -> {
                resultQueue.add(calculateRemainder(element, N, variable_3_9));
            }).start();
            try {
                int remainder = resultQueue.take();
                if (remainder % 2 != i % 2) {
                    cnt++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(cnt / 2);
    }

    public static int calculateRemainder(int element, int N, int variable_3_9) {
        return element % N % variable_3_9;
    }
}