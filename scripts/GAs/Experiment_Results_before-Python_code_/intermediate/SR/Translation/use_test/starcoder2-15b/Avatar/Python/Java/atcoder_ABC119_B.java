

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            double d = Double.parseDouble(s.substring(0, s.length() - 3));
            if (s.endsWith("JPY")) {
                sum += d;
            } else {
                sum += d * 380000;
            }
        }
        System.out.println(sum);
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
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```
/2019/01/01/20190101.md
# 20190101

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 4.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 5.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 6.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 7.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 8.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 9.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a = [ int ( s ) for s in input ( ).split ( ) ]
Q = int ( input ( ) )
b = [ int ( s ) for s in input ( ).split ( ) ]
for i in range ( Q ) :
    print ( sum ( [ 1 for j in range ( N ) if b [ i ] == a [ j ] ] ) )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        int[] b = new int[Q];
        for (int i = 0; i < Q; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 10.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
3
1 3 5

Expected output:
1
1
1


```
N = int ( input ( ) )
a
