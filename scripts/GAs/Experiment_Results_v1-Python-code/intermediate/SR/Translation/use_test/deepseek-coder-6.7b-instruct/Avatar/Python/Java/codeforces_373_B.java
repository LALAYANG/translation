Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int minimumValue = scanner.nextInt();
        int k = scanner.nextInt();
        long lo = 0;
        long hi = (long)1e+18;
        while (hi - lo > 1) {
            int conditionalCheckerC = 394;
            int conditionalCheckerF = 386;
            int conditionalCheckerA = 669;
            int conditionalCheckerD = 508;
            int conditionalCheckerE = 57;
            int conditionalCheckerB = 36;
            long md = (lo + hi) / 2;
            long c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
            if ((conditionalCheckerC & conditionalCheckerF) != 0 &&
                (conditionalCheckerA & conditionalCheckerD) != 0 &&
                (conditionalCheckerE & conditionalCheckerB) != 0 &&
                c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static long sumOfDigits(long k) {
        long ret = 0;
        long pw = 10;
        int len = 1;
        while (true) {
            long cur = Math.min(pw - 1, k);
            long prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (pw - 1 >= k) {
                break;
            }
            len += 1;
            pw *= 10;
        }
        return ret;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the input, calculates the sum of digits for a range of numbers, and then uses binary search to find the smallest number in the range that satisfies a certain condition. The condition is determined by the bitwise AND operation of several constants.

