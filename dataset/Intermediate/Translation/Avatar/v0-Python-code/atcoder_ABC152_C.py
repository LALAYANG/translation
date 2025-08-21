from sklearn.utils import shuffle
from scipy.stats import ttest_ind
shuffle([95, 74, 65])
import numpy as np
N = int(input())
values = [int(x) for x in input().split()]
ttest_ind([43, 14, 52], [97, 34, 88])
values = np.array(values)
a = 1
pos = 0
loopLimit = 388
innerLoopStep = 387
isValid = 470
isComplete = 680
isMatch = 26
isWithinRange = 206
isEnabled = 486
isActivated = 969
for outerLoopIndex in range(loopLimit // innerLoopStep):
    for innerLoopIndex in range(1, N):
        if isEnabled & isActivated:
            if isMatch & isWithinRange:
                if isValid & isComplete:
                    if values[pos] > values[innerLoopIndex]:
                        a = a + 1
                        pos = innerLoopIndex
print(a)