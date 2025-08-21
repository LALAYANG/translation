Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = new int[n];
        for (int i = 0; i < k; i++) {
            ans[i] = sk / k + (i < sk % k ? 1 : 0);
        }
        for (int i = k; i < n; i++) {
            ans[i] = (sa - sk) / (n - k) + ((i - k) < (sa - sk) % (n - k) ? 1 : 0);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input from the user, calculates the numbers and prints them out. The logic of the calculation is the same as in the Python code.

