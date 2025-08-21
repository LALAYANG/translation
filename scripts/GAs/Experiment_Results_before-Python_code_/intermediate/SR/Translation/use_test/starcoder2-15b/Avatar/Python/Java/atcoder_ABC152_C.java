

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (n[pos] > n[i]) {
                a++;
                pos = i;
            }
        }
        System.out.println(a);
    }
}
```

## 2.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the maximum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . max ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[N - 1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 3.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the minimum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . min ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[0]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 4.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the maximum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . max ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[N - 1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 5.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the minimum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . min ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[0]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 6.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the maximum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . max ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[N - 1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 7.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the minimum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . min ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[0]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 8.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the maximum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . max ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[N - 1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 9.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the minimum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . min ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[0]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 10.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the maximum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . max ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[N - 1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 11.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the minimum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . min ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[0]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 12.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the maximum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . max ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[N - 1]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 13.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the minimum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 0
for i in range ( 0 , N ) :
    if n [ i ] == n . min ( ) :
        a += 1
print ( a )
```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int a = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[0]) {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 14.

Write a program that reads a number N and a list of N numbers. The program should print the number of times that the maximum number appears in the list.

A sample test case is provided below:

Test input:
4
4 3 2 1

Expected output:
1


```
import numpy as np

