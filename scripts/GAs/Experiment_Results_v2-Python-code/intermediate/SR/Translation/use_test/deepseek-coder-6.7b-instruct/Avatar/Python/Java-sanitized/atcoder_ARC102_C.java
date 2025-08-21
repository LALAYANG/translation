import java.util.*;
import java.math.*;

public class atcoder_ARC102_C {
    static int K, N, mod = 998244353;
    static BigInteger[] g1, g2, inverse;

    static BigInteger combinations(int n, int num_combinations) {
        if (num_combinations < 0 || num_combinations > n) {
            return BigInteger.ZERO;
        }
        num_combinations = Math.min(num_combinations, n - num_combinations);
        return g1[n].multiply(g2[num_combinations]).multiply(g2[n - num_combinations]).mod(BigInteger.valueOf(mod));
    }

    static BigInteger distinct_combinations(int p, int q) {
        return combinations(p + q - 1, q - 1);
    }

    static BigInteger solve(int n) {
        assert n <= K + 1;
        BigInteger ans = BigInteger.ZERO;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            BigInteger tmp = BigInteger.valueOf(2).pow(p).multiply(combinations(kumi, p)).multiply(distinct_combinations(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))));
            ans = ans.add(tmp);
            if (n % 2 == 0 && N - p - 1 >= 0) {
                tmp = BigInteger.valueOf(2).pow(p).multiply(combinations(kumi, p)).multiply(distinct_combinations(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))));
                ans = ans.add(tmp);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        K = in.nextInt();
        N = in.nextInt();

        g1 = new BigInteger[8001];
        g2 = new BigInteger[8001];
        inverse = new BigInteger[8001];

        g1[0] = g1[1] = BigInteger.ONE;
        g2[0] = g2[1] = BigInteger.ONE;
        inverse[0] = BigInteger.ZERO;
        inverse[1] = BigInteger.ONE;

        for (int i = 2; i <= 8000; i++) {
            g1[i] = g1[i - 1].multiply(BigInteger.valueOf(i));
            inverse[i] = BigInteger.valueOf(-1).multiply(inverse[i % i]).multiply(BigInteger.valueOf(8000 / i));
            g2[i] = g2[i - 1].multiply(inverse[i]);
        }

        List<BigInteger> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            BigInteger tmp;
            if (i <= K + 1) {
                tmp = solve(i).mod(BigInteger.valueOf(mod));
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(ans.size() - i + K));
            }
        }
    }
}