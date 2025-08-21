

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextInt();
        }
        int[] ab = new int[x * y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        int[] abc = new int[k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < z; j++) {
                abc[i] = ab[i] + c[j];
            }
        }
        Arrays.sort(abc);
        for (int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }
}
```

## 2. 1000000007

Given a number n, find the last digit of n! (n factorial).

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n!.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 10;
            }
            System.out.println(ans);
        }
    }
}
```

## 3. 1000000009

Given a number n, find the last digit of n! (n factorial) modulo 1000000009.

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n! modulo 1000000009.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 1000000009;
            }
            System.out.println(ans);
        }
    }
}
```
 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 1000000009;
            }
            System.out.println(ans);
        }
    }
}
```
/1000000007-1000000009.md
# 1000000007 and 1000000009

## 1. 1000000007

Given a number n, find the last digit of n! (n factorial).

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n!.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 10;
            }
            System.out.println(ans);
        }
    }
}
```

## 2. 1000000009

Given a number n, find the last digit of n! (n factorial) modulo 1000000009.

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n! modulo 1000000009.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 1000000009;
            }
            System.out.println(ans);
        }
    }
}
```
/1000000007.md
# 1000000007

Given a number n, find the last digit of n! (n factorial).

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n!.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 10;
            }
            System.out.println(ans);
        }
    }
}
```

## 2. 1000000009

Given a number n, find the last digit of n! (n factorial) modulo 1000000009.

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n! modulo 1000000009.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 1000000009;
            }
            System.out.println(ans);
        }
    }
}
```
/1000000009.md
# 1000000009

Given a number n, find the last digit of n! (n factorial) modulo 1000000009.

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n! modulo 1000000009.

Constraints:
1 <= T <= 100000
1 <= n <=/1000000000.md
# 1000000000

Given a number n, find the last digit of n! (n factorial).

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n!.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 10;
            }
            System.out.println(ans);
        }
    }
}
```

## 2. 1000000001

Given a number n, find the last digit of n! (n factorial) modulo 1000000001.

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n! modulo 1000000001.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 1000000001;
            }
            System.out.println(ans);
        }
    }
}
```

## 3. 1000000003

Given a number n, find the last digit of n! (n factorial) modulo 1000000003.

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n! modulo 1000000003.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 1000000003;
            }
            System.out.println(ans);
        }
    }
}
```

## 4. 1000000007

Given a number n, find the last digit of n! (n factorial).

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.

Output:
For each test case, print the last digit of n!.

Constraints:
1 <= T <= 100000
1 <= n <= 1000000000

Sample Input:
2
3
6

Sample Output:
6
0

Explanation:
3! = 6
6! = 720

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int ans = 1;
            for (int j = 1; j <= n; j++) {
                ans = (ans * j) % 10;
            }
            System.out.println(ans);
        }
    }
}
```

## 5. 1000000009

Given a number n, find the last digit of n! (n factorial) modulo 1000000009.

Input:
The first line contains an integer T, the number of test cases.
Each test case contains an integer n.


