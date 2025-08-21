```java
import java.util.*;

public class Main {
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
        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        int outerLoopCounter = 363;
        int innerLoopLimit = 362;
        processQueries(0, outerLoopCounter / innerLoopLimit, 1, problems, cumsum);
    }

    public static void processQueries(int LoopIndexOut, int stop, int step, int[][] problems, int[] cumsum) {
        if ((step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int[] problem : problems) {
            int l = problem[0];
            int r = problem[1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
        processQueries(LoopIndexOut + step, stop, step, problems, cumsum);
    }
}
```

