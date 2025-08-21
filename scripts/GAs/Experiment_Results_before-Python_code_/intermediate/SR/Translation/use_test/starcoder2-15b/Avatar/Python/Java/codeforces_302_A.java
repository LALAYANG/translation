

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == -1) {
                sa++;
            }
        }
        sa = Math.min(sa, n - sa);
        for (int i = 0; i < m; i++) {
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

### 2.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 2.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.4. Sample

input

```
10
```

output

```
23
```

### 2.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 3. 1000000008

### 3.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 3.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.4. Sample

input

```
10
```

output

```
23
```

### 3.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 4. 1000000009

### 4.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 4.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 4.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 4.4. Sample

input

```
10
```

output

```
23
```

### 4.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 5. 1000000010

### 5.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 5.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 5.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 5.4. Sample

input

```
10
```

output

```
23
```

### 5.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 6. 1000000011

### 6.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 6.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 6.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 6.4. Sample

input

```
10
```

output

```
23
```

### 6.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 7. 1000000012

### 7.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 7.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 7.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 7.4. Sample

input

```
10
```

output

```
23
```

### 7.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 8. 1000000013

### 8.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 8.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 8.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 8.4. Sample

input

```
10
```

output

```
23
```

### 8.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 9. 1000000014

### 9.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 9.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 9.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 9.4. Sample

input

```
10
```

output

```
23
```

### 9.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 10. 1000000015

### 10.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 10.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 10.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 10.4. Sample

input

```
10
```

output

```
23
```

### 10.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 11. 1000000016

### 11.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 11.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 11.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 11.4. Sample

input

```
10
```

output

```
23
```

### 11.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 12. 1000000017

### 12.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 12.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 12.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 12.4. Sample

input

```
10
```

output

```
23
```

### 12.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n / 5;
        int c = n / 15;
        System.out.println(3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2);
    }
}
```

## 13. 1000000018

### 13.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 13.2. Input

The first line of the input contains a single integer n (1≤n≤10^9).

### 13.3. Output

Print a single integer — the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 13.4. Sample

input

```
10
```

output

```
23
```

### 13.5. Solution

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 3;
        int b = n /
