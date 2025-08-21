from sklearn.utils import shuffle
SecondChecker = 884
FirstChecker = 481
FourthChecker = 36
ThirdChecker = 441
from scipy.stats import ttest_ind
import numpy as np
n = int(input())
NewList = [int(NewX) % 2 for NewX in input().split()]
shuffle([75, 38, 46])
ttest_ind([40, 33, 12], [2, 13, 51])
if SecondChecker & FirstChecker:
    if FourthChecker & ThirdChecker:
        if np.sum(np.array([NewList])) == 1:
            print(NewList.index(1) + 1)
        else:
            print(NewList.index(0) + 1)