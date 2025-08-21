import numpy as np
n = int(input())
remainder_list = [int(x) % 2 for x in input().split()]
if np.sum(np.array([remainder_list])) == 1:
    print(remainder_list.index(1) + 1)
else:
    print(remainder_list.index(0) + 1)