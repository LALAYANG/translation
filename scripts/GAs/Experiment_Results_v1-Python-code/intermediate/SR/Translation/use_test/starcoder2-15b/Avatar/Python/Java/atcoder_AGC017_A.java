

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = sc.nextInt();
        }
        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 0) {
                zero++;
            } else {
                one++;
            }
        }
        long pattern_a = 0;
        long pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static long combi(int N, int K) {
        long a = 1;
        for (int i = 0; i < K; i++) {
            a *= calculate_remaining(i, N);
        }
        for (int j = 0; j < K; j++) {
            a /= j + 1;
        }
        return a;
    }

    public static int calculate_remaining(int i, int N) {
        return N - i;
    }
}
```

## 2. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 3. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 4. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 5. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 6. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 7. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 8. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 9. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 10. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 11. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 12. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 13. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 14. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 15. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 16. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 17. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 18. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 19. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 20. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 21. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 22. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 23. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
print(1000000007)
```

Java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 24. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and
