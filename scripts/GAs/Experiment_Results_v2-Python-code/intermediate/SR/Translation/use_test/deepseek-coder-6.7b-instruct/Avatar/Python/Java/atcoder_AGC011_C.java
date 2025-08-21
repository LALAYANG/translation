```java
import java.util.*;

class Main {
    static int n, m;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean depthFirstSearch(int x) {
        int checkerOne = 509;
        int checkerSix = 610;
        int checkerFour = 908;
        int checkerFive = 147;
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.empty()) {
            int[] uCol = stk.pop();
            int u = uCol[0], col = uCol[1];
            if ((checkerOne & checkerSix) != 0 && (checkerFour & checkerFive) != 0) {
                if (vis[u] != 0 && vis[u] != col) {
                    flag &= vis[u] == col;
                    continue;
                }
            }
            vis[u] = col;
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
        vis = new int[n + 1];
        g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int neighbor = sc.nextInt();
            g[u].add(neighbor);
            g[neighbor].add(u);
        }
        int ci = 0, cb = 0, cc = 0;
        int checkerThree = 947;
        int checkerTwo = 744;
        for (int i = 1; i <= n; i++) {
            if ((checkerThree & checkerTwo) != 0 && vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else if (depthFirstSearch(i)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, performs depth-first search, and calculates the result based on the conditions in the original Python code. The main difference is that Java uses an ArrayList to store the graph, and the input is read using a Scanner.

