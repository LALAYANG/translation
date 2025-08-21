

```java

```


```java

```
/README.md
# Python to Java

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
56588

Expected output:
56591


```
from scipy.stats import ttest_ind
start_index = int(input())
prime = [True] * 100010
prime[0] = False
prime[1] = False
for i in range(4, 100010, 2):
    prime[i] = False
i = 3
ttest_ind([63, 95, 33], [80, 83, 67])
while i * i <= 100008:
    check115 = 462
    check215 = 676
    check113 = 423
    check213 = 591
    check111 = 279
    check211 = 581
    if check115 & check215:
        if check113 & check213:
            if check111 & check211:
                if prime[i]:
                    for prime_index in range(i + i, 100008, i):
                        prime[prime_index] = False
    i = i + 2
check125 = 294
check225 = 368
for i in range(start_index, 100008):
    if check125 & check225:
        if prime[i]:
            print(i)
            break
```
