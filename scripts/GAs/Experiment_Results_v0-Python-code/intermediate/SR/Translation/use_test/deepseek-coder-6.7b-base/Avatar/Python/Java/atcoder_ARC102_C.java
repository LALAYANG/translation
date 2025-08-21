```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int num_items = scanner.nextInt();
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                ans[i] = solve(i, K, num_items);
                System.out.println(ans[i]);
            } else {
                System.out.println(ans[2 * K + 1 - i]);
            }
        }
    }

    public static int solve(int n, int K, int num_items) {
        assert n <= K + 1;
        int ans = 0;
        int variable_3_45 = 2;
        int variable_6_45 = 1;
        int kumi = calculateCombinations(variable_6_45, n, variable_3_45);
        for (int p = 0; p <= kumi; p++) {
            if (p > num_items) {
                break;
            }
            ans += 2 * (int) Math.pow(p, 2) * cmb(kumi, p, 998244353) * kumiawase(num_items - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && num_items - p - 1 >= 0) {
                ans += 2 * (int) Math.pow(p, 2) * cmb(kumi, p, 998244353) * kumiawase(num_items - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans;
    }

    public static int calculateCombinations(int variable_6_45, int n, int variable_3_45) {
        return (n - variable_6_45) / variable_3_45;
    }

    public static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, 998244353);
    }

    public static int[] g1 = new int[8000];
    public static int[] g2 = new int[8000];
    public static int[] inverse = new int[8000];

    static {
        g1[0] = g1[1] = 1;
        g2[0] = g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i < 8000; i++) {
            g1[i] = (int) ((long) g1[i - 1] * i % 998244353);
            inverse[i] = -inverse[998244353 % i] * (998244353 / i) % 998244353;
            g2[i] = (int) ((long) g2[i - 1] * inverse[i] % 998244353);
        }
    }
}
```

