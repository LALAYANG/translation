import java.util.concurrent.*;
import java.util.Scanner;

public class codeforces_373_B {
    private static int calculateMidpoint(int lo, int variable_3_23, int hi) {
        return (lo + hi) / variable_3_23;
    }

    private static int funcSum0(int k) {
        int ret = 0;
        int powerOfTen = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(powerOfTen - 1, k);
            int prev = powerOfTen / 10;
            ret += (cur - prev + 1) * len;
            if (powerOfTen - 1 >= k) {
                break;
            }
            len = len + 1;
            powerOfTen *= 10;
        }
        return ret;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int lo = 0;
        int hi = (int)Math.pow(10, 18);
        while (hi - lo > 1) {
            int check1 = 809;
            int check2 = 867;
            int variable_3_23 = 2;
            ExecutorService executorService = Executors.newFixedThreadPool(1);
            Future<Integer> midpointFuture = executorService.submit(() -> calculateMidpoint(lo, variable_3_23, hi));
            int midpointResult = midpointFuture.get();
            int medianValue = midpointResult;
            int c = funcSum0(m + medianValue - 1) - funcSum0(m - 1);
            if ((check1 & check2) != 0) {
                if (c * k <= w) {
                    lo = medianValue;
                } else {
                    hi = medianValue;
                }
            }
            executorService.shutdown();
        }
        System.out.println(lo);
    }
}