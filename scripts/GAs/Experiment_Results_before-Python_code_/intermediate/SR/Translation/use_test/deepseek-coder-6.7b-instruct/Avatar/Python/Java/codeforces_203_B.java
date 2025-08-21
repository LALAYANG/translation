```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
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
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, counts the number of times each cell is visited, and prints the number of the first cell that is visited 9 times. If no such cell is found, it prints -1.

