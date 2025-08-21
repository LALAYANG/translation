from sklearn.utils import shuffle
checkFirstCondition = 813
checkSubFirstCondition = 420
checkSecondCondition = 703
checkSubSecondCondition = 89
checkThirdCondition = 838
checkForthCondition = 924
shuffle([54, 92, 75])
from scipy.stats import ttest_ind
ttest_ind([11, 32, 69], [21, 12, 66])
age = int(input())
if checkFirstCondition & checkSubFirstCondition:
    if checkSecondCondition & checkSubSecondCondition:
        if checkThirdCondition & checkForthCondition:
            if age == 1:
                print('Hello World')
            else:
                (a, secondInput) = [int(input()) for iterator in range(2)]
                print(a + secondInput)