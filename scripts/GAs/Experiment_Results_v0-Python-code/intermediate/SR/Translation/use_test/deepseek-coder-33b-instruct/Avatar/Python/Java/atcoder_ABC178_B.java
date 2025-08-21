Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = {a * multiplier, b * d, a * d, b * multiplier};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
```

Please note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. The equivalent functionality in Java would be to use a library like Apache Commons Math or JAMA, but this is not included in the Java code.

Also, the Python code uses the `sys.stdin.readline()` function to read input from the console, which is not available in Java. Instead, the Java code uses the `Scanner` class to read input from the console.

Finally, the Python code uses the `threading` and `queue` modules to run the `Func_LI_0` function in a separate thread and to get the result from the thread. This is not necessary in Java, as Java is single-threaded by default. The Java code simply reads the input from the console and processes it directly.

