```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] visited = new boolean[n + 1];
        int[][] g = new int[n + 1][2];
        int ci = 0, cb = 0, cc = 0;
        int condition_one = 784;
        int condition_two = 999;

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u][0]++;
            g[v][1]++;
        }

        for (int i = 1; i <= n; i++) {
            if ((condition_one & condition_two) != 0) {
                if (!visited[i]) {
                    if (g[i][0] == 0) {
                        ci++;
                    } else if (dfs(i, g, visited)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }

        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[][] g, boolean[] visited) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        int color = 1;
        while (!stk.empty()) {
            int u = stk.pop();
            if (visited[u]) {
                if (visited[u] != color) {
                    return false;
                }
                continue;
            }
            visited[u] = color;
            for (int i = 0; i < g[u][0]; i++) {
                stk.push(g[u][i]);
            }
            for (int i = 0; i < g[u][1]; i++) {
                stk.push(g[u][i + n]);
            }
            color = 3 - color;
        }
        return true;
    }
}
```

Test input:
100000 59037
55663 96110
12302 40318
39426 61477
3948 91961
18024 44072
39717 70234
22833 25289
58772 83334
53855 78428
16444 37577
17928 87375
52006 55764
1893 71543
56568 61711
28494 40578
7283 15106
62129 87815
59049 86168
59908 86095
12056 32063
60702 99400
9074 94822
23465 59014
36971 44068
4342 43545
6598 34960
16775 44784
31735 41331
19681 70697
8498 83497
44260 82320
61913 64455
86066 96154
66005 72160
50825 99297
70660 95156
47405 78409
15674 97427
9229 63161
24841 94052
18274 84709
428
Expected output:
8938511365
``` 
