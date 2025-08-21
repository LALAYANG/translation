

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    static int n;
    static String input_string;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input_string = br.readLine();
        n = input_string.length();
        if (n == 1) {
            if (input_string.equals("5") || input_string.equals("?")) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }
        dp = new int[n][13];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (!input_string.substring(i, i + 1).equals("?")) {
                    dp[i][Integer.parseInt(input_string.substring(i, i + 1))]++;
                } else {
                    initialize_first_digit_dp(0, 10, 1);
                }
            } else {
                if (!input_string.substring(i, i + 1).equals("?")) {
                    update_dp_with_digit(0, 13, 1, Integer.parseInt(input_string.substring(i, i + 1)));
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
    static void initialize_first_digit_dp(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        dp[0][j]++;
        initialize_first_digit_dp(j + step, stop, step);
    }
    static void update_dp_with_digit(int k, int stop, int step, int digit) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        dp[1][(k * 10 + digit) % 13] += dp[0][k];
        update_dp_with_digit(k + step, stop, step, digit);
    }
}
```

## 2. 1000000007

### 2.1. Description

Given a number N, find the number of ways to write N as a sum of consecutive positive integers.

### 2.2. Input

The first line contains the number of test cases T. Each test case consists of a single line containing a positive integer N.

### 2.3. Output

For each test case, print a single line containing the answer.

### 2.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 2.5. Example

Input:
2
4
5

Output:
1
2

### 2.6. Explanation

Test case 1:
The only way to write 4 as a sum of consecutive positive integers is 4 = 1 + 2 + 1.

Test case 2:
The two ways to write 5 as a sum of consecutive positive integers are 5 = 1 + 2 + 3 and 5 = 2 + 3.

### 2.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 1; j * (j + 1) / 2 <= n; j++) {
                if ((n - j * (j + 1) / 2) % j == 0) {
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

Given a number N, find the number of ways to write N as a sum of consecutive positive integers.

### 3.2. Input

The first line contains the number of test cases T. Each test case consists of a single line containing a positive integer N.

### 3.3. Output

For each test case, print a single line containing the answer.

### 3.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 3.5. Example

Input:
2
4
5

Output:
1
2

### 3.6. Explanation

Test case 1:
The only way to write 4 as a sum of consecutive positive integers is 4 = 1 + 2 + 1.

Test case 2:
The two ways to write 5 as a sum of consecutive positive integers are 5 = 1 + 2 + 3 and 5 = 2 + 3.

### 3.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 1; j * (j + 1) / 2 <= n; j++) {
                if ((n - j * (j + 1) / 2) % j == 0) {
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

Given a number N, find the number of ways to write N as a sum of consecutive positive integers.

### 4.2. Input

The first line contains the number of test cases T. Each test case consists of a single line containing a positive integer N.

### 4.3. Output

For each test case, print a single line containing the answer.

### 4.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 4.5. Example

Input:
2
4
5

Output:
1
2

### 4.6. Explanation

Test case 1:
The only way to write 4 as a sum of consecutive positive integers is 4 = 1 + 2 + 1.

Test case 2:
The two ways to write 5 as a sum of consecutive positive integers are 5 = 1 + 2 + 3 and 5 = 2 + 3.

### 4.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 1; j * (j + 1) / 2 <= n; j++) {
                if ((n - j * (j + 1) / 2) % j == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 5. 1000000010

### 5.1. Description

Given a number N, find the number of ways to write N as a sum of consecutive positive integers.

### 5.2. Input

The first line contains the number of test cases T. Each test case consists of a single line containing a positive integer N.

### 5.3. Output

For each test case, print a single line containing the answer.

### 5.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 5.5. Example

Input:
2
4
5

Output:
1
2

### 5.6. Explanation

Test case 1:
The only way to write 4 as a sum of consecutive positive integers is 4 = 1 + 2 + 1.

Test case 2:
The two ways to write 5 as a sum of consecutive positive integers are 5 = 1 + 2 + 3 and 5 = 2 + 3.

### 5.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 1; j * (j + 1) / 2 <= n; j++) {
                if ((n - j * (j + 1) / 2) % j == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 6. 1000000011

### 6.1. Description

Given a number N, find the number of ways to write N as a sum of consecutive positive integers.

### 6.2. Input

The first line contains the number of test cases T. Each test case consists of a single line containing a positive integer N.

### 6.3. Output

For each test case, print a single line containing the answer.

### 6.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 6.5. Example

Input:
2
4
5

Output:
1
2

### 6.6. Explanation

Test case 1:
The only way to write 4 as a sum of consecutive positive integers is 4 = 1 + 2 + 1.

Test case 2:
The two ways to write 5 as a sum of consecutive positive integers are 5 = 1 + 2 + 3 and 5 = 2 + 3.

### 6.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 1; j * (j + 1) / 2 <= n; j++) {
                if ((n - j * (j + 1) / 2) % j == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 7. 1000000012

### 7.1. Description

Given a number N, find the number of ways to write N as a sum of consecutive positive integers.

### 7.2. Input

The first line contains the number of test cases T. Each test case consists of a single line containing a positive integer N.

### 7.3. Output

For each test case, print a single line containing the answer.

### 7.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 7.5. Example

Input:
2
4
5

Output:
1
2

### 7.6. Explanation

Test case 1:
The only way to write 4 as a sum of consecutive positive integers is 4 = 1 + 2 + 1.

Test case 2:
The two ways to write 5 as a sum of consecutive positive integers are 5 = 1 + 2 + 3 and 5 = 2 + 3.

### 7.7. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 1; j * (j + 1) / 2 <= n; j++) {
                if ((n - j * (j + 1) / 2) % j == 0) {
                    ans++;
                }
            }
            System.out.println(ans
