

```
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((a[i - 1] < a[i] && a[i] > a[i + 1]) || (a[i - 1] > a[i] && a[i] < a[i + 1])) {
                ans++;
                i++;
            }
        }
        System.out.println(ans + 1);
    }
}

```

## 2. 1000000007

### 2.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 2.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first and only line of each test case contains a single integer N.

### 2.3. Output

For each test case, output a single line containing the answer.

### 2.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 2.5. Example

Input:
2
10
15

Output:
7
10

### 2.6. Explanation

In the first example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 10.

In the second example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 9, 10, 12, 15.

### 2.7. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2 + n / 3 + n / 5 - n / 6 - n / 10 - n / 15 + n / 30;
            System.out.println(ans);
        }
    }
}

```

## 3. 1000000009

### 3.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 3.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first and only line of each test case contains a single integer N.

### 3.3. Output

For each test case, output a single line containing the answer.

### 3.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 3.5. Example

Input:
2
10
15

Output:
7
10

### 3.6. Explanation

In the first example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 10.

In the second example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 9, 10, 12, 15.

### 3.7. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2 + n / 3 + n / 5 - n / 6 - n / 10 - n / 15 + n / 30;
            System.out.println(ans);
        }
    }
}

```

## 4. 1000000021

### 4.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 4.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first and only line of each test case contains a single integer N.

### 4.3. Output

For each test case, output a single line containing the answer.

### 4.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 4.5. Example

Input:
2
10
15

Output:
7
10

### 4.6. Explanation

In the first example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 10.

In the second example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 9, 10, 12, 15.

### 4.7. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2 + n / 3 + n / 5 - n / 6 - n / 10 - n / 15 + n / 30;
            System.out.println(ans);
        }
    }
}

```

## 5. 1000000033

### 5.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 5.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first and only line of each test case contains a single integer N.

### 5.3. Output

For each test case, output a single line containing the answer.

### 5.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 5.5. Example

Input:
2
10
15

Output:
7
10

### 5.6. Explanation

In the first example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 10.

In the second example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 9, 10, 12, 15.

### 5.7. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2 + n / 3 + n / 5 - n / 6 - n / 10 - n / 15 + n / 30;
            System.out.println(ans);
        }
    }
}

```

## 6. 1000000081

### 6.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 6.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first and only line of each test case contains a single integer N.

### 6.3. Output

For each test case, output a single line containing the answer.

### 6.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 6.5. Example

Input:
2
10
15

Output:
7
10

### 6.6. Explanation

In the first example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 10.

In the second example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 9, 10, 12, 15.

### 6.7. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2 + n / 3 + n / 5 - n / 6 - n / 10 - n / 15 + n / 30;
            System.out.println(ans);
        }
    }
}

```

## 7. 1000000097

### 7.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 7.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first and only line of each test case contains a single integer N.

### 7.3. Output

For each test case, output a single line containing the answer.

### 7.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 7.5. Example

Input:
2
10
15

Output:
7
10

### 7.6. Explanation

In the first example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 10.

In the second example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8, 9, 10, 12, 15.

### 7.7. Solution

```
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2 + n / 3 + n / 5 - n / 6 - n / 10 - n / 15 + n / 30;
            System.out.println(ans);
        }
    }
}

```

## 8. 1000000109

### 8.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 8.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first and only line of each test case contains a single integer N.

### 8.3. Output

For each test case, output a single line containing the answer.

### 8.4. Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### 8.5. Example

Input:
2
10
15

Output:
7
10

### 8.6. Explanation

In the first example, the numbers divisible by 2 or 3 or 5 are 2, 3, 4, 5, 6, 8,
