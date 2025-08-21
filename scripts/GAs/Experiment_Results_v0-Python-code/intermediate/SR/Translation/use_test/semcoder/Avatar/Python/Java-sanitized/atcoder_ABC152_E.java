import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        int variable3 = 7;
        int variable4 = 10;
        int exponent = 9;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread powerSumWorker = new Thread(() -> {
            int result = calculatePowerSum(variable3, variable4, exponent);
            resultQueue.add(result);
        });
        powerSumWorker.start();
        try {
            powerSumWorker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int powerSumResult = resultQueue.poll();
        int MOD = powerSumResult;

        // Input N and A (array) from console or any source
        int N = 5;
        int[] A = {12, 12, 12, 12, 12};

        long lcm = 1;
        for (int num : A) {
            lcm = lcm * num / gcd(lcm, num);
        }

        long ans = lcm * A.stream().mapToLong(s -> pow(s, MOD - 2, MOD)).sum() % MOD;
        System.out.println((int) (ans % MOD));
    }

    private static int calculatePowerSum(int variable3, int variable4, int exponent) {
        return (int) Math.pow(variable4, exponent) + variable3;
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 0) {
            return pow((base * base) % mod, exp / 2, mod);
        } else {
            return (base * pow(base, exp - 1, mod)) % mod;
        }
    }
}