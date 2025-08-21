
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            y--;
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `int[][] count` array is used to keep track of the number of times each cell has been visited. The `ans` variable is used to store the final answer.
