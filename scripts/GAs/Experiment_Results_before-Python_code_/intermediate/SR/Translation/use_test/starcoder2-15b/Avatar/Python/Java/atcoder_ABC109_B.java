

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextLine();
            if (map.containsKey(l[i])) {
                map.put(l[i], map.get(l[i]) + 1);
            } else {
                map.put(l[i], 1);
            }
        }
        String f = "Yes";
        int i = -1;
        for (String v : l) {
            if (map.get(v) >= 2) {
                f = "No";
            }
            if (i != -1 && l[i].charAt(l[i].length() - 1) != v.charAt(0)) {
                f = "No";
            }
            i++;
        }
        System.out.println(f);
    }
}
```


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextLine();
        }
        Arrays.sort(l);
        for (String s : l) {
            System.out.println(s);
        }
    }
}
```
/2019/01/20190110.md
# 20190110

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
5
4
3
2
1


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
l.reverse ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int v : l) {
            System.out.println(v);
        }
    }
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
5
4
3
2
1


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
l.reverse ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }
    }
}
```

## 4.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int v : l) {
            System.out.println(v);
        }
    }
}
```

## 5.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
5
4
3
2
1


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
l.reverse ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }
    }
}
```

## 6.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int v : l) {
            System.out.println(v);
        }
    }
}
```

## 7.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
5
4
3
2
1


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
l.reverse ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }
    }
}
```

## 8.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int v : l) {
            System.out.println(v);
        }
    }
}
```

## 9.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
5
4
3
2
1


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
l.reverse ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }
    }
}
```

## 10.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }
    }
}
```

## 10.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int v : l) {
            System.out.println(v);
        }
    }
}
```
/2019/01/20190109.md
# 20190109

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
5
4
3
2
1


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
l.reverse ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(l[i]);
        }
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected output:
1
2
3
4
5


```
n = int ( input ( ) )
l = list ( [ int ( input ( ) ) for i in range ( n ) ] )
l.sort ( )
for v in l :
    print ( v )


```

Java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sc.nextLine();
        }
        Arrays.sort(l);
        for (int v : l) {
            System.out.println(v);
        }
    }
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1
2
3
4
5

Expected
