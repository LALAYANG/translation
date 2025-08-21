

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] InitialList = new int[1];
        int[] a = new int[n + 1];
        int[] cnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        int[] ans = new int[n + 1];
        int ans_len = 0;
        for (int i = 1; i <= n; i++) {
            if (cnt[i] == 1) {
                int[] crt = new int[n + 1];
                int crt_len = 0;
                crt[crt_len++] = i;
                int x = a[i];
                while (cnt[x] == 1) {
                    crt[crt_len++] = x;
                    x = a[x];
                }
                if (crt_len > ans_len) {
                    ans_len = crt_len;
                    for (int j = 0; j < crt_len; j++) {
                        ans[j] = crt[j];
                    }
                }
            }
        }
        System.out.println(ans_len);
        for (int i = ans_len - 1; i >= 0; i--) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

## 2. 2019-2020 ACM-ICPC, Asia Jakarta Regional Contest (Online Mirror, ACM-ICPC Rules, Teams Preferred)

### 2.1. A. A - B

#### 2.1.1. Description

Given two integers A and B, output A - B.

#### 2.1.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.1.3. Output

For each test case, output A - B in a single line.

#### 2.1.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.1.5. Sample Output

```
-1
-10
10
```

#### 2.1.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.2. B. B - C

#### 2.2.1. Description

Given two integers A and B, output A - B.

#### 2.2.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.2.3. Output

For each test case, output A - B in a single line.

#### 2.2.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.2.5. Sample Output

```
-1
-10
10
```

#### 2.2.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.3. C. C - D

#### 2.3.1. Description

Given two integers A and B, output A - B.

#### 2.3.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.3.3. Output

For each test case, output A - B in a single line.

#### 2.3.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.3.5. Sample Output

```
-1
-10
10
```

#### 2.3.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.4. D. D - E

#### 2.4.1. Description

Given two integers A and B, output A - B.

#### 2.4.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.4.3. Output

For each test case, output A - B in a single line.

#### 2.4.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.4.5. Sample Output

```
-1
-10
10
```

#### 2.4.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.5. E. E - F

#### 2.5.1. Description

Given two integers A and B, output A - B.

#### 2.5.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.5.3. Output

For each test case, output A - B in a single line.

#### 2.5.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.5.5. Sample Output

```
-1
-10
10
```

#### 2.5.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.6. F. F - G

#### 2.6.1. Description

Given two integers A and B, output A - B.

#### 2.6.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.6.3. Output

For each test case, output A - B in a single line.

#### 2.6.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.6.5. Sample Output

```
-1
-10
10
```

#### 2.6.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.7. G. G - H

#### 2.7.1. Description

Given two integers A and B, output A - B.

#### 2.7.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.7.3. Output

For each test case, output A - B in a single line.

#### 2.7.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.7.5. Sample Output

```
-1
-10
10
```

#### 2.7.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.8. H. H - I

#### 2.8.1. Description

Given two integers A and B, output A - B.

#### 2.8.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.8.3. Output

For each test case, output A - B in a single line.

#### 2.8.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.8.5. Sample Output

```
-1
-10
10
```

#### 2.8.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.9. I. I - J

#### 2.9.1. Description

Given two integers A and B, output A - B.

#### 2.9.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.9.3. Output

For each test case, output A - B in a single line.

#### 2.9.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.9.5. Sample Output

```
-1
-10
10
```

#### 2.9.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.10. J. J - K

#### 2.10.1. Description

Given two integers A and B, output A - B.

#### 2.10.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.10.3. Output

For each test case, output A - B in a single line.

#### 2.10.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.10.5. Sample Output

```
-1
-10
10
```

#### 2.10.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A - B);
        }
    }
}
```

### 2.11. K. K - L

#### 2.11.1. Description

Given two integers A and B, output A - B.

#### 2.11.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), denoting the number of test cases.

Each test case contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.11.3. Output

For each test case, output A - B in a single line.

#### 2.11.4. Sample Input

```
3
1 2
10 20
20 10
```

#### 2.11.5. Sample Output

```
-1
-10
10
```

#### 2.11.6. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.
