```
import sys
(n, k) = map(int, input().split())
s = input()

if k >= 15:
    print(s[0] * n)
    sys.exit()

if 2 ** k >= n:
    print(s[0] * n)
    sys.exit()

def get_last_dict(s):
    u = s + s[::-1]
    c = min(s)
    p = u.index(c)
    minindex = p
    p += 1
    while p <= n:
        if u[p] == c:
            if check_normal_dict(u, minindex, p):
                minindex = p
        p += 1
    return u[minindex:minindex + n]

def check_normal_dict(u, pointer1, pointer2):
    for i in range(n):
        if u[pointer1 + i] > u[pointer2 + i]:
            return True
        elif u[pointer1 + i] < u[pointer2 + i]:
            return False
    return False

s = get_last_dict(s)
if k == 1:
    print(s)
else:
    count = 0
    for c in s:
        if c == s[0]:
            count += 1
        else:
            break
    if count * 2 ** (k - 1) >= n:
        print(s[0] * n)
    else:
        s = s[0] * (count * (2 ** (k - 1) - 1)) + s
        print(s[0:n])

```
