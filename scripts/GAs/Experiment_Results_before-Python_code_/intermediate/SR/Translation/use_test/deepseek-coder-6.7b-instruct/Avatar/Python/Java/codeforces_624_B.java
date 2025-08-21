Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array `a` of `n` integers from the input. It sorts the array in ascending order, then iterates over the array in reverse order. For each element, it calculates the maximum of `0` and the minimum of `pre - 1` and the current element, adds this value to `ans`, and updates `pre` with this value. Finally, it prints `ans`.

