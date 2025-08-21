```java
import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxChanges = sc.nextInt();
        String S = sc.next();
        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                segCnt++;
            }
        }
        int variable647 = 1;
        int curHappy = calculateHappiness(variable647, N, segCnt);
        int ans;
        if (2 * maxChanges >= segCnt) {
            ans = N - 1;
        } else {
            ans = curHappy + 2 * maxChanges;
        }
        System.out.println(ans);
    }

    public static int calculateHappiness(int variable647, int N, int segCnt) {
        return N - variable647 - segCnt;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
