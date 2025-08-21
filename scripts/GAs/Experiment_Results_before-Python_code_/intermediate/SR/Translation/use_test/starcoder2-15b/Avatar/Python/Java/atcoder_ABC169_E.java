

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            low[i] = a;
            high[i] = b;
        }
        Arrays.sort(low);
        Arrays.sort(high);
        if (n % 2 == 1) {
            System.out.println(high[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
        } else {
            double hh = (high[n / 2 - 1] + high[n / 2]) / 2.0;
            double ll = (low[n / 2 - 1] + low[n / 2]) / 2.0;
            System.out.println((int)((hh - ll) * 2) + 1);
        }
    }
}

```

## 2. 1000000007

### 2.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 2.2. Input

The input consists of a single integer n.

### 2.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 2.4. Constraints

1 ≤ n ≤ 10^18

### 2.5. Sample Input

```
10
```

### 2.6. Sample Output

```
7
```

### 2.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 2.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 3. 1000000008

### 3.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 3.2. Input

The input consists of a single integer n.

### 3.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 3.4. Constraints

1 ≤ n ≤ 10^18

### 3.5. Sample Input

```
10
```

### 3.6. Sample Output

```
7
```

### 3.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 3.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 4. 1000000009

### 4.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 4.2. Input

The input consists of a single integer n.

### 4.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 4.4. Constraints

1 ≤ n ≤ 10^18

### 4.5. Sample Input

```
10
```

### 4.6. Sample Output

```
7
```

### 4.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 4.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 5. 1000000010

### 5.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 5.2. Input

The input consists of a single integer n.

### 5.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 5.4. Constraints

1 ≤ n ≤ 10^18

### 5.5. Sample Input

```
10
```

### 5.6. Sample Output

```
7
```

### 5.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 5.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 6. 1000000011

### 6.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 6.2. Input

The input consists of a single integer n.

### 6.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 6.4. Constraints

1 ≤ n ≤ 10^18

### 6.5. Sample Input

```
10
```

### 6.6. Sample Output

```
7
```

### 6.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 6.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 7. 1000000012

### 7.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 7.2. Input

The input consists of a single integer n.

### 7.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 7.4. Constraints

1 ≤ n ≤ 10^18

### 7.5. Sample Input

```
10
```

### 7.6. Sample Output

```
7
```

### 7.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 7.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 8. 1000000013

### 8.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 8.2. Input

The input consists of a single integer n.

### 8.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 8.4. Constraints

1 ≤ n ≤ 10^18

### 8.5. Sample Input

```
10
```

### 8.6. Sample Output

```
7
```

### 8.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 8.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 9. 1000000014

### 9.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 9.2. Input

The input consists of a single integer n.

### 9.3. Output

Print the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 9.4. Constraints

1 ≤ n ≤ 10^18

### 9.5. Sample Input

```
10
```

### 9.6. Sample Output

```
7
```

### 9.7. Explanation

The numbers that are divisible by 2 or 3 but not both are 2, 3, 4, 6, 8, 9, and 10.

### 9.8. Solution

```
def resolve ( ) :
    n = int ( input ( ) )
    print ( n // 2 + n // 3 - n // 6 )
if __name__ == "__main__" :
    resolve ( )
```

Java code:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(n / 2 + n / 3 - n / 6);
    }
}
```

## 10. 1000000015

### 10.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are divisible by 2 or 3 but not both.

### 10.2. Input

The input consists of a single integer n.
