

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] degs = new int[N];
        int[] parity = new int[N];
        boolean[] flag = new boolean[N];
        ArrayList<Integer>[] edges = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
            degs[a]++;
            degs[b]++;
        }
        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }
        PriorityQueue<int[]> Q = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int i = 0; i < N; i++) {
            Q.add(new int[]{degs[i], i});
        }
        while (!Q.isEmpty()) {
            int[] u = Q.poll();
            if (flag[u[1]]) {
                continue;
            }
            flag[u[1]] = true;
            for (int i = 0; i < edges[u[1]].size(); i++) {
                int v = edges[u[1]].get(i);
                edges[v].remove(new Integer(u[1]));
                if (parity[u[1]] != 0 && i == 0) {
                    System.out.println((u[1] + 1) + " " + (v + 1));
                    parity[u[1]] = 1 - parity[u[1]];
                } else {
                    System.out.println((v + 1) + " " + (u[1] + 1));
                    parity[v] = 1 - parity[v];
                }
                degs[v]--;
                Q.add(new int[]{degs[v], v});
            }
        }
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a positive integer N, find the largest integer K such that 10^K is a factor of N! (N factorial).

### 2.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains a single integer N.

### 2.3. Output

For each test case, output a single line containing the largest integer K such that 10^K is a factor of N!.

### 2.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 2.5. Example

Input:

```
3
1
2
3
```

Output:

```
0
1
1
```

### 2.6. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 5; j <= N; j *= 5) {
                ans += N / j;
            }
            System.out.println(ans);
        }
    }
}

```
 1; i <= N; i++) {
            if (i % 2 == 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        printEvenNumbers();
    }

    /**
     * 打印从0到目标数字的序列，每隔一个数字打印一个。
     *
     * <p>例如，printEvenNumbers(2) 打印 "02"，printEvenNumbers(4) 打印 "024"
     *
     * @param target 目标数字
     */
    public static void printEvenNumbers(int target) {
        for (int i = 0; i <= target; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }

    public static void main2(String[] args) {
        int N = 100;
        int ans = 0;
        // 在此编写代码，将N以内的偶数累加到ans中
        for (int i =/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        printNarcissisticNumber();
    }

    /**
     * 打印所有的水仙花数。水仙花数是指一个三位数，其各位数字立方和等于该数本身。
     *
     * <p>例如，153是一个水仙花数，因为1的立方+5的立方+3的立方 = 153
     *
     * <p>提示：可用除法和求余运算得到一个数字的个、十、百位上的数字。
     */
    public static void printNarcissisticNumber() {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
    }
}

