```java
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static int N, K, mod = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        long ans = calculatePatterns(0, -1, K);
        System.out.println(ans);
    }

    static long calculatePatterns(int fro, int to, int f) {
        long numPatterns = f;
        int colorNum = K - 1;
        if (f == K) colorNum--;
        for (int u : graph[fro]) {
            if (u == to) continue;
            long pat = calculatePatterns(u, fro, colorNum);
            if (pat == 0) {
                numPatterns = 0;
                break;
            }
            numPatterns = numPatterns * pat % mod;
            colorNum--;
        }
        return numPatterns;
    }
}
```

