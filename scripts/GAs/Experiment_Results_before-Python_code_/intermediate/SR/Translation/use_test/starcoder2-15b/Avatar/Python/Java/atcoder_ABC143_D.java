

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int[] l = new int[n];
        str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(l);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if (left <= i && i < right) {
                    tmp--;
                }
                if (left <= j && j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}

```

## 2.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 3.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 4.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 5.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 6.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 7.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 8.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 9.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 10.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```
/2019/2019-01-20/README.md
# 2019-01-20

## 1.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 2.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 3.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 4.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 5.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 6.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 7.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 8.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(1000000));
    }
}

```

## 9.

The following code is written in Python.

```
def f ( x ) :
    if x == 0 :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 1000000 ) )
```

Translate the above code to Java and enclose your solution inside ```java and ```.

```
public class Main {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        }
        return f(x - 1) + 1;
    }
    public static void main(String[] args) {
        System.out.println(f(
