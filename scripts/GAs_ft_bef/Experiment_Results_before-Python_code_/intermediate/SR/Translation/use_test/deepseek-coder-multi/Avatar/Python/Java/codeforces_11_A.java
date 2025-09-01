```
n, d = map(int, input().split())
x = list(map(int, input().split()))
m = 0
for i in range(n - 1):
    if x[i] >= x[i + 1]:
        q = int((x[i] - x[i + 1]) / d + 1)
        m += q
        x[i + 1] += q * d
print(m)

```
