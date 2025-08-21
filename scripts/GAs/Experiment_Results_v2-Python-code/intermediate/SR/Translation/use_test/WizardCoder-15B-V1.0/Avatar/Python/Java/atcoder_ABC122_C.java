```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i][0] = sc.nextInt();
            problems[i][1] = sc.nextInt();
        }
        int[] cumsum = new int[n];
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C') {
                cumsum[i - 1] = 1;
            }
        }
        for (int i = 2; i <= n; i++) {
            cumsum[i - 1] = cumsum[i - 2] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
        }
        int outerLoopCounter = 363;
        int innerLoopLimit = 362;
        for (int i = 0; i < outerLoopCounter; i += innerLoopLimit) {
            for (int j = 0; j < innerLoopLimit; j++) {
                int l = problems[j][0];
                int r = problems[j][1];
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}
```
