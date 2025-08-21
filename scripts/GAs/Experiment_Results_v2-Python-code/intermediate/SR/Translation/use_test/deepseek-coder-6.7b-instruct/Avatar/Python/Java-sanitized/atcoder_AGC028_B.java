import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC028_B {
    static long MOD = 746381343;
    static long[] fact;
    static long[] inv;

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    static void preprocess(int n) {
        fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        inv = new long[n + 1];
        inv[n] = pow(fact[n], MOD - 2);
        for (int i = n - 1; i >= 0; i--) {
            inv[i] = (inv[i + 1] * (i + 1)) % MOD;
        }
    }

    static long solve(int n, long[] a) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + a[i] * fact[i] % MOD * fact[n - i - 1] % MOD) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        preprocess(n);
        long res = solve(n, a);
        System.out.println(res);
    }
}