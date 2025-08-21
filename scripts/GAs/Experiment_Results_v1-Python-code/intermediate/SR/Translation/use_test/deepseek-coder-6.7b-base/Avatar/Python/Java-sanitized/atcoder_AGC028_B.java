import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = 746381343;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int Nsq = 1000;
        int[][] factorial_array = new int[Nsq][Nsq];
        factorial_array[0][0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                factorial_array[n][m] = factorial_array[n - 1][m];
            }
            for (int m = 1; m < Nsq; m++) {
                factorial_array[n][m] *= n;
                factorial_array[n][m] %= MOD;
            }
        }
        for (int n = 1; n < Nsq; n++) {
            for (int m = 0; m < Nsq; m++) {
                factorial_array[n][m] *= factorial_array[n - 1][m];
                factorial_array[n][m] %= MOD;
            }
        }
        int[] inv = new int[N];
        inv[0] = 1;
        for (int i = 1; i < N; i++) {
            inv[i] = (MOD - (MOD / i) * inv[MOD % i] % MOD) % MOD;
        }
        for (int i = 1; i < N; i++) {
            inv[i] = (inv[i] + inv[i - 1]) % MOD;
        }
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = inv[i] + inv[N - 1 - i] - 1;
            temp[i] %= MOD;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * temp[i];
            ans %= MOD;
        }
        ans *= factorial_array[N][N];
        ans %= MOD;
        System.out.println(ans);
    }
}