

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = sc.nextInt();
            m[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (m[j][1] < m[j + 1][1]) {
                    int temp = m[j][1];
                    m[j][1] = m[j + 1][1];
                    m[j + 1][1] = temp;
                    temp = m[j][0];
                    m[j][0] = m[j + 1][0];
                    m[j + 1][0] = temp;
                }
            }
        }
        int a = m[0][1];
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a) {
                System.out.println("Happy Alex");
                return;
            }
            a = m[i][1];
        }
        System.out.println("Poor Alex");
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 2.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.4. Sample test(s)

#### 2.4.1. Sample input

```
10
```

#### 2.4.2. Sample output

```
18
```

### 2.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 3. 1000000007

### 3.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 3.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.4. Sample test(s)

#### 3.4.1. Sample input

```
10
```

#### 3.4.2. Sample output

```
18
```

### 3.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 4. 1000000007

### 4.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 4.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 4.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 4.4. Sample test(s)

#### 4.4.1. Sample input

```
10
```

#### 4.4.2. Sample output

```
18
```

### 4.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 5. 1000000007

### 5.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 5.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 5.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 5.4. Sample test(s)

#### 5.4.1. Sample input

```
10
```

#### 5.4.2. Sample output

```
18
```

### 5.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 6. 1000000007

### 6.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 6.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 6.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 6.4. Sample test(s)

#### 6.4.1. Sample input

```
10
```

#### 6.4.2. Sample output

```
18
```

### 6.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 7. 1000000007

### 7.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 7.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 7.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 7.4. Sample test(s)

#### 7.4.1. Sample input

```
10
```

#### 7.4.2. Sample output

```
18
```

### 7.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 8. 1000000007

### 8.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 8.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 8.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 8.4. Sample test(s)

#### 8.4.1. Sample input

```
10
```

#### 8.4.2. Sample output

```
18
```

### 8.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 9. 1000000007

### 9.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 9.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 9.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 9.4. Sample test(s)

#### 9.4.1. Sample input

```
10
```

#### 9.4.2. Sample output

```
18
```

### 9.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 10. 1000000007

### 10.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 10.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 10.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 10.4. Sample test(s)

#### 10.4.1. Sample input

```
10
```

#### 10.4.2. Sample output

```
18
```

### 10.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 11. 1000000007

### 11.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 11.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 11.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 11.4. Sample test(s)

#### 11.4.1. Sample input

```
10
```

#### 11.4.2. Sample output

```
18
```

### 11.5. Java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

## 12. 1000
