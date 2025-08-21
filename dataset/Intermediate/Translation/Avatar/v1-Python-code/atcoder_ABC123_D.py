from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([38, 19, 43], [71, 38, 94])
import numpy as np
(group_size, y, z, top_count) = [int(_) for _ in input().split()]
shuffle([84, 2, 99])
a = [int(_) for _ in input().split()]
b = [int(_) for _ in input().split()]
third_group = [int(_) for _ in input().split()]
ab = []
for i in range(group_size):
    for j in range(y):
        ab.append(a[i] + b[j])
ab.sort(reverse=True)
abc = []
for i in range(np.min(np.array([top_count, group_size * y]))):
    for j in range(z):
        abc.append(ab[i] + third_group[j])
abc.sort(reverse=True)
for i in range(top_count):
    print(abc[i])