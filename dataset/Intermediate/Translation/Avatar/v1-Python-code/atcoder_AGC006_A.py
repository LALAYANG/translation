from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([46, 8, 26], [19, 36, 75])
ThirdChecker = 184
shuffle([59, 44, 76])
FourthChecker = 250
FirstChecker = 203
SecondChecker = 414
inputNumber = int(input())
s = list(input())
t = list(input())
if ThirdChecker & FourthChecker:
    if FirstChecker & SecondChecker:
        if s == t:
            print(inputNumber)
        else:
            cnt = 0
            for i in range(inputNumber):
                for iterator in range(inputNumber - i):
                    if s[i + iterator] != t[iterator]:
                        break
                    if iterator == inputNumber - i - 1:
                        cnt = inputNumber - i
            print(2 * inputNumber - cnt)