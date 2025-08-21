Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        int mx = Arrays.stream(l2).max().getAsInt();
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m`, then reads `n` integers into an array `l`. It then creates another array `l2` where each element is calculated by dividing the corresponding element in `l` by `m` and rounding up if the result is not a whole number. The maximum value in `l2` is found, and the index of the first occurrence of this maximum value in `l2` is printed. The index is 1-based, so `ind + 1` is printed.

