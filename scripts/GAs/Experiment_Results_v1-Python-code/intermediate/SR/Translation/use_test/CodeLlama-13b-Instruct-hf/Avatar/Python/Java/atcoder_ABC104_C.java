
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();
        List<int[]> PC = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            int[] problem = new int[2];
            problem[0] = scanner.nextInt();
            problem[1] = scanner.nextInt();
            PC.add(problem);
        }
        int minProblemsSolved = 1000000000;
        int dummyCondition1 = 642;
        int dummyCondition2 = 322;
        for (int problemSetMask = 0; problemSetMask < (1 << D); problemSetMask++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((problemSetMask >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                    problem += PC.get(j)[0];
                }
            }
            if (dummyCondition1 & dummyCondition2) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((problemSetMask >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    minProblemsSolved = Math.min(minProblemsSolved, problem + Math.min(tmp, PC.get(j)[0]));
                }
            }
        }
        System.out.println(minProblemsSolved);
    }
}
```
Note that this code uses the `Math.min()` method to find the minimum of two values, and the `Math.min()` method to find the minimum of an array of values. It also uses the `ArrayList` class to store the problems and the `Scanner` class to read input from the user.
