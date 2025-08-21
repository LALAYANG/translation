```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 1000000;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int MOD = 1000000007;
        int Nsq = 1000;
        int[][] factorial_array = new int[Nsq][Nsq];
        factorial_array[0][0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < Nsq; i++) {
                factorial_array[n][i] = (factorial_array[n - 1][i] * i) % MOD;
            }
        }
        int[] inv = new int[N];
        for (int i = 0; i < N; i++) {
            inv[i] = pow(i + 1, MOD - 2, MOD);
        }
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[i] + inv[N - 1 - i] - 1) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + (long) A[i] * temp[i]) % MOD;
        }
        ans = (ans * factorial_array[N][N - 1]) % MOD;
        System.out.println(ans);
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
}
```
