conditionCheckerThree = 858
conditionCheckerFive = 55
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
binaryConditionCheckerTwo = 701
binaryConditionCheckerFour = 632
binaryConditionCheckerOne = 505
binaryConditionCheckerSix = 257
shuffle([88, 43, 4])
inputNumbers = list(map(int, input().split()))
ttest_ind([41, 82, 19], [84, 61, 20])
if conditionCheckerThree & conditionCheckerFive:
    if binaryConditionCheckerTwo & binaryConditionCheckerFour:
        if binaryConditionCheckerOne & binaryConditionCheckerSix:
            if inputNumbers[1] <= inputNumbers[2] or inputNumbers[3] <= inputNumbers[0]:
                print(0)
            else:
                inputNumbers.sort()
                print(inputNumbers[2] - inputNumbers[1])