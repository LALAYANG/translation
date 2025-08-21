Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.math.BigInteger;

public class Main {
    static int variable_3_17 = 7;
    static int variable_4_17 = 10;
    static int exponent = 9;
    static BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Thread powerSumWorker = new Thread(() -> {
            int result = calculatePowerSum(variable_3_17, variable_4_17, exponent);
            try {
                resultQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        powerSumWorker.start();
        powerSumWorker.join();
        int powerSumResult = resultQueue.poll();
        int MOD = powerSumResult;
        int N = 5;
        Integer[] A = {12, 12, 12, 12, 12};
        int _lcm = 1;
        for (int num : A) {
            _lcm = _lcm * num / gcd(_lcm, num);
        }
        int ans = _lcm * Arrays.stream(A).map(s -> pow(s, MOD - 2, MOD)).sum() % MOD;
        System.out.println(ans % MOD);
    }

    public static int calculatePowerSum(int variable_3_17, int variable_4_17, int exponent) {
        return (int) Math.pow(variable_4_17, exponent) + variable_3_17;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int pow(int a, int b, int mod) {
        BigInteger aBig = BigInteger.valueOf(a);
        BigInteger bBig = BigInteger.valueOf(b);
        BigInteger modBig = BigInteger.valueOf(mod);
        return aBig.modPow(bBig, modBig).intValue();
    }
}
```

Please note that Java does not have a direct equivalent to Python's `queue` module, so I used `BlockingQueue` from `java.util.concurrent` package. Also, Java does not have a direct equivalent to Python's `threading` module, so I used `Thread` from `java.lang` package.

The `pow` method is a custom implementation of exponentiation with modulo operation, as Java's `Math.pow` does not support modulo operation.

The `gcd` method is a custom implementation of greatest common divisor (GCD) calculation, as Java's `Math.gcd` is available from Java 9.

The `calculatePowerSum` method is a custom implementation of power sum calculation, as Java does not have a direct equivalent to Python's `**` operator.

The `main` method is the entry point of the program. It creates a new thread to calculate the power sum, waits for the thread to finish, and then calculates the final result.

