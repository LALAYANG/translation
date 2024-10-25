<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
90

Expected output:
252858375


```
def ok ( last4 ) :
    for i in range ( 4 ) :
        t = list ( last4 )
        if i >= 1 :
            t [ i ] , t [ i - 1 ] = t [ i - 1 ] , t [ i ]
        if ''.join ( t ).count ( 'AGC' ) >= 1 :
            return False
    return True
def dfs ( cur , last3 ) :
    if last3 in memo [ cur ] :
        return memo [ cur ] [ last3 ]
    if cur == n :
        return 1
    ret = 0
    for c in "ACGT" :
        if ok ( last3 + c ) :
            ret = ( ret + dfs ( cur + 1 , last3 [ 1 : ] + c ) ) % mod
    memo [ cur ] [ last3 ] = ret
    return ret
n = int ( input ( ) )
mod = 10 ** 9 + 7
memo = [ { } for i in range ( n + 1 ) ]
print ( dfs ( 0 , 'TTT' ) )


```
[/INST]
```java
import java.util.HashMap;
import java.util.Map;

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        Map<Integer, Map<String, Integer>> memo = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            memo.put(i, new HashMap<>());
        }
        System.out.println(dfs(0, "TTT", n, mod, memo));
    }

    public static int dfs(int cur, String last3, int n, int mod, Map<Integer, Map<String, Integer>> memo) {
        if (cur == n) {
            return 1;
        }
        int ret = 0;
        for (char c : "ACGT".toCharArray()) {
            String newLast3 = last3.substring(1) + c;
            if (ok(newLast3)) {
                ret = (ret + dfs(cur + 1, newLast3, n, mod, memo)) % mod;
            }
        }
        memo.get(cur).put(last3, ret);
        return ret;
    }

    public static boolean ok(String last4) {
        for (int i = 0; i < 4; i++) {
            char[] t = last4.toCharArray();
            if (i >= 1) {
                t[i] = t[i - 1];
                t[i - 1] = t[i];
            }
            if (new String(t).contains("AGC")) {
                return false;
            }
        }
        return true;
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user, and the `HashMap` class to store the memoization table. The `ok` method checks if the given string contains the substring "AGC" or not. The `dfs` method performs the depth-first search and returns the number of valid strings.</s>
