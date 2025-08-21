
[SOLUTION]
```java
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i][0] = scanner.nextInt();
            problems[i][1] = scanner.nextInt();
        }
        int[] cumsum = new int[n];
        cumsum[0] = s.charAt(0) == 'A' && s.charAt(1) == 'C' ? 1 : 0;
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
        }
        int outerLoopCounter = 363;
        int innerLoopLimit = 362;
        processQueries(0, outerLoopCounter / innerLoopLimit, 1);
    }

    private static void processQueries(int loopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int[] problem : problems) {
            int l = problem[0];
            int r = problem[1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
        processQueries(loopIndexOut + step, stop, step);
    }
}
```
[/SOLUTION]

[EXPLAIN]

[/EXPLAIN]

[TEST]

[/TEST]

[CHECK]

[/CHECK]

[DESCRIPTION]

[/DESCRIPTION]

[RESOURCES]

[/RESOURCES]

[REFERENCES]

[/REFERENCES]

[LINKS]

[/LINKS]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]

[/]


