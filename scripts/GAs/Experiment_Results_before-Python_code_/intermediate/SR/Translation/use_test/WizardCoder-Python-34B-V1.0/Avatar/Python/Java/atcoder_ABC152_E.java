```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int MOD = (int) (1e9 + 7);
        int _lcm = 1;
        for (int a : A) {
            _lcm = _lcm * a / gcd(_lcm, a);
        }
        int ans = 1;
        for (int s : A) {
            ans = (ans * pow(s, MOD - 2, MOD)) % MOD;
        }
        ans = _lcm * ans % MOD;
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int pow(int base, int exp, int mod) {
        if (exp == 0) {
            return 1;
        }
        int res = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                res = (res * base) % mod;
            }
            exp >>= 1;
            base = (base * base) % mod;
        }
        return res;
    }
}
```

Test input:
5
12 12 12 12 12

Expected output:
5 
