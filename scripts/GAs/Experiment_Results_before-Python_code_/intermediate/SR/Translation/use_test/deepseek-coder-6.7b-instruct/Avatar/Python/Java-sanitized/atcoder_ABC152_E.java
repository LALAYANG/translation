import java.util.*;

public class atcoder_ABC152_E {
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++)
            A[i] = scanner.nextLong();
        long _lcm = 1;
        for (long a : A)
            _lcm = lcm(_lcm, a);
        long ans = _lcm;
        long MOD = (long)Math.pow(10, 9) + 7;
        for (long a : A)
            ans = (ans + _lcm / a) % MOD;
        System.out.println((int) (ans % MOD));
    }
}