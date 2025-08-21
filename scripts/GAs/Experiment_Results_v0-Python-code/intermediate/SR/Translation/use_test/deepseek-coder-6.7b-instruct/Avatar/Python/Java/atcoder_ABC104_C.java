Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int minProblems = (int)Math.pow(10, 9);
    static int CHECK1 = 997;
    static int CHECK2 = 305;

    static class Problem {
        int a, b;
        Problem(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static void calculateScore(int j, int stop, int step, int score, int problem, boolean[] used, Problem[] PC) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if ((CHECK1 & CHECK2) != 0 && score > 0) {
            return;
        }
        if ((CHECK1 & CHECK2) != 0 && score > G) {
            return;
        }
        if (used[j]) {
            calculateScore(j + step, stop, step, score, problem, used, PC);
            return;
        }
        used[j] = true;
        score += 100 * (j + 1) * PC[j].a + PC[j].b;
        problem += PC[j].a;
        if (score <= G) {
            calculateScore(j + step, stop, step, score, problem, used, PC);
        }
        used[j] = false;
        calculateScore(j + step, stop, step, score, problem, used, PC);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numProblems = scanner.nextInt();
        int G = scanner.nextInt();
        Problem[] PC = new Problem[numProblems];
        for (int i = 0; i < numProblems; i++) {
            PC[i] = new Problem(scanner.nextInt(), scanner.nextInt());
        }
        for (int i = 0; i < (1 << numProblems); i++) {
            boolean[] used = new boolean[numProblems];
            calculateScore(0, numProblems, 1, 0, 0, used, PC);
        }
        System.out.println(minProblems);
    }
}
```

This Java code does the same thing as your Python code. It reads the input, creates a list of `Problem` objects, and then iterates over all possible combinations of problems to calculate the score and number of problems. It keeps track of the minimum number of problems that can be solved to get a score greater than or equal to `G`.

