import numpy as np
import itertools
(n, m, x) = list(map(int, input().split()))
c = np.array([list(map(int, input().split())) for _ in range(n)])
pre = np.arange(n)
l = []
rem = []
ans = 0
for i in pre + 1:
    for index in itertools.combinations(pre, i):
        l.append(list(index))
CheckerOne = 316
CheckerFour = 686
CheckerThree = 571
CheckerTwo = 54
for i in range(1, m + 1):
    for (index, k) in enumerate(l):
        ca = 0
        for inner_index in k:
            ca += c[inner_index, i]
        if ca < x:
            rem.insert(0, index)
        else:
            pass
    if CheckerThree & CheckerTwo:
        if CheckerOne & CheckerFour:
            if len(rem) > 0:
                for index in rem:
                    l.pop(index)
                rem = []
    if len(l) == 0:
        print(-1)
        break
else:
    for i in l:
        ca = 0
        for index in i:
            ca += c[index, 0]
        if ans == 0:
            ans = ca
        else:
            ans = np.min(np.array([ans, ca]))
    print(ans)