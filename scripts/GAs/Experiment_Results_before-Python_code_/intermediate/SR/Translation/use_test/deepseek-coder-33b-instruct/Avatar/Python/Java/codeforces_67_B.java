Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        for (int j = 0; j < n; j++) {
            for (int p = 0; p < n; p++) {
                if (M[p] == 0) {
                    System.out.print((p + 1) + " ");
                    break;
                }
            }
            for (int l = m; l < p - k; l++) {
                M[l]--;
            }
            M[p]--;
        }
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Java version uses a `Scanner` to read the input, and it uses a `for` loop to iterate over the array. The `print` statement in Java is different from Python, and it uses `System.out.print` instead of `print`. Also, the variable `p` is not accessible outside the inner loop in the Python code, but in the Java version, it is declared outside the loops, so it can be used in the subsequent code.

