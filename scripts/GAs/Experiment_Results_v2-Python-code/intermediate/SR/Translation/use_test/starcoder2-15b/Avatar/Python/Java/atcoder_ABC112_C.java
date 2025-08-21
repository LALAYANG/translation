

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = sc.nextInt();
            ls_xyh[i][1] = sc.nextInt();
            ls_xyh[i][2] = sc.nextInt();
        }
        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
                break;
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            List<int[]> newCands = new ArrayList<>();
            for (int[] cand : cands) {
                if (Math.max(cand[2] - Math.abs(cand[0] - x) - Math.abs(cand[1] - y), 0) == h) {
                    newCands.add(cand);
                }
            }
            cands = newCands;
        }
        int[] ans = cands.get(0);
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
}
```

## 10. 1000000007

The following code is written in Python.

```
def solve(n, a, b):
    return (a * pow(b, n, 1000000007) + 1) % 1000000007

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    a = int(ws[1])
    b = int(ws[2])
    return (n, a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000000 1 2

Expected output:
570312505


```
import sys

def solve(n, a, b):
    return (a * pow(b, n, 1000000007) + 1) % 1000000007

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    n = int(ws[0])
    a = int(ws[1])
    b = int(ws[2])
    return (n, a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println((a * pow(b, n, 1000000007) + 1) % 1000000007);
    }

    public static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        long res = pow(a, b / 2, mod);
        res = (res * res) % mod;
        if (b % 2 == 1) {
            res = (res * a) % mod;
        }
        return res;
    }
}
```
/README.md
# 2020-01-20-python-to-java

## 1. 1000

The following code is written in Python.

```
def solve(a, b):
    return a + b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
3


```
import sys

def solve(a, b):
    return a + b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 2. 1001

The following code is written in Python.

```
def solve(a, b):
    return a - b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-1


```
import sys

def solve(a, b):
    return a - b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

## 3. 1002

The following code is written in Python.

```
def solve(a, b):
    return a * b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
import sys

def solve(a, b):
    return a * b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}
```

## 4. 1003

The following code is written in Python.

```
def solve(a, b):
    return a // b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
0


```
import sys

def solve(a, b):
    return a // b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
    }
}
```

## 5. 1004

The following code is written in Python.

```
def solve(a, b):
    return a % b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1


```
import sys

def solve(a, b):
    return a % b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);
    }
}
```

## 6. 1005

The following code is written in Python.

```
def solve(a, b):
    return a / b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
0.5


```
import sys

def solve(a, b):
    return a / b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / (double) b);
    }
}
```

## 7. 1006

The following code is written in Python.

```
def solve(a, b):
    return a ** b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1


```
import sys

def solve(a, b):
    return a ** b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.pow(a, b));
    }
}
```

## 8. 1007

The following code is written in Python.

```
def solve(a, b):
    return a // b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2

Expected output:
0


```
import sys

def solve(a, b):
    return a // b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
    a = int(ws[0])
    b = int(ws[1])
    return (a, b)

def main():
    print(solve(*readQuestion()))
main()
```

Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
    }
}
```

## 9. 1008

The following code is written in Python.

```
def solve(a, b):
    return a / b

def readQuestion():
    ws = sys.stdin.readline().strip().split()
