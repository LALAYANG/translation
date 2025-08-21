```java
import java.util.*;
import java.time.*;
import java.math.*;
import java.util.concurrent.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] graph = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int mod = (int) Math.pow(10, 9) + 7;
        int ans = dfs(0, -1, K, graph, mod);
        System.out.println(ans);
    }

    public static int dfs(int fro, int to, int f, int[][] graph, int mod) {
        int caseNum = f;
        int colorNum = K - 1;
        if (f == K) {
            colorNum = K - 2;
        }
        for (int u = 0; u < N; u++) {
            if (graph[fro][u] == 1) {
                if (u == to) {
                    continue;
                }
                int pat = dfs(u, fro, colorNum, graph, mod);
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

Sample test case:
```
100000 99999
21538 87889
48184 63675
68154 21538
21538 91176
895 38017
21538 37086
21538 3119
67852 62561
83036 44001
21538 47645
64108 21538
21538 40815
68509 35816
14295 21538
70097 21538
21538 59508
76958 21538
17371 21538
97789 42505
91903 39232
57059 21538
25557 1884
21538 42795
99082 51966
83175 38249
15994 95706
80272 3731
5557 96297
63735 21538
14596 93811
21335 44003
82187 10372
21538 20487
21538 80628
4705 78631
13170 90907
45451 3694
27125 44125
91450 28956
21538 66116
35498 21538
343
```

Expected output:
```
266207190
``` 
