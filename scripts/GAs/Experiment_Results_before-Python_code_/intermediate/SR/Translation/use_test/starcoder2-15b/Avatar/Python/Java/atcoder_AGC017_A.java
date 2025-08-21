

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }
        long pattern_a = 0;
        long pattern_b = 0;
        for (int i = 0; i <= zero; i++) {
            pattern_b += combi(zero, i);
        }
        for (int i = 0; i <= one; i++) {
            if (i % 2 == P) {
                pattern_a += combi(one, i);
            }
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a positive integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 2.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 2.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 2.4. Constraints

1 ≤ T ≤ 100
1 ≤ N ≤ 109

### 2.5. Subtasks

Subtask #1 (100 points): original constraints

### 2.6. Example

Input:

```
2
4
5
```

Output:

```
1
2
```

### 2.7. Explanation

Example case 1: 4 can be written as 1+2+1.

Example case 2: 5 can be written as 1+2+2 or 2+3.

### 2.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 1; j <= N; j++) {
                if (N % j == 0 && (N / j - j + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

```

## 3. 1000000008

### 3.1. Description

Given a positive integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 3.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 3.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 3.4. Constraints

1 ≤ T ≤ 100
1 ≤ N ≤ 109

### 3.5. Subtasks

Subtask #1 (100 points): original constraints

### 3.6. Example

Input:

```
2
4
5
```

Output:

```
1
2
```

### 3.7. Explanation

Example case 1: 4 can be written as 1+2+1.

Example case 2: 5 can be written as 1+2+2 or 2+3.

### 3.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 1; j <= N; j++) {
                if (N % j == 0 && (N / j - j + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

```

## 4. 1000000009

### 4.1. Description

Given a positive integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 4.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 4.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 4.4. Constraints

1 ≤ T ≤ 100
1 ≤ N ≤ 109

### 4.5. Subtasks

Subtask #1 (100 points): original constraints

### 4.6. Example

Input:

```
2
4
5
```

Output:

```
1
2
```

### 4.7. Explanation

Example case 1: 4 can be written as 1+2+1.

Example case 2: 5 can be written as 1+2+2 or 2+3.

### 4.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 1; j <= N; j++) {
                if (N % j == 0 && (N / j - j + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }
        long pattern_a = 0;
        long pattern_b = 0;
        for (int i = 0; i <= zero; i++) {
            pattern_b += combi(zero, i);
        }
        for (int i = 0; i <= one; i++) {
            if (i % 2 == P) {
                pattern_a += combi(one, i);
            }
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= N - i;
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }
}

