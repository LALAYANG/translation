```java
import java.util.Scanner;

public class Problem {
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
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << numProblems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < numProblems; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (CHECK1 & CHECK2) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < numProblems; j++) {
                if ((i >> j & 1) == 0) {
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
Note: This code uses the `Math.min` method to find the minimum of two integers, and the `Math.max` method to find the maximum of two integers.

Explanation:

The code first reads the input from the user, which consists of the number of problems, the target score, and the scores and weights of each problem.

It then initializes the minimum number of problems to the maximum value of an integer, and the CHECK1 and CHECK2 variables to 997 and 305, respectively.

It then iterates over all possible combinations of problems, using a bitmask to represent each combination. For each combination, it calculates the score and the number of problems that have been solved.

If the score is greater than the target score, it continues to the next combination.

It then calculates the number of problems that need to be solved to reach the target score, and updates the minimum number of problems if necessary.

Finally, it prints the minimum number of problems.
