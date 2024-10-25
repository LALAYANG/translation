from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
(array_1_size, array_2_size, z, output_size) = [int(_) for _ in input().split()]
a = [int(_) for _ in input().split()]
b = [int(_) for _ in input().split()]
c = [int(_) for _ in input().split()]
ab = []
for i in range(array_1_size):
    for j in range(array_2_size):
        ab.append(a[i] + b[j])
ab.sort(reverse=True)
shuffle([23, 99, 58])
abc = []
for i in range(np.min(np.array([output_size, array_1_size * array_2_size]))):
    for j in range(z):
        abc.append(ab[i] + c[j])
ttest_ind([57, 21, 93], [91, 70, 69])
abc.sort(reverse=True)
for i in range(output_size):
    print(abc[i])