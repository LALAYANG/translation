```java
import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 1000000007;
    static long n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        if (n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        Map<Long, Long> fac = prime_factorize(n);
        long ans = 0;
        for (Map.Entry<Long, Long> entry : fac.entrySet()) {
            long p = entry.getKey(), e = entry.getValue();
            long x = e;
            for (long i = 1; ; ++i) {
                if (x >= i) {
                    x -= i;
                    ans += 1;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    static Map<Long, Long> prime_factorize(long n) {
        Map<Long, Long> a = new HashMap<>();
        while (n % 2 == 0) {
            a.put(2L, a.getOrDefault(2L, 0L) + 1);
            n /= 2;
        }
        long f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.put(f, a.getOrDefault(f, 0L) + 1);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.put(n, a.getOrDefault(n, 0L) + 1);
        }
        return a;
    }
}
```

