
[SOLUTION]

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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
        int[] base = new int[1];
        int offset = 1;
        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread calculationThread = new Thread(() -> {
            int result = calculateValue(base, N, offset);
            resultQueue.add(result);
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculatedResult = resultQueue.take();
        int[] a = calculatedResult;
        for (int i = 0; i < N; i++) {
            a[P[i]] = i;
        }
        int tmp = 1;
        int maxLen = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                tmp += 1;
                maxLen = Math.max(maxLen, tmp);
            } else {
                tmp = 1;
            }
        }
        int ans = N - maxLen;
        System.out.println(ans);
    }

    public static int calculateValue(int[] base, int N, int offset) {
        return base[0] * (N + offset);
    }
}
```

[/SOLUTION]

[EXPLAIN]

[/EXPLAIN]

[TEST]

[/TEST]

[CHECK]

[/CHECK]

[DESCRIPTION]

[/DESCRIPTION]

[RESOURCES]

[/RESOURCES]

[REFERENCES]

[/REFERENCES]

[/CATEGORY]

[CATEGORY: "Data Structures"]

[TITLE: "Arrays: Left Rotation"]

[URL: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem]

[DESCRIPTION]

[/DESCRIPTION]

[CODE]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
Expected output:
3 4 5 1 2


```
def rotLeft(a, d):
    return a[d:] + a[:d]

def main():
    n = int(input())
    a = [int(i) for i in input().split()]
    d = int(input())
    print(*rotLeft(a, d))
```
[/INST]

[SOLUTION]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int[] rotated = rotLeft(a, d);
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static int[] rotLeft(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rotated[(i + d) % a.length] = a[i];
        }
        return rotated;
    }
}
```

[/SOLUTION]

[EXPLAIN]

[/EXPLAIN]

[TEST]

[/TEST]

[CHECK]

[/CHECK]

[DESCRIPTION]

[/DESCRIPTION]

[RESOURCES]

[/RESOURCES]

[REFERENCES]

[/REFERENCES]

[/CATEGORY]

[CATEGORY: "Data Structures"]

[TITLE: "Arrays: Right Rotation"]

[URL: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem]

[DESCRIPTION]

[/DESCRIPTION]

[CODE]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
Expected output:
3 4 5 1 2


```
def rotRight(a, d):
    return a[-d:] + a[:-d]

def main():
    n = int(input())
    a = [int(i) for i in input().split()]
    d = int(input())
    print(*rotRight(a, d))
```
[/INST]

[SOLUTION]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int[] rotated = rotRight(a, d);
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static int[] rotRight(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rotated[(i - d) % a.length] = a[i];
        }
        return rotated;
    }
}
```

[/SOLUTION]

[EXPLAIN]

[/EXPLAIN]

[TEST]

[/TEST]

[CHECK]

[/CHECK]

[DESCRIPTION]

[/DESCRIPTION]

[RESOURCES]

[/RESOURCES]

[REFERENCES]

[/REFERENCES]

[/CATEGORY]

[CATEGORY: "Data Structures"]

[TITLE: "Arrays: Left Rotation"]

[URL: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem]

[DESCRIPTION]

[/DESCRIPTION]

[CODE]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
Expected output:
3 4 5 1 2


```
def rotLeft(a, d):
    return a[d:] + a[:d]

def main():
    n = int(input())
    a = [int(i) for i in input().split()]
    d = int(input())
    print(*rotLeft(a, d))
```
[/INST]

[SOLUTION]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int[] rotated = rotLeft(a, d);
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static int[] rotLeft(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rotated[(i + d) % a.length] = a[i];
        }
        return rotated;
    }
}
```

[/SOLUTION]

[EXPLAIN]

[/EXPLAIN]

[TEST]

[/TEST]

[CHECK]

[/CHECK]

[DESCRIPTION]

[/DESCRIPTION]

[RESOURCES]

[/RESOURCES]

[REFERENCES]

[/REFERENCES]

[/CATEGORY]

[CATEGORY: "Data Structures"]

[TITLE: "Arrays: Right Rotation"]

[URL: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem]

[DESCRIPTION]

[/DESCRIPTION]

[CODE]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
Expected output:
3 4 5 1 2


```
def rotRight(a, d):
    return a[-d:] + a[:-d]

def main():
    n = int(input())
    a = [int(i) for i in input().split()]
    d = int(input())
    print(*rotRight(a, d))
```
[/INST]

[SOLUTION]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int[] rotated = rotRight(a, d);
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static int[] rotRight(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rotated[(i - d) % a.length] = a[i];
        }
        return rotated;
    }
}
```

[/SOLUTION]

[EXPLAIN]

[/EXPLAIN]

[TEST]

[/TEST]

[CHECK]

[/CHECK]

[DESCRIPTION]

[/DESCRIPTION]

[RESOURCES]

[/RESOURCES]

[REFEREN
