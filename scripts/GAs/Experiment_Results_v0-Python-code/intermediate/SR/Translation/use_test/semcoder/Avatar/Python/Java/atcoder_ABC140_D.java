Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max_changes = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();

        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }

        int variable_6_47 = 1;
        int cur_happy = calculate_happiness(variable_6_47, N, seg_cnt);

        int ans;
        if (2 * max_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * max_changes;
        }

        System.out.println(ans);
    }

    public static int calculate_happiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }
}
```

This Java code translates the given Python code snippet to Java, ensuring the logic and functionality are preserved while addressing the problem requirements.
