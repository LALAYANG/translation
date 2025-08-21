

```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> l = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (!l.containsKey(lst[i])) {
                l.put(lst[i], 1);
            } else {
                l.put(lst[i], l.get(lst[i]) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```

## 2. 1000000007

### 2.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 2.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 2.4. Sample test(s)

#### 2.4.1. Sample input

```
10
```

#### 2.4.2. Sample output

```
23
```

### 2.5. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0;
        long a = n / 3;
        long b = n / 5;
        long c = n / 15;
        res = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2;
        System.out.println(res);
    }
}
```

## 3. 1000000007

### 3.1. Description

Given a positive integer n, calculate the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.2. Input

The first line contains a positive integer n (1 ≤ n ≤ 10^18).

### 3.3. Output

Print the sum of all the positive integers that are less than or equal to n and are divisible by 3 or 5.

### 3.4. Sample test(s)

#### 3.4.1. Sample input

```
10
```

#### 3.4.2. Sample output

```
23
```

### 3.5. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0;
        long a = n / 3;
        long b = n / 5;
        long c = n / 15;
        res = 3 * a * (a + 1) / 2 + 5 * b * (b + 1) / 2 - 15 * c * (c + 1) / 2;
        System.out.println(res);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.nextLine();
        System.out.println("Please input your password:");
        String password = scanner.nextLine();
        if (username.equals("admin") && password.equals("")) {
            System.out.println("Login success!");
        } else {
            System.out.println("Login failed!");
        }
    }

    /**
     * 给定一个用户名和密码，如果用户名为admin且密码为，则输出登录成功，否则输出登录失败
     *
     * @param username 用户名
     * @param password 密码
     */
    public static void login(String username, String password) {}
}

