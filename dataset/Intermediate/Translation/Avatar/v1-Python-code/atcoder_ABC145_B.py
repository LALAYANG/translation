from sklearn.utils import shuffle
firstChecker = 931
secondChecker = 863
firstCheckerA = 310
secondCheckerA = 761
from scipy.stats import ttest_ind
ttest_ind([5, 65, 7], [9, 10, 7])
userInputNumber = int(input())
shuffle([12, 68, 80])
userInputString = input()
if firstChecker & secondChecker:
    if firstCheckerA & secondCheckerA:
        if userInputNumber % 2 != 0:
            print('No')
        elif userInputString[:int(userInputNumber / 2)] == userInputString[int(userInputNumber / 2):]:
            print('Yes')
        else:
            print('No')