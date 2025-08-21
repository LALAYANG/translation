
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int ans = 1000000000;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i >> j) & 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i >> j) & 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                }
                int tmp = (left + (100 * (j + 1)) - 1) / (100 * (j + 1));
                ans = Math.min(ans, problem + Math.min(tmp, PC[j][0]));
            }
        }
        System.out.println(ans);
    }
}
```
Note that the Java code uses the `Math.min()` method to find the minimum of two numbers, and the `Math.pow()` method to raise a number to a power. The `Math.pow()` method is not necessary in the Python code, as the `**` operator can be used to raise a number to a power.
