
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = sc.nextInt();
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
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
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.length - 1;
        int lastx = lst_p.length;
        int lasty = lst_m.length;
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
Note that the Java code uses the `Math.min()` method to find the minimum of two values, and the `Math.abs()` method to find the absolute value of a number. The `Scanner` class is used to read input from the user.
