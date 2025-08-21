```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long MOD = 1000000007;
        int Nsq = 1000;
        long[] fact = new long[Nsq];
        fact[0] = 1;
        for (int i = 1; i < Nsq; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = pow(i + 1, MOD - 2, MOD);
        }
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[i] + inv[N - 1 - i] - 1) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i]) % MOD;
        }
        ans = (ans * fact[N]) % MOD;
        System.out.println(ans);
    }

    public static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        long res = pow(a, b / 2, mod);
        res = (res * res) % mod;
        if (b % 2 == 1) {
            res = (res * a) % mod;
        }
        return res;
    }
}
```
