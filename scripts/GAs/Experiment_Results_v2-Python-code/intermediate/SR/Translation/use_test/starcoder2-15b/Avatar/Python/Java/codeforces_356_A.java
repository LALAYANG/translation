

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rangeEnd = sc.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < rangeEnd; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = sc.nextInt();
            int t = l;
            while (t <= r) {
                int next_val = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1;
                if (t >= x) {
                    comp[t - 1] = x;
                }
                t = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```

## 2.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 3.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 4.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 5.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 6.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 7.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 8.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 9.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```

## 10.

The following code is written in Python.

```
def func(n):
    if n == 0:
        return 0
    return n + func(n - 1)

print(func(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

Java code:

```java
public class Solution {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(func(5));
    }
}
```
/README.md
# Python to Java

This repository contains a collection of Python to Java translations.

## How to contribute

To contribute, please follow the following steps:

1. Fork this repository.
2. Create a new folder with the name of the problem.
3. Add your solution to the folder.
4. Create a pull request.

## License

This repository is licensed under the MIT License.

