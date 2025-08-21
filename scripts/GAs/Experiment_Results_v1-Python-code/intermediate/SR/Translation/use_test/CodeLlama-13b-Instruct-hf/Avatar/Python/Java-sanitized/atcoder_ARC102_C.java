import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        int K = 1;
        int N = 1;
        int mod = 998244353;
        int __N = 8000;
        int[] g1 = new int[__N + 1];
        int[] g2 = new int[__N + 1];
        int[] inverse = new int[__N + 1];
        for (int i = 0; i < __N + 1; i++) {
            g1[i] = 1;
            g2[i] = 1;
            inverse[i] = 0;
        }
        for (int i = 2; i < __N + 1; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i) % mod);
            g2[i] = (g2[i - 1] * inverse[i - 1]) % mod;
        }

        BlockingQueue<Integer> remainderDivQueue = new LinkedBlockingQueue<>();
        Thread remainderDivThread = new Thread(() -> {
            int result = remainderDivision(1, 2, N);
            remainderDivQueue.put(result);
        });
        remainderDivThread.start();
        remainderDivThread.join();
        int remainderDivResult = remainderDivQueue.get();
        int kumi = remainderDivResult;
        for (int p = 0; p < kumi + 1; p++) {
            if (p > N) {
                break;
            }
            int ans = 2 ** p * combinationCalculation(kumi, p, mod) * anotherCombinationCalc(N - p, p + (K - kumi * 2 - int(N % 2 == 0)));
            if (N % 2 == 0 && N - p - 1 >= 0) {
                ans += 2 ** p * combinationCalculation(kumi, p, mod) * anotherCombinationCalc(N - p - 1, p + (K - kumi * 2 - int(N % 2 == 0)));
            }
        }
        System.out.println(ans);
    }

    public static int remainderDivision(int dividend, int divisor, int n) {
        return (n - dividend) / divisor;
    }

    public static int combinationCalculation(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int anotherCombinationCalc(int p, int q) {
        return combinationCalculation(p + q - 1, q - 1, mod);
    }
}