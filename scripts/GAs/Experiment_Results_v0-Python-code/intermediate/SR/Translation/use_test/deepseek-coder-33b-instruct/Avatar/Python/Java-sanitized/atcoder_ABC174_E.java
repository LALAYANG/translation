import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC174_E {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }
        int a = 1;
        int b = Arrays.stream(lis).max().getAsInt();
        int ans = b;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        BlockingQueue<Integer> midQueue = new LinkedBlockingQueue<>();
        while (a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            executor.execute(() -> {
                try {
                    midQueue.put(calculateMid(b, a, variable_3_14));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.MINUTES);
            int mid = midQueue.take();
            if ((check1 & check2) != 0) {
                if (funcCheck0(lis, k, mid)) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }

    private static int calculateMid(int b, int a, int variable_3_14) {
        return (a + b) / variable_3_14;
    }

    private static boolean funcCheck0(int[] lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= i / mid;
        }
        return k >= 0;
    }
}