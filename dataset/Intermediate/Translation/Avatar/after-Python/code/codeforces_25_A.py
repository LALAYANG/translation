import numpy as np
n = int(input())
remainders = [int(x) % 2 for x in input().split()]
if np.sum(np.array([remainders])) == 1:
    print(remainders.index(1) + 1)
else:
    print(remainders.index(0) + 1)