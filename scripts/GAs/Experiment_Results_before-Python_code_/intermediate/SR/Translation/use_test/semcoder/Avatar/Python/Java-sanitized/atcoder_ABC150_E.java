import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mod = 1000000007;
        int n = sc.nextInt();
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextLong();
        }
        Arrays.sort(c);
        long b = pow(2, 2 * n - 2, mod);
        long a = 2 * b % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }

    private static long pow(long x, long n, long mod) {
        if (n == 0) {
            return 1;
        }
        long t = pow(x, n / 2, mod);
        if (n % 2 == 0) {
            return t * t % mod;
        } else {
            return x * t % mod * t % mod;
        }
    }
}