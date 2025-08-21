

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int mod = (int) (1e9 + 7);
    static int checkResultOne = 345;
    static int checkResultThree = 265;
    static int checkResultTwo = 13;
    static int checkResultFour = 217;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        String S = fs.next();
        int n = S.length();
        if (checkResultOne & checkResultThree) {
            if (checkResultTwo & checkResultFour) {
                if (n == 1) {
                    if (S.equals("5") || S.equals("?")) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    return;
                }
            }
        }
        int[][] dp = new int[n][13];
        for (int idx = 0; idx < n; idx++) {
            if (idx == 0) {
                if (S.charAt(idx) != '?') {
                    dp[idx][Integer.parseInt(S.charAt(idx) + "")]++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[idx][j]++;
                    }
                }
            } else {
                if (S.charAt(idx) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[idx][(k * 10 + Integer.parseInt(S.charAt(idx) + "")) % 13] += dp[idx - 1][k];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[idx][(k * 10 + j) % 13] += dp[idx - 1][k];
                        }
                    }
                }
                for (int k = 0; k < 13; k++) {
                    dp[idx][k] %= mod;
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++)
                a[idx] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
```

## 2.

```
def readInput():
    return sys.stdin.readline()[:-1]
mod = 10 ** 9 + 7

def readInt():
    return int(readInput())

def II():
    return map(int, readInput().split())

def III():
    return list(map(int, readInput().split()))

def Line(N):
    read_all = [tuple(map(int, readInput().split())) for _ in range(N)]
    return map(list, zip(*read_all))
```

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static int mod = (int) (1e9 + 7);

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++)
                a[idx] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
```

## 3.

```
from scipy.stats import ttest_ind
checkResultOne = 345
checkResultThree = 265
checkResultTwo = 13
checkResultFour = 217
```

```
static int checkResultOne = 345;
static int checkResultThree = 265;
static int checkResultTwo = 13;
static int checkResultFour = 217;
```

## 4.

```
import sys
import math
from collections import defaultdict
sys.setrecursionlimit(10 ** 7)
```

```
import java.util.*;
import java.io.*;
import java.math.*;
```

## 5.

```
def readInput():
    return sys.stdin.readline()[:-1]
```

```
public static String readInput() {
    FastScanner fs = new FastScanner();
    return fs.next();
}
```

## 6.

```
mod = 10 ** 9 + 7
```

```
static int mod = (int) (1e9 + 7);
```

## 7.

```
def readInt():
    return int(readInput())
```

```
public static int readInt() {
    FastScanner fs = new FastScanner();
    return fs.nextInt();
}
```

## 8.

```
def II():
    return map(int, readInput().split())
```

```
public static int[] II() {
    FastScanner fs = new FastScanner();
    return fs.readArray(2);
}
```

## 9.

```
def III():
    return list(map(int, readInput().split()))
```

```
public static int[] III() {
    FastScanner fs = new FastScanner();
    return fs.readArray(3);
}
```

## 10.

```
def Line(N):
    read_all = [tuple(map(int, readInput().split())) for _ in range(N)]
    return map(list, zip(*read_all))
```

```
public static int[][] Line(int N) {
    FastScanner fs = new FastScanner();
    int[][] a = new int[N][2];
    for (int idx = 0; idx < N; idx++) {
        a[idx] = fs.readArray(2);
    }
    return a;
}
```

## 11.

```
S = str(readInput())
```

```
String S = readInput();
```

## 12.

```
n = len(S)
```

```
int n = S.length();
```

## 13.

```
if checkResultOne & checkResultThree:
    if checkResultTwo & checkResultFour:
        if n == 1:
            if S == '5' or S == '?':
                print(1)
            else:
                print(0)
            exit()
```

```
if (checkResultOne & checkResultThree) {
    if (checkResultTwo & checkResultFour) {
        if (n == 1) {
            if (S.equals("5") || S.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }
    }
}
```

## 14.

```
dp = [[0] * 13 for idx in range(n)]
```

```
int[][] dp = new int[n][13];
```

## 15.

```
for idx in range(n):
    if idx == 0:
        if S[idx] != '?':
            dp[idx][int(S[idx])] += 1
        else:
            for j in range(10):
                dp[idx][j] += 1
    else:
        if S[idx] != '?':
            for k in range(13):
                dp[idx][(k * 10 + int(S[idx])) % 13] += dp[idx - 1][k]
        else:
            for j in range(10):
                for k in range(13):
                    dp[idx][(k * 10 + j) % 13] += dp[idx - 1][k]
        for k in range(13):
            dp[idx][k] %= mod
```

```
for (int idx = 0; idx < n; idx++) {
    if (idx == 0) {
        if (S.charAt(idx) != '?') {
            dp[idx][Integer.parseInt(S.charAt(idx) + "")]++;
        } else {
            for (int j = 0; j < 10; j++) {
                dp[idx][j]++;
            }
        }
    } else {
        if (S.charAt(idx) != '?') {
            for (int k = 0; k < 13; k++) {
                dp[idx][(k * 10 + Integer.parseInt(S.charAt(idx) + "")) % 13] += dp[idx - 1][k];
            }
        } else {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 13; k++) {
                    dp[idx][(k * 10 + j) % 13] += dp[idx - 1][k];
                }
            }
        }
        for (int k = 0; k < 13; k++) {
            dp[idx][k] %= mod;
        }
    }
}
```

## 16.

```
print(dp[n - 1][5])
```

```
System.out.println(dp[n - 1][5]);
```

## 17.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 18.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 19.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 20.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 21.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 22.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 23.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 24.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 25.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 26.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 27.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 28.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 29.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 30.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 31.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 32.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 33.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 34.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 35.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 36.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 37.

```
if __name__ == '__main__':
    main()
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 38.

```
def main():
    pass
```

```
public static void main(String[] args) {
    FastScanner fs = new FastScanner();
}
```

## 39.

```
if __name__ == '__main__':
    main()
```

```

