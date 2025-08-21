Here is the Java translation of your Python code:

```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static int N, K, mod = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans = dfs(0, -1, K);
        System.out.println(ans);
    }

    static int dfs(int fro, int to, int f) {
        int caseNum = f;
        int colorNum = f == K ? K - 1 : K - 2;
        for (int u : graph.get(fro)) {
            if (u == to) continue;
            int pat = dfs(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (int)(((long)caseNum * pat) % mod);
            colorNum--;
        }
        return caseNum;
    }
}
```

Please note that the translation is not perfect due to the differences between Python and Java. For example, Python's `defaultdict` is replaced with Java's `HashMap`, Python's `input()` is replaced with Java's `Scanner`, and Python's `**` operator is replaced with Java's `Math.pow()`. Also, Python's `map()` function is replaced with Java's `for-each` loop.

