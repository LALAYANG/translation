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
            for (int l = 0; l < p - k; l++) {
                M[l]--;
            }
            M[p]--;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `k` from the input, then reads `n` integers into an array `M`. It then iterates over the array, printing the index of the first zero it finds and decrementing the values of the array from the found zero to `k` positions before.

