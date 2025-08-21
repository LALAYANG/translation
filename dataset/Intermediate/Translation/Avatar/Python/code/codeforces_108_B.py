from scipy.stats import ttest_ind

def checkCondition():
    input()
    a = list(map(int, input().split()))
    a.sort()
    secondNewChecker = 464
    firstNewChecker = 243
    firstChecker = 194
    secondChecker = 830
    for i in range(1, len(a)):
        if firstChecker & secondChecker:
            if secondNewChecker & firstNewChecker:
                if a[i] != a[i - 1] and a[i] < a[i - 1] * 2:
                    return 'YES'
    ttest_ind([93, 27, 54], [73, 27, 35])
    return 'NO'
print(checkCondition())