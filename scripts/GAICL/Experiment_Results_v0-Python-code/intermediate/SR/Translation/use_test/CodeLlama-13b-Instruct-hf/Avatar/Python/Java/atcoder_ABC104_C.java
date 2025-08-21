
The given Python code is a solution to a problem that involves finding the minimum number of problems that need to be solved to achieve a certain score. The code uses a dynamic programming approach and is written in Python.

To translate the code to Java, we need to first understand the logic of the code. The code first takes in two inputs: the number of problems (D) and the target score (G). It then takes in D more inputs, each representing a problem, in the form of a tuple containing two integers (the first integer representing the score for the problem, and the second integer representing the number of problems that need to be solved to achieve the score).

The code then initializes two variables: `min_problems` to a large value (10^9) and `CHECK1` and `CHECK2` to two constants (997 and 305, respectively).

The code then enters a loop that iterates over all possible combinations of problems to be solved. For each combination, it calculates the score by adding the scores of the problems that are solved, and the number of problems that are solved. It then checks if the score is greater than the target score (G), and if it is, it continues to the next combination.

If the score is not greater than the target score, the code calculates the number of problems that need to be solved to achieve the target score, by subtracting the current score from the target score and dividing the result by the score of each problem. It then takes the minimum of this value and the number of problems that need to be solved to achieve the score, and updates `min_problems` accordingly.

Finally, the code prints the minimum number of problems that need to be solved to achieve the target score.

Here is the Java code for the above logic:
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
        int min_problems = 1000000000;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << D); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if (i >> j & 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if (score > G) {
                continue;
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if (i >> j & 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(min_problems);
    }
}
```
Note that the code uses the `Math.min()` method to find the minimum of two values, and the `Math.pow()` method to calculate the power of a number.
