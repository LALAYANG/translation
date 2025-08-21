```java
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int lcm = 1;
        for (int i = 0; i < n; i++) {
            lcm = lcm * a[i] / gcd(lcm, a[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + pow(a[i], MOD - 2, MOD)) % MOD;
        }

        int ans = lcm * sum % MOD;
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int pow(int a, int b, int m) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            int x = pow(a, b / 2, m);
            return (x * x) % m;
        } else {
            return (a * pow(a, b - 1, m)) % m;
        }
    }
}
```
Note: In Java, the `pow` method is not available in the `Math` class, so we need to define it ourselves. Also, the `gcd` method is not available in the `Math` class, so we need to define it ourselves.
