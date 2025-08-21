

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int MOD = 746381343;
        int N = Integer.parseInt(br.readLine());
        int M = 1000000;
        String[] A_str = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(A_str[i]);
        }
        long[][] factorial_array = new long[1000][1000];
        factorial_array[0][0] = 1;
        for (int n = 1; n < 1000; n++) {
            for (int m = 0; m < 1000; m++) {
                factorial_array[n][m] = factorial_array[n - 1][m] * factorial_array[n][m - 1] % MOD;
            }
        }
        for (int n = 1; n < 1000; n++) {
            factorial_array[n][999] = factorial_array[n - 1][999] * factorial_array[n][999] % MOD;
        }
        for (int n = 0; n < 1000; n++) {
            for (int m = 0; m < 1000; m++) {
                factorial_array[n][m] = factorial_array[n][m] * factorial_array[n][999] % MOD;
            }
        }
        long[] factorial_array_flat = new long[1000000];
        for (int n = 0; n < 1000; n++) {
            for (int m = 0; m < 1000; m++) {
                factorial_array_flat[n * 1000 + m] = factorial_array[n][m];
            }
        }
        long[] j = new long[N];
        for (int i = 0; i < N; i++) {
            j[i] = i;
        }
        long[] inv = new long[N];
        for (int i = 0; i < N; i++) {
            inv[i] = (long) Math.pow(i + 1, MOD - 2) % MOD;
        }
        long[] inv_cumsum = new long[N];
        inv_cumsum[0] = inv[0];
        for (int i = 1; i < N; i++) {
            inv_cumsum[i] = (inv_cumsum[i - 1] + inv[i]) % MOD;
        }
        long[] temp = new long[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv_cumsum[(int) j[i]] + inv_cumsum[N - 1 - (int) j[i]] - 1) % MOD;
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i] % MOD) % MOD;
        }
        ans = ans * factorial_array_flat[N] % MOD;
        System.out.println(ans);
    }
}
```

## 2.

The following code is written in Python.

```
import numpy as np
import sys
input = sys.stdin.readline

N = int(input())
A = np.array(input().split(), dtype=np.int64)
MOD = 10 ** 9 + 7

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if A[i] + A[j] > A[k]:
                ans += 1

print(ans % MOD)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
Expected output:
3


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A_str = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(A_str[i]);
        }
        long MOD = 1000000007;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] + A[j] > A[k]) {
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans % MOD);
    }
}
```

## 3.

The following code is written in Python.

```
import numpy as np
import sys
input = sys.stdin.readline

N = int(input())
A = np.array(input().split(), dtype=np.int64)
MOD = 10 ** 9 + 7

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if A[i] + A[j] > A[k]:
                ans += 1

print(ans % MOD)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
Expected output:
3


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A_str = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(A_str[i]);
        }
        long MOD = 1000000007;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] + A[j] > A[k]) {
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans % MOD);
    }
}
```

## 4.

The following code is written in Python.

```
import numpy as np
import sys
input = sys.stdin.readline

N = int(input())
A = np.array(input().split(), dtype=np.int64)
MOD = 10 ** 9 + 7

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if A[i] + A[j] > A[k]:
                ans += 1

print(ans % MOD)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
Expected output:
3


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A_str = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(A_str[i]);
        }
        long MOD = 1000000007;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] + A[j] > A[k]) {
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans % MOD);
    }
}
```

## 5.

The following code is written in Python.

```
import numpy as np
import sys
input = sys.stdin.readline

N = int(input())
A = np.array(input().split(), dtype=np.int64)
MOD = 10 ** 9 + 7

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if A[i] + A[j] > A[k]:
                ans += 1

print(ans % MOD)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
Expected output:
3


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A_str = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(A_str[i]);
        }
        long MOD = 1000000007;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] + A[j] > A[k]) {
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans % MOD);
    }
}
```

## 6.

The following code is written in Python.

```
import numpy as np
import sys
input = sys.stdin.readline

N = int(input())
A = np.array(input().split(), dtype=np.int64)
MOD = 10 ** 9 + 7

ans = 0
for i in range(N):
    for j in range(i + 1, N):
        for k in range(j + 1, N):
            if A[i] + A[j] > A[k]:
                ans += 1

print(ans % MOD)
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
Expected output:
3


```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] A_str = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(A_str[i]);
        }
        long MOD = 1000000007;
        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] + A[j] > A[k]) {
                        ans += 1;
                    }
                }
            }
        }
        System.out.println(ans
