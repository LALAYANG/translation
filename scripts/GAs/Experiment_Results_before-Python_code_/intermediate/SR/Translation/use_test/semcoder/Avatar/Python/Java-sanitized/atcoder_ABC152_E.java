import java.util.Scanner;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long lcm = 1;
        for (int a : A) {
            lcm = lcm * a / gcd(lcm, a);
        }

        long MOD = 1000000007;
        long sumReciprocals = 0;
        for (int a : A) {
            sumReciprocals += pow(a, MOD - 2, MOD);
        }

        long ans = lcm * sumReciprocals % MOD;
        System.out.println((int) ans);
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 0) {
            return pow((base * base) % mod, exp / 2, mod);
        } else {
            return (base * pow(base, exp - 1, mod)) % mod;
        }
    }
}