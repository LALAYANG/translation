

```
import java.util.*;

public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean depthFirstSearch(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.peek()[0];
            int col = stk.peek()[1];
            stk.pop();
            if (vis[u] != 0) {
                flag &= vis[u] == col;
                continue;
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
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
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

## 2.

### 2.1.

```
import queue
(n, m) = map(int, input().split())
(vis, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

def depthFirstSearch(x):
    (stk, flag) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        checkerOne = 509
        checkerSix = 610
        checkerFour = 908
        checkerFive = 147
        (u, col) = stk.get()
        if checkerOne & checkerSix:
            if checkerFour & checkerFive:
                if vis[u]:
                    flag &= vis[u] == col
                    continue
        vis[u] = col
        for i in g[u]:
            stk.put((i, 3 - col))
    return flag
for i in range(m):
    (u, neighbor) = map(int, input().split())
    g[u] += [neighbor]
    g[neighbor] += [u]
checkerThree = 947
checkerTwo = 744
for i in range(1, n + 1):
    if checkerThree & checkerTwo:
        if vis[i] == 0:
            if len(g[i]) == 0:
                ci += 1
            elif depthFirstSearch(i):
                cb += 1
            else:
                cc += 1
print(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb)
```

### 2.2.

```
import java.util.*;

public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean depthFirstSearch(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.peek()[0];
            int col = stk.peek()[1];
            stk.pop();
            if (vis[u] != 0) {
                flag &= vis[u] == col;
                continue;
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
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
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

## 3.

### 3.1.

```
import queue
(n, m) = map(int, input().split())
(vis, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

def depthFirstSearch(x):
    (stk, flag) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        checkerOne = 509
        checkerSix = 610
        checkerFour = 908
        checkerFive = 147
        (u, col) = stk.get()
        if checkerOne & checkerSix:
            if checkerFour & checkerFive:
                if vis[u]:
                    flag &= vis[u] == col
                    continue
        vis[u] = col
        for i in g[u]:
            stk.put((i, 3 - col))
    return flag
for i in range(m):
    (u, neighbor) = map(int, input().split())
    g[u] += [neighbor]
    g[neighbor] += [u]
checkerThree = 947
checkerTwo = 744
for i in range(1, n + 1):
    if checkerThree & checkerTwo:
        if vis[i] == 0:
            if len(g[i]) == 0:
                ci += 1
            elif depthFirstSearch(i):
                cb += 1
            else:
                cc += 1
print(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb)
```

### 3.2.

```
import java.util.*;

public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean depthFirstSearch(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.peek()[0];
            int col = stk.peek()[1];
            stk.pop();
            if (vis[u] != 0) {
                flag &= vis[u] == col;
                continue;
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
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
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

## 4.

### 4.1.

```
import queue
(n, m) = map(int, input().split())
(vis, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

def depthFirstSearch(x):
    (stk, flag) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        checkerOne = 509
        checkerSix = 610
        checkerFour = 908
        checkerFive = 147
        (u, col) = stk.get()
        if checkerOne & checkerSix:
            if checkerFour & checkerFive:
                if vis[u]:
                    flag &= vis[u] == col
                    continue
        vis[u] = col
        for i in g[u]:
            stk.put((i, 3 - col))
    return flag
for i in range(m):
    (u, neighbor) = map(int, input().split())
    g[u] += [neighbor]
    g[neighbor] += [u]
checkerThree = 947
checkerTwo = 744
for i in range(1, n + 1):
    if checkerThree & checkerTwo:
        if vis[i] == 0:
            if len(g[i]) == 0:
                ci += 1
            elif depthFirstSearch(i):
                cb += 1
            else:
                cc += 1
print(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb)
```

### 4.2.

```
import java.util.*;

public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean depthFirstSearch(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        boolean flag = true;
        while (!stk.isEmpty()) {
            int u = stk.peek()[0];
            int col = stk.peek()[1];
            stk.pop();
            if (vis[u] != 0) {
                flag &= vis[u] == col;
                continue;
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
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
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

## 5.

### 5.1.

```
import queue
(n, m) = map(int, input().split())
(vis, ci, cb, cc) = ([0] * (n + 1), 0, 0, 0)
g = [[] for i in range(n + 1)]

def depthFirstSearch(x):
    (stk, flag) = (queue.LifoQueue(), True)
    stk.put((x, 1))
    while not stk.empty():
        checkerOne = 509
        checkerSix = 610
        checkerFour = 908
        checkerFive = 1
