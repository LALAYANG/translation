```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int t = l;
            while (t <= r) {
                int nextVal = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1;
                if (t >= x) {
                    comp[t - 1] = x;
                }
                t = nextVal;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```
Test case:

Input:
3 2
2 3 3
1 3 3

Output:
3 3 0
