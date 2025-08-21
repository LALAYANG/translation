

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber + 1];
        m[0] = 1;
        int a = 0;
        int r = 0;
        for (int i = 0; i < 325; i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                a += Character.getNumericValue(s.charAt(j)) * BigInteger.valueOf(10).pow(j).mod(BigInteger.valueOf(moduloNumber)).intValue();
                r += m[a % moduloNumber];
                m[a % moduloNumber]++;
            }
        }
        System.out.println(r);
    }
}
```

## 2.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 3.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 4.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 5.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 6.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 7.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 8.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 9.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 10.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 11.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 12.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 13.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 14.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

    public static int fgh(int x) {
        return f(g(h(x)));
    }
}
```

## 15.

The following code is written in Python.

```
def f(x):
    return x * x

def g(x):
    return x + 1

def h(x):
    return x - 1

def fgh(x):
    return f(g(h(x)))

print(fgh(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(fgh(1));
    }

    public static int f(int x) {
        return x * x;
    }

    public static int g(int x) {
        return x + 1;
    }

    public static int h(int x) {
        return x - 1;
    }

   
