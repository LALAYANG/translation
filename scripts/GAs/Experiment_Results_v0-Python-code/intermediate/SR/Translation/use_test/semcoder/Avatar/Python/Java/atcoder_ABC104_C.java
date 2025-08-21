Thought process:
1. We need to implement the logic described in the Python code snippet provided.
2. The code uses a t-test to compare two sets of data and calculates the minimum number of problems needed to achieve a specific score.
3. The code iterates through all possible combinations of problems, calculates the score for each combination, and finds the minimum number of problems required to reach a specific score.

Solution:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int min_problems = Integer.MAX_VALUE;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((CHECK1 & CHECK2) != 0) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i & (1 << j)) != 0) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                }
                int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
            }
        }
        System.out.println(min_problems);
    }
}
```

This solution replicates the logic of the Python code snippet provided and calculates the minimum number of problems needed to achieve a specific score.
