import java.util.Scanner;
import java.util.concurrent.*;

public class atcoder_ABC174_E {
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

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }
        int a = 1;
        int b = Integer.MIN_VALUE;
        for (int i : lis) {
            if (i > b) {
                b = i;
            }
        }
        int ans = b;
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        while (a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            Future<Integer> midFuture = executorService.submit(() -> calculateMid(b, a, variable_3_14));
            int mid = midFuture.get();
            if (check1 != 0 && check2 != 0) {
                if (funcCheck0(lis, k, mid)) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        executorService.shutdown();
        System.out.println(ans);
    }
}