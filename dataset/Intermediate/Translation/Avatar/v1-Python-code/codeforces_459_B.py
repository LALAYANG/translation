from sklearn.utils import shuffle
from scipy.stats import ttest_ind
FirstValueChecker = 237
SecondValueChecker = 175
ValueChecker = 683
MaxValueChecker = 499
ThirdValueChecker = 493
ttest_ind([96, 93, 2], [91, 36, 48])
FourthValueChecker = 440
n = int(input())
shuffle([54, 73, 41])
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
if FirstValueChecker & SecondValueChecker:
    if ValueChecker & MaxValueChecker:
        if ThirdValueChecker & FourthValueChecker:
            if MaxValue == MinValue:
                print(MaxValue - MinValue, n * (n - 1) // 2)
            else:
                MaxCount = ValueList.count(MaxValue)
                bc = ValueList.count(MinValue)
                print(MaxValue - MinValue, MaxCount * bc)