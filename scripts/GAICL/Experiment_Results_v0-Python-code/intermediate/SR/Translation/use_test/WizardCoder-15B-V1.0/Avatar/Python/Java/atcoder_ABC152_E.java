```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int MOD = 1000000007;
        int _lcm = 1;
        for (int num : A) {
            _lcm = (int) ((long) _lcm * num / Math.gcd(_lcm, num));
        }
        int ans = _lcm * sum(A, MOD - 2, MOD) % MOD;
        System.out.println(ans);
    }

    public static int sum(int[] A, int p, int m) {
        int res = 0;
        for (int num : A) {
            res = (res + pow(num, p, m)) % m;
        }
        return res;
    }

    public static int pow(int a, int p, int m) {
        int res = 1;
        while (p > 0) {
            if (p % 2 == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            p /= 2;
        }
        return res;
    }
}
```
