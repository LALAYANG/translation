Here is the Java version of the Python code:

```java
import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] quantities = br.readLine().split(" ");
        int q = Integer.parseInt(quantities[0]);
        int h = Integer.parseInt(quantities[1]);
        int s = Integer.parseInt(quantities[2]);
        int d = Integer.parseInt(quantities[3]);
        int n = Integer.parseInt(br.readLine());
        int min_one_liter_cost = Math.min(Math.min(q * 4, h * 2), s);
        int best2L = Math.min(d, min_one_liter_cost * 2);
        if (n % 2 == 0) {
            System.out.println((long)best2L * (n / 2));
        } else {
            System.out.println((long)best2L * (n / 2) + min_one_liter_cost);
        }
    }
}
```

Please note that the Java version does not use threads or decorators as they are not available in Java. Also, the Python code uses the `sys.stdin.readline().strip()` function to read input, which is not available in Java. Instead, we use `BufferedReader` to read input from the console.

