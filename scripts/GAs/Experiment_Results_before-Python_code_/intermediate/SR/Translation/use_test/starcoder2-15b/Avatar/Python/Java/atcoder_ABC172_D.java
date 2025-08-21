

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
}
```
/content/posts/2020-04-01-python-list-comprehension.md
---
title: "Python List Comprehension"
date: 2020-04-01T12:00:00+08:00
draft: false
---

## List Comprehension

List comprehension is a way to create a list in Python.

It is a short way to create a list.

List comprehension is a complete substitute for the lambda function as well as the functions map(), filter() and reduce().

## Syntax

```
new_list = [expression for_loop_one_or_more conditions]
```

## Example

```
# without list comprehension
squares = []
for i in range(10):
    squares.append(i**2)   #list append
print(squares)

# output: [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

# with list comprehension
squares = [i**2 for i in range(10)]
print(squares)

# output: [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
```

## Example

```
# without list comprehension
cubes = []
for i in range(10):
    cubes.append(i**3)
print(cubes)

# output: [0, 1, 8, 27, 64, 125, 216, 343, 512, 729]

# with list comprehension
cubes = [i**3 for i in range(10)]
print(cubes)

# output: [0, 1, 8, 27, 64, 125, 216, 343, 512, 729]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append(a)
print(common_num)

# output: [2, 3, 4]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [a for a in list_a for b in list_b if a == b]
print(common_num)

# output: [2, 3, 4]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
squared_diff = []
for a in list_a:
    for b in list_b:
        if a == b:
            squared_diff.append((a-b)**2)
print(squared_diff)

# output: [0, 1, 4]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
squared_diff = [(a-b)**2 for a in list_a for b in list_b if a == b]
print(squared_diff)

# output: [0, 1, 4]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append(a*b)
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [a*b for a in list_a for b in list_b if a == b]
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append((a-b)**2)
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [(a-b)**2 for a in list_a for b in list_b if a == b]
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append(a*b)
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [a*b for a in list_a for b in list_b if a == b]
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append((a-b)**2)
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [(a-b)**2 for a in list_a for b in list_b if a == b]
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append(a*b)
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [a*b for a in list_a for b in list_b if a == b]
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append((a-b)**2)
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [(a-b)**2 for a in list_a for b in list_b if a == b]
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append(a*b)
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [a*b for a in list_a for b in list_b if a == b]
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append((a-b)**2)
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [(a-b)**2 for a in list_a for b in list_b if a == b]
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append(a*b)
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [a*b for a in list_a for b in list_b if a == b]
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append((a-b)**2)
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [(a-b)**2 for a in list_a for b in list_b if a == b]
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append(a*b)
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [a*b for a in list_a for b in list_b if a == b]
print(common_num)

# output: [2, 6, 8, 3, 9, 12, 4, 12, 16]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = []
for a in list_a:
    for b in list_b:
        if a == b:
            common_num.append((a-b)**2)
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]

# with list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4, 5]
common_num = [(a-b)**2 for a in list_a for b in list_b if a == b]
print(common_num)

# output: [0, 1, 4, 1, 0, 1, 4, 1, 0]
```

## Example

```
# without list comprehension
list_a = [1, 2, 3, 4]
list_b = [2, 3, 4,
