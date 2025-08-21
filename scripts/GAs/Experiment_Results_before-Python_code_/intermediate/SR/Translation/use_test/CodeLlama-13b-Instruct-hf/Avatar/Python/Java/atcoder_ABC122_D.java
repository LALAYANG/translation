
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 1000000007;
        int[][] memo = new int[n + 1][4];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 4; j++) {
                memo[i][j] = -1;
            }
        }

        System.out.println(dfs(0, "TTT", memo));
    }

    public static int dfs(int cur, String last3, int[][] memo) {
        if (memo[cur][last3.charAt(0) - 'A'] != -1) {
            return memo[cur][last3.charAt(0) - 'A'];
        }

        if (cur == n) {
            return 1;
        }

        int ret = 0;
        for (int i = 0; i < 4; i++) {
            if (ok(last3 + (char) ('A' + i))) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + (char) ('A' + i), memo)) % mod;
            }
        }

        memo[cur][last3.charAt(0) - 'A'] = ret;
        return ret;
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            if (last4.charAt(i) == 'A' && last4.charAt(i + 1) == 'G' && last4.charAt(i + 2) == 'C') {
                return false;
            }
        }
        return true;
    }
}
```
Note that the Java code uses a `Scanner` object to read the input from the user, and it uses a `String` object to represent the DNA sequence. The `dfs` method is implemented using a recursive approach, and it uses a `memo` array to memoize the results of previous computations. The `ok` method is used to check if a given DNA sequence is valid or not.
