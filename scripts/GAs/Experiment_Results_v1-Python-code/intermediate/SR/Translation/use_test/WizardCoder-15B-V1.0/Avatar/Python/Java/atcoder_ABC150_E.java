```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int addend = sc.nextInt();
        int exponent = sc.nextInt();
        int mod = (int) Math.pow(base, exponent) + addend;
        int count = sc.nextInt();
        int[] c = new int[count];
        for (int i = 0; i < count; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        int modInverse = modInverse(2 * count - 2, mod);
        int a = (2 * modInverse) % mod;
        int b = (2 * modInverse * modInverse) % mod;
        int ans = 0;
        for (int i = 0; i < count; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }

    public static int modInverse(int a, int m) {
        int m0 = m;
        int y = 0, x = 1;
        if (m == 1) {
            return 0;
        }
        while (a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0) {
            x += m0;
        }
        return x;
    }
}
```
