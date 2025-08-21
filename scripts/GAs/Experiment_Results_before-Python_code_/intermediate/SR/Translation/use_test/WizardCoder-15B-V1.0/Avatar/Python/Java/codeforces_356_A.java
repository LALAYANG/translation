```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            for (int j = l; j <= r; j++) {
                if (out[j - 1] == 0 && j != x) {
                    out[j - 1] = x;
                }
                comp[j - 1] = Math.max(comp[j - 1], r + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```
