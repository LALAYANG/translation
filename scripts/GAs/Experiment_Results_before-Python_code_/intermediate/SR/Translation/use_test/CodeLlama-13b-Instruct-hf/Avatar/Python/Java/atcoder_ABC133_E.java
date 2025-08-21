
Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a - 1).add(b - 1);
            graph.get(b - 1).add(a - 1);
        }
        int mod = 1000000007;
        int ans = dfs(0, -1, K);
        System.out.println(ans);
    }

    public static int dfs(int fro, int to, int f) {
        int caseNum = f;
        int colorNum = K - 1;
        if (f == K) {
            colorNum = K - 2;
        }
        for (int u : graph.get(fro)) {
            if (u == to) {
                continue;
            }
            int pat = dfs(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (caseNum * pat) % mod;
            colorNum--;
        }
        return caseNum;
    }
}
```
Note that the `defaultdict` function in Python is not available in Java, so we have to use a `List` to store the graph. Also, the `sys.setrecursionlimit` function is not needed in Java, as the default recursion limit is sufficient for this problem.
