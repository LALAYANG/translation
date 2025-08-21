

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> cnt = new HashMap<>();
        for (long f : fac) {
            cnt.put(f, cnt.getOrDefault(f, 0) + 1);
        }
        int ans = 0;
        for (long f : cnt.keySet()) {
            int x = cnt.get(f);
            for (int i = 1; i < 99999999; i++) {
                if (x >= i) {
                    x -= i;
                    ans++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2L);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }
}

```

## 2. 1000000007

### 2.1. 题目描述

给定一个正整数n，求n的质因数分解，并输出n的质因数分解中，每个质因数的个数。

### 2.2. 输入输出格式

#### 2.2.1. 输入格式：

一行，一个正整数n。

#### 2.2.2. 输出格式：

一行，n的质因数分解中，每个质因数的个数。

### 2.3. 输入输出样例

#### 2.3.1. 输入样例#1：

```
1000000007
```

#### 2.3.2. 输出样例#1：

```
1
```

### 2.4. 说明

#### 2.4.1. 数据范围

对于100%的数据，1≤n≤10^18。

### 2.5. 题解

#### 2.5.1. 思路

质因数分解，然后统计每个质因数的个数。

#### 2.5.2. 代码

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> cnt = new HashMap<>();
        for (long f : fac) {
            cnt.put(f, cnt.getOrDefault(f, 0) + 1);
        }
        for (long f : cnt.keySet()) {
            System.out.println(f + " " + cnt.get(f));
        }
    }

    public static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2L);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }
}

```

## 3. 1000000008

### 3.1. 题目描述

给定一个正整数n，求n的质因数分解，并输出n的质因数分解中，每个质因数的个数。

### 3.2. 输入输出格式

#### 3.2.1. 输入格式：

一行，一个正整数n。

#### 3.2.2. 输出格式：

一行，n的质因数分解中，每个质因数的个数。

### 3.3. 输入输出样例

#### 3.3.1. 输入样例#1：

```
1000000008
```

#### 3.3.2. 输出样例#1：

```
2 3
```

### 3.4. 说明

#### 3.4.1. 数据范围

对于100%的数据，1≤n≤10^18。

### 3.5. 题解

#### 3.5.1. 思路

质因数分解，然后统计每个质因数的个数。

#### 3.5.2. 代码

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> cnt = new HashMap<>();
        for (long f : fac) {
            cnt.put(f, cnt.getOrDefault(f, 0) + 1);
        }
        for (long f : cnt.keySet()) {
            System.out.println(f + " " + cnt.get(f));
        }
    }

    public static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2L);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }
}

```

## 4. 1000000009

### 4.1. 题目描述

给定一个正整数n，求n的质因数分解，并输出n的质因数分解中，每个质因数的个数。

### 4.2. 输入输出格式

#### 4.2.1. 输入格式：

一行，一个正整数n。

#### 4.2.2. 输出格式：

一行，n的质因数分解中，每个质因数的个数。

### 4.3. 输入输出样例

#### 4.3.1. 输入样例#1：

```
1000000009
```

#### 4.3.2. 输出样例#1：

```
1000000009 1
```

### 4.4. 说明

#### 4.4.1. 数据范围

对于100%的数据，1≤n≤10^18。

### 4.5. 题解

#### 4.5.1. 思路

质因数分解，然后统计每个质因数的个数。

#### 4.5.2. 代码

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> cnt = new HashMap<>();
        for (long f : fac) {
            cnt.put(f, cnt.getOrDefault(f, 0) + 1);
        }
        for (long f : cnt.keySet()) {
            System.out.println(f + " " + cnt.get(f));
        }
    }

    public static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2L);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }
}

```

## 5. 1000000010

### 5.1. 题目描述

给定一个正整数n，求n的质因数分解，并输出n的质因数分解中，每个质因数的个数。

### 5.2. 输入输出格式

#### 5.2.1. 输入格式：

一行，一个正整数n。

#### 5.2.2. 输出格式：

一行，n的质因数分解中，每个质因数的个数。

### 5.3. 输入输出样例

#### 5.3.1. 输入样例#1：

```
1000000010
```

#### 5.3.2. 输出样例#1：

```
2 1
5 1
1000000007 1
```

### 5.4. 说明

#### 5.4.1. 数据范围

对于100%的数据，1≤n≤10^18。

### 5.5. 题解

#### 5.5.1. 思路

质因数分解，然后统计每个质因数的个数。

#### 5.5.2. 代码

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> cnt = new HashMap<>();
        for (long f : fac) {
            cnt.put(f, cnt.getOrDefault(f, 0) + 1);
        }
        for (long f : cnt.keySet()) {
            System.out.println(f + " " + cnt.get(f));
        }
    }

    public static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2L);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }
}

```

## 6. 1000000011

### 6.1. 题目描述

给定一个正整数n，求n的质因数分解，并输出n的质因数分解中，每个质因数的个数。

### 6.2. 输入输出格式

#### 6.2.1. 输入格式：

一行，一个正整数n。

#### 6.2.2. 输出格式：

一行，n的质因数分解中，每个质因数的个数。

### 6.3. 输入输出样例

#### 6.3.1. 输入样例#1：

```
1000000011
```

#### 6.3.2. 输出样例#1：

```
3 1
11 1
3603601 1
```

### 6.4. 说明

#### 6.4.1. 数据范围

对于100%的数据，1≤n≤10^18。

### 6.5. 题解

#### 6.5.1. 思路

质因数分解，然后统计每个质因数的个数。

#### 6.5.2. 代码

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Long> fac = primeFactorize(n);
        Map<Long, Integer> cnt = new HashMap<>();
        for (long f : fac) {
            cnt.put(f, cnt.getOrDefault(f, 0) + 1);
        }
        for (long f : cnt.keySet()) {
            System.out.println(f + " " + cnt.get(f));
        }
    }

    public static List<Long> primeFactorize(long n) {
        List<Long> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2L);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            res.add(n);
        }
        return res;
    }
}

```

## 7. 1000000012

### 7.1. 题目描述

给定一个正整数n，求n的质因数分解，并输出n的质因数分解中，每个质因数的个数。

### 7.2. 输入输出格式

#### 7.2.1. 输入格式：

一行，一个正整数n。

#### 7.2.2. 输出格式：

一行，n的质因数分解中，每个质因数
