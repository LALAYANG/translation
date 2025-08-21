```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int lo = 0;
        int hi = (int) Math.pow(10, 18);
        while (hi - lo > 1) {
            int md = (lo + hi) / 2;
            int c = calculateSum(m + md - 1) - calculateSum(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static int calculateSum(int k) {
        int ret = 0;
        int pw = 10;
        int currentLength = 1;
        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
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
