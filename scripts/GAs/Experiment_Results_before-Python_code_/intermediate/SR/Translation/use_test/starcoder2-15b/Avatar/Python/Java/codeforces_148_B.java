

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int princess = sc.nextInt();
        int dragon = sc.nextInt();
        int t = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        if (dragon <= princess) {
            System.out.println(0);
            return;
        }
        int result = 0;
        int position = t * princess;
        position += princess * position / (dragon - princess);
        while (position < c) {
            result++;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }
        System.out.println(result);
    }
}

```

## 3. 1000000007

### 3.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 3.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 3.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 3.4. Sample Input

```
3
1
2
3

```

### 3.5. Sample Output

```
1
1
2

```

### 3.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 3.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 4. 1000000008

### 4.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 4.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 4.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 4.4. Sample Input

```
3
1
2
3

```

### 4.5. Sample Output

```
1
1
2

```

### 4.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 4.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 5. 1000000009

### 5.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 5.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 5.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 5.4. Sample Input

```
3
1
2
3

```

### 5.5. Sample Output

```
1
1
2

```

### 5.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 5.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 6. 1000000010

### 6.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 6.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 6.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 6.4. Sample Input

```
3
1
2
3

```

### 6.5. Sample Output

```
1
1
2

```

### 6.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 6.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 7. 1000000011

### 7.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 7.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 7.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 7.4. Sample Input

```
3
1
2
3

```

### 7.5. Sample Output

```
1
1
2

```

### 7.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 7.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 8. 1000000012

### 8.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 8.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 8.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 8.4. Sample Input

```
3
1
2
3

```

### 8.5. Sample Output

```
1
1
2

```

### 8.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 8.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 9. 1000000013

### 9.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 9.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 9.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 9.4. Sample Input

```
3
1
2
3

```

### 9.5. Sample Output

```
1
1
2

```

### 9.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 9.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 10. 1000000014

### 10.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 10.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 10.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 10.4. Sample Input

```
3
1
2
3

```

### 10.5. Sample Output

```
1
1
2

```

### 10.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 10.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 11. 1000000015

### 11.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 11.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 11.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 11.4. Sample Input

```
3
1
2
3

```

### 11.5. Sample Output

```
1
1
2

```

### 11.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.

### 11.7. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && (n / i - i + 1) % 2 == 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}

```

## 12. 1000000016

### 12.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 12.2. Input

The first line contains the number of test cases t.

Each of the next t lines contains a number n.

### 12.3. Output

For each test case, output the number of ways to write n as a sum of consecutive positive integers.

### 12.4. Sample Input

```
3
1
2
3

```

### 12.5. Sample Output

```
1
1
2

```

### 12.6. Hint

For the first test case, 1 can be written as 1.

For the second test case, 2 can be written as 1+1.

For the third test case, 3 can be written as 1+2 or 3.


