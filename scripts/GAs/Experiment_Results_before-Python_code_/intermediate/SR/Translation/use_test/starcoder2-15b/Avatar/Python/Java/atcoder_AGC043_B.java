

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = s.charAt(i) - '0' - 1;
        }
        boolean noOne = false;
        if (Arrays.stream(nums).anyMatch(x -> x == 1)) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] /= 2;
            }
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.length; i++) {
            if (parityOfNCr(n - 1, i) != (nums[i] & 1)) {
                isOdd ^= true;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne);
        }
    }

    public static int twosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    public static boolean parityOfNCr(int n, int i) {
        int f = twosInFactorial(n);
        return f - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a number n, find the number of ways to write n as a sum of two or more consecutive positive integers.

### 2.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 2.3. Output

For each test case, output a single line containing the answer.

### 2.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 2.5. Sample Input

```
3
1
2
3
```

### 2.6. Sample Output

```
0
1
2
```

### 2.7. Explanation

In the first case, there is no way to write 1 as a sum of two or more consecutive positive integers.

In the second case, 2 can be written as 1 + 1.

In the third case, 3 can be written as 1 + 2 or 2 + 1.

### 2.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i * (i + 1) <= 2 * n; i++) {
                if ((2 * n - i * (i + 1)) % (2 * i) == 0) {
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

Given a number n, find the number of ways to write n as a sum of two or more consecutive positive integers.

### 3.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 3.3. Output

For each test case, output a single line containing the answer.

### 3.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 3.5. Sample Input

```
3
1
2
3
```

### 3.6. Sample Output

```
0
1
2
```

### 3.7. Explanation

In the first case, there is no way to write 1 as a sum of two or more consecutive positive integers.

In the second case, 2 can be written as 1 + 1.

In the third case, 3 can be written as 1 + 2 or 2 + 1.

### 3.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i * (i + 1) <= 2 * n; i++) {
                if ((2 * n - i * (i + 1)) % (2 * i) == 0) {
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

Given a number n, find the number of ways to write n as a sum of two or more consecutive positive integers.

### 4.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 4.3. Output

For each test case, output a single line containing the answer.

### 4.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 4.5. Sample Input

```
3
1
2
3
```

### 4.6. Sample Output

```
0
1
2
```

### 4.7. Explanation

In the first case, there is no way to write 1 as a sum of two or more consecutive positive integers.

In the second case, 2 can be written as 1 + 1.

In the third case, 3 can be written as 1 + 2 or 2 + 1.

### 4.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i * (i + 1) <= 2 * n; i++) {
                if ((2 * n - i * (i + 1)) % (2 * i) == 0) {
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

Given a number n, find the number of ways to write n as a sum of two or more consecutive positive integers.

### 5.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 5.3. Output

For each test case, output a single line containing the answer.

### 5.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 5.5. Sample Input

```
3
1
2
3
```

### 5.6. Sample Output

```
0
1
2
```

### 5.7. Explanation

In the first case, there is no way to write 1 as a sum of two or more consecutive positive integers.

In the second case, 2 can be written as 1 + 1.

In the third case, 3 can be written as 1 + 2 or 2 + 1.

### 5.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i * (i + 1) <= 2 * n; i++) {
                if ((2 * n - i * (i + 1)) % (2 * i) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

```

## 6. 1000000087

### 6.1. Description

Given a number n, find the number of ways to write n as a sum of two or more consecutive positive integers.

### 6.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 6.3. Output

For each test case, output a single line containing the answer.

### 6.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 6.5. Sample Input

```
3
1
2
3
```

### 6.6. Sample Output

```
0
1
2
```

### 6.7. Explanation

In the first case, there is no way to write 1 as a sum of two or more consecutive positive integers.

In the second case, 2 can be written as 1 + 1.

In the third case, 3 can be written as 1 + 2 or 2 + 1.

### 6.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i * (i + 1) <= 2 * n; i++) {
                if ((2 * n - i * (i + 1)) % (2 * i) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

```

## 7. 1000000093

### 7.1. Description

Given a number n, find the number of ways to write n as a sum of two or more consecutive positive integers.

### 7.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 7.3. Output

For each test case, output a single line containing the answer.

### 7.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 7.5. Sample Input

```
3
1
2
3
```

### 7.6. Sample Output

```
0
1
2
```

### 7.7. Explanation

In the first case, there is no way to write 1 as a sum of two or more consecutive positive integers.

In the second case, 2 can be written as 1 + 1.

In the third case, 3 can be written as 1 + 2 or 2 + 1.

### 7.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            for (int i = 1; i * (i + 1) <= 2 * n; i++) {
                if ((2 * n - i * (i + 1)) % (2 * i) == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

```

## 8. 1000000097

### 8.1. Description

Given a number n, find the number of ways to write n as a sum of two or more consecutive positive integers.

### 8.2. Input

The first line contains an integer T, the number of test cases.

Each of the next T lines contains an integer n.

### 8.3. Output

For each test case, output a single line containing the answer.

### 8.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 8.5. Sample Input

```
3
1
2
3
```

### 8.6. Sample Output

```
0
1
2
```

### 8.7. Explanation

In the first case, there is no way to write 1 as a sum of two or more consecutive positive integers.

In the second case, 2 can be written as 1 + 1.

In the third case, 3 can be written as 1 + 2 or 2 + 1.

### 8.8. Solution

```
import java.util.*;

