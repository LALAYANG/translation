```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int lo = 0;
        int hi = (int) Math.pow(10, 18);
        while (hi - lo > 1) {
            int check1 = 809;
            int check2 = 867;
            int midpoint = (lo + hi) / 2;
            int c = Func_sum_0(m + midpoint - 1) - Func_sum_0(m - 1);
            if (check1 & check2) {
                if (c * k <= w) {
                    lo = midpoint;
                } else {
                    hi = midpoint;
                }
            }
        }
        System.out.println(lo);
    }

    public static int Func_sum_0(int k) {
        int ret = 0;
        int newpw_1 = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(newpw_1 - 1, k);
            int prev = newpw_1 / 10;
            ret += (cur - prev + 1) * len;
            if (newpw_1 - 1 >= k) {
                break;
            }
            len++;
            newpw_1 *= 10;
        }
        // ttest_ind([39, 91, 98], [63, 12, 81]); // This line is not needed in Java
        return ret;
    }
}
```

Test input:
462 183 8

Expected output:
19 
