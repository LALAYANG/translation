

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age == 1) {
            System.out.println("Hello World");
        } else {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

```
/01-max-of-n-numbers.md
# Max of N numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
3


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
max = a [ 0 ]
for i in range ( 1 , n ) :
    if a [ i ] > max :
        max = a [ i ]
print ( max )
/02-sum-of-n-numbers.md
# Sum of N numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
6


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

```
/03-sum-of-even-numbers.md
# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
1
2
3

Expected output:
2


```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
sum = 0
for i in range ( n ) :
    if a [ i ] % 2 == 0 :
        sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System
