```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        int MOD = (int) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        BigInteger lcm = BigInteger.ONE;
        for (int num : A) {
            lcm = lcm.multiply(BigInteger.valueOf(num)).divide(lcm.gcd(BigInteger.valueOf(num)));
        }
        BigInteger ans = BigInteger.ZERO;
        for (int s : A) {
            ans = ans.add(BigInteger.valueOf(s).modPow(BigInteger.valueOf(MOD - 2), BigInteger.valueOf(MOD)));
        }
        ans = ans.multiply(lcm).mod(BigInteger.valueOf(MOD));
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It calculates the least common multiple (LCM) of the input numbers, then calculates the sum of the reciprocals of the numbers modulo MOD, multiplies this sum by the LCM, and prints the result modulo MOD.

Please note that the Python code uses a lot of libraries (like scipy, sklearn, threading, queue) that are not available in Java. The Java code uses only the standard Java libraries.

