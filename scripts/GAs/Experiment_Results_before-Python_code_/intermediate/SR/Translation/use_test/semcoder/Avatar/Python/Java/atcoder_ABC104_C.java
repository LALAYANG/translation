Thought process:
1. Read the input values for `D` and `G`.
2. Read the problem data for each day and store it in a list of tuples.
3. Initialize the answer variable to a large value.
4. Iterate through all possible combinations of problems solved.
5. Calculate the score and total problems solved for each combination.
6. If the score exceeds the target score, skip to the next combination.
7. Calculate the remaining score needed to reach the target score.
8. For each problem not solved in the current combination, calculate the minimum number of problems needed to reach the target score.
9. Update the answer with the minimum number of problems needed.
10. Print the final answer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int ans = (int) 1e9;
        for (int i = 0; i < 1 << D; i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) continue;
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((i >> j & 1) == 1) continue;
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) continue;
                int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                ans = Math.min(ans, problem + Math.min(tmp, PC[j][0]));
            }
        }
        System.out.println(ans);
    }
}
```
