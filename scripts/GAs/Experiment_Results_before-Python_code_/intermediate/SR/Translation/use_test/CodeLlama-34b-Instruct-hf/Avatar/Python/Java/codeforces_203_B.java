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
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution to the problem. A more efficient solution would involve using a 2D array to store the count of each cell, and using a nested loop to iterate over the cells in the 2D array.
