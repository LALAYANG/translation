

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = 0;
        if (k <= Math.max(n * n / 2, n * n - (n * n / 2))) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == j % 2 && x < k) {
                        System.out.print("L");
                        x++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}

```

## 2. 1005. 剪绳子

### 题目描述

给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。

### 输入描述

输入一个数n，意义见题面。（2 <= n <= 60）

### 输出描述

输出答案。

### 样例

#### 样例输入

8

#### 样例输出

18

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        System.out.println(dp[n]);
    }
}

```

## 3. 1006. 换硬币

### 题目描述

小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。

比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。

给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？

### 输入描述

输入只包括一行，一个由斜杠'/'分隔的日期。（保证每个数字恰好占两位）

### 输出描述

输出可能的日期，每个日期占一行。

### 样例

#### 样例输入

02/03/04

#### 样例输出

2002/03/04

2004/02/03

2004/03/02

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("/");
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] > 12) {
                int temp = a[i];
                a[i] = a[i % 3];
                a[i % 3] = temp;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (a[i] < 10) {
                System.out.print("0");
            }
            System.out.print(a[i]);
            if (i != 2) {
                System.out.print("/");
            }
        }
    }
}

```

## 4. 1007. 等差数列

### 题目描述

如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。

小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

### 输入描述

输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。

第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。

### 输出描述

如果可以变成等差数列输出"Possible",否则输出"Impossible"。

### 样例

#### 样例输入

3

3 1 2

#### 样例输出

Possible

### 题解

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int d = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            if (a[i] - a[i - 1] != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}

```

## 5. 1008. 矩形面积交

### 题目描述

平面内有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。

### 输入描述

输入仅包含两行，每行描述一个矩形。

在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。

### 输出描述

输出仅包含一个实数，为交的面积，保留到小数后两位。

### 样例

#### 样例输入

1 1 3 3

2 2 4 4

#### 样例输出

1.00

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        double x = Math.min(x2, x4) - Math.max(x1, x3);
        double y = Math.min(y2, y4) - Math.max(y1, y3);
        if (x <= 0 || y <= 0) {
            System.out.println(0);
        } else {
            System.out.printf("%.2f", x * y);
        }
    }
}

```

## 6. 1009. 等差数列

### 题目描述

如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。

小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

### 输入描述

输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。

第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。

### 输出描述

如果可以变成等差数列输出"Possible",否则输出"Impossible"。

### 样例

#### 样例输入

3

3 1 2

#### 样例输出

Possible

### 题解

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int d = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            if (a[i] - a[i - 1] != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}

```

## 7. 1010. 等差数列

### 题目描述

如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。

小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

### 输入描述

输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。

第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。

### 输出描述

如果可以变成等差数列输出"Possible",否则输出"Impossible"。

### 样例

#### 样例输入

3

3 1 2

#### 样例输出

Possible

### 题解

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int d = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            if (a[i] - a[i - 1] != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}

```

## 8. 1011. 等差数列

### 题目描述

如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。

小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

### 输入描述

输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。

第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。

### 输出描述

如果可以变成等差数列输出"Possible",否则输出"Impossible"。

### 样例

#### 样例输入

3

3 1 2

#### 样例输出

Possible

### 题解

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int d = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            if (a[i] - a[i - 1] != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}

```

## 9. 1012. 等差数列

### 题目描述

如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。

小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

### 输入描述

输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。

第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。

### 输出描述

如果可以变成等差数列输出"Possible",否则输出"Impossible"。

### 样例

#### 样例输入

3

3 1 2

#### 样例输出

Possible

### 题解

