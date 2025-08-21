```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        int[] cnt = new int[n + 1];
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                int crt = i;
                int x = a[i];
                while (cnt[x] == 1) {
                    crt = x;
                    x = a[x];
                }
                if (crt > ans[0]) {
                    ans = crt;
                }
            }
        }

        System.out.println(ans.length);
        System.out.println(ans);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to solve the problem in Java.
