

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int at = sc.nextInt();
        int b = sc.nextInt();
        int bt = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
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
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(countGreaterThanAverage(a));
    }

    /**
     * 统计一个给定的数组中，大于平均值的数字有多少个。
     *
     * @param array 给定的数组
     * @return 数组中大于平均值的数字的数量
     */
    public static int countGreaterThanAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                count++;
            }
        }
        return count;
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
2


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
print ( sum ( a ) // n )

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
        int average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > average) {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(countGreaterThanAverage(a));
    }

    /**
     * 统计一个给定的数组中，大于平均值的数字有多少个。
     *
     * @param array 给定的数组
     * @return 数组中大于平均值的数字的数量
     */
    public static int countGreaterThanAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum / array.length;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                count++;
            }
        }
        return count;
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
2


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
print ( sum ( a ) // n )

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
        int average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > average) {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i ] > a [ j ] :
            ans += 1
print ( ans )

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
10


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if a [ i
