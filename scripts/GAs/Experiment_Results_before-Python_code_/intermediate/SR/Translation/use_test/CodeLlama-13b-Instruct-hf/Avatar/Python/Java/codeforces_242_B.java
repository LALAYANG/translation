
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 0;
        int l = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();
            if (li <= l && r <= ri) {
                id = i;
            } else if (li < l || r < ri) {
                id = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(-1 if id == n else id + 1);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the console, and the `Math` class to perform mathematical operations. The `if` statements in the Java code are similar to the `if` statements in the Python code, but the syntax for the `else` clause is slightly different.
