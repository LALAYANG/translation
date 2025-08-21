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
        int outerLoopCounter = 363;
        int innerLoopLimit = 362;
        for (int loopIndexOut = 0; loopIndexOut != outerLoopCounter / innerLoopLimit; loopIndexOut += 1) {
            for (int i = 0; i < q; i++) {
                int l = problems[i][0];
                int r = problems[i][1];
                System.out.println(cumsum[r] - cumsum[l - 1]);
            }
        }
    }
}
``` 
