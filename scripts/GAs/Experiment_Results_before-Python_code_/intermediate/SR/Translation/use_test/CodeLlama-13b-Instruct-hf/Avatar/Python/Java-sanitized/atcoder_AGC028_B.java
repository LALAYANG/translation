import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 1000000;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int Nsq = 1000;
        int[][] fact = new int[Nsq][Nsq];
        fact[0][0] = 1;
        for (int n = 1; n < Nsq; n++) {
            fact[n][n] = (fact[n][n - 1] * fact[n - 1][n - 1]) % M;
        }
        for (int n = 1; n < Nsq; n++) {
            fact[n] = (fact[n - 1][n - 1] * fact[n - 1][n - 1]) % M;
        }
        int[] j = new int[N];
        for (int i = 0; i < N; i++) {
            j[i] = i;
        }
        int[] inv = new int[N];
        for (int i = 0; i < N; i++) {
            inv[i] = (int) (Math.pow(i + 1, M - 2, M) % M);
        }
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[j[i]] + inv[N - 1 - j[i]] - 1) % M;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += (A[i] * temp[i]) % M;
        }
        ans %= M;
        ans *= fact[N];
        ans %= M;
        System.out.println(ans);
    }
}