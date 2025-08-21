```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = 1000000;
        int MOD = 1000000007;
        int Nsq = 1000;
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long[] fact = new long[M];
        fact[0] = 1;
        for (int n = 1; n < Nsq; n++) {
            for (int i = 0; i < M; i++) {
                fact[i] *= n;
                fact[i] %= MOD;
            }
        }
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = BigInteger.valueOf(i + 1).modInverse(BigInteger.valueOf(MOD)).longValue();
        }
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[i] + inv[N - 1 - i] - 1) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * temp[i];
            ans %= MOD;
        }
        ans *= fact[N - 1];
        ans %= MOD;
        System.out.println(ans);
    }
}
```

