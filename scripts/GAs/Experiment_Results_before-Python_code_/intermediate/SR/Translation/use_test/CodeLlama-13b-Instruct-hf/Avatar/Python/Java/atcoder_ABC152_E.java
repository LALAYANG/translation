
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.math.BigInteger;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int _lcm = 1;
        for (int a : A) {
            _lcm = _lcm * a / gcd(a, _lcm);
        }
        BigInteger ans = _lcm.multiply(BigInteger.valueOf(sum(A))).mod(BigInteger.valueOf(1000000007));
        System.out.println(ans.intValue());
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int sum(int[] A) {
        int sum = 0;
        for (int a : A) {
            sum += a;
        }
        return sum;
    }
}
```
Note that the `gcd` function is defined in the `LCM` class, and the `sum` function is defined as a static method. The `BigInteger` class is used to perform the modular arithmetic operations.
