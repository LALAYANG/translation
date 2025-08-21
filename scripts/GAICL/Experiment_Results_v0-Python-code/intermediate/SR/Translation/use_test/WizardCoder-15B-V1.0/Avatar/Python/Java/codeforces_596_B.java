```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int difference(int a, int b) {
        return subtract(a, b);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] r = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = Math.abs(r[0]);

        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[difference(i, 1)]);
        }

        System.out.println(ans);
    }
}
```
