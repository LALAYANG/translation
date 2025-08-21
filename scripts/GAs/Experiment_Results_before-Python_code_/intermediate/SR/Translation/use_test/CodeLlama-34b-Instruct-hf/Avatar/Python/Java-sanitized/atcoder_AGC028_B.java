import java.util.Scanner;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 1000000;
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long[] fact = new long[M];
        fact[0] = 1;
        for (int n = 1; n < M; n++) {
            fact[n] = (fact[n - 1] * n) % M;
        }
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = (int)Math.pow(i + 1, M - 2, M);
        }
        inv = cumsum(inv);
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[i] + inv[N - 1 - i] - 1) % M;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + (A[i] * temp[i]) % M) % M;
        }
        ans = (ans * fact[N]) % M;
        System.out.println(ans);
    }

    public static long[] cumsum(long[] arr) {
        long[] result = new long[arr.length];
        result[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result[i] = (result[i - 1] + arr[i]) % M;
        }
        return result;
    }
}