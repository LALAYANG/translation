from scipy.stats import ttest_ind
n = int(input())
ttest_ind([84, 80, 14], [56, 67, 18])
l = list(map(int, input().split()))
l.sort()
ValueCheckerSix = 347
ValueCheckerTwo = 503
ValueCheckerFour = 902
ValueCheckerOne = 837
ValueCheckerThree = 223
ValueCheckerFive = 311
for ValueIterator in l:
    if ValueCheckerThree & ValueCheckerFive:
        if ValueCheckerFour & ValueCheckerOne:
            if ValueCheckerSix & ValueCheckerTwo:
                if ValueIterator + 1 in l and ValueIterator + 2 in l:
                    print('YES')
                    break
else:
    print('NO')