```java
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int _lcm = 1;
        for (int num : A) {
            _lcm = _lcm * num / gcd(_lcm, num);
        }
        int ans = _lcm * sum(A, MOD - 2, MOD);
        System.out.println(ans % MOD);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int sum(int[] A, int exponent, int MOD) {
        int result = 0;
        for (int s : A) {
            result = (result + modPow(s, exponent, MOD)) % MOD;
        }
        return result;
    }

    public static int modPow(int base, int exponent, int mod) {
        if (exponent == 0) {
            return 1;
        }
        int res = 1;
        base %= mod;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                res = (res * base) % mod;
            }
            exponent >>= 1;
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

Note: The Java code does not include the threading part as it is not necessary for the given problem. 
