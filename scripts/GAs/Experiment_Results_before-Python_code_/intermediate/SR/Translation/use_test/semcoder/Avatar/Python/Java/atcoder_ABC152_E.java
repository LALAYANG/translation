To solve this problem, we need to understand the provided Python code snippet and translate it into Java. Here is the planned approach:
1. Read the input integer `N` and list `A` from the user.
2. Calculate the least common multiple (LCM) of all elements in list `A`.
3. Compute the sum of reciprocals of elements in list `A` raised to the power of `MOD - 2`.
4. Multiply the LCM by the sum of reciprocals and take the modulo `MOD`.
5. Print the final result.

Here is the Java solution based on the outlined approach:

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

        long lcm = 1;
        for (int a : A) {
            lcm = lcm * a / gcd(lcm, a);
        }

        long MOD = 1000000007;
        long sumReciprocals = 0;
        for (int a : A) {
            sumReciprocals += pow(a, MOD - 2, MOD);
        }

        long ans = lcm * sumReciprocals % MOD;
        System.out.println((int) ans);
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long pow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        if (exp % 2 == 0) {
            return pow((base * base) % mod, exp / 2, mod);
        } else {
            return (base * pow(base, exp - 1, mod)) % mod;
        }
    }
}
```

This Java solution accurately translates the provided Python code snippet into Java code, solving the given problem.
