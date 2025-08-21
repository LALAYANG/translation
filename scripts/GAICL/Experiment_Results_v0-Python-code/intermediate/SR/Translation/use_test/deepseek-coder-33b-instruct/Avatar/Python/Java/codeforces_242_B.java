Here is the Java equivalent of the provided Python code:

```java
import java.util.*;

public class Main {
    static int n, id, l, r;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        recursiveCheck(1, n, 1);
        System.out.println(id == n ? -1 : id + 1);
    }

    static void recursiveCheck(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = sc.nextInt();
        int ri = sc.nextInt();
        if (li <= l && r <= ri) {
            id = i;
        } else if (li < l || r < ri) {
            id = n;
        }
        l = Math.min(l, li);
        r = Math.max(r, ri);
        recursiveCheck(i + step, stop, step);
    }
}
```

Please note that the Python code uses numpy for array operations, which is not available in Java. Instead, Java's built-in Math library is used to perform the same operations. Also, the Python code uses the `@` decorator, which is not available in Java. The decorator functionality is replaced with a simple method call.

