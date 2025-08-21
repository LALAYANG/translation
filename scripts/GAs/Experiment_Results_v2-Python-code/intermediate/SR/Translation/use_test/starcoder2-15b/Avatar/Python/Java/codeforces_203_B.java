

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.2. 2019-09-10

### 2019-09-10 10:00

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1


```
from scipy.stats import ttest_ind

def solveCase():
    (n, m) = map(int, input().split())
    count = [None] * n

    def nestedLoop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        count[i] = [0] * n
        nestedLoop(i + step, stop, step)
    nestedLoop(0, n, 1)
    ans = -1
    ttest_ind([63, 61, 33], [63, 90, 9])
    checkConditionOne = 243
    checkConditionTwo = 85
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    count[i][j] += 1
                    if count[i][j] == 9:
                        found = True
        if checkConditionOne & checkConditionTwo:
            if found:
                ans = k + 1
                break
    print(ans)
solveCase()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.3. 2019-09-11

### 2019-09-11 10:00

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1


```
from scipy.stats import ttest_ind

def solveCase():
    (n, m) = map(int, input().split())
    count = [None] * n

    def nestedLoop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        count[i] = [0] * n
        nestedLoop(i + step, stop, step)
    nestedLoop(0, n, 1)
    ans = -1
    ttest_ind([63, 61, 33], [63, 90, 9])
    checkConditionOne = 243
    checkConditionTwo = 85
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    count[i][j] += 1
                    if count[i][j] == 9:
                        found = True
        if checkConditionOne & checkConditionTwo:
            if found:
                ans = k + 1
                break
    print(ans)
solveCase()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.4. 2019-09-12

### 2019-09-12 10:00

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1


```
from scipy.stats import ttest_ind

def solveCase():
    (n, m) = map(int, input().split())
    count = [None] * n

    def nestedLoop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        count[i] = [0] * n
        nestedLoop(i + step, stop, step)
    nestedLoop(0, n, 1)
    ans = -1
    ttest_ind([63, 61, 33], [63, 90, 9])
    checkConditionOne = 243
    checkConditionTwo = 85
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    count[i][j] += 1
                    if count[i][j] == 9:
                        found = True
        if checkConditionOne & checkConditionTwo:
            if found:
                ans = k + 1
                break
    print(ans)
solveCase()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.5. 2019-09-13

### 2019-09-13 10:00

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1


```
from scipy.stats import ttest_ind

def solveCase():
    (n, m) = map(int, input().split())
    count = [None] * n

    def nestedLoop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        count[i] = [0] * n
        nestedLoop(i + step, stop, step)
    nestedLoop(0, n, 1)
    ans = -1
    ttest_ind([63, 61, 33], [63, 90, 9])
    checkConditionOne = 243
    checkConditionTwo = 85
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    count[i][j] += 1
                    if count[i][j] == 9:
                        found = True
        if checkConditionOne & checkConditionTwo:
            if found:
                ans = k + 1
                break
    print(ans)
solveCase()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.6. 2019-09-14

### 2019-09-14 10:00

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1


```
from scipy.stats import ttest_ind

def solveCase():
    (n, m) = map(int, input().split())
    count = [None] * n

    def nestedLoop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        count[i] = [0] * n
        nestedLoop(i + step, stop, step)
    nestedLoop(0, n, 1)
    ans = -1
    ttest_ind([63, 61, 33], [63, 90, 9])
    checkConditionOne = 243
    checkConditionTwo = 85
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    count[i][j] += 1
                    if count[i][j] == 9:
                        found = True
        if checkConditionOne & checkConditionTwo:
            if found:
                ans = k + 1
                break
    print(ans)
solveCase()
```

Java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.2.2.7. 2019-09-15

### 2019-09-15 10:00

Translate the following Python code to Java and enclose your solution inside
