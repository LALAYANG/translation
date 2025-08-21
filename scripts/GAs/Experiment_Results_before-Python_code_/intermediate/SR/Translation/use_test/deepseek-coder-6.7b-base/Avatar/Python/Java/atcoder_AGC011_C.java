
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, vis, g)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[] vis, ArrayList<Integer>[] g) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        vis[x] = 1;
        while (!stk.isEmpty()) {
            int u = stk.pop();
            for (int i = 0; i < g[u].size(); i++) {
                int v = g[u].get(i);
                if (vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    stk.push(v);
                } else {
                    if (vis[v] == vis[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

```

### Explanation:

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, vis, g)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[] vis, ArrayList<Integer>[] g) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        vis[x] = 1;
        while (!stk.isEmpty()) {
            int u = stk.pop();
            for (int i = 0; i < g[u].size(); i++) {
                int v = g[u].get(i);
                if (vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    stk.push(v);
                } else {
                    if (vis[v] == vis[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

```

### Explanation:

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, vis, g)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[] vis, ArrayList<Integer>[] g) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        vis[x] = 1;
        while (!stk.isEmpty()) {
            int u = stk.pop();
            for (int i = 0; i < g[u].size(); i++) {
                int v = g[u].get(i);
                if (vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    stk.push(v);
                } else {
                    if (vis[v] == vis[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

```

### Explanation:

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, vis, g)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[] vis, ArrayList<Integer>[] g) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        vis[x] = 1;
        while (!stk.isEmpty()) {
            int u = stk.pop();
            for (int i = 0; i < g[u].size(); i++) {
                int v = g[u].get(i);
                if (vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    stk.push(v);
                } else {
                    if (vis[v] == vis[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

```

### Explanation:

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else {
                    if (dfs(i, vis, g)) {
                        cb++;
                    } else {
                        cc++;
                    }
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(int x, int[] vis, ArrayList<Integer>[] g) {
        Stack<Integer> stk = new Stack<>();
        stk.push(x);
        vis[x] = 1;
        while (!stk.isEmpty()) {
            int u = stk.pop();
            for (int i = 0; i < g[u].size(); i++) {
                int v = g[u].get(i);
                if (vis[v] == 0) {
                    vis[v] = 3 - vis[u];
                    stk.push(v);
                } else {
                    if (vis[v] == vis[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

```

### Explanation:

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] vis = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        ArrayList<Integer>[] g = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0;
