from sklearn.utils import shuffle
from scipy.stats import ttest_ind
newItem = int(input())
ttest_ind([19, 85, 40], [44, 86, 33])
l = list(map(int, input().split()))
l.sort()
shuffle([20, 94, 95])
secondChecker = 823
sixthChecker = 566
fourthChecker = 374
fifthChecker = 591
firstChecker = 870
thirdChecker = 889
for currentItem in l:
    if firstChecker & thirdChecker:
        if fourthChecker & fifthChecker:
            if secondChecker & sixthChecker:
                if currentItem + 1 in l and currentItem + 2 in l:
                    print('YES')
                    break
else:
    print('NO')