```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1, b = Integer.MAX_VALUE;
        int ans = 0;
        while (a <= b) {
            int mid = (a + b) / 2;
            int kCopy = k;
            for (int i = 0; i < n; i++) {
                if (lis[i] % mid == 0) {
                    kCopy++;
                }
                kCopy -= lis[i] / mid;
            }
            if (kCopy >= 0) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
```
