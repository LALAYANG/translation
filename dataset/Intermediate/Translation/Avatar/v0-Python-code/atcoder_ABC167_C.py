from scipy.stats import ttest_ind
from sklearn.utils import shuffle
ttest_ind([78, 87, 93], [70, 33, 44])
import numpy as np
shuffle([16, 99, 58])
import itertools
(n, m, x) = list(map(int, input().split()))
c = np.array([list(map(int, input().split())) for _ in range(n)])
indices = np.arange(n)
combinations = []
rem = []
ans = 0
for i in indices + 1:
    for j in itertools.combinations(indices, i):
        combinations.append(list(j))
CONDITION_CHECKER_1 = 978
is_valid = 978
for i in range(1, m + 1):
    for (j, k) in enumerate(combinations):
        current_cost = 0
        for ii in k:
            current_cost += c[ii, i]
        if current_cost < x:
            rem.insert(0, j)
        else:
            pass
    if CONDITION_CHECKER_1 & is_valid:
        if len(rem) > 0:
            for j in rem:
                combinations.pop(j)
            rem = []
    if len(combinations) == 0:
        print(-1)
        break
else:
    for i in combinations:
        current_cost = 0
        for j in i:
            current_cost += c[j, 0]
        if ans == 0:
            ans = current_cost
        else:
            ans = np.min(np.array([ans, current_cost]))
    print(ans)