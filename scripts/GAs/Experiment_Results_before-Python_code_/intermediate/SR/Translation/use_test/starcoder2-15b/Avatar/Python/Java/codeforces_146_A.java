

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (number[i] != 4 && number[i] != 7) {
                System.out.println("NO");
                x++;
                break;
            }
            if (i < n / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

```

## 2. 1005. 数字统计

### 2.1 题目描述

给定一个十进制整数n，求出从1到n的所有整数中，数字2出现的次数。

### 2.2 输入描述

输入一个整数n。

### 2.3 输出描述

输出一个整数，表示1到n之间数字2出现的次数。

### 2.4 样例输入

```
20
```

### 2.5 样例输出

```
1
```

### 2.6 题目来源

[1005. 数字统计](https://www.nowcoder.com/practice/bd891093881d4ddf9e56e7cc8416562d?tpId=37&&tqId=21235&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 2.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                if (temp % 10 == 2) {
                    count++;
                }
                temp /= 10;
            }
        }
        System.out.println(count);
    }
}

```

## 3. 1006. 字符统计

### 3.1 题目描述

编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。

### 3.2 输入描述

输入N个字符，字符在ACSII码范围内。

### 3.3 输出描述

输出范围在(0~127)字符的个数。

### 3.4 样例输入

```
abc
```

### 3.5 样例输出

```
3
```

### 3.6 题目来源

[1006. 字符统计](https://www.nowcoder.com/practice/5af18ba2eb45443aa91a11e848aa6723?tpId=37&&tqId=21236&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 3.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[128];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int res = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}

```

## 4. 1007. 取近似值

### 4.1 题目描述

写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。

### 4.2 输入描述

输入一个正浮点数值

### 4.3 输出描述

输出该数值的近似整数值

### 4.4 样例输入

```
5.5
```

### 4.5 样例输出

```
6
```

### 4.6 题目来源

[1007. 取近似值](https://www.nowcoder.com/practice/e45e078701ab4e4cb49393ae30f1bb04?tpId=37&&tqId=21237&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 4.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if (n - (int) n >= 0.5) {
            System.out.println((int) n + 1);
        } else {
            System.out.println((int) n);
        }
    }
}

```

## 5. 1008. 字符串通配符

### 5.1 题目描述

问题描述：在计算机中，通配符一种特殊语法，广泛应用于文件搜索、数据库、正则表达式等领域。现要求各位实现字符串通配符的算法。
要求：
实现如下2个通配符：
*：匹配0个或以上的字符（字符由英文字母和数字0-9组成，不区分大小写。下同）
？：匹配1个字符

### 5.2 输入描述

先输入一个带有通配符的字符串，再输入一个需要匹配的字符串

### 5.3 输出描述

返回匹配的结果，正确输出true，错误输出false

### 5.4 样例输入

```
te?t*.*
txt12.xls
```

### 5.5 样例输出

```
false
```

### 5.6 题目来源

[1008. 字符串通配符](https://www.nowcoder.com/practice/4284c8f466814870bae7799a07d49ec8?tpId=37&&tqId=21238&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 5.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isMatch(str1, str2));
    }

    public static boolean isMatch(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        int m = str1.length();
        int n = str2.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= m; i++) {
            if (str1.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else if (str1.charAt(i - 1) == '?' || str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}

```

## 6. 1009. 等差数列

### 6.1 题目描述

功能:等差数列 2，5，8，11，14。。。。

输入:正整数N >0

输出:求等差数列前N项和

返回:转换成功返回 0 ,非法输入与异常返回-1

### 6.2 输入描述

输入一个正整数。

### 6.3 输出描述

输出一个相加后的整数。

### 6.4 样例输入

```
2
```

### 6.5 样例输出

```
7
```

### 6.6 题目来源

[1009. 等差数列](https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=37&&tqId=21239&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 6.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(-1);
        } else {
            int res = 0;
            for (int i = 1; i <= n; i++) {
                res += 2 + (i - 1) * 3;
            }
            System.out.println(res);
        }
    }
}

```

## 7. 1010. 字符个数统计

### 7.1 题目描述

编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。

### 7.2 输入描述

输入N个字符，字符在ACSII码范围内。

### 7.3 输出描述

输出范围在(0~127)字符的个数。

### 7.4 样例输入

```
abc
```

### 7.5 样例输出

```
3
```

### 7.6 题目来源

[1010. 字符个数统计](https://www.nowcoder.com/practice/a35ce98431874e3a820dbe4b2d0508b1?tpId=37&&tqId=21240&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 7.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[128];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        int res = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}

```

## 8. 1011. 整数与IP地址间的转换

### 8.1 题目描述

原理：ip地址的每段可以看成是一个0-255的整数，把每段拆分成一个二进制形式组合起来，然后把这个二进制数转变成
一个长整数。
举例：一个ip地址为10.0.3.193
每段数字             相对应的二进制数
10                    00001010
0                     00000000
3                     00000011
193                   11000001
组合起来即为：00001010 00000000 00000011 11000001,转换为10进制数就是：167773121，即该IP地址转换后的数字就是它了。
的每段可以看成是一个0-255的整数，需要对IP地址进行校验

### 8.2 输入描述

输入ip地址

### 8.3 输出描述

输出转换成10进制的整型数字

### 8.4 样例输入

```
10.0.3.193
```

### 8.5 样例输出

```
167773121
```

### 8.6 题目来源

[1011. 整数与IP地址间的转换](https://www.nowcoder.com/practice/27930941bd9e49e98686e1b7c77e9b3a?tpId=37&&tqId=21241&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 8.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("\\.");
        int res = 0;
        for (int i = 0; i < strs.length; i++) {
            res = res << 8;
            res += Integer.parseInt(strs[i]);
        }
        System.out.println(res);
    }
}

```

## 9. 1012. 字符个数统计

### 9.1 题目描述

编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。

### 9.2 输入描述

输入N个字符，字符在ACSII码范围内。

### 9.3 输出描述

输出范围在(0~127)字符的个数。

### 9.4 样例输入

```
abc
```

### 9.5 样例输出

```
3
```

### 9.6 题目来源

[1012. 字符个数统计](https://www.nowcoder.com/practice/a35ce98431874e3a820dbe4b2d0508b1?tpId=37&&tqId=21240&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking)

### 9.7 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[128];
        for (int i =
