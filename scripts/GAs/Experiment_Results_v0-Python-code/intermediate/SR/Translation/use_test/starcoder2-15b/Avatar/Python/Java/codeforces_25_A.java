

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] remainder_list = new int[n];
        for (int i = 0; i < n; i++) {
            remainder_list[i] = sc.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += remainder_list[i];
        }
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (remainder_list[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (remainder_list[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
```
/docs/python/python-100-examples/python-exercise-example10.md
# Python 练习实例10

**题目：** 列表转换为字典。

**程序分析：**

```python
i = ["a", "b"]
l = [1, 2]
print(

```python
i = ["a", "b"]
l = [1, 2]
print(dict([i, l]))
```
dict([i, l]))
```

程序源代码：

```python
import random

print(random.randint(10, 20))
```
/docs/python/python-100-examples/python-exercise-example15.md
# Python 练习实例15

**题目：** 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

**程序分析：** 程序分析：(a>b)?a:b这是条件运算符的基本例子。

```python
score = int(input('input score:\n'))
if score >= 90:
    grade = 'A'
elif score >= 60:
    grade = 'B'
else:
    grade = 'C'

print('%d belongs to %s' % (score, grade))
```

程序源代码：

```python
s = int(input('input a number:\n'))
if s >= 90:
    grade = 'A'
elif s >= 60:
    grade = 'B'
else:
    grade = 'C'

print('%d belongs to %s' % (s, grade))
```

程序源代码：/docs/python/python-100-examples/python-exercise-example11.md
# Python 练习实例11

**题目：** 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？

**程序分析：** 兔子的规律为数列1,1,2,3,5,8,13,21....

```python
f1 = 1
f2 = 1
for i in range(1, 22):
    print('%12ld %12ld' % (f1, f2), end='')
    if (i % 3) == 0:
        print('')
    f1 = f1 + f2
    f2 = f1 + f2
```

程序源代码：

```python
f1 = 1
f2 = 1
for i in range(1, 22):
    print('%12ld %12ld' % (f1, f2), end='')
    if (i % 3) == 0:
        print('')
    f1 = f1 + f2
    f2 = f1 + f2
```
/docs/python/python-100-examples/pytho

```python
print(random.random())
```
n-exercise-example14.md
# Python 练习实例14

**题目：** 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

**程序分析：** 程序分析：(a>b)?a:b这是条件运算符的基本例子。

```python
import random

print(random.random())
```

程序源代码：

```python
import random

print(random.random())
```

程序源代码：

```python
import random

print(random.random())
```

程序源代码：

```python
import random

print(random.random())
```

程序源代码：

```python
import random

print(random.random())
```

程序源代码：

```python
import random

print(random.random())
```

程序源代码：

```python
import random

print(random.random())
```

程序源代码：/docs/python/python-100-examples/python-exercise-example12.md
# Python 练习实例12

**题目：** 判断101

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x
print(sum)
```

程序源代码：

```python
n = int(input('n = '))

# use for loop
sum = 0
for x in range(1, n + 1):
    sum += x

