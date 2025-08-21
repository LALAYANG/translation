

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String nums = in.next();
        boolean no_one = false;
        if (!nums.contains("1")) {
            no_one = true;
            nums = nums.replaceAll("2", "1");
        }
        boolean is_odd = false;
        for (int i = 0; i < nums.length(); i++) {
            if (parity_of_nCr(n - 1, i) != (nums.charAt(i) - '0') % 2) {
                is_odd ^= true;
            }
        }
        if (!is_odd) {
            System.out.println(0);
        } else {
            System.out.println(1 << no_one);
        }
    }

    public static int twos_in_factorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parity_of_nCr(int n, int i) {
        int f = twos_in_factorial(n);
        return f - twos_in_factorial(n - i) - twos_in_factorial(i) > 0;
    }
}
```

## 2. 1000000007

### 2.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 2.2. Input

The first line contains the number of test cases T. T test cases follow. Each test case contains a number n.

### 2.3. Output

For each test case, output the answer in a new line.

### 2.4. Constraints

1 <= T <= 100000
1 <= n <= 1000000000

### 2.5. Sample Input

```
2
4
5
```

### 2.6. Sample Output

```
1
2
```

### 2.7. Explanation

For the first test case, 4 can only be written as 1 + 2 + 1.
For the second test case, 5 can be written as 1 + 2 + 2 or 1 + 4.

### 2.8. Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 3. 1000000009

### 3.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 3.2. Input

The first line contains the number of test cases T. T test cases follow. Each test case contains a number n.

### 3.3. Output

For each test case, output the answer in a new line.

### 3.4. Constraints

1 <= T <= 100000
1 <= n <= 1000000000

### 3.5. Sample Input

```
2
4
5
```

### 3.6. Sample Output

```
1
2
```

### 3.7. Explanation

For the first test case, 4 can only be written as 1 + 2 + 1.
For the second test case, 5 can be written as 1 + 2 + 2 or 1 + 4.

### 3.8. Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 4. 1000000021

### 4.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 4.2. Input

The first line contains the number of test cases T. T test cases follow. Each test case contains a number n.

### 4.3. Output

For each test case, output the answer in a new line.

### 4.4. Constraints

1 <= T <= 100000
1 <= n <= 1000000000

### 4.5. Sample Input

```
2
4
5
```

### 4.6. Sample Output

```
1
2
```

### 4.7. Explanation

For the first test case, 4 can only be written as 1 + 2 + 1.
For the second test case, 5 can be written as 1 + 2 + 2 or 1 + 4.

### 4.8. Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 5. 1000000033

### 5.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 5.2. Input

The first line contains the number of test cases T. T test cases follow. Each test case contains a number n.

### 5.3. Output

For each test case, output the answer in a new line.

### 5.4. Constraints

1 <= T <= 100000
1 <= n <= 1000000000

### 5.5. Sample Input

```
2
4
5
```

### 5.6. Sample Output

```
1
2
```

### 5.7. Explanation

For the first test case, 4 can only be written as 1 + 2 + 1.
For the second test case, 5 can be written as 1 + 2 + 2 or 1 + 4.

### 5.8. Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 6. 1000000081

### 6.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 6.2. Input

The first line contains the number of test cases T. T test cases follow. Each test case contains a number n.

### 6.3. Output

For each test case, output the answer in a new line.

### 6.4. Constraints

1 <= T <= 100000
1 <= n <= 1000000000

### 6.5. Sample Input

```
2
4
5
```

### 6.6. Sample Output

```
1
2
```

### 6.7. Explanation

For the first test case, 4 can only be written as 1 + 2 + 1.
For the second test case, 5 can be written as 1 + 2 + 2 or 1 + 4.

### 6.8. Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 7. 1000000099

### 7.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 7.2. Input

The first line contains the number of test cases T. T test cases follow. Each test case contains a number n.

### 7.3. Output

For each test case, output the answer in a new line.

### 7.4. Constraints

1 <= T <= 100000
1 <= n <= 1000000000

### 7.5. Sample Input

```
2
4
5
```

### 7.6. Sample Output

```
1
2
```

### 7.7. Explanation

For the first test case, 4 can only be written as 1 + 2 + 1.
For the second test case, 5 can be written as 1 + 2 + 2 or 1 + 4.

### 7.8. Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 8. 1000000117

### 8.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 8.2. Input

The first line contains the number of test cases T. T test cases follow. Each test case contains a number n.

### 8.3. Output

For each test case, output the answer in a new line.

### 8.4. Constraints

1 <= T <= 100000
1 <= n <= 1000000000

### 8.5. Sample Input

```
2
4
5
```

### 8.6. Sample Output

```
1
2
```

### 8.7. Explanation

For the first test case, 4 can only be written as 1 + 2 + 1.
For the second test case, 5 can be written as 1 + 2 + 2 or 1 + 4.

### 8.8. Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int ans = 0;
            for (int j = 1; j * (j + 1) <= 2 * n; j++) {
                if ((1.0 * n - j * (j + 1) / 2) % (j + 1) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 9. 1000000129

### 9.1
