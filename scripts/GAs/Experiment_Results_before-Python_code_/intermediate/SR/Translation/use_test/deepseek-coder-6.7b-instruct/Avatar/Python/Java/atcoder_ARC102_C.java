Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int K, N;
    static long mod = 998244353;
    static int __N = 8000;
    static long[] g1 = new long[__N + 1];
    static long[] g2 = new long[__N + 1];
    static long[] inverse = new long[__N + 1];

    static void init() {
        g1[0] = g2[0] = inverse[0] = 1;
        for (int i = 1; i <= __N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[(int) (mod % i)] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }
    }

    static long cmb(int n, int r, long mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] % mod * g2[n - r] % mod;
    }

    static long kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }

    static long solve(int n) {
        assert n <= K + 1;
        long ans = 0;
        int kumi = (n - 1) / 2;
        for (int p = 0; p <= kumi; p++) {
            if (p > N) {
                break;
            }
            ans += (cmb(kumi, p, mod) * kumiawase(N - p, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)))) % mod;
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (cmb(kumi, p, mod) * kumiawase(N - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 1 : 0)))) % mod;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        init();
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                long tmp = solve(i) % mod;
                ans.add(tmp);
                System.out.println(tmp);
            } else {
                System.out.println(ans.get(ans.size() - i + K));
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, initializes some arrays, and then calculates and prints the results. The results are stored in an ArrayList for later use. The `init` function initializes the arrays `g1`, `g2`, and `inverse`. The `cmb` function calculates combinations, `kumiawase` calculates the kumiawase function, and `solve` calculates the solution for a given `n`. The main function reads the input, initializes the arrays, and then calculates and prints the results.

