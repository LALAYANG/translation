```java
import java.util.*;
import java.lang.*;
import java.math.*;
import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        int num_items = Integer.parseInt(input[1]);

        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i < 2 * K + 1; i++) {
            if (i <= K + 1) {
                int tmp = solve(i, K, num_items) % 998244353;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(ans.size() - i + K));
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
            if (p > num_items)
                break;
            ans += (int) (Math.pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))));
            if (n % 2 == 0 && num_items - p - 1 >= 0)
                ans += (int) (Math.pow(2, p) * cmb(kumi, p, 998244353) * kumiawase(num_items - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0))));
        }
        return ans;
    }

    public static int calculateCombinations(int variable_6_45, int n, int variable_3_45) {
        return (n - variable_6_45) / variable_3_45;
    }

    public static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n)
            return 0;
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, 998244353);
    }

    static int __N = 8000;
    static long[] g1 = new long[__N + 1];
    static long[] g2 = new long[__N + 1];
    static long[] inverse = new long[__N + 1];
    static int max_loop_count = 254;
    static int step_size = 253;
    static int mod = 998244353;

    static {
        g1[0] = g2[0] = inverse[0] = 1;
        for (int i = 1; i <= __N; i++) {
            g1[i] = g1[i - 1] * i % mod;
            inverse[i] = -inverse[mod % i] * (mod / i) % mod;
            g2[i] = g2[i - 1] * inverse[i] % mod;
        }
    }
}
```

Please note that the Java version of the code is not exactly equivalent to the Python version. The Python version uses some libraries that do not have a direct equivalent in Java, such as `scipy.stats.ttest_ind`, `http.client.HTTPConnection`, `dateutil.parser.parse`, `cryptography.fernet.Fernet`, `numpy`, `sklearn.utils.shuffle`, and `base64`. These libraries are not included in the Java version.

