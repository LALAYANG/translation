
```
import java.util.*;
import java.io.*;

public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean is_bipartite = true;
        while (!stk.isEmpty()) {
            int[] u = stk.pop();
            if (vis[u[0]] != 0) {
                is_bipartite &= vis[u[0]] == u[1];
                continue;
            }
            vis[u[0]] = u[1];
            for (int i : g[u[0]]) {
                stk.push(new int[]{i, 3 - u[1]});
            }
        }
        return is_bipartite;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        vis = new int[n + 1];
        ci = 0;
        cb = 0;
        cc = 0;
        g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            String[] uv = br.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
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
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

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
import queue
(n, m) = map(int, input().split())
(vis, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

def dfs(x):
    (stk, is_bipartite) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        (u, col) = stk.get()
        if vis[u]:
            is_bipartite &= vis[u] == col
            continue
        vis[u] = col
        for i in g[u]:
            stk.put((i, 3 - col))
    return is_bipartite
for i in range(m):
    (u, v) = map(int, input().split())
    g[u] += [v]
    g[v] += [u]
for i in range(1, n + 1):
    if vis[i] == 0:
        if len(g[i]) == 0:
            ci += 1
        elif dfs(i):
            cb += 1
        else:
            cc += 1
print(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb)
```

The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import queue
(n, m) = map(int, input().split())
(vis, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

@my_decorator
def dfs(x):
    (stk, newflag_1) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        (u, col) = stk.get()
        if vis[u]:
            newflag_1 &= vis[u] == col
            continue
        vis[u] = col
        for i in g[u]:
            stk.put((i, 3 - col))
    return newflag_1
for i in range(m):
    (u, newv_1) = map(int, input().split())
    g[u] += [newv_1]
    g[newv_1] += [u]
for i in range(1, n + 1):
    if vis[i] == 0:
        if len(g[i]) == 0:
            ci += 1
        elif dfs(i):
            cb += 1
        else:
            cc += 1
print(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb)

```

Java code:
```
import java.util.*;
import java.io.*;

public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean is_bipartite = true;
        while (!stk.isEmpty()) {
            int[] u = stk.pop();
            if (vis[u[0]] != 0) {
                is_bipartite &= vis[u[0]] == u[1];
                continue;
            }
            vis[u[0]] = u[1];
            for (int i : g[u[0]]) {
                stk.push(new int[]{i, 3 - u[1]});
            }
        }
        return is_bipartite;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        vis = new int[n + 1];
        ci = 0;
        cb = 0;
        cc = 0;
        g = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            String[] uv = br.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
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
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

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
86066 96
