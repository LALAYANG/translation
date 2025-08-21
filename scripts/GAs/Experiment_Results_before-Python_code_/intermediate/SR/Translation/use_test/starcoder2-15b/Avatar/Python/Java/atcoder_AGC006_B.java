

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == N * 2 - 2) {
                List<Integer> xs = new ArrayList<>();
                for (int i = N - 1; i <= X + 1; i++) {
                    xs.add(i);
                }
                for (int i = 1; i < N - 1; i++) {
                    xs.add(i);
                }
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i < X - 1; i++) {
                    ys.add(i);
                }
                for (int i = X + 3; i < N * 2; i++) {
                    ys.add(i);
                }
                List<Integer> xs = new ArrayList<>();
                for (int i = 0; i < N - 3; i++) {
                    xs.add(ys.get(i));
                }
                xs.add(X + 2);
                xs.add(X - 1);
                xs.add(X);
                xs.add(X + 1);
                for (int i = N - 3; i < ys.size(); i++) {
                    xs.add(ys.get(i));
                }
            }
            for (int x : xs) {
                System.out.println(x);
            }
        }
    }
}

```

## 2. 1000000007

### 2.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 2.2. Input

The input consists of a single integer N.

### 2.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 2.4. Constraints

1 ≤ N ≤ 10^9

### 2.5. Sample Input 1

```
10
```

### 2.6. Sample Output 1

```
7
```

### 2.7. Sample Input 2

```
1000000000
```

### 2.8. Sample Output 2

```
333333333
```

### 2.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 2.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 3. 1000000008

### 3.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 3.2. Input

The input consists of a single integer N.

### 3.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 3.4. Constraints

1 ≤ N ≤ 10^9

### 3.5. Sample Input 1

```
10
```

### 3.6. Sample Output 1

```
7
```

### 3.7. Sample Input 2

```
1000000000
```

### 3.8. Sample Output 2

```
333333333
```

### 3.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 3.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 4. 1000000009

### 4.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 4.2. Input

The input consists of a single integer N.

### 4.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 4.4. Constraints

1 ≤ N ≤ 10^9

### 4.5. Sample Input 1

```
10
```

### 4.6. Sample Output 1

```
7
```

### 4.7. Sample Input 2

```
1000000000
```

### 4.8. Sample Output 2

```
333333333
```

### 4.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 4.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```


```

### 2.6. Sample Output 1

```
1
```

### 2.7. Sample Input 2

```
1000000000
```

### 2.8. Sample Output 2

```
333333333
```

### 2.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 2.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 3. 1000000008

### 3.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 3.2. Input

The input consists of a single integer N.

### 3.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 3.4. Constraints

1 ≤ N ≤ 10^9

### 3.5. Sample Input 1

```
10
```

### 3.6. Sample Output 1

```
7
```

### 3.7. Sample Input 2

```
1000000000
```

### 3.8. Sample Output 2

```
333333333
```

### 3.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 3.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 4. 1000000009

### 4.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 4.2. Input

The input consists of a single integer N.

### 4.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 4.4. Constraints

1 ≤ N ≤ 10^9

### 4.5. Sample Input 1

```
10
```

### 4.6. Sample Output 1

```
7
```

### 4.7. Sample Input 2

```
1000000000
```

### 4.8. Sample Output 2

```
333333333
```

### 4.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 4.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 5. 1000000010

### 5.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 5.2. Input

The input consists of a single integer N.

### 5.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 5.4. Constraints

1 ≤ N ≤ 10^9

### 5.5. Sample Input 1

```
10
```

### 5.6. Sample Output 1

```
7
```

### 5.7. Sample Input 2

```
1000000000
```

### 5.8. Sample Output 2

```
333333333
```

### 5.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 5.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 6. 1000000011

### 6.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 6.2. Input

The input consists of a single integer N.

### 6.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 6.4. Constraints

1 ≤ N ≤ 10^9

### 6.5. Sample Input 1

```
10
```

### 6.6. Sample Output 1

```
7
```

### 6.7. Sample Input 2

```
1000000000
```

### 6.8. Sample Output 2

```
333333333
```

### 6.9. Note

In the first sample, the numbers divisible by 2 are 2, 4, 6, 8, 10. The numbers divisible by 3 are 3, 6, 9. The numbers divisible by both are 6. The answer is 10 - 5 - 3 + 1 = 7.

### 6.10. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = N / 2 + N / 3 - N / 6;
        System.out.println(ans);
    }
}

```

## 7. 1000000012

### 7.1. Problem

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 7.2. Input

The input consists of a single integer N.

### 7.3. Output

Print the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 7.4. Constraints

1 ≤ N ≤
