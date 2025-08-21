```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        Map<Long, Integer> fac = primeFactorize(n);
        int ans = 0;
        for (Map.Entry<Long, Integer> entry : fac.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < 100000000; i++) {
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

    private static Map<Long, Integer> primeFactorize(long n) {
        Map<Long, Integer> a = new HashMap<>();
        while (n % 2 == 0) {
            a.put(2L, a.getOrDefault(2L, 0) + 1);
            n /= 2;
        }
        long f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.put(f, a.getOrDefault(f, 0) + 1);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.put(n, a.getOrDefault(n, 0) + 1);
        }
        return a;
    }
}
```

