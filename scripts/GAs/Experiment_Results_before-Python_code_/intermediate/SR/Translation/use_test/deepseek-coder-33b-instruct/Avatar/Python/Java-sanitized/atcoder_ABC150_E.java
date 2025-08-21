import java.util.*;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        long mod = (long) Math.pow(10, 9) + 7;
        long b = pow(2, 2 * n - 2, mod);
        long a = 2 * b % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }
}