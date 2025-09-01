```

import math


def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a


n, m = map(int, input().split())
s = input()
t = input()

for i in range(n):
    if s[i] != t[i * m // n]:
        print(-1)
        exit()

print(n * m // gcd(n, m))

```
