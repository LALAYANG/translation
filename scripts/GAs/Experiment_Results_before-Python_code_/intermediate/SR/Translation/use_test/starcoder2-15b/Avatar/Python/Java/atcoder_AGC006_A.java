

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        if (s.equals(t)) {
            System.out.println(n);
        } else {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s.charAt(i + j) != t.charAt(j)) {
                        break;
                    }
                    if (j == n - i - 1) {
                        cnt = n - i;
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
    }
}

```

## 2. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
n = int ( input ( ) )
print ( n - 1 )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}

```

## 3. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
n = int ( input ( ) )
print ( n - 1 )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}

```

## 4. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
n = int ( input ( ) )
print ( n - 1 )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}

```

## 5. 1000000007

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
n = int ( input ( ) )
print ( n - 1 )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
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
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login1(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login2(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login3(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login4(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login5(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login6(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login7(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login8(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login9(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login10(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login11(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login12(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login13(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login14(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login15(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login16(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main17(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login17(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main18(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.out.println(login(username, password));
    }

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功与否，成功返回true，失败返回false
     */
    public static boolean login18(String username, String password) {
        return username.equals("admin") && password.equals("");
    }

    public static void main19(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your username:");
        String username = scanner.next();
        System.out.println("Please input your password:");
        String password = scanner.next();
        System.
