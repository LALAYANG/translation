

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            b[r - 1] = b[n + c - 1] = 0;
        }
        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < n * 2; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
```

## 2. 1000000007

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3. 1000000008

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4. 1000000009

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5. 1000000010

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6. 1000000011

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7. 1000000012

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8. 1000000013

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9. 1000000014

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10. 1000000015

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11. 1000000016

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 12. 1000000017

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 13. 1000000018

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 14. 1000000019

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Input
The first line contains a single integer n (1≤n≤109).

Output
Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

Sample Input 1

```
10
```

Sample Output 1

```
23
```

Sample Input 2

```
100
```

Sample Output 2

```
2318
```

```java
import java.util.Scanner;

public class
