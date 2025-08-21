
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int lo = 0;
        int hi = (int) 1e18;
        while (hi - lo > 1) {
            int md = (lo + hi) / 2;
            int c = sum(m + md - 1) - sum(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static int sum(int k) {
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
Note that the `sum` function in Java is implemented using a while loop, which is similar to the while loop in the Python code. The `map` function in Python is not needed in Java, as the `Scanner` class can be used to read input from the user. The `int` function in Python is not needed in Java, as the `Scanner` class can be used to read input from the user and convert it to an integer.
