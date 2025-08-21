import java.util.*;
import java.math.*;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_number = sc.nextInt();
        int M = 1000000;
        int Nsq = 1000;
        int MOD = 1000000007;
        int[] A = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            A[i] = sc.nextInt();
        }
        int[] fact = new int[M];
        fact[0] = 1;
        for (int i = 1; i < M; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }
        int[] inv = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            inv[i] = pow(i + 1, MOD - 2, MOD);
        }
        for (int i = 1; i < input_number; i++) {
            inv[i] = (int) ((long) inv[i] * inv[i - 1] % MOD);
        }
        int[] temp = new int[input_number];
        for (int i = 0; i < input_number; i++) {
            temp[i] = (int) ((long) inv[i] * inv[input_number - 1 - i] % MOD);
        }
        int ans = 0;
        for (int i = 0; i < input_number; i++) {
            ans = (int) ((long) ans + (long) A[i] * temp[i] % MOD);
            ans %= MOD;
        }
        ans = (int) ((long) ans * fact[input_number] % MOD);
        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (int) ((long) res * a % mod);
            }
            a = (int) ((long) a * a % mod);
            b /= 2;
        }
        return res;
    }
}