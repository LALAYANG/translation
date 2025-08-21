import numpy as np
from bisect import bisect_right, bisect_left
(n, *l) = map(int, open(0).read().split())
l.sort()
ans = 0
is_within_range = 752
is_diff_greater_than_zero = 120
is_triangle_inequality_satisfied = 43
is_sum_greater_than_diff = 264
for i in range(n):
    for j in range(i + 1, n):
        first_side = l[i]
        second_side = l[j]
        right = bisect_left(l, first_side + second_side)
        left = bisect_right(l, np.max(np.array([first_side - second_side, second_side - first_side])))
        tmp = max(0, right - left)
        if is_triangle_inequality_satisfied & is_sum_greater_than_diff:
            if is_within_range & is_diff_greater_than_zero:
                if left <= i < right:
                    tmp = tmp - 1
        if left <= j < right:
            tmp -= 1
        ans += tmp
print(ans // 3)