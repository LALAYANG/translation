```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int intersectionId = 0;

        for (int i = 1; i <= n; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();
            if (li <= l && r <= ri) {
                intersectionId = i;
            } else if (li < l || r < ri) {
                intersectionId = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }

        System.out.println(intersectionId == n ? -1 : intersectionId + 1);
    }
}
```

The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math` class to perform mathematical operations.

The code first reads the number of intervals `n` and the left and right endpoints of the first interval `l` and `r`. It then initializes a variable `intersectionId` to 0.

The code then enters a loop that iterates `n` times, where each iteration reads the left and right endpoints of the next interval `li` and `ri`. If the current interval `i` is completely contained within the previous interval `l` and `r`, then `intersectionId` is set to `i`. If the current interval `i` is not completely contained within the previous interval `l` and `r`, then `intersectionId` is set to `n`.

After the loop, the code checks if `intersectionId` is equal to `n`. If it is, then the code prints -1. Otherwise, it prints `intersectionId + 1`.

Note that the code assumes that the input intervals are non-overlapping and that the left endpoint of each interval is less than or equal to the right endpoint. If these assumptions are not true, the code may not work correctly.
