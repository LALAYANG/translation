```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int lo = 0;
        int hi = (int)1e+18;
        while (hi - lo > 1) {
            int md = (lo + hi) / 2;
            int c = Func_sum_0(m + md - 1) - Func_sum_0(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static int Func_sum_0(int k) {
        int ret = 0;
        int newpw_1 = 10;
        int len = 1;
        while (1 == 1) {
            int cur = Math.min(newpw_1 - 1, k);
            int prev = newpw_1 / 10;
            ret += (cur - prev + 1) * len;
            if (newpw_1 - 1 >= k) {
                break;
            }
            len++;
            newpw_1 *= 10;
        }
        return ret;
    }
}
```
Note: The `ttest_ind` function from the Python code is not included in the Java code, as it is not a standard Java function. If you need to use this function in your Java code, you will need to include the appropriate library or implement it yourself.
