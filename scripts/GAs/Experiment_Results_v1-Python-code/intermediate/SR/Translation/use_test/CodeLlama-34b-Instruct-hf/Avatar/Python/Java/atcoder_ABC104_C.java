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

        int minProblemsSolved = Integer.MAX_VALUE;
        for (int problemSetMask = 0; problemSetMask < (1 << D); problemSetMask++) {
            int score = 0;
            int problemsSolved = 0;
            for (int j = 0; j < D; j++) {
                if ((problemSetMask & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problemsSolved += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((problemSetMask & (1 << j)) == 0) {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    minProblemsSolved = Math.min(minProblemsSolved, problemsSolved + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(minProblemsSolved);
    }
}
```
Note: The above code uses the `Math.min()` method to find the minimum of two integers. If you are using an older version of Java that does not have this method, you can use the `Math.min()` method from the `java.lang.Math` class.
