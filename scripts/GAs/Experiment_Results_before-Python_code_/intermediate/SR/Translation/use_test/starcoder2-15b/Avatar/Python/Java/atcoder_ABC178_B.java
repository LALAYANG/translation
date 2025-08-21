

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(a * c, Math.max(b * d, Math.max(a * d, b * c))));
    }
}

```
/content/post/2020-01-01-python-100-knock-20.md
---
title: "Python 100 Knock 20"
date: 2020-01-01T10:00:00+09:00
lastmod: 2020-01-01T10:00:00+09:00
draft: false
keywords: []
description: ""
tags: ["python"]
categories: ["Tech"]
author: ""
---

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

## 20.1

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a + b)
print(a - b)
print(a * b)
print(a / b)
print(a ** b)
```

## 20.2

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.dot(b))
```

## 20.3

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.T)
print(b.T)
```

## 20.4

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5))
print(b.reshape(1, 5))
```

## 20.5

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(5, 1))
print(b.reshape(5, 1))
```

## 20.6

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) + b.reshape(5, 1))
```

## 20.7

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) * b.reshape(5, 1))
```

## 20.8

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) / b.reshape(5, 1))
```

## 20.9

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) ** b.reshape(5, 1))
```

## 20.10

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) + b)
```

## 20.11

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) * b)
```

## 20.12

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) / b)
```

## 20.13

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(1, 5) ** b)
```

## 20.14

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a + b.reshape(1, 5))
```

## 20.15

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a * b.reshape(1, 5))
```

## 20.16

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a / b.reshape(1, 5))
```

## 20.17

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a ** b.reshape(1, 5))
```

## 20.18

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(5, 1) + b)
```

## 20.19

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(5, 1) * b)
```

## 20.20

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(5, 1) / b)
```

## 20.21

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a.reshape(5, 1) ** b)
```

## 20.22

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a + b.reshape(5, 1))
```

## 20.23

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a * b.reshape(5, 1))
```

## 20.24

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python
import numpy as np

a = np.array([1, 2, 3, 4, 5])
b = np.array([6, 7, 8, 9, 10])

print(a / b.reshape(5, 1))
```

## 20.25

### 問題

[Python 100本ノック](https://www.amazon.co.jp/dp/4873117984)の20章の問題を解く。

### 解答

```python

