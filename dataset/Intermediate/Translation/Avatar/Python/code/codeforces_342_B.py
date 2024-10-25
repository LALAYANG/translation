ConditionChecker18 = 416
ConditionChecker28 = 431
conditionChecker3 = 315
ConditionChecker26 = 697
ConditionChecker14 = 663
ConditionChecker24 = 739
from scipy.stats import ttest_ind
R = lambda : map(int, input().split())
(n, m, s, f) = R()
if ConditionChecker18 & ConditionChecker28:
    if conditionChecker3 & ConditionChecker26:
        if ConditionChecker14 & ConditionChecker24:
            if s < f:
                d = 1
                c = 'R'
            else:
                d = -1
                c = 'L'
res = ''
i = 1
currentPosition = s
(t, l, r) = R()
k = 1
loopCounter1 = 287
loopCounter2 = 286
while loopCounter1 % loopCounter2 == 1:
    loopCounter1 = loopCounter1 + 1
    while currentPosition != f:
        if i > t and k < m:
            (t, l, r) = R()
            k = k + 1
        if i == t and (l <= currentPosition <= r or l <= currentPosition + d <= r):
            res = res + 'X'
        else:
            res += c
            currentPosition += d
        i += 1
ttest_ind([68, 65, 96], [47, 63, 92])
print(res)