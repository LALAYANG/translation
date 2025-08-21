

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numIterations = sc.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == -1) {
                sa++;
            }
        }
        sa = Math.min(sa, n - sa);
        for (int i = 0; i < numIterations; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            b -= a;
            if (b % 2 == 1 && b <= sa << 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

## 2. 1000000007

Given a number N, find the number of trailing zeros in N!

Input Format

The first line contains an integer T, i.e., number of test cases.
Next T lines will contain an integer N.

Output Format

Print the number of trailing zeros in N!

Constraints

1 <= T <= 1000
1 <= N <= 10^9

Sample Input

4
3
60
100
1024

Sample Output

0
14
24
253

Explanation

You can calculate 3! = 6, 60! has 14 trailing zeros, 100! has 24 trailing zeros and 1024! has 253 trailing zeros.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}
```

## 3. 1000000009

Given a number N, find the number of trailing zeros in N!

Input Format

The first line contains an integer T, i.e., number of test cases.
Next T lines will contain an integer N.

Output Format

Print the number of trailing zeros in N!

Constraints

1 <= T <= 1000
1 <= N <= 10^9

Sample Input

4
3
60
100
1024

Sample Output

0
14
24
253

Explanation

You can calculate 3! = 6, 60! has 14 trailing zeros, 100! has 24 trailing zeros and 1024! has 253 trailing zeros.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}
```


```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}
```
/1000000007.md
# 1000000007

Given a number N, find the number of trailing zeros in N!

Input Format

The first line contains an integer T, i.e., number of test cases.
Next T lines will contain an integer N.

Output Format

Print the number of trailing zeros in N!

Constraints

1 <= T <= 1000
1 <= N <= 10^9

Sample Input

4
3
60
100
1024

Sample Output

0
14
24
253

Explanation

You can calculate 3! = 6, 60! has 14 trailing zeros, 100! has 24 trailing zeros and 1024! has 253 trailing zeros. 1000
1 <= N <= 10^9

Sample Input

4
3
60
100
1024

Sample Output

0
14
24
253

Explanation

You can calculate 3! = 6, 60! has 14 trailing zeros, 100! has 24 trailing zeros and 1024! has 253 trailing zeros.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}
```
/1000000009.md
# 1000000009

Given a number N, find the number of trailing zeros in N!

Input Format

The first line contains an integer T, i.e., number of test cases.
Next T lines will contain an integer N.

Output Format

Print the number of trailing zeros in N!

Constraints

1 <= T <= 1000
1 <= N <= 10^9

Sample Input

4
3
60
100
1024

Sample Output

0
14
24
253

Explanation

You can calculate 3! = 6, 60! has 14 trailing zeros, 100! has 24 trailing zeros and 1024! has 253 trailing zeros.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}
```
/README.md
# 1000000007

Given a number N, find the number of trailing zeros in N!

Input Format

The first line contains an integer T, i.e., number of test cases.
Next T lines will contain an integer N.

Output Format

Print the number of trailing zeros in N!

Constraints

1 <= T <= 1000
1 <= N <= 10^9

Sample Input

4
3
60
100
1024

Sample Output

0
14
24
253

Explanation

You can calculate 3! = 6, 60! has 14 trailing zeros, 100! has 24 trailing zeros and 1024! has 253 trailing zeros.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 0;
            for (int j = 5; j <= n; j *= 5) {
                count += n / j;
            }
            System.out.println(count);
        }
    }
}
```

# 1000000009

Given a number N, find the number of trailing zeros in N!

Input Format

The first line contains an integer T, i.e., number of test cases.
Next T lines will contain an integer N.

Output Format

Print the number of trailing zeros in N!

Constraints

1 <= T <=
