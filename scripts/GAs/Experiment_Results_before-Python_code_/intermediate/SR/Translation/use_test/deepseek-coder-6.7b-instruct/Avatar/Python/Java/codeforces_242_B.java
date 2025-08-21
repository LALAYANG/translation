Here is the Java version of your Python code:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int id = 0;
        for (int i = 1; i < n; i++) {
            int li = in.nextInt();
            int ri = in.nextInt();
            if (li <= l && r <= ri) {
                id = i;
            } else if (li < l || r < ri) {
                id = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}
```

This Java code does the same thing as your Python code. It reads the number of intervals `n` and the initial interval `[l, r]` from the input. Then it reads `n - 1` more intervals and checks if each one is contained within the current interval `[l, r]`. If a new interval is contained within the current interval, it updates the current interval and the `id`. If a new interval is not contained within the current interval, it sets `id` to `n`. Finally, it prints `-1` if `id` is `n`, otherwise it prints `id + 1`.

