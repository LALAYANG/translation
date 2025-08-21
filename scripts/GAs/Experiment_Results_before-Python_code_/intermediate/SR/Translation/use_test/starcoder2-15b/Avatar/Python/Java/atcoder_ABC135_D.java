

```
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    static int n;
    static String s;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        n = s.length();
        if (n == 1) {
            if (s.equals("5") || s.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }
        dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (s.charAt(i) != '?') {
                    dp[i][s.charAt(i) - '0']++;
                } else {
                    for (int j = 0; j < 10; j++) {
                        dp[i][j]++;
                    }
                }
            } else {
                if (s.charAt(i) != '?') {
                    for (int k = 0; k < 13; k++) {
                        dp[i][(k * 10 + s.charAt(i) - '0') % 13] += dp[i - 1][k];
                    }
                } else {
                    for (int j = 0; j < 10; j++) {
                        for (int k = 0; k < 13; k++) {
                            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
                        }
                    }
                }
                for (int k = 0; k < 13; k++) {
                    dp[i][k] %= mod;
                }
            }
        }
        System.out.println(dp[n - 1][5]);
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

### 2.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.
Each test case contains a single integer N.

### 2.3. Output

For each test case, output a single line containing the answer.

### 2.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 2.5. Sample Input

```
3
4
5
6
```

### 2.6. Sample Output

```
1
2
3
```

### 2.7. Explanation

Test case 1: 4 can be written as 1 + 2 + 1.
Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.
Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 2.8. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += (n - i * (i - 1) / 2) / i;
            }
            System.out.println(ans);
        }
    }
}

```

## 3. 1000000008

### 3.1. Description

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

### 3.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.
Each test case contains a single integer N.

### 3.3. Output

For each test case, output a single line containing the answer.

### 3.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 3.5. Sample Input

```
3
4
5
6
```

### 3.6. Sample Output

```
1
2
3
```

### 3.7. Explanation

Test case 1: 4 can be written as 1 + 2 + 1.
Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.
Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 3.8. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += (n - i * (i - 1) / 2) / i;
            }
            System.out.println(ans);
        }
    }
}

```

## 4. 1000000009

### 4.1. Description

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

### 4.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.
Each test case contains a single integer N.

### 4.3. Output

For each test case, output a single line containing the answer.

### 4.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 4.5. Sample Input

```
3
4
5
6
```

### 4.6. Sample Output

```
1
2
3
```

### 4.7. Explanation

Test case 1: 4 can be written as 1 + 2 + 1.
Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.
Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 4.8. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += (n - i * (i - 1) / 2) / i;
            }
            System.out.println(ans);
        }
    }
}

```

## 5. 1000000010

### 5.1. Description

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

### 5.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.
Each test case contains a single integer N.

### 5.3. Output

For each test case, output a single line containing the answer.

### 5.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 5.5. Sample Input

```
3
4
5
6
```

### 5.6. Sample Output

```
1
2
3
```

### 5.7. Explanation

Test case 1: 4 can be written as 1 + 2 + 1.
Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.
Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 5.8. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += (n - i * (i - 1) / 2) / i;
            }
            System.out.println(ans);
        }
    }
}

```

## 6. 1000000011

### 6.1. Description

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

### 6.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.
Each test case contains a single integer N.

### 6.3. Output

For each test case, output a single line containing the answer.

### 6.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 6.5. Sample Input

```
3
4
5
6
```

### 6.6. Sample Output

```
1
2
3
```

### 6.7. Explanation

Test case 1: 4 can be written as 1 + 2 + 1.
Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.
Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 6.8. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += (n - i * (i - 1) / 2) / i;
            }
            System.out.println(ans);
        }
    }
}

```

## 7. 1000000012

### 7.1. Description

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

### 7.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.
Each test case contains a single integer N.

### 7.3. Output

For each test case, output a single line containing the answer.

### 7.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 7.5. Sample Input

```
3
4
5
6
```

### 7.6. Sample Output

```
1
2
3
```

### 7.7. Explanation

Test case 1: 4 can be written as 1 + 2 + 1.
Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.
Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 7.8. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += (n - i * (i - 1) / 2) / i;
            }
            System.out.println(ans);
        }
    }
}

```

## 8. 1000000013

### 8.1. Description

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

### 8.2. Input

The first line contains an integer T, the number of test cases. Then T test cases follow.
Each test case contains a single integer N.

### 8.3. Output

For each test case, output a single line containing the answer.

### 8.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 8.5. Sample Input

```
3
4
5
6
```

### 8.6. Sample Output

```
1
2
3
```

### 8.7. Explanation

Test case 1: 4 can be written as 1 + 2 + 1.
Test case 2: 5 can be written as 1 + 2 + 2 or 2 +
