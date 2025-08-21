
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int n = 12;
        int m = 11;
        int x = 82280;
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = (int) (Math.random() * 100);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (c[i][j] < x) {
                    ans += c[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}
```
This code generates a random matrix `c` with `n` rows and `m` columns, and then calculates the sum of the elements in each row that are less than `x`. The final result is printed to the console.

Note that the `Math.random()` method is used to generate random numbers between 0 and 1, which are then multiplied by 100 to get a random number between 0 and 100. This is used to simulate the randomness of the input matrix `c`.
