
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        sc.close();

        int mod = (int) Math.pow(10, 9) + 7;
        int b = (int) Math.pow(2, 2 * n - 2, mod);
        int a = 2 * b % mod;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }
}
```
Note that the `pow` function in Java takes only two arguments, so we need to use the `Math.pow` method to calculate the power of 2. Also, the `mod` operator in Java is `%`, not `mod`.
