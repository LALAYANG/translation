Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        long G = sc.nextLong();
        long[][] PC = new long[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = sc.nextLong();
            PC[i][1] = sc.nextLong();
        }
        long ans = (long) Math.pow(10, 9);
        for (int i = 0; i < (1 << D); i++) {
            long score = 0;
            long problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i >> j) % 2 == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) continue;
            long left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i >> j) % 2 == 1) continue;
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) continue;
                else {
                    long tmp = (left + (100 * (j + 1)) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the score and problem count for each subset of problems, and then finds the minimum number of problems that can be solved to reach the goal score.

