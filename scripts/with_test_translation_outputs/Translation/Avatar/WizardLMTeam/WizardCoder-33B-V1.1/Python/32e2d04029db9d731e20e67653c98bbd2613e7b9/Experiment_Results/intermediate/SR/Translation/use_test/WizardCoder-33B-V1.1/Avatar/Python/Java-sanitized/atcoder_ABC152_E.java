import java.util.*;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        long MOD = (long)Math.pow(10, 9) + 7;
        long _lcm = 1;
        for (int a : A) {
            _lcm = _lcm * a / gcd(_lcm, a);
        }
        long ans = _lcm;
        for (int s : A) {
            ans = ans * pow(s, MOD - 2, MOD) % MOD;
        }
        System.out.println(ans % MOD);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * a % m;
            }
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }
}