

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }
        System.out.println(c);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/docs/python/python-101/01-introduction.md
# Introduction

## 1.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 5.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```


```

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

## 5.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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
/docs/java/java-101/01-introduction.md
# Introduction

## 1.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 2.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 3.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 4.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 5.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 1.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 2.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 3.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 4.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 5.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

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

## 1.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String
