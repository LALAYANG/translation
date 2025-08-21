

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int ans = 0;
        while (Math.pow(10, i) <= N) {
            ans += (int) (Math.pow(10, i) - Math.pow(10, i - 1));
            i += 2;
        }
        ans += Math.max(0, N - (int) Math.pow(10, i - 1) + 1);
        System.out.println(ans);
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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2019-09-25-1.md
# 2019-09-25-1

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 2 1

Expected output:
2


```
def main ( ) :
    N = int ( input ( ) )
    A = [ int ( x ) for x in input ( ) . split ( ) ]
    ans = 0
    for i in range ( N ) :
        for j in range ( i + 1 , N ) :
            if A [ i ] == A [ j ] :
                ans += 1
    print ( ans )
if __name__ == "__main__" :
    main ( )
/2019-09-25-2.md
# 2019-09-25-2

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
  }
}
```
5
1 2 3 2 1

Expected output:
2


```
def main ( ) :
    N = int ( input ( ) )
    A = [ int ( x ) for x in input ( ) . split ( ) ]
    ans = 0
    for i in range ( N ) :
        for j in range ( i + 1 , N ) :
            if A [ i ] == A [ j ] :
                ans += 1
    print ( ans )
if __name__ == "__main__" :
    main ( )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
  /2019-09-25-3.md
# 2019-09-25-3

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 2 1

Expected output:
2


```
def main ( ) :
    N = int ( input ( ) )
    A = [ int ( x ) for x in input ( ) . split ( ) ]
    ans = 0
    for i in range ( N ) :
        for j in range ( i + 1 , N ) :
            if A [ i ] == A [ j ] :
                ans += 1
    print ( ans )
if __name__ == "__main__" :
    main ( )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2019-09-25-4.md
# 2019-09-25-4

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 2 1

Expected output:
2


```
def main ( ) :
    N = int ( input ( ) )
    A = [ int ( x ) for x in input ( ) . split ( ) ]
    ans = 0
    for i in range ( N ) :
        for j in range ( i + 1 , N ) :
            if A [ i ] == A [ j ] :
                ans += 1
    print ( ans )
if __name__ == "__main__" :
    main ( )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2019-09-25-5.md
# 2019-09-25-5

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 2 1

Expected output:
2


```
def main ( ) :
    N = int ( input ( ) )
    A = [ int ( x ) for x in input ( ) . split ( ) ]
    ans = 0
    for i in range ( N ) :
        for j in range ( i + 1 , N ) :
            if A [ i ] == A [ j ] :
                ans += 1
    print ( ans )
if __name__ == "__main__" :
    main ( )


```

Java code:

```java
import java.util.Scanner;

pub
lic class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.
