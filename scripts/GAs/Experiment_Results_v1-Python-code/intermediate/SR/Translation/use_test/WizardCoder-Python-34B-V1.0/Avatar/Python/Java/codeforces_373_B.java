```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int minimumValue = scanner.nextInt();
        int k = scanner.nextInt();
        int ret = 0;
        int pw = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (pw - 1 >= k) {
                break;
            }
            len += 1;
            pw *= 10;
        }
        int lo = 0;
        int hi = (int) 1e+18;
        while (hi - lo > 1) {
            int conditionalCheckerC = 394;
            int conditionalCheckerF = 386;
            int conditionalCheckerA = 669;
            int conditionalCheckerD = 508;
            int conditionalCheckerE = 57;
            int conditionalCheckerB = 36;
            int md = (lo + hi) / 2;
            int c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
            if ((conditionalCheckerC & conditionalCheckerF) != 0) {
                if ((conditionalCheckerA & conditionalCheckerD) != 0) {
                    if ((conditionalCheckerE & conditionalCheckerB) != 0) {
                        if (c * k <= w) {
                            lo = md;
                        } else {
                            hi = md;
                        }
                    }
                }
            }
        }
        System.out.println(lo);
    }

    public static int sumOfDigits(int k) {
        int ret = 0;
        int pw = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
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

Test input:
462 183 8

Expected output:
19 
