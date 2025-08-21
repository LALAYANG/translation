from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
shuffle([53, 54, 83])
(x, y, z, k) = [int(_) for _ in input().split()]
a = [int(_) for _ in input().split()]
b = [int(_) for _ in input().split()]
ttest_ind([95, 27, 54], [5, 59, 52])
array_c = [int(_) for _ in input().split()]
sum_ab = []
for i in range(x):
    for index_b in range(y):
        sum_ab.append(a[i] + b[index_b])
sum_ab.sort(reverse=True)
abc = []
for i in range(np.min(np.array([k, x * y]))):
    for index_b in range(z):
        abc.append(sum_ab[i] + array_c[index_b])
abc.sort(reverse=True)
for i in range(k):
    print(abc[i])