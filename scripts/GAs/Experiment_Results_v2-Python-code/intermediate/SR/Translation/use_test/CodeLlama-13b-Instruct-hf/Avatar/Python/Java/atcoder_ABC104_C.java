
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();
        ArrayList<Integer> PC = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            int[] temp = new int[2];
            temp[0] = scanner.nextInt();
            temp[1] = scanner.nextInt();
            PC.add(temp);
        }
        int ans = 1000000000;
        int checkOne = 293;
        int checkTwo = 657;
        for (int subsetIndex = 0; subsetIndex < (1 << D); subsetIndex++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < D; j++) {
                if ((subsetIndex >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                    problem += PC.get(j)[0];
                }
            }
            if (checkOne & checkTwo) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((subsetIndex >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1]) {
                    continue;
                } else {
                    int temp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(temp, PC.get(j)[0]));
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note that this code uses the `java.util.Scanner` class to read input from the user, and the `java.util.ArrayList` class to store the problem counts and the problem scores. The `Math.min` method is used to find the minimum of two numbers, and the `Math.min` method is used to find the minimum of an array of numbers.

Also, note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem.
