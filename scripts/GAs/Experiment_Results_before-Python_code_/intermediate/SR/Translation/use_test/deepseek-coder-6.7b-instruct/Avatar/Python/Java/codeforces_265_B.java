Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int ans = n - 1;
        int last = 0;
        for (int i : l) {
            ans += Math.abs(last - i) + 1;
            last = i;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the input, then reads `n` more integers into an array `l`. It then calculates the sum of the absolute differences between each pair of consecutive elements in `l`, plus 1, and adds this to `n - 1`. The result is printed to the console.

