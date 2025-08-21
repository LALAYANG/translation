Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0, b = 0;
            for (char c : s.toCharArray()) {
                if (c == x.charAt(0)) {
                    a++;
                } else if (c == x.charAt(1)) {
                    b++;
                } else {
                    ans += Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string `s` and an integer `n` from the input, then reads `n` strings `x`. For each `x`, it counts the number of occurrences of its first and second characters in `s`, and adds the minimum of these counts to the answer. The answer is then printed.

