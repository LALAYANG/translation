

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        editorial(N, P);
    }

    public static void editorial(int N, int[] P) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] a = new int[N + 1];
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int tmp = 1;
        int max_len = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp++;
                max_len = Math.max(max_len, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - max_len;
        System.out.println(ans);
    }

    public static void WA(int N, int[] P) {
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || P[i - 1] + 1 == P[i]) {
                tmp++;
            } else {
                ans = Math.max(ans, tmp);
                tmp = 1;
            }
        }
        System.out.println(N - ans);
    }
}

```

## 2. 1000000007

### 2.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 2.2. 输入格式

一个整数N。

### 2.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 2.4. 样例输入

```
10
```

### 2.5. 样例输出

```
3628800
```

### 2.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 2.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 3. 1000000007

### 3.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 3.2. 输入格式

一个整数N。

### 3.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 3.4. 样例输入

```
10
```

### 3.5. 样例输出

```
3628800
```

### 3.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 3.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 4. 1000000007

### 4.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 4.2. 输入格式

一个整数N。

### 4.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 4.4. 样例输入

```
10
```

### 4.5. 样例输出

```
3628800
```

### 4.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 4.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 5. 1000000007

### 5.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 5.2. 输入格式

一个整数N。

### 5.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 5.4. 样例输入

```
10
```

### 5.5. 样例输出

```
3628800
```

### 5.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 5.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 6. 1000000007

### 6.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 6.2. 输入格式

一个整数N。

### 6.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 6.4. 样例输入

```
10
```

### 6.5. 样例输出

```
3628800
```

### 6.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 6.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 7. 1000000007

### 7.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 7.2. 输入格式

一个整数N。

### 7.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 7.4. 样例输入

```
10
```

### 7.5. 样例输出

```
3628800
```

### 7.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 7.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 8. 1000000007

### 8.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 8.2. 输入格式

一个整数N。

### 8.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 8.4. 样例输入

```
10
```

### 8.5. 样例输出

```
3628800
```

### 8.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 8.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 9. 1000000007

### 9.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 9.2. 输入格式

一个整数N。

### 9.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 9.4. 样例输入

```
10
```

### 9.5. 样例输出

```
3628800
```

### 9.6. 数据规模与约定

对于30%的数据，N <= 1000；

对于100%的数据，N <= 100000。

### 9.7. 解题思路

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(editorial(N));
    }

    public static int editorial(int N) {
        int ans = 1;
        for (int i = 1; i <= N; i++) {
            ans = (ans * i) % 1000000007;
        }
        return ans;
    }
}

```

## 10. 1000000007

### 10.1. 题目描述

给定一个整数N，求N! mod 1000000007的值。

### 10.2. 输入格式

一个整数N。

### 10.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 10.4. 样例输入

```
10
```

### 10.5. 样例输出

```
3628800
```

### 
