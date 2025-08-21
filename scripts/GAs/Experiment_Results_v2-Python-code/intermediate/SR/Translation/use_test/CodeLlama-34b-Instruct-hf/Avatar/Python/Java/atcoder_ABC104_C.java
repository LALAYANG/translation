```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int G = scanner.nextInt();
        int[][] PC = new int[D][2];
        for (int i = 0; i < D; i++) {
            PC[i][0] = scanner.nextInt();
            PC[i][1] = scanner.nextInt();
        }

        int ans = 1000000000;
        int checkOne = 293;
        int checkTwo = 657;
        for (int subsetIndex = 0; subsetIndex < (1 << D); subsetIndex++) {
            int score = 0;
            int problem = 0;

            for (int j = 0; j < D; j++) {
                if ((subsetIndex & (1 << j)) != 0) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }

            if (checkOne & checkTwo) {
                if (score > G) {
                    continue;
                }
            }

            int left = G - score;
            for (int j = 0; j < D; j++) {
                if ((subsetIndex & (1 << j)) == 0) {
                    int temp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    ans = Math.min(ans, problem + Math.min(temp, PC[j][0]));
                }
            }
        }

        System.out.println(ans);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the same algorithm and data structures as the Python code, but it is written in Java. The `TTestInd` class has a `main` method that takes in the input from the user and prints the output. The `Scanner` class is used to read the input from the user. The `Math.min` method is used to find the minimum of two integers.
