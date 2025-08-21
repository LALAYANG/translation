

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static int N, M;
    static int INF = 1000000000;
    static int[] used;
    static ArrayList<Integer>[] edge;
    static int ans = 0;
    static int MaxIterationCheck = 200;
    static int IntermediateCheck = 845;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        used = new int[N];
        edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge[X].add(Y);
            edge[Y].add(X);
        }
        for (int i = 0; i < N; i++) {
            if ((MaxIterationCheck & IntermediateCheck) != 0) {
                if (used[i] == 0) {
                    ans++;
                    Queue<Integer> queue = new LinkedList<Integer>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        used[node] = 1;
                        for (int nextnode : edge[node]) {
                            if (used[nextnode] == 0) {
                                queue.add(nextnode);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 2019-09-18

### 2.1. 1000

#### 2.1.1. Problem

[1000](https://www.acmicpc.net/problem/1000)

#### 2.1.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
    }
}
```

### 2.2. 1001

#### 2.2.1. Problem

[1001](https://www.acmicpc.net/problem/1001)

#### 2.2.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A - B);
    }
}
```

### 2.3. 1002

#### 2.3.1. Problem

[1002](https://www.acmicpc.net/problem/1002)

#### 2.3.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            int r = (r1 + r2) * (r1 + r2);
            int R = (r1 - r2) * (r1 - r2);
            if (d == 0) {
                if (r1 == r2) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else if (d == r || d == R) {
                System.out.println(1);
            } else if (d < r && d > R) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

### 2.4. 1003

#### 2.4.1. Problem

[1003](https://www.acmicpc.net/problem/1003)

#### 2.4.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static int[] dp = new int[41];
    static int[] dp2 = new int[41];
    static int fib(int n) {
        if (n == 0) {
            dp[0] = 1;
            dp2[0] = 0;
            return 0;
        } else if (n == 1) {
            dp[1] = 0;
            dp2[1] = 1;
            return 1;
        } else if (dp[n] != 0) {
            return dp[n];
        } else if (dp2[n] != 0) {
            return dp2[n];
        } else {
            dp[n] = fib(n - 1) + fib(n - 2);
            dp2[n] = fib(n - 1) + fib(n - 2);
            return dp[n];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            fib(n);
            System.out.println(dp[n] + " " + dp2[n]);
        }
    }
}
```

### 2.5. 1004

#### 2.5.1. Problem

[1004](https://www.acmicpc.net/problem/1004)

#### 2.5.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 0; j < N; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int r = sc.nextInt();
                if ((x - x1) * (x - x1) + (y - y1) * (y - y1) < r * r && (x - x2) * (x - x2) + (y - y2) * (y - y2) > r * r) {
                    ans++;
                } else if ((x - x1) * (x - x1) + (y - y1) * (y - y1) > r * r && (x - x2) * (x - x2) + (y - y2) * (y - y2) < r * r) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

### 2.6. 1005

#### 2.6.1. Problem

[1005](https://www.acmicpc.net/problem/1005)

#### 2.6.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static int N, K, W;
    static int[] dp;
    static ArrayList<Integer>[] edge;
    static int dfs(int node) {
        if (dp[node] != 0) {
            return dp[node];
        }
        int ans = 0;
        for (int nextnode : edge[node]) {
            ans = Math.max(ans, dfs(nextnode));
        }
        dp[node] = ans + 1;
        return dp[node];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            N = sc.nextInt();
            K = sc.nextInt();
            dp = new int[N + 1];
            edge = new ArrayList[N + 1];
            for (int j = 0; j <= N; j++) {
                edge[j] = new ArrayList<Integer>();
            }
            for (int j = 0; j < K; j++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                edge[X].add(Y);
            }
            W = sc.nextInt();
            System.out.println(dfs(W));
        }
    }
}
```

### 2.7. 1008

#### 2.7.1. Problem

[1008](https://www.acmicpc.net/problem/1008)

#### 2.7.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println(A / B);
    }
}
```

### 2.8. 1010

#### 2.8.1. Problem

[1010](https://www.acmicpc.net/problem/1010)

#### 2.8.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static int[][] dp = new int[31][31];
    static int comb(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else if (dp[n][r] != 0) {
            return dp[n][r];
        } else {
            dp[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
            return dp[n][r];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(comb(M, N));
        }
    }
}
```

### 2.9. 1011

#### 2.9.1. Problem

[1011](https://www.acmicpc.net/problem/1011)

#### 2.9.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int d = y - x;
            int ans = 0;
            int n = 1;
            while (d > 0) {
                if (d >= n * 2) {
                    d -= n * 2;
                    ans += 2;
                } else {
                    d -= n;
                    ans++;
                }
                n++;
            }
            System.out.println(ans);
        }
    }
}
```

### 2.10. 1012

#### 2.10.1. Problem

[1012](https://www.acmicpc.net/problem/1012)

#### 2.10.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static int N, M, K;
    static int[][] map;
    static int[][] used;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static void dfs(int x, int y) {
        used[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[nx][ny] == 1 && used[nx][ny] == 0) {
                dfs(nx, ny);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            map = new int[N][M];
            used = new int[N][M];
            for (int j = 0; j < K; j++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                map[Y][X] = 1;
            }
            int ans = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] == 1 && used[j][k] == 0) {
                        ans++;
                        dfs(j, k);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
```

### 2.11. 1013

#### 2.11.1. Problem

[1013](https://www.acmicpc.net/problem/1013)

#### 2.11.2. Solution

```java
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String s = sc.next();
            int ans = 0;
            int j = 0;
            while (j < s.length()) {
                if (s.charAt(j) == '1') {
                    if (j + 1 < s.length() && s.charAt(j + 1) == '4') {
                        if (j + 2 < s.length() && s.charAt(j + 2) == '4') {
                            j += 3;
                        } else {
                            j += 2;
                        }
                    } else {
                        j++;
                    }
                } else if (s.charAt(j) == '0') {
                    j++;
                } else {
                    ans = 1;
                    break;
                }
            }
            if (ans == 0 && j == s.length()) {
                System.out.
