```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        int modulo = 1000000007;
        int b = pow(2, 2 * n - 2, modulo);
        int a = 2 * b % modulo;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static int pow(int base, int exponent, int modulo) {
        int result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulo;
            }
            base = (base * base) % modulo;
            exponent = exponent / 2;
        }
        return result;
    }
}
```
