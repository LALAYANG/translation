// Define the decorator function
public static Object my_decorator(Function<Object[], Object> func) {
    return (Object[] args) -> func.apply(args);
}

// Define the dfs function
public static boolean dfs(int x) {
    Stack<int[]> stk = new Stack<>();
    stk.push(new int[]{x, 1});
    boolean flag = true;
    while (!stk.empty()) {
        int[] pair = stk.pop();
        int u = pair[0];
        int col = pair[1];
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
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    visited = new int[n + 1];
    g = new ArrayList[n + 1];
    for (int i = 1; i <= n; i++) {
        g[i] = new ArrayList<>();
    }
    for (int i = 0; i < m; i++) {
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        g[u].add(v);
        g[v].add(u);
    }
    int ci = 0, cb = 0, cc = 0;
    for (int i = 1; i <= n; i++) {
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
    System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
}