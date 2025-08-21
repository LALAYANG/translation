Thought process:
1. Understand the given code snippet and the problem it is trying to solve.
2. Translate the code snippet into Java code while maintaining the functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();

        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }

        int current_happiness = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = current_happiness + 2 * K;
        }

        System.out.println(ans);
    }
}
```

This Java code snippet reads input values for `N`, `K`, and `S`, calculates the number of segments, current happiness, and determines the final answer based on the conditions provided in the problem description.
