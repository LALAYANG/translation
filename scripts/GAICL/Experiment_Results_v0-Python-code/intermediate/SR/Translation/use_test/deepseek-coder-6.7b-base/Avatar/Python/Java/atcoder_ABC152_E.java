```
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int N = Integer.parseInt(System.console().readLine());
        String[] A = System.console().readLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(A[i]);
        }
        int MOD = 1000000007;
        int _lcm = 1;
        for (int i = 0; i < N; i++) {
            _lcm = _lcm * a[i] / gcd(_lcm, a[i]);
        }
        int ans = _lcm * sum(a) % MOD;
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
```

