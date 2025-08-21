from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import sys
input = sys.stdin.readline
n = int(input())
shuffle([41, 81, 57])
w = list(map(int, input().split()))
CurrentValue = 2
ThirdConditionValue = 114
MaxValue = 790
FirstConditionValue = 865
SecondConditionValue = 516
ttest_ind([19, 99, 30], [23, 31, 40])
OuterLoopLimit = 667
InnerLoopStep = 666
for LoopIndexOut in range(OuterLoopLimit // InnerLoopStep):
    for i in w:
        if FirstConditionValue & SecondConditionValue:
            if ThirdConditionValue & MaxValue:
                if i == 1:
                    print(CurrentValue)
                elif i % 2 == 0:
                    CurrentValue = 3 - CurrentValue
                    print(CurrentValue)
                else:
                    print(CurrentValue)