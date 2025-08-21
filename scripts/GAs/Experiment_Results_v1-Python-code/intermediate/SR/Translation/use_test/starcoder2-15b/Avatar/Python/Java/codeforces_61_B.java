

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
        }
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && i != k) {
                        l.add(f(s[i] + s[j] + s[k]));
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            if (l.contains(f(t))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-' && s.charAt(i) != ';' && s.charAt(i) != '_') {
                r += Character.toLowerCase(s.charAt(i));
            }
        }
        return r;
    }
}
```

## 2.

### 2.1.

```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def f(s):
    r = ''
    outerLoopLimit = 890
    innerLoopLimit = 889
    for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
        for i in s:
            if i not in ['-', ';', '_']:
                r += i.lower()
    return r

def solve():
    l = []

    def readInputStrings(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        l.append(f(input()))
        readInputStrings(i + step, stop, step)
    readInputStrings(0, 3, 1)
    t = itertools.permutations(l, len(l))
    l = []
    for i in t:
        l.append(''.join(i))

    def processTestCases(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in l:
            print('ACC')
        else:
            print('WA')
        processTestCases(i + step, stop, step)
    processTestCases(0, inp(), 1)
if __name__ == '__main__':
    solve()
```

### 2.2.

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[3];
        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
        }
        List<String> l = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && i != k) {
                        l.add(f(s[i] + s[j] + s[k]));
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            if (l.contains(f(t))) {
                System.out.println("ACC");
            } else {
                System.out.println("WA");
            }
        }
    }

    public static String f(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-' && s.charAt(i) != ';' && s.charAt(i) != '_') {
                r += Character.toLowerCase(s.charAt(i));
            }
        }
        return r;
    }
}
```
/2020/2020-09-21/README.md
# 2020-09-21

## 1.

### 1.1.

```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def solve():
    n = inp()
    l = inlst()
    l.sort()
    print(l[n // 2])
if __name__ == '__main__':
    solve()
```

### 1.2.

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(l[n / 2]);
    }
}
```

## 2.

### 2.1.

```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def solve():
    n = inp()
    l = inlst()
    l.sort()
    print(l[n // 2])
if __name__ == '__main__':
    solve()
```

### 2.2.

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(l[n / 2]);
    }
}
```
/2020/2020-09-28/README.md
# 2020-09-28

## 1.

### 1.1.

```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def solve():
    n = inp()
    l = inlst()
    l.sort()
    print(l[n // 2])
if __name__ == '__main__':
    solve()
```

### 1.2.

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(l[n / 2]);
    }
}
```

## 2.

### 2.1.

```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    return int(input())

def inps():
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def solve():
    n = inp()
    l = inlst()
    l.sort()
    print(l[n // 2])
if __name__ == '__main__':
    solve()
```

### 2.2.

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(l[n / 2]);
    }
}
```
/2020/2020-09-14/README.md
# 2020-09-14

## 1.

### 1.1.

```
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def isValid(i, j, n, m):
    if i < n and i >= 0 and (j >= 0) and (j < m):
        return True
    return False

def calculateSum(i, n):
    return (n - i) * (i + n) / 2

def sqfun(a, b, c):
    return (-b + math.sqrt(b * b - 4 * a * c)) / 2 * a

def value():
    return tuple(map(int, input().split()))

def values():
    return tuple(map(int, sys.stdin.readline().
