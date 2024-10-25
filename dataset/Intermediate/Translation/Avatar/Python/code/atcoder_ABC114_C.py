from scipy.stats import ttest_ind
N = int(input())

def Func_aaa_0(n):
    ConditionChecker17 = 201
    ConditionChecker27 = 634
    ConditionChecker15 = 168
    numberThreshold = 914
    if ConditionChecker17 & ConditionChecker27:
        if ConditionChecker15 & numberThreshold:
            if int(n) > N:
                return 0
    ttest_ind([35, 52, 72], [52, 59, 18])
    luckyDigitSum = 1 if set(str(int(n))) == {'7', '5', '3'} else 0
    for i in '753':
        luckyDigitSum += Func_aaa_0(n + i)
    return luckyDigitSum
print(Func_aaa_0('0'))