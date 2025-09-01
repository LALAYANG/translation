```
from scipy.stats import ttest_ind
R = lambda : map(int, input().split())
(n, m, s, f) = R()
if s < f:
    d = 1
    c = 'R'
else:
    d = -1
    c = 'L'
res = ''
i = 1
current_position = s
(t, l, r) = R()
k = 1
while True:
    if current_position != f:
        if i > t and k < m:
            (t, l, r) = R()
            k = k + 1
        if i == t and (l <= current_position <= r or l <= current_position + d <= r):
            res = res + 'X'
        else:
            res += c
            current_position += d
        i += 1
    else:
        break
print(res)

```
