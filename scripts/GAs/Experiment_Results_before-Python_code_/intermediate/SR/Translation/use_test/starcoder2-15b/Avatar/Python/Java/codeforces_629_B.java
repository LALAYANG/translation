

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt() + 1;
            if (x.equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }
        System.out.println(c);
    }
}
```

## 2. 2019-2020 ACM-ICPC, Asia Jakarta Regional Contest (Online Mirror, ACM-ICPC Rules, Teams Preferred)

### 2.1. A. A - B

#### 2.1.1. Problem

Given two integers A and B, output A - B.

#### 2.1.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.1.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.1.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.1.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.1.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.2. B. B - C

#### 2.2.1. Problem

Given two integers A and B, output A - B.

#### 2.2.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.2.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.2.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.2.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.2.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.3. C. C - D

#### 2.3.1. Problem

Given two integers A and B, output A - B.

#### 2.3.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.3.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.3.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.3.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.3.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.4. D. D - E

#### 2.4.1. Problem

Given two integers A and B, output A - B.

#### 2.4.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.4.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.4.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.4.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.4.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.5. E. E - F

#### 2.5.1. Problem

Given two integers A and B, output A - B.

#### 2.5.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.5.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.5.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.5.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.5.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.6. F. F - G

#### 2.6.1. Problem

Given two integers A and B, output A - B.

#### 2.6.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.6.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.6.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.6.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.6.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.7. G. G - H

#### 2.7.1. Problem

Given two integers A and B, output A - B.

#### 2.7.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.7.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.7.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.7.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.7.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.8. H. H - I

#### 2.8.1. Problem

Given two integers A and B, output A - B.

#### 2.8.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.8.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.8.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.8.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.8.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
    }
}
```

### 2.9. I. I - J

#### 2.9.1. Problem

Given two integers A and B, output A - B.

#### 2.9.2. Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (1 ≤ A, B ≤ 1000).

#### 2.9.3. Output

For each test case, output one line containing "Case #x: A - B = C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C = A - B.

#### 2.9.4. Sample Input

```
3
1 1
10 8
36 12
```

#### 2.9.5. Sample Output

```
Case #1: 1 - 1 = 0
Case #2: 10 - 8 = 2
Case #3: 36 - 12 = 24
```

#### 2.9.6. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + A + " - " + B + " = " + (A - B));
        }
   
