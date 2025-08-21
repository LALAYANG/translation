

```java
import java.util.Scanner;
import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        Collections.shuffle(Arrays.asList(95, 50, 78));
        TTest t = new TTest();
        t.t(new double[]{96, 31, 70}, new double[]{80, 72, 33});
        int STRING_LENGTH = l.length();
        int[][] dp = new int[STRING_LENGTH + 1][2];
        dp[0][0] = 1;
        int THRESHOLD_2 = 256;
        int THRESHOLD_1 = 777;
        int CONDITION_VALUE_2 = 897;
        int CONDITION_VALUE_1 = 418;
        int INNER_LOOP_LIMIT = 67;
        int OUTER_LOOP_LIMIT = 66;
        for (int LoopIndexOut = 0; LoopIndexOut < INNER_LOOP_LIMIT / OUTER_LOOP_LIMIT; LoopIndexOut++) {
            for (int i = 0; i < l.length(); i++) {
                char c = l.charAt(i);
                if ((CONDITION_VALUE_2 & CONDITION_VALUE_1) != 0) {
                    if ((THRESHOLD_2 & THRESHOLD_1) != 0) {
                        if (c == '0') {
                            dp[i + 1][0] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        } else {
                            dp[i + 1][0] += dp[i][0] * 2;
                            dp[i + 1][1] += dp[i][0];
                            dp[i + 1][1] += dp[i][1] * 3;
                        }
                    }
                }
                dp[i + 1][0] %= 1000000007;
                dp[i + 1][1] %= 1000000007;
            }
        }
        System.out.println((dp[STRING_LENGTH][0] + dp[STRING_LENGTH][1]) % 1000000007);
    }
}
```

## 2.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 3.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 4.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 5.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 6.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 7.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 8.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 9.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 10.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 11.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 12.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 13.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 14.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 15.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 16.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 17.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 18.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 19.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 20.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return f(x - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
```

## 21.

The following code is written in Python.

```
def f(x):
    if x == 0:
        return 1
    return f(x - 1) + 1

print(f(5))
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```java
public class Solution {
    public static int
