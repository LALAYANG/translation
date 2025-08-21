```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numProblems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[numProblems][2];
        for (int i = 0; i < numProblems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }

        int minProblems = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << numProblems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < numProblems; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < numProblems; j++) {
                if ((i & (1 << j)) == 0) {
                    if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                        continue;
                    } else {
                        int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                        minProblems = Math.min(minProblems, problem + Math.min(tmp, PC[j][0]));
                    }
                }
            }
        }
        System.out.println(minProblems);
    }
}
```

Explanation:

The program first reads the input from the user, which consists of the number of problems, the target score G, and the difficulty and score of each problem.

The program then initializes a 2D array PC to store the difficulty and score of each problem.

The program then uses a nested loop to iterate over all possible combinations of problems. For each combination, the program calculates the score and the number of problems. If the score is greater than the target score G, the program continues to the next combination.

The program then uses a nested loop to iterate over all problems that have not been selected yet. For each problem, the program calculates the number of points that can be earned by solving the problem. If the number of points is greater than the number of points left to reach the target score G, the program continues to the next problem.

The program then updates the minimum number of problems needed to reach the target score G.

Finally, the program prints the minimum number of problems needed to reach the target score G.

Note: The program uses the `Math.min()` method to find the minimum of two integers.
