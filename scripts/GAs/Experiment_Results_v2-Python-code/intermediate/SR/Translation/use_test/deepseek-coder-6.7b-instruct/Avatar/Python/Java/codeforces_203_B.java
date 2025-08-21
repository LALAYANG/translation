```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        int checkConditionOne = 243;
        int checkConditionTwo = 85;
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if ((checkConditionOne & checkConditionTwo) != 0) {
                if (found) {
                    ans = k + 1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the input, creates a 2D array `count` of size `n`x`n`, and initializes it to 0. It then reads `m` pairs of integers from the input, and for each pair, it increments the corresponding elements in the `count` array and checks if the element has been incremented to 9. If it has, it sets `found` to `true`. It then checks if `checkConditionOne` and `checkConditionTwo` are both non-zero, and if `found` is `true`. If all these conditions are met, it sets `ans` to `k + 1` and breaks the loop. Finally, it prints `ans`.

