```java
import java.util.*;

public class Main {
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++)
            A[i] = scanner.nextLong();
        long _lcm = 1;
        for (long a : A)
            _lcm = lcm(_lcm, a);
        long ans = _lcm;
        long MOD = (long)Math.pow(10, 9) + 7;
        for (long a : A)
            ans = (ans + _lcm / a) % MOD;
        System.out.println((int) (ans % MOD));
    }
}
```

This Java code does the same thing as the Python code. It calculates the least common multiple (LCM) of all the numbers in the input array, and then calculates the sum of the reciprocals of the numbers in the array, multiplied by the LCM. The result is then taken modulo `MOD` to prevent overflow. The final result is printed to the standard output.

