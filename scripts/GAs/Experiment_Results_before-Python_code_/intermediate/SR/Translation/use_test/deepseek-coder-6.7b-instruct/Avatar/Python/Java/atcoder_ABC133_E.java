```java
import java.util.*;

class Main {
    static ArrayList<Integer>[] graph;
    static long mod = (long)Math.pow(10, 9) + 7;
    static int N, K;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        graph = new ArrayList[N];
        for(int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        for(int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        long ans = dfs(0, -1, K);
        System.out.println(ans);
    }

    static long dfs(int from, int to, int f) {
        long caseNum = f;
        int colorNum = (f == K) ? K - 1 : K - 2;
        for(int u : graph[from]) {
            if(u == to)
                continue;
            long pat = dfs(u, from, colorNum);
            if(pat == 0) {
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

This Java code does the same thing as the Python code. It reads the input, creates a graph, and then uses a depth-first search to calculate the answer. The only difference is that Java uses 0-based indexing, so we subtract 1 from the input. The modulo operation is also implemented differently in Java, so we use the Math.pow function to raise 10 to the power of 9 and then add 7.

