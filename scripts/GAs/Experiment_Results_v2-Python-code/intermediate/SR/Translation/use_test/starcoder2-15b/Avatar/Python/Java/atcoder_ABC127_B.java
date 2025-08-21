

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commonRatio = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        int outerLoopStart = 388;
        int outerLoopEnd = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopStart / outerLoopEnd; LoopIndexOut++) {
            for (int innerLoopIndex = 2; innerLoopIndex < 12; innerLoopIndex++) {
                System.out.println((int) Math.pow(commonRatio, innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio));
            }
        }
    }
}
```


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int[][] b = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        int[][] c = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
/README.md
# Python to Java

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 3 4
1 2 3
4 5 6
7 8 9
1 2 3 4
5 6 7 8
9 1 2 3

Expected output:
30 36 42 48
84 108 132 156


```
n, m, k = map(int, input().split())
a = [list(map(int, input().split())) for i in range(n)]
b = [list(map(int, input().split())) for i in range(m)]
c = [[0 for j in range(k)] for i in range(n)]
for i in range(n):
    for j in range(k):
        for l in range(m):
            c[i][j] += a[i][l] * b[l][j]
for i in range(n):
    print(*c[i])/main.py
n, m, k = map(int, input().split())
a = [list(map(int, input().split())) for i in range(n)]
b = [list(map(int, input().split())) for i in range(m)]
c = [[0 for j in range(k)] for i in range(n)]
for i in range(n):
    for j in range(k):
        for l in range(m):
            c[i][j] += a[i][l] * b[l][j]
for i in range(n):
    print(*c[i])

