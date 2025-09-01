```
import numpy as np

def solve(n, arr):
    arr = np.array(arr)
    a = 1
    pos = 0
    for i in range(1, n):
        if arr[pos] > arr[i]:
            a += 1
            pos = i
    return a

n = int(input())
arr = [int(x) for x in input().split()]
print(solve(n, arr))

```
