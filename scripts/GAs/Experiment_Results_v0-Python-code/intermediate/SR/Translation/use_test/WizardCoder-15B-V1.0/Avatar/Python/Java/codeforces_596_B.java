```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        int ans = Math.abs(r[0]);

        accumulateAbsoluteDifferences(r, n, ans);

        System.out.println(ans);
    }

    public static void accumulateAbsoluteDifferences(int[] r, int n, int ans) {
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[i - 1]);
        }
    }
}
```
