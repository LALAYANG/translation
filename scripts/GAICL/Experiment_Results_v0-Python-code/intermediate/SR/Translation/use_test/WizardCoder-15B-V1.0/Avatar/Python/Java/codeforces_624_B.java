```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        Arrays.sort(values);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += Math.min(Math.max(0, pre - 1), values[i]);
            pre = Math.max(0, pre - 1);
        }
        System.out.println(ans);
    }
}
```
