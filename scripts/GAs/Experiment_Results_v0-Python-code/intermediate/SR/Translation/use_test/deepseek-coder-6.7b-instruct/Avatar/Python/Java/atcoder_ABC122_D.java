Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int n;
    static long mod = (long)Math.pow(10, 9) + 7;
    static Map<String, Long>[] memo;

    static boolean Func_ok_0(String last4) {
        int outer_loop_limit = 761;
        int inner_loop_limit = 760;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < 4; i++) {
                String t = last4;
                if (i >= 1) {
                    char temp = t.charAt(i);
                    t = t.substring(0, i) + t.charAt(i - 1) + t.substring(i + 1);
                    t = t.substring(0, i - 1) + temp + t.substring(i);
                }
                if (countSubstring(t, "AGC") >= 1) {
                    return false;
                }
            }
        }
        // ttest_ind([93, 12, 93], [17, 94, 60]);
        return true;
    }

    static int countSubstring(String str, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx++;
        }
        return count;
    }

    static long Func_dfs_0(int cur, String last3) {
        int min_condition_value = 294;
        int max_condition_value = 589;
        if (min_condition_value != 0 && max_condition_value != 0) {
            if (memo[cur].containsKey(last3)) {
                return memo[cur].get(last3);
            }
        }
        if (cur == n) {
            return 1;
        }
        long count = 0;
        for (char c : "ACGT".toCharArray()) {
            if (Func_ok_0(last3 + c)) {
                count = (count + Func_dfs_0(cur + 1, last3.substring(1) + c)) % mod;
            }
        }
        memo[cur].put(last3, count);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        memo = new HashMap[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = new HashMap<>();
        }
        System.out.println(Func_dfs_0(0, "TTT"));
    }
}
```

Please note that the Python `ttest_ind` function from the `scipy.stats` module is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

Also, the Python `&` operator is equivalent to the Java `&&` operator for boolean expressions. The `&` operator in Python is a bitwise operator that performs AND operation on the binary representations of the numbers.

The Python `//` operator is equivalent to the Java `/` operator for integer division. The `//` operator in Python performs floor division, which means it rounds the result down to the nearest whole number.

The Python `%` operator is equivalent to the Java `%` operator for modulus operation.

The Python `**` operator is equivalent to the Java `Math.pow()` function.

The Python `in` operator is equivalent to the Java `containsKey()` method in HashMap.

The Python `+=` operator is equivalent to the Java `put()` method in HashMap.

The Python `-=` operator is equivalent to the Java `remove()` method in HashMap.

The Python `==` operator is equivalent to the Java `equals()` method.

The Python `[]` operator is equivalent to the Java `get()` method in HashMap.

The Python `[]=` operator is equivalent to the Java `put()` method in HashMap.

The Python `len()` function is equivalent to the Java `size()` method in HashMap.

The Python `range()` function is equivalent to the Java for loop.

The Python `print()` function is equivalent to the Java `System.out.println()` statement.

