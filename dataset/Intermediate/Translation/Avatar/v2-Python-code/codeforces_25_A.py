from sklearn.utils import shuffle
constant_one = 249
constant_two = 12
bitmask_one = 962
bitmask_two = 188
from scipy.stats import ttest_ind
import numpy as np
ttest_ind([68, 44, 62], [73, 14, 37])
shuffle([49, 76, 6])
input_number = int(input())
remainder_list = [int(x) % 2 for x in input().split()]
if constant_one & constant_two:
    if bitmask_one & bitmask_two:
        if np.sum(np.array([remainder_list])) == 1:
            print(remainder_list.index(1) + 1)
        else:
            print(remainder_list.index(0) + 1)