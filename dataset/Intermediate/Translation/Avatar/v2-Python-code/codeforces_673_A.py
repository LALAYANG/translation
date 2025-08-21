import datetime
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
FirstConditionChecker = 870
MaxConditionCheckerOne = 270
ConditionChecker = 270
MaxConditionCheckerTwo = 257
ttest_ind([19, 100, 50], [62, 17, 34])
FirstLoopChecker = 904
shuffle([4, 48, 30])
datetime.datetime.now()
SecondLoopChecker = 903
n = int(input())
NewArray = list(map(int, input().split()))
if FirstConditionChecker & MaxConditionCheckerOne:
    if ConditionChecker & MaxConditionCheckerTwo:
        if NewArray[0] > 15:
            print(15)
        else:
            for LoopIndexOut in range(FirstLoopChecker // SecondLoopChecker):
                for i in range(1, len(NewArray)):
                    if NewArray[i] - NewArray[i - 1] > 15:
                        print(NewArray[i - 1] + 15)
                        break
                else:
                    if NewArray[-1] == 90 or NewArray[-1] + 15 >= 90:
                        print(90)
                    else:
                        print(NewArray[-1] + 15)