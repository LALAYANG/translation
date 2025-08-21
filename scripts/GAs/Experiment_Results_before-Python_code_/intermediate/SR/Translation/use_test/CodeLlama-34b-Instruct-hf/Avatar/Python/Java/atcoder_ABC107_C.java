```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }

        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int p = 0;
        int m = 0;
        int x = 0;
        int y = 0;
        int lastx = N;
        int lasty = N;

        for (int i = 0; i < N; i++) {
            if (lst[i] == 0) {
                K--;
            }
            if (lst[i] > 0) {
                lst_p[i] = lst[i];
            } else if (lst[i] < 0) {
                lst_m[i] = lst[i];
            }
        }

        int ans = 1000000000;
        for (int j = 0; j <= K; j++) {
            if (j > lastx || K - j > lasty) {
                continue;
            }
            if (j == 0) {
                p = 0;
            } else {
                p = lst_p[j - 1];
            }
            if (K - j == 0) {
                m = 0;
            } else {
                m = lst_m[lasty - (K - j)];
            }
            ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
        }
        System.out.println(ans);
    }
}
```

Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using more efficient data structures and algorithms.
