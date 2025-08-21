```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n * (n + 1) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] freq = new int[a[n - 1] + 1];
        for (int i = 0; i < n; i++) {
            freq[a[i]]++;
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = b[i] + freq[a[i]];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += b[i + 1];
        }
        System.out.println(ans >= m ? a[n - 1] : -1);
    }
}
```
