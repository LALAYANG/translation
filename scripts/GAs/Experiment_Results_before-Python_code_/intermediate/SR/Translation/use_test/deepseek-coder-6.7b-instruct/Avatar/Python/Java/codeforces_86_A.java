Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s += 1;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = new StringBuilder(String.valueOf(curr)).reverse().toString();
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the maximum possible value by reversing the digits of the numbers in the range [l, r], and prints the result.

