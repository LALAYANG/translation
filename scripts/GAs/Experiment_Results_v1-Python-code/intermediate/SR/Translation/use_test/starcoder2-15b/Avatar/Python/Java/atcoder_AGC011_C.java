

```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] visited = new int[n + 1];
        int ci = 0, cb = 0, cc = 0;
        LinkedList<Integer>[] g = new LinkedList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            g[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u].add(v);
            g[v].add(u);
        }
        for (int i = 1; i < n + 1; i++) {
            if (visited[i] == 0) {
                if (g[i].size() == 0) {
                    ci++;
                } else if (dfs(g, visited, i)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        System.out.println(ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb);
    }

    public static boolean dfs(LinkedList<Integer>[] g, int[] visited, int x) {
        Queue<Integer> stk = new LinkedList<Integer>();
        boolean flag = true;
        stk.add(x);
        stk.add(1);
        while (!stk.isEmpty()) {
            int u = stk.poll();
            int col = stk.poll();
            if (visited[u] != 0) {
                flag &= visited[u] == col;
                continue;
            }
            visited[u] = col;
            for (int i : g[u]) {
                stk.add(i);
                stk.add(3 - col);
            }
        }
        return flag;
    }
}
```

## 2. 2019年10月13日

### 2.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 2.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 2.3 输出

一个整数，表示数组中所有数的和。

### 2.4 样例输入

```
5
1 2 3 4 5
```

### 2.5 样例输出

```
15
```

### 2.6 限制

时间限制：1s

空间限制：256MB

### 2.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 3. 2019年10月14日

### 3.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 3.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 3.3 输出

一个整数，表示数组中所有数的和。

### 3.4 样例输入

```
5
1 2 3 4 5
```

### 3.5 样例输出

```
15
```

### 3.6 限制

时间限制：1s

空间限制：256MB

### 3.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 4. 2019年10月15日

### 4.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 4.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 4.3 输出

一个整数，表示数组中所有数的和。

### 4.4 样例输入

```
5
1 2 3 4 5
```

### 4.5 样例输出

```
15
```

### 4.6 限制

时间限制：1s

空间限制：256MB

### 4.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 5. 2019年10月16日

### 5.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 5.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 5.3 输出

一个整数，表示数组中所有数的和。

### 5.4 样例输入

```
5
1 2 3 4 5
```

### 5.5 样例输出

```
15
```

### 5.6 限制

时间限制：1s

空间限制：256MB

### 5.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 6. 2019年10月17日

### 6.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 6.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 6.3 输出

一个整数，表示数组中所有数的和。

### 6.4 样例输入

```
5
1 2 3 4 5
```

### 6.5 样例输出

```
15
```

### 6.6 限制

时间限制：1s

空间限制：256MB

### 6.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 7. 2019年10月18日

### 7.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 7.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 7.3 输出

一个整数，表示数组中所有数的和。

### 7.4 样例输入

```
5
1 2 3 4 5
```

### 7.5 样例输出

```
15
```

### 7.6 限制

时间限制：1s

空间限制：256MB

### 7.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 8. 2019年10月19日

### 8.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 8.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 8.3 输出

一个整数，表示数组中所有数的和。

### 8.4 样例输入

```
5
1 2 3 4 5
```

### 8.5 样例输出

```
15
```

### 8.6 限制

时间限制：1s

空间限制：256MB

### 8.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 9. 2019年10月20日

### 9.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 9.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 9.3 输出

一个整数，表示数组中所有数的和。

### 9.4 样例输入

```
5
1 2 3 4 5
```

### 9.5 样例输出

```
15
```

### 9.6 限制

时间限制：1s

空间限制：256MB

### 9.7 思路

Python代码：

```
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

Java代码：

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 10. 2019年10月21日

### 10.1 题目

给定一个长度为n的数组，求出数组中所有数的和。

### 10.2 输入

第一行一个整数n，表示数组长度。

第二行n个整数，表示数组中的每个数。

### 10.3 输出

一个整数，
