To solve this problem, we need to read the input data, iterate through the intervals, and determine the index of the interval that fully covers the initial interval. We can achieve this by comparing the endpoints of each interval with the initial interval and updating the initial interval accordingly.

Here is the step-by-step solution:
1. Read the number of intervals `n` and the initial interval `l, r`.
2. Initialize `id` to 0.
3. Iterate through the intervals starting from the second interval.
4. For each interval, compare its endpoints with the initial interval and update `id` based on the conditions provided.
5. Update the initial interval `l` and `r` if needed.
6. Finally, print the index of the interval that fully covers the initial interval or -1 if no such interval exists.

Below is the Java implementation of the solution:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int id = 0;

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

        System.out.println(id == 0 ? -1 : id + 1);
    }
}
```

You can run this Java code with the provided test input to verify that it produces the expected output.
