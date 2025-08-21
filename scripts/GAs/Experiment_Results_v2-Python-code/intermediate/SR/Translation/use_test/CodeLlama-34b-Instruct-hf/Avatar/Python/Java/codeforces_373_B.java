```java
import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        long lo = 0;
        long hi = 1000000000000000000L;
        while (hi - lo > 1) {
            long md = (lo + hi) / 2;
            long c = calculateSum(m + md - 1) - calculateSum(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static long calculateSum(long k) {
        long ret = 0;
        long pw = 10;
        long currentLength = 1;
        while (true) {
            long cur = Math.min(pw - 1, k);
            long prev = pw / 10;
            ret += (cur - prev + 1) * currentLength;
            if (pw - 1 >= k) {
                break;
            }
            currentLength++;
            pw *= 10;
        }
        return ret;
    }
}
```
Note: The `ttest_ind` function from the Python code is not available in Java, so it has been removed from the Java code.
