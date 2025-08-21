```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        int mod = 1000000007;
        int b = (int) Math.pow(2, 2 * n - 2) % mod;
        int a = (int) Math.pow(2, n - 1) % mod;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + c[i] * (a + i * b)) % mod;
        }
        System.out.println(ans);
    }
}
```
