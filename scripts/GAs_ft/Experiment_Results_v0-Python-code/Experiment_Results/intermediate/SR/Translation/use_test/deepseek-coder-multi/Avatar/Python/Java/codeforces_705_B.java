```
import sys
input = sys.stdin.readline
n = int(input())
numbers = list(map(int, input().split()))
c = 2
for i in numbers:
    if i == 1:
        print(c)
    elif i % 2 == 0:
        c = 3 - c
        print(c)
    else:
        print(c)
```
