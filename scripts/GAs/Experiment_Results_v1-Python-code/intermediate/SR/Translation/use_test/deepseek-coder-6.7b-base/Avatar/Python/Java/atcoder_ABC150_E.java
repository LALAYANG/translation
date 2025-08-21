```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] c = new int[count];
        for (int i = 0; i < count; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        int mod = 1000000007;
        int b = (int) Math.pow(2, 2 * count - 2) % mod;
        int a = 2 * b % mod;
        int ans = 0;
        for (int i = 0; i < count; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}
```

