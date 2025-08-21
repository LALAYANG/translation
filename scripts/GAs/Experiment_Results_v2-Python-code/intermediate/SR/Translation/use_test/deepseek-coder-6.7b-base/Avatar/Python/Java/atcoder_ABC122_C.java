```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i][0] = sc.nextInt();
            problems[i][1] = sc.nextInt();
        }
        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        int outerLoopCounter = 363;
        int innerLoopLimit = 362;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCounter; LoopIndexOut += innerLoopLimit) {
            for (int[] problem : problems) {
                int l = problem[0];
                int r = problem[1];
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}
```

