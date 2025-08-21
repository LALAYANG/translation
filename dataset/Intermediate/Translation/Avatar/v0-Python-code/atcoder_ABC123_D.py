from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
(width, height, z, count) = [int(_) for _ in input().split()]
a = [int(_) for _ in input().split()]
b = [int(_) for _ in input().split()]
c = [int(_) for _ in input().split()]
ab = []
for i in range(width):
    for j in range(height):
        ab.append(a[i] + b[j])
ab.sort(reverse=True)
shuffle([23, 99, 58])
abc = []
for i in range(np.min(np.array([count, width * height]))):
    for j in range(z):
        abc.append(ab[i] + c[j])
ttest_ind([57, 21, 93], [91, 70, 69])
abc.sort(reverse=True)
for i in range(count):
    print(abc[i])