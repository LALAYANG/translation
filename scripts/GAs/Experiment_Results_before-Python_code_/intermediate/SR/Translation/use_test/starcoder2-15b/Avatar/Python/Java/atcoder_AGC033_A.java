

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        int[][] graph = new int[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '#') {
                    graph[i][j] = 0;
                } else {
                    graph[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int x = 0; x < w - 1; x++) {
            for (int y = 0; y < h; y++) {
                graph[y][x + 1] = Math.min(graph[y][x] + 1, graph[y][x + 1]);
            }
        }
        for (int x = w - 1; x > 0; x--) {
            for (int y = 0; y < h; y++) {
                graph[y][x - 1] = Math.min(graph[y][x] + 1, graph[y][x - 1]);
            }
        }
        for (int y = 0; y < h - 1; y++) {
            for (int x = 0; x < w; x++) {
                graph[y + 1][x] = Math.min(graph[y][x] + 1, graph[y + 1][x]);
            }
        }
        for (int y = h - 1; y > 0; y--) {
            for (int x = 0; x < w; x++) {
                graph[y - 1][x] = Math.min(graph[y][x] + 1, graph[y - 1][x]);
            }
        }
        int max = 0;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                max = Math.max(max, graph[y][x]);
            }
        }
        System.out.println(max);
    }
}
```
/docs/01.python/05.SYL/02.day02/01.Python 基础语法.md
---
title: Python 基础语法
date: 2021-03-09 10:27:36
permalink: /pages/50000b/
categories:
  - python
  - SYL
  - day02
tags:
  - 
---
# Python 基础语法

## 注释

### 单行注释

```python
# 单行注释
```

### 多行注释

```python
'''
多行注释
多行注释
多行注释
'''

"""
多行注释
多行注释
多行注释
"""
```

## 变量

### 变量的定义

```python
# 定义变量
a = 10
b = 20
c = 30

# 定义多个变量
a, b, c = 10, 20, 30

# 定义多个变量
a = b = c = 10
```

### 变量的命名规则

- 变量名只能是 字母、数字或下划线的任意组合
- 变量名的第一个字符不能是数字
- 以下关键字不能声明为变量名
  - and、as、assert、break、class、continue、def、del、elif、else、except、exec、finally、for、from、global、if、import、in、is、lambda、not、or、pass、print、raise、return、try、while、with、yield

### 变量的类型

- 整型（int）
- 浮点型（float）
- 字符串（str）
- 布尔型（bool）

```python
# 整型
a = 10

# 浮点型
b = 10.1

# 字符串
c = 'hello'

# 布尔型
d = True
```

### 变量的类型转换

- int()：将一个数值或字符串转换成整数，可以指定进制。
- float()：将一个字符串转换成浮点数。
- str()：将指定的对象转换成字符串形式，可以指定编码。
- chr()：将整数转换成该编码对应的字符串（一个字符）。
- ord()：将字符串（一个字符）转换成对应的编码（整数）。

```python
# int()
a = int(10.1)
b = int('10')
c = int('1010', 2)

# float()
a = float(10)
b = float('10.1')

# str()
a = str(10)
b = str(10.1)
c = str('hello')

# chr()
a = chr(97)

# ord()
a = ord('a')
```

## 运算符

### 算术运算符

| 运算符 | 描述 | 实例 |
| --- | --- | --- |
| + | 加 | 10 + 20 = 30 |
| - | 减 | 10 - 20 = -10 |
| * | 乘 | 10 * 20 = 200 |
| / | 除 | 10 / 20 = 0.5 |
| // | 取整除 | 9 // 2 = 4 |
| % | 取余数 | 9 % 2 = 1 |
| ** | 幂 | 2 ** 3 = 8 |

```python
# 加
a = 10 + 20

# 减
a = 10 - 20

# 乘
a = 10 * 20

# 除
a = 10 / 20

# 取整除
a = 9 // 2

# 取余数
a = 9 % 2

# 幂
a = 2 ** 3
```

### 比较运算符

| 运算符 | 描述 | 实例 |
| --- | --- | --- |
| == | 检查两个操作数的值是否相等，如果是，则条件变为真。 | 10 == 20 返回 False |
| != | 检查两个操作数的值是否相等，如果值不相等，则条件变为真。 | 10 != 20 返回 True |
| > | 检查左操作数的值是否大于右操作数的值，如果是，则条件成立。 | 10 > 20 返回 False |
| < | 检查左操作数的值是否小于右操作数的值，如果是，则条件成立。 | 10 < 20 返回 True |
| >= | 检查左操作数的值是否大于或等于右操作数的值，如果是，则条件成立。 | 10 >= 20 返回 False |
| <= | 检查左操作数的值是否小于或等于右操作数的值，如果是，则条件成立。 | 10 <= 20 返回 True |

```python
# 检查两个操作数的值是否相等，如果是，则条件变为真
a = 10 == 20

# 检查两个操作数的值是否相等，如果值不相等，则条件变为真
a = 10 != 20

# 检查左操作数的值是否大于右操作数的值，如果是，则条件成立
a = 10 > 20

# 检查左操作数的值是否小于右操作数的值，如果是，则条件成立
a = 10 < 20

# 检查左操作数的值是否大于或等于右操作数的值，如果是，则条件成立
a = 10 >= 20

# 检查左操作数的值是否小于或等于右操作数的值，如果是，则条件成立
a = 10 <= 20
```

### 赋值运算符

| 运算符 | 描述 | 实例 |
| --- | --- | --- |
| = | 简单的赋值运算符 | c = a + b 将 a + b 的运算结果赋值为 c |
| += | 加法赋值运算符 | c += a 等效于 c = c + a |
| -= | 减法赋值运算符 | c -= a 等效于 c = c - a |
| *= | 乘法赋值运算符 | c *= a 等效于 c = c * a |
| /= | 除法赋值运算符 | c /= a 等效于 c = c / a |
| //= | 取整除赋值运算符 | c //= a 等效于 c = c // a |
| %= | 取余赋值运算符 | c %= a 等效于 c = c % a |
| **= | 幂赋值运算符 | c **= a 等效于 c = c ** a |

```python
# 简单的赋值运算符
a = 10

# 加法赋值运算符
a += 10

# 减法赋值运算符
a -= 10

# 乘法赋值运算符
a *= 10

# 除法赋值运算符
a /= 10

# 取整除赋值运算符
a //= 10

# 取余赋值运算符
a %= 10

# 幂赋值运算符
a **= 10
```

### 逻辑运算符

| 运算符 | 逻辑表达式 | 描述 |
| --- | --- | --- |
| and | x and y | 只有 x 和 y 的值都为 True，才会返回 True，否则只要 x 或者 y 有一个值为 False，就返回 False。 |
| or | x or y | 只要 x 或者 y 有一个值为 True，就返回 True，只有 x 和 y 的值都为 False，才会返回 False。 |
| not | not x | 如果 x 为 True，返回 False；如果 x 为 False，返回 True。 |

```python
# and
a = True and True
b = True and False
c = False and True
d = False and False

# or
a = True or True
b = True or False
c = False or True
d = False or False

# not
a = not True
b = not False
```

### 成员运算符

| 运算符 | 描述 | 实例 |
| --- | --- | --- |
| in | 如果在指定的序列中找到值返回 True，否则返回 False。 | x 在 y 序列中 , 如果 x 在 y 序列中返回 True。 |
| not in | 如果在指定的序列中没有找到值返回 True，否则返回 False。 | x 不在 y 序列中 , 如果 x 不在 y 序列中返回 True。 |

```python
# in
a = 10 in [10, 20, 30]
b = 10 in (10, 20, 30)
c = 10 in {10, 20, 30}
d = 'a' in 'abc'
e = 'a' in {'a': 1, 'b': 2, 'c': 3}
f = 'a' in {'a', 'b', 'c'}

# not in
a = 10 not in [10, 20, 30]
b = 10 not in (10, 20, 30)
c = 10 not in {10, 20, 30}
d = 'a' not in 'abc'
e = 'a' not in {'a': 1, 'b': 2, 'c': 3}
f = 'a' not in {'a', 'b', 'c'}
```

### 身份运算符

| 运算符 | 描述 | 实例 |
| --- | --- | --- |
| is | is 是判断两个标识符是不是引用自一个对象 | x is y, 类似 id(x) == id(y) , 如果引用的是同一个对象则返回 True，否则返回 False |
| is not | is not 是判断两个标识符是不是引用自不同对象 | x is not y ， 类似 id(a) != id(b)。如果引用的不是同一个对象则返回结果 True，否则返回 False。 |

```python
# is
a = 10 is 10
b = 10 is 20
c = 10 is not 10
d = 10 is not 20
```

### 运算符优先级

| 运算符 | 描述 |
| --- | --- |
| ** | 指数 (最高优先级) |
| ~ + - | 按位翻转, 一元加号和减号 (最后两个的方法名为 +@ 和 -@) |
| * / % // | 乘，除，取模和取整除 |
| + - | 加法减法 |
| >> << | 右移，左移运算符 |
| & | 位 'AND' |
| ^ | 位运算符 |
| <= < > >= | 比较运算符 |
| <> == != | 等于运算符 |
| = %= /= //= -= += *= **= | 赋值运算符 |
| is is not | 身份运算符 |
| in not in | 成员运算符 |
| not or and | 逻辑运算符 |

## 条件判断

### if 语句

```python
if 条件表达式:
    代码块
```

### if-else 语句

```python
if 条件表达式:
    代码块
else:
    代码块
```

### if-elif-else 语句

```python
if 条件表达式:
    代码块
elif 条件表达式:
    代码块
elif 条件表达式:
    代码块
...
else:
    代码块
```

### 三元运算符

```python
a = 10 if 10 > 20 else 20
```

## 循环

### while 循环

```python
while 条件表达式:
    代码块
```

### for 循环

```python
for 变量 in 序列:
    代码块
```

### break

```python
for i in range(10):
    if i == 5:
        break
    print(i)
```

### continue

```python
for i in range(10):
    if i == 5:
        continue
    print(i)
```

### else

```python
for i in range(10):
    if i == 5:
        break
    print(i)
else:
    print('循环正常结束')
```

## 练习

### 练习 1：输入一个数，判断是奇数还是偶数

```python
num = int(input('请输入一个数：'))
if num % 2 == 0:
    print('偶数')
else:
    print('奇数')
```

### 练习 2：输入一个数，判断是正数、负数还是零

```python
num = int(input('请输入一个数：'))
if num > 0:
    print('正数')
elif num < 0:
    print('负数')
else:
    print('零')
```

### 练习 3：输入一个年份，判断是平年还是闰年

```python
year = int(input('请输入一个年份：'))

