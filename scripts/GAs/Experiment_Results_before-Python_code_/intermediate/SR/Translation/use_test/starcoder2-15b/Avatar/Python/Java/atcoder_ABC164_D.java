

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 2019;
        int[] m = new int[l];
        m[0] = 1;
        int a = 0;
        int r = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            a += (s.charAt(i) - '0') * (int)Math.pow(10, s.length() - 1 - i, l);
            a %= l;
            r += m[a];
            m[a]++;
        }
        System.out.println(r);
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 2.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

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
1
2
2
```

### 2.7. Explanation

In the first case, the only number less than or equal to 1 that is divisible by 2 or 3 but not both is 1.

In the second case, the numbers less than or equal to 2 that are divisible by 2 or 3 but not both are 1 and 2.

In the third case, the numbers less than or equal to 3 that are divisible by 2 or 3 but not both are 1 and 2.

### 2.8. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}

```

## 3. 1000000009

### 3.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 3.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

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
1
2
2
```

### 3.7. Explanation

In the first case, the only number less than or equal to 1 that is divisible by 2 or 3 but not both is 1.

In the second case, the numbers less than or equal to 2 that are divisible by 2 or 3 but not both are 1 and 2.

In the third case, the numbers less than or equal to 3 that are divisible by 2 or 3 but not both are 1 and 2.

### 3.8. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}

```

## 4. 1000000021

### 4.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 4.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

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
1
2
2
```

### 4.7. Explanation

In the first case, the only number less than or equal to 1 that is divisible by 2 or 3 but not both is 1.

In the second case, the numbers less than or equal to 2 that are divisible by 2 or 3 but not both are 1 and 2.

In the third case, the numbers less than or equal to 3 that are divisible by 2 or 3 but not both are 1 and 2.

### 4.8. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}

```

## 5. 1000000033

### 5.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 5.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

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
1
2
2
```

### 5.7. Explanation

In the first case, the only number less than or equal to 1 that is divisible by 2 or 3 but not both is 1.

In the second case, the numbers less than or equal to 2 that are divisible by 2 or 3 but not both are 1 and 2.

In the third case, the numbers less than or equal to 3 that are divisible by 2 or 3 but not both are 1 and 2.

### 5.8. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}

```

## 6. 1000000087

### 6.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 6.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

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
1
2
2
```

### 6.7. Explanation

In the first case, the only number less than or equal to 1 that is divisible by 2 or 3 but not both is 1.

In the second case, the numbers less than or equal to 2 that are divisible by 2 or 3 but not both are 1 and 2.

In the third case, the numbers less than or equal to 3 that are divisible by 2 or 3 but not both are 1 and 2.

### 6.8. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}

```

## 7. 1000000093

### 7.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 7.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

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
1
2
2
```

### 7.7. Explanation

In the first case, the only number less than or equal to 1 that is divisible by 2 or 3 but not both is 1.

In the second case, the numbers less than or equal to 2 that are divisible by 2 or 3 but not both are 1 and 2.

In the third case, the numbers less than or equal to 3 that are divisible by 2 or 3 but not both are 1 and 2.

### 7.8. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}

```

## 8. 1000000097

### 8.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 8.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.

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
1
2
2
```

### 8.7. Explanation

In the first case, the only number less than or equal to 1 that is divisible by 2 or 3 but not both is 1.

In the second case, the numbers less than or equal to 2 that are divisible by 2 or 3 but not both are 1 and 2.

In the third case, the numbers less than or equal to 3 that are divisible by 2 or 3 but not both are 1 and 2.

### 8.8. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}

```

## 9. 1000000103

### 9.1. Description

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 9.2. Input

The first line contains a single integer T, the number of test cases.

Each of the next T lines contains a single integer n.
