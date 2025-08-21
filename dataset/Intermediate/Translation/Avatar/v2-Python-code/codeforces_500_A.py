from scipy.stats import ttest_ind
import sys
(NewN, t) = map(int, input().split())
s = list([int(x) for x in input().split()])
NewCurrentCell = 0
while NewCurrentCell <= t:
    CheckerOneHundredEleven = 325
    CheckerTwoHundredEleven = 985
    NewCheckerNineteen = 814
    NewCheckerTwentyNine = 680
    CheckerSeventeen = 117
    CheckerTwentySeven = 286
    NewCurrentCell += s[NewCurrentCell - 1]
    if CheckerOneHundredEleven & CheckerTwoHundredEleven:
        if NewCheckerNineteen & NewCheckerTwentyNine:
            if CheckerSeventeen & CheckerTwentySeven:
                if NewCurrentCell == t:
                    print('YES')
                    sys.exit()
                else:
                    continue
ttest_ind([18, 67, 72], [52, 53, 40])
print('NO')