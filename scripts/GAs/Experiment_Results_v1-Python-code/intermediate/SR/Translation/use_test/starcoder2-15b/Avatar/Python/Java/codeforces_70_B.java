

```java
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        int sumL = 0;
        int value = 693;
        int check = 914;
        int mask = 421;
        int flag = 729;
        int limit = 10;
        int step = 9;
        for (int LoopIndexOut = 0; LoopIndexOut < limit / step; LoopIndexOut++) {
            String sentence = sc.nextLine();
            String[] sentences = Pattern.compile("[.?!]").split(sentence);
            for (String s : sentences) {
                s = s.trim() + ".";
                int L = s.length();
                if ((mask & flag) != 0) {
                    if ((value & check) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                return;
                            }
                            if (sumL + L + (sumL > 0) > n) {
                                result = result + 1;
                                sumL = L;
                            } else {
                                sumL = sumL + L + (sumL > 0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f, g).apply(1));
        System.out.println(compose(f, h).apply(1));
        System.out.println(compose(g, f).apply(1));
        System.out.println(compose(h, f).apply(1));
    }

    public static Function<Integer, Integer> compose(Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return x -> f.apply(g.apply(x));
    }

    public static Function<Integer, Integer> f(Integer x) {
        return x * x;
    }

    public static Function<Integer, Integer> g(Integer x) {
        return x + 1;
    }

    public static Function<Integer, Integer> h(Integer x) {
        return x - 1;
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

def compose(f, g):
    return lambda x: f(g(x))

print(compose(f, g)(1))
print(compose(f, h)(1))
print(compose(g, f)(1))
print(compose(h, f)(1))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static void main(String[] args) {
        System.out.println(compose(f,
