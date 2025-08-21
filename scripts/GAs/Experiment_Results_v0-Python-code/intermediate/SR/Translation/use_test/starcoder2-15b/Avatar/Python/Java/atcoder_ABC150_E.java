

```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(c);
        Collections.reverse(Arrays.asList(c));
        int mod = (int) Math.pow(10, 9) + 7;
        int b = (int) Math.pow(2, 2 * n - 2) % mod;
        int a = 2 * b % mod;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }
}
```

## 2.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 3.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 4.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 5.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 6.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 7.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 8.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 9.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 10.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 11.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
            b = x
        else:
            a = x
    return a

print(find_max(0, 10, 0.001))
```

## 12.

The following code is a solution to the problem of finding the maximum value of a function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    x = a
    while x < b:
        if f(x) > f(x + eps):
            return x
        x += eps
    return x

print(find_max(0, 10, 0.001))
```

The code is not very efficient, because it checks the value of the function at each point.

Rewrite the code using the binary search algorithm to find the maximum value of the function.

```
import math

def f(x):
    return math.sin(x)

def find_max(a, b, eps):
    while b - a > eps:
        x = (a + b) / 2
        if f(x) > f(x + eps):
           
