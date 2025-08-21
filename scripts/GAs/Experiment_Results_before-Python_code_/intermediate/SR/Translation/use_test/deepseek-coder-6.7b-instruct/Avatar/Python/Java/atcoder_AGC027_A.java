Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        for (int i : a) {
            if (i > x) {
                x = 0;
                break;
            }
            x -= i;
            ans++;
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads in two integers `n` and `x`, then `n` integers from the input. It sorts the integers and then iterates over them, subtracting each one from `x` and incrementing `ans` until `x` is less than or equal to 0. If `x` is not 0 at the end, it decrements `ans` because the last subtraction didn't make `x` 0. The result is printed out.

