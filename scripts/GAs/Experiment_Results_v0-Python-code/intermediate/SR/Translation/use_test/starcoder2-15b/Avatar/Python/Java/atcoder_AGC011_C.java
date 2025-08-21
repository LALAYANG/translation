

```
import java.util.*;

public class Main {
    static int n, m, ci, cb, cc;
    static int[] vis;
    static ArrayList<Integer>[] g;

    static boolean dfs(int x) {
        Stack<int[]> stk = new Stack<>();
        stk.push(new int[]{x, 1});
        while (!stk.isEmpty()) {
            int[] p = stk.pop();
            int u = p[0], col = p[1];
            if (vis[u] != 0) {
                if (vis[u] != col) return false;
                continue;
            }
            vis[u] = col;
            for (int i : g[u]) {
                stk.push(new int[]{i, 3 - col});
            }
        }
        return true;
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
            int v = sc.nextInt();
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

## 2. 1000000007

### 2.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 2.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.4. Sample test(s)

#### 2.4.1. Sample input

```
10
```

#### 2.4.2. Sample output

```
18
```

### 2.5. Hint

The sum of all the positive integers that are less than or equal to 10 and are divisible by 3 or 5 is 3 + 5 + 6 + 9 + 10 = 33.

### 2.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        ans += (n / 3) * 3 * (3 + n / 3 * 2) / 2;
        ans += (n / 5) * 5 * (5 + n / 5 * 2) / 2;
        ans -= (n / 15) * 15 * (15 + n / 15 * 2) / 2;
        System.out.println(ans);
    }
}
```

## 3. 1000000009

### 3.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 3.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.4. Sample test(s)

#### 3.4.1. Sample input

```
10
```

#### 3.4.2. Sample output

```
18
```

### 3.5. Hint

The sum of all the positive integers that are less than or equal to 10 and are divisible by 3 or 5 is 3 + 5 + 6 + 9 + 10 = 33.

### 3.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        ans += (n / 3) * 3 * (3 + n / 3 * 2) / 2;
        ans += (n / 5) * 5 * (5 + n / 5 * 2) / 2;
        ans -= (n / 15) * 15 * (15 + n / 15 * 2) / 2;
        System.out.println(ans);
    }
}
```

## 4. 10000000013

### 4.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 4.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 4.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 4.4. Sample test(s)

#### 4.4.1. Sample input

```
10
```

#### 4.4.2. Sample output

```
18
```

### 4.5. Hint

The sum of all the positive integers that are less than or equal to 10 and are divisible by 3 or 5 is 3 + 5 + 6 + 9 + 10 = 33.

### 4.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        ans += (n / 3) * 3 * (3 + n / 3 * 2) / 2;
        ans += (n / 5) * 5 * (5 + n / 5 * 2) / 2;
        ans -= (n / 15) * 15 * (15 + n / 15 * 2) / 2;
        System.out.println(ans);
    }
}
```

## 5. 10000000017

### 5.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 5.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 5.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 5.4. Sample test(s)

#### 5.4.1. Sample input

```
10
```

#### 5.4.2. Sample output

```
18
```

### 5.5. Hint

The sum of all the positive integers that are less than or equal to 10 and are divisible by 3 or 5 is 3 + 5 + 6 + 9 + 10 = 33.

### 5.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        ans += (n / 3) * 3 * (3 + n / 3 * 2) / 2;
        ans += (n / 5) * 5 * (5 + n / 5 * 2) / 2;
        ans -= (n / 15) * 15 * (15 + n / 15 * 2) / 2;
        System.out.println(ans);
    }
}
```

## 6. 10000000019

### 6.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 6.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 6.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 6.4. Sample test(s)

#### 6.4.1. Sample input

```
10
```

#### 6.4.2. Sample output

```
18
```

### 6.5. Hint

The sum of all the positive integers that are less than or equal to 10 and are divisible by 3 or 5 is 3 + 5 + 6 + 9 + 10 = 33.

### 6.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        ans += (n / 3) * 3 * (3 + n / 3 * 2) / 2;
        ans += (n / 5) * 5 * (5 + n / 5 * 2) / 2;
        ans -= (n / 15) * 15 * (15 + n / 15 * 2) / 2;
        System.out.println(ans);
    }
}
```

## 7. 10000000021

### 7.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 7.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 7.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 7.4. Sample test(s)

#### 7.4.1. Sample input

```
10
```

#### 7.4.2. Sample output

```
18
```

### 7.5. Hint

The sum of all the positive integers that are less than or equal to 10 and are divisible by 3 or 5 is 3 + 5 + 6 + 9 + 10 = 33.

### 7.6. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        ans += (n / 3) * 3 * (3 + n / 3 * 2) / 2;
        ans += (n / 5) * 5 * (5 + n / 5 * 2) / 2;
        ans -= (n / 15) * 15 * (15 + n / 15 * 2) / 2;
        System.out.println(ans);
    }
}
```

## 8. 10000000023

### 8.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 8.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 8.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 8.4. Sample test(s)

#### 8.4.1. Sample input

```
10
```

#### 8.4.2. Sample output

```
18
```

### 8.5. Hint

The sum of all the positive integers that are less than or equal to 10 and are divisible by 3 or 5 is 3 + 5 + 6 + 9 + 10 = 33.

### 8.6. Solution

```
import java.util.*;
