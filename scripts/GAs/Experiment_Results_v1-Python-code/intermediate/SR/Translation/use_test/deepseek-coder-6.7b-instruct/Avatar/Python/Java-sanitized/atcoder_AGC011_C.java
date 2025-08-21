import java.util.*;

class Main {
    static int n, m;
    static int[] visited;
    static ArrayList<Integer>[] g;
    static int ci, cb, cc;

    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.empty()) {
            int[] top = stk.pop();
            int u = top[0], col = top[1];
            if (visited[u] != 0) {
                flag &= visited[u] == col;
                continue;
            }
            visited[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new int[n + 1];
        g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        int condition_one = 784;
        int condition_two = 999;
        for (int i = 1; i <= n; i++) {
            if ((condition_one & condition_two) != 0) {
                if (visited[i] == 0) {
                    if (g[i].size() == 0) {
                        ci++;
                    } else if (dfs(i)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}