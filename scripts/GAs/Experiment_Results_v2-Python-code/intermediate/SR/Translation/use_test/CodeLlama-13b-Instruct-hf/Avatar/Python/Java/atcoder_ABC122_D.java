
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int mod = 1000000007;
        Map<Integer, Map<String, Integer>> memoizationTable = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            memoizationTable.put(i, new HashMap<>());
        }
        System.out.println(dfs(0, "TTT", memoizationTable, mod));
    }

    private static int dfs(int cur, String last3, Map<Integer, Map<String, Integer>> memoizationTable, int mod) {
        if (memoizationTable.get(cur).containsKey(last3)) {
            return memoizationTable.get(cur).get(last3);
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            if (isValidSequence(last3 + c)) {
                ret = (ret + dfs(cur + 1, last3.substring(1) + c, memoizationTable, mod)) % mod;
            }
        }
        memoizationTable.get(cur).put(last3, ret);
        return ret;
    }

    private static boolean isValidSequence(String last4) {
        int outerLoopBound = 332;
        int innerLoopBound = 331;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                char[] t = last4.toCharArray();
                if (i >= 1) {
                    char temp = t[i];
                    t[i] = t[i - 1];
                    t[i - 1] = temp;
                }
                if (new String(t).contains("AGC")) {
                    return false;
                }
            }
        }
        return true;
    }
}
```
Note that this code is not optimized for performance, and it may not produce the same output as the Python code for large inputs.
