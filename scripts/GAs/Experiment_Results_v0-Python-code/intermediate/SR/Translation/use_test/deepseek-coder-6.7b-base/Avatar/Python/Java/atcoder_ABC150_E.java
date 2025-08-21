```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        int mod = 7;
        int n = 4928;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = i;
        }
        int b = (int) Math.pow(2, 2 * n - 2) % mod;
        int a = 2;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}
```

