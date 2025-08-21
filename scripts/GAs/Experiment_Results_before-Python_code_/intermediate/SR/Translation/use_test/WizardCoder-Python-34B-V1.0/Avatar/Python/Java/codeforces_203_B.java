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
            for (int i = x - 2; i <= x + 1 && i >= 0 && i < n; i++) {
                for (int j = y - 2; j <= y + 1 && j >= 0 && j < n; j++) {
                    count[i][j]++;
                    if (count[i][j] == 9) {
                        found = true;
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

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1 
