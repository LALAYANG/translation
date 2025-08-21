

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(360 / gcd(360, x));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
```

## 2.

Write a program that reads a number and prints the sum of its digits.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number and prints the sum of its digits.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number and prints the sum of its digits.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```
/README.md
# Python to Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
179

Expected output:
360


```
from math import gcd
x = int ( input ( ) )
print ( 360 // gcd ( 360 , x ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(360 / gcd(360, x));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
```

## 2.

Write a program that reads a number and prints the sum of its digits.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number and prints the sum of its digits.

Test input:
12345

Expected output:
15
