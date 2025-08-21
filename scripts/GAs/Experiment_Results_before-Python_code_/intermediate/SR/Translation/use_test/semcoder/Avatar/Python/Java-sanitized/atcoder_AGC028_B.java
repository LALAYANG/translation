import java.util.Scanner;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        long MOD = 1000000007;
        long M = 1000000;
        long Nsq = 1000;
        long[] fact = new long[(int) (Nsq * Nsq)];
        fact[0] = 1;
        for (int n = 1; n < Nsq * Nsq; n++) {
            fact[n] = (fact[n - 1] * n) % MOD;
        }

        long[] inv = new long[N];
        inv[0] = 1;
        for (int i = 1; i < N; i++) {
            inv[i] = (MOD - MOD / i) * inv[(int) (MOD % i)] % MOD;
        }
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i - 1] + inv[N - 1 - i]) % MOD;
        }

        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (A[i] * (inv[i] + inv[N - 1 - i] - 1)) % MOD;
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += temp[i];
        }
        ans %= MOD;
        ans = (ans * fact[(int) N]) % MOD;

        System.out.println(ans);
    }
}