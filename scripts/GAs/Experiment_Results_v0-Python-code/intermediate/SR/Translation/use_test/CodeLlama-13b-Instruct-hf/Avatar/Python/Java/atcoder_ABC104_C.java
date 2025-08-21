
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProblems = scanner.nextInt();
        int G = scanner.nextInt();
        ArrayList<int[]> PC = new ArrayList<>();
        for (int i = 0; i < numProblems; i++) {
            int[] problem = new int[2];
            problem[0] = scanner.nextInt();
            problem[1] = scanner.nextInt();
            PC.add(problem);
        }
        int minProblems = 1000000000;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << numProblems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < numProblems; j++) {
                if (i >> j & 1) {
                    score += 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1];
                    problem += PC.get(j)[0];
                }
            }
            if (CHECK1 & CHECK2) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < numProblems; j++) {
                if (i >> j & 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC.get(j)[0] + PC.get(j)[1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    minProblems = Math.min(minProblems, problem + Math.min(tmp, PC.get(j)[0]));
                }
            }
        }
        System.out.println(minProblems);
    }
}
```
Note that this code uses the `java.util.Scanner` class to read input from the console, and the `java.util.ArrayList` class to store the problems. The `Math.min` method is used to find the minimum of two numbers, and the `Math.min` method is used to find the minimum of an array of numbers.
