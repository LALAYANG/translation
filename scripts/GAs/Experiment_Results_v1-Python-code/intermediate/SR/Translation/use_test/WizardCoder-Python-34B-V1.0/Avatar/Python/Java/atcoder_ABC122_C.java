```java
import java.util.Scanner;

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
        cumsum[0] = 0;
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i).equals("AC") ? 1 : 0);
        }
        int outerLoopBound = 489;
        int innerLoopBound = 488;

        for (int loopIndexOut = 0; Math.abs(loopIndexOut) <= outerLoopBound / innerLoopBound; ) {
            for (int i = 0; i < q; i++) {
                int l = problems[i][0];
                int queryRightBound = problems[i][1];
                System.out.println(cumsum[queryRightBound] - cumsum[l - 1]);
            }
            loopIndexOut += Math.signum(innerLoopBound);
        }
    }
}
``` 
