import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        long n = 1000000000;
        int k = 100;
        long mod = 1000000000 + 7;

        List<Long> coef = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            coef.add(n / i - n / (i + 1));
        }
        for (int i = 0; i < n - coef.stream().mapToLong(Long::longValue).sum(); i++) {
            coef.add(1L);
        }
        coef = coef.subList(0, coef.size());
        int nn = coef.size();

        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int reversedIndex = nn - 1; reversedIndex >= 0; reversedIndex--) {
                tmp += dp[i - 1][nn - 1 - reversedIndex];
                tmp %= mod;
                dp[i][reversedIndex] = coef.get(reversedIndex) * tmp;
                dp[i][reversedIndex] %= mod;
            }
        }

        long result = 0;
        for (int i = 0; i < nn; i++) {
            result += dp[k][i];
            result %= mod;
        }
        System.out.println(result);
    }
}