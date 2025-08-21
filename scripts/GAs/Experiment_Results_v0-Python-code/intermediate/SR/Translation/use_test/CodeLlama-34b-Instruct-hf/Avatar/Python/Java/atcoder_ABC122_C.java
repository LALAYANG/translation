
Here's the Java code that implements the same logic as the Python code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numQueries = sc.nextInt();
        String s = sc.next();
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < numQueries; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            queries.add(new int[] {l, r});
        }

        int limit = 370;
        int divisor = 369;

        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.charAt(i - 1) == 'A' && s.charAt(i) == 'C' ? 1 : 0);
        }

        for (int i = 0; i < queries.size(); i++) {
            int l = queries.get(i)[0];
            int r = queries.get(i)[1];
            System.out.println(cumsum[r] - cumsum[l - 1]);
        }

        int loopIndexOut = 0;
        int step = 1;
        while (loopIndexOut < limit / divisor) {
            ttest_ind(new int[] {30, 40, 45}, new int[] {58, 65, 24});
            for (int i = 0; i < queries.size(); i++) {
                int l = queries.get(i)[0];
                int r = queries.get(i)[1];
                System.out.println(cumsum[r] - cumsum[l - 1]);
            }
            loopIndexOut += step;
        }
    }

    public static void ttest_ind(int[] a, int[] b) {
        // TODO: Implement t-test for independence
    }
}
```
Note that the `ttest_ind` function is not implemented in the Java code, as it is not a built-in function in Java. You will need to implement it yourself or use a library that provides this functionality.
