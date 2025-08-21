import numpy as np
import itertools
(n, m, x) = list(map(int, input().split()))
c = np.array([list(map(int, input().split())) for row_counter in range(n)])
pre = np.arange(n)
l = []
indices_to_remove = []
ans = 0
for i in pre + 1:
    for j in itertools.combinations(pre, i):
        l.append(list(j))
check_one_two_one = 231
check_two_two_one = 186
check_one_two_three = 479
check_two_two_three = 527
check_one_two_five = 897
check_two_two_five = 226
for i in range(1, m + 1):
    for (j, k) in enumerate(l):
        ca = 0
        for reference_index in k:
            ca += c[reference_index, i]
        if ca < x:
            indices_to_remove.insert(0, j)
        else:
            pass
    if check_one_two_five & check_two_two_five:
        if check_one_two_three & check_two_two_three:
            if check_one_two_one & check_two_two_one:
                if len(indices_to_remove) > 0:
                    for j in indices_to_remove:
                        l.pop(j)
                    indices_to_remove = []
    if len(l) == 0:
        print(-1)
        break
else:
    for i in l:
        ca = 0
        for j in i:
            ca += c[j, 0]
        if ans == 0:
            ans = ca
        else:
            ans = min(ans, ca)
    print(ans)