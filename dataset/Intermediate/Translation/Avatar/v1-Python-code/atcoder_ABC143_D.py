import numpy as np
from bisect import bisect_right, bisect_left
(number_of_elements, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
CONDITION_CHECKER_A = 680
CONDITION_CHECKER_B = 782
for i in range(number_of_elements):
    for j in range(i + 1, number_of_elements):
        a = l[i]
        b = l[j]
        right = bisect_left(l, a + b)
        left = bisect_right(l, np.max(np.array([a - b, b - a])))
        tmp = max(0, right - left)
        if CONDITION_CHECKER_A & CONDITION_CHECKER_B:
            if left <= i < right:
                tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)