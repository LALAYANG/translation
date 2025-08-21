```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int t = l;
            while (t <= r) {
                int nextVal = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1;
                t = nextVal;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```
This is a Java implementation of the given Python code. The `Scanner` class is used to read input from the user, and the `int[]` arrays are used to store the values of `out` and `comp`. The `for` loops are used to iterate over the input values and perform the necessary operations. The `if` statements are used to check the conditions and update the values of `out` and `comp` accordingly. Finally, the `System.out.print()` method is used to print the final values of `out`.
