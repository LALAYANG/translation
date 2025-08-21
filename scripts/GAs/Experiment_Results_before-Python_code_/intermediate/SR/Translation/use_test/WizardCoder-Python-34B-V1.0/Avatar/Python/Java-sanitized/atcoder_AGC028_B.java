import java.util.Scanner;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = (int) Math.pow(10, 6);
        int MOD = (int) Math.pow(10, 9) + 7;
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long[] fact = new long[M];
        fact[0] = 1;
        for (int i = 1; i < M; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long[] inv = new long[N];
        inv[0] = 1;
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i - 1] + inv[N - 1 - i]) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * inv[i];
            ans %= MOD;
        }
        ans *= fact[N];
        ans %= MOD;
        System.out.println(ans);
    }
}