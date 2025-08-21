

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        int mx = l2[0];
        for (int i = 1; i < n; i++) {
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
            }
        }
        System.out.println(ind + 1);
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 4.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 5.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 6.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 7.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 8.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 9.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 10.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```


```

## 10.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```

```
/README.md
# Python to Java

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46


```
n , m = map ( int , input ( ).split ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
l2 = [ ]
for i in l :
    if i % m == 0 :
        l2.append ( i // m )
    else :
        l2.append ( i // m + 1 )
mx = max ( l2 )
for i in range ( n ) :
    if l2 [ i ] == mx :
        ind = i
print ( ind + 1 )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        int mx = l2[0];
        for (int i = 1; i < n; i++) {
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
            }
        }
        System.out.println(ind + 1);
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 4.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 5.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 6.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

## 7.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt
