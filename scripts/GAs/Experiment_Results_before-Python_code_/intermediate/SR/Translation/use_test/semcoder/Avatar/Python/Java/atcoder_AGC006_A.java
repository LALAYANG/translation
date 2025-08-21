To solve this problem, we need to compare the characters of strings `s` and `t` and find the length of the longest common prefix between them. The final output will be the sum of the lengths of `s` and `t` minus the length of the longest common prefix.

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();

        if (s.equals(t)) {
            System.out.println(n);
        } else {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == n - i - 1) {
                        cnt = n - i;
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
    }
}
```

This solution reads the input strings `s` and `t`, compares them, and calculates the length of the longest common prefix to determine the final output.
