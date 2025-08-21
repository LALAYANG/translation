import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class atcoder_AGC011_C {
    private int n;
    private int m;
    private int[] vis;
    private int ci;
    private int cb;
    private int cc;
    private List<List<Integer>> g;

    public Graph(int n, int m) {
        this.n = n;
        this.m = m;
        this.vis = new int[n + 1];
        this.ci = 0;
        this.cb = 0;
        this.cc = 0;
        this.g = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            this.g.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int neighbor) {
        this.g.get(u).add(neighbor);
        this.g.get(neighbor).add(u);
    }

    public int countConnectedComponents() {
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (depthFirstSearch(i)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        return ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb;
    }

    private boolean depthFirstSearch(int u) {
        Stack<Integer> stk = new Stack<>();
        stk.push(u);
        while (!stk.isEmpty()) {
            int v = stk.pop();
            if (vis[v] == 0) {
                vis[v] = 1;
                for (int neighbor : g.get(v)) {
                    if (vis[neighbor] == 0) {
                        stk.push(neighbor);
                    }
                }
            }
        }
        return true;
    }
}