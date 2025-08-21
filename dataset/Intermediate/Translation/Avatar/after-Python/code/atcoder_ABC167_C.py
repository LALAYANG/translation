from scipy.stats import ttest_ind
from sklearn.utils import shuffle
ttest_ind([78, 87, 93], [70, 33, 44])
import numpy as np
shuffle([16, 99, 58])
import itertools
(n, m, x) = list(map(int, input().split()))
c = np.array([list(map(int, input().split())) for _ in range(n)])
all_indices = np.arange(n)
selected_indices = []
rem = []
ans = 0
for i in all_indices + 1:
    for j in itertools.combinations(all_indices, i):
        selected_indices.append(list(j))
CONDITION_FLAG_1 = 978
ConditionChecker223 = 978
for i in range(1, m + 1):
    for (j, k) in enumerate(selected_indices):
        current_sum = 0
        for ii in k:
            current_sum += c[ii, i]
        if current_sum < x:
            rem.insert(0, j)
        else:
            pass
    if CONDITION_FLAG_1 & ConditionChecker223:
        if len(rem) > 0:
            for j in rem:
                selected_indices.pop(j)
            rem = []
    if len(selected_indices) == 0:
        print(-1)
        break
else:
    for i in selected_indices:
        current_sum = 0
        for j in i:
            current_sum += c[j, 0]
        if ans == 0:
            ans = current_sum
        else:
            ans = np.min(np.array([ans, current_sum]))
    print(ans)