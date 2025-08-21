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