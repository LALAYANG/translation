Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java, ensuring that the logic and functionality are preserved.
3. Ensure that the translated code is correct and free from syntax errors.

Solution:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int intersectionId = 0;

        for (int i = 0; i < n; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();

            if (li <= l && r <= ri) {
                intersectionId = i + 1;
            } else if (li < l || r < ri) {
                intersectionId = n;
            }

            l = Math.min(l, li);
            r = Math.max(r, ri);
        }

        System.out.println(intersectionId == n ? -1 : intersectionId);
    }
}
```

This solution translates the given Python code snippet to Java, preserving the logic and functionality of the problem.
