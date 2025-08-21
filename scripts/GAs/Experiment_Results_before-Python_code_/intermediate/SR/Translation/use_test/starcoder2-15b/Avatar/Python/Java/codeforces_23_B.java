

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < 2) {
                System.out.println(0);
            }
            if (a >= 2) {
                System.out.println(a - 2);
            }
        }
    }
}

```


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

```
/src/main/java/com/github/hcsp/controlflow/Main.md
# 最大的整数

请实现一个程序，找出数组中最大的那个整数。

在提交答案之前，你需要在本地编译并运行这个类，看看你的程序是否能够正常工作。

提交答案时，你需要将这个文件重新命名为`Main.java`

## 题目描述

请实现一个程序，找出数组中最大的那个整数。

在提交答案之前，你需要在本地编译并运行这个类，看看你的程序是否能够正常工作。

提交答案时，你需要将这个文件重新命名为`Main.java`

## 示例

```
输入：[1, 2, 3, 4, 5]
输出：5
```

```
输入：[1, 2, 3, 4, 5, 0]
输出：5
```

```
输入：[-1, -2, -3, -4, -5]
输出：-1
```

## 思路

1. 定义一个变量max，初始值为数组的第一个元素
2. 遍历数组，如果当前元素大于max，则将max赋值为当前元素
3. 遍历结束后，max即为数组中最大的元素

## 解答

```
n = int ( input ( ) )
a = [ ]
for i in range ( n ) :
    a.append ( int ( input ( ) ) )
max = a [ 0 ]
for i in range ( 1 , n ) :
    if a [ i ] > max :
        max = a [ i ]
print ( max )

