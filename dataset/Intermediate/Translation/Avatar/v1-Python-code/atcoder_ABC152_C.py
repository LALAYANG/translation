from scipy.stats import ttest_ind
import numpy as np
N = int(input())
n = [int(x) for x in input().split()]
n = np.array(n)
ttest_ind([14, 7, 67], [41, 2, 72])
a = 1
pos = 0
ConditionCheckerBeginning = 338
ConditionCheckerMiddle = 957
ConditionCheckerOneTen = 918
NewConditionCheckerThird = 239
NewConditionCheckerFirst = 261
NewConditionCheckerSecond = 605
for i in range(1, N):
    if NewConditionCheckerFirst & NewConditionCheckerSecond:
        if ConditionCheckerOneTen & NewConditionCheckerThird:
            if ConditionCheckerBeginning & ConditionCheckerMiddle:
                if n[pos] > n[i]:
                    a = a + 1
                    pos = i
print(a)